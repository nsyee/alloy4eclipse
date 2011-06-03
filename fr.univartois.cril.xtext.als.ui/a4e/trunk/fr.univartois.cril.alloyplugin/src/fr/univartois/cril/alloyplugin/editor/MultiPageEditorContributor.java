package fr.univartois.cril.alloyplugin.editor;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.IDEActionFactory;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

import edu.mit.csail.sdg.alloy4viz.VizGUI;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.preferences.AlloyPreferencePage;

/**
 * Manages the installation/deinstallation of global actions for multi-page
 * editors. Responsible for the redirection of global actions to the active
 * editor. Multi-page contributor replaces the contributors for the individual
 * editors in the multi-page editor.
 */
public class MultiPageEditorContributor extends
		MultiPageEditorActionBarContributor {
	private IEditorPart activeEditorPart;
	private Action editorAction1, editorAction2, editorAction3, editorAction4;
	private Action saveAsTheme;

	private MultiPageEditor multiPageEditor;

	public void setMultiPageEditor(MultiPageEditor multiPageEditor) {
		this.multiPageEditor = multiPageEditor;
	}

	/**
	 * Creates a multi-page contributor.
	 */
	public MultiPageEditorContributor() {
		super();
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.ctor().begin");
		createActions();
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.ctor().end");
	}

	/**
	 * Returns the action registed with the given text editor.
	 * 
	 * @return IAction or null if editor is null.
	 */
	protected IAction getAction(ITextEditor editor, String actionID) {
		return (editor == null ? null : editor.getAction(actionID));
	}

	/*
	 * (non-JavaDoc) Method declared in
	 * AbstractMultiPageEditorActionBarContributor.
	 */
	public void setActivePage(IEditorPart part) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.setActivePage(part=" + part
							+ ").begin");
		try {
			if (activeEditorPart == part)
				return;

			activeEditorPart = part;

			IActionBars actionBars = getActionBars();
			if (actionBars != null) {

				ITextEditor editor = (part instanceof ITextEditor) ? (ITextEditor) part
						: null;

				actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
						getAction(editor, ITextEditorActionConstants.DELETE));
				actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
						getAction(editor, ITextEditorActionConstants.UNDO));
				actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(),
						getAction(editor, ITextEditorActionConstants.REDO));
				actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
						getAction(editor, ITextEditorActionConstants.CUT));
				actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
						getAction(editor, ITextEditorActionConstants.COPY));
				actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
						getAction(editor, ITextEditorActionConstants.PASTE));
				actionBars.setGlobalActionHandler(ActionFactory.SELECT_ALL
						.getId(), getAction(editor,
						ITextEditorActionConstants.SELECT_ALL));
				actionBars.setGlobalActionHandler(ActionFactory.FIND.getId(),
						getAction(editor, ITextEditorActionConstants.FIND));
				actionBars.setGlobalActionHandler(IDEActionFactory.BOOKMARK
						.getId(), getAction(editor, IDEActionFactory.BOOKMARK
						.getId()));
				actionBars.updateActionBars();
			}
		} finally {
			if (AlloyPreferencePage.getShowDebugMessagesPreference())
				AlloyPlugin.getDefault().logInfo(
						"MultiPageEditorContributor.setActivePage(part=" + part
								+ ").end");
		}
	}

	/**
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @param theme
	 *            the IPath of the A4 visualization theme to use to visualize
	 *            the current A4 solution instance.
	 * @return the IAction which will apply the A4 visualization theme to the
	 *         current A4 solution instance or null if the action cannot be
	 *         created.
	 */
	public Action createApplyVisualizationAction(final IPath theme) {
		try {
			return createApplyVisualizationAction(FileLocator.toFileURL(theme
					.toFile().toURI().toURL()));
		} catch (MalformedURLException e) {
			AlloyPlugin.getDefault().log(e);
			return null;
		} catch (IOException e) {
			AlloyPlugin.getDefault().log(e);
			return null;
		}
	}

	/**
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @param themeUrl
	 *            the URL of the A4 visualization theme to use to visualize the
	 *            current A4 solution instance.
	 * @return the IAction which will apply the A4 visualization theme to the
	 *         current A4 solution instance or null if the action cannot be
	 *         created.
	 */
	public Action createApplyVisualizationAction(final URL themeUrl) {
		return new Action() {
			public void run() {
				try {
					doApplyVisualizationAction(themeUrl);
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
	}

	/**
	 * @param theme
	 *            the path to the A4 visualization theme to apply to the current
	 *            graph pane.
	 * @return true if the theme was successfully applied, false otherwise.
	 */
	public boolean doApplyVisualizationAction(final IPath theme) {
		try {
			return doApplyVisualizationAction(FileLocator.toFileURL(theme
					.toFile().toURI().toURL()));
		} catch (MalformedURLException e) {
			AlloyPlugin.getDefault().log(e);
			return false;
		} catch (IOException e) {
			AlloyPlugin.getDefault().log(e);
			return false;
		}
	}

	/**
	 * @param themeUrl
	 *            the URL to the A4 visualization theme to apply to the current
	 *            graph pane.
	 * @return true if the theme was successfully applied, false otherwise.
	 */
	public boolean doApplyVisualizationAction(final URL themeUrl) {
		if (multiPageEditor != null) {
			/* MyVizGUI viz = */multiPageEditor
					.applyAlloyVisualizationToCurrentPage(themeUrl);
			return true;
		}
		return false;
	}

	/**
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @param pageName
	 *            the name of a new tab with a new A4 visualization for the
	 *            current A4 solution instance.
	 * @param theme
	 *            the IPath of the A4 visualization theme to use to visualize
	 *            the current A4 solution instance.
	 * @return the IAction which will add a new A4 visualization tab for the
	 *         current A4 solution instance using the A4 visualization theme or
	 *         null if the action cannot be created.
	 */
	public Action createAddVisualizationAction(final String pageName,
			final IPath theme) {
		try {
			return createAddVisualizationAction(pageName, FileLocator
					.toFileURL(theme.toFile().toURI().toURL()));
		} catch (MalformedURLException e) {
			AlloyPlugin.getDefault().log(e);
			return null;
		} catch (IOException e) {
			AlloyPlugin.getDefault().log(e);
			return null;
		}
	}

	/**
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @param pageName
	 *            the name of a new tab with a new A4 visualization for the
	 *            current A4 solution instance.
	 * @param themeUrl
	 *            the URL of the A4 visualization theme to use to visualize the
	 *            current A4 solution instance.
	 * @return the IAction which will add a new A4 visualization tab for the
	 *         current A4 solution instance using the A4 visualization theme or
	 *         null if the action cannot be created.
	 */
	public Action createAddVisualizationAction(final String pageName,
			final URL themeUrl) {
		return new Action() {
			public void run() {
				try {
					doAddVisualizationAction(pageName, themeUrl);
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
	}

	/**
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @param pageName
	 *            the name of a new tab with a new A4 visualization for the
	 *            current A4 solution instance.
	 * @param theme
	 *            the IPath of the A4 visualization theme to use to visualize
	 *            the current A4 solution instance.
	 * @return true if the theme was successfully applied, false otherwise.
	 */
	public boolean doAddVisualizationAction(final String pageName,
			final IPath theme) {
		try {
			return doAddVisualizationAction(pageName, FileLocator
					.toFileURL(theme.toFile().toURI().toURL()));
		} catch (MalformedURLException e) {
			AlloyPlugin.getDefault().log(e);
			return false;
		} catch (IOException e) {
			AlloyPlugin.getDefault().log(e);
			return false;
		}
	}

	/**
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @param pageName
	 *            the name of a new tab with a new A4 visualization for the
	 *            current A4 solution instance.
	 * @param themeUrl
	 *            the URL of the A4 visualization theme to use to visualize the
	 *            current A4 solution instance.
	 * @return true if the theme was successfully applied, false otherwise.
	 */
	public boolean doAddVisualizationAction(final String pageName,
			final URL themeUrl) {
		if (multiPageEditor != null) {
			/* MyVizGUI viz = */multiPageEditor.addAlloyVisualizationPage(
					pageName, themeUrl);
			// multiPageEditor.setActivePage(pageName);
			return true;
		}
		return false;
	}

	private void createActions() {
		editorAction1 = new Action() {
			public void run() {
				try {
					if (multiPageEditor != null) {
						FileDialog dialog = new FileDialog(multiPageEditor
								.getEditorSite().getShell());
						dialog.setFilterExtensions(new String[] { "*.thm" });
						IResource resource = (IResource) multiPageEditor
								.getEditorInput().getAdapter(IResource.class);
						dialog.setFilterPath(resource.getProject()
								.getLocation().toPortableString());
						dialog.setText("Select a visualization theme");
						dialog.open();
						final IPath dir = new Path(dialog.getFilterPath());
						final IPath path = dir.addTrailingSeparator().append(
								dialog.getFileName());
						doApplyVisualizationAction(path);
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
		editorAction1.setText("Apply Visualization Theme");
		editorAction1.setToolTipText("Alloy4Eclipse Visualization Theme");
		editorAction1.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.THEME_IMPORT_ICON_ID));

		editorAction2 = new Action() {
			public void run() {
				try {
					if (multiPageEditor != null) {
						Shell shell = multiPageEditor.getEditorSite()
								.getShell();
						FileDialog fdialog = new FileDialog(shell);
						fdialog.setFilterExtensions(new String[] { "*.thm" });
						IResource resource = (IResource) multiPageEditor
								.getEditorInput().getAdapter(IResource.class);
						fdialog.setFilterPath(resource.getProject()
								.getLocation().toPortableString());
						fdialog.setText("Select a visualization theme");
						fdialog.open();
						final IPath dir = new Path(fdialog.getFilterPath());
						final String filename = fdialog.getFileName();
						if (!"".equals(filename)) {
							final IPath path = dir.addTrailingSeparator()
									.append(filename);
							InputDialog ndialog = new InputDialog(shell,
									"New Alloy4 visualization page name:",
									"Enter a string", null, null);
							ndialog.open();
							String pageName = ndialog.getValue();
							doAddVisualizationAction(pageName, path);
						}
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
		editorAction2.setText("Add Another Visualization Page");
		editorAction2.setToolTipText("New Alloy4Eclipse Visualization Page");
		editorAction2.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.THEME_IMPORT_ADD_ICON_ID));

		editorAction3 = new Action() {
			public void run() {
				try {
					if (multiPageEditor != null) {
						Shell shell = multiPageEditor.getEditorSite()
								.getShell();
						FileDialog fdialog = new FileDialog(shell);
						fdialog.setFilterExtensions(new String[] { "*.thm" });
						IResource resource = (IResource) multiPageEditor
								.getEditorInput().getAdapter(IResource.class);
						fdialog.setFilterPath(resource.getProject()
								.getLocation().toPortableString());
						fdialog.setText("Select a visualization theme");
						fdialog.open();
						final IPath dir = new Path(fdialog.getFilterPath());
						final String filename = fdialog.getFileName();
						if (!"".equals(filename)) {
							final IPath path = dir.addTrailingSeparator()
									.append(filename);
							VizGUI viz = new VizGUI(false, "", null);
							viz.loadXML(resource.getLocation().toOSString(),
									true);
							try {
								final URL themeUrl = FileLocator.toFileURL(path
										.toFile().toURI().toURL());
								viz.loadThemeFile(themeUrl.getFile());
							} catch (MalformedURLException e) {
								AlloyPlugin.getDefault().log(e);
							} catch (IOException e) {
								AlloyPlugin.getDefault().log(e);
							}
						}
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};

		editorAction3.setText("Open with Alloy4 Visualizer");
		editorAction3
				.setToolTipText("Open an Alloy4 visualizer on this instance");
		editorAction3.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.LAUNCH_A4_ICON_ID));

		/**
		 * Adapted from a suggestion by Felix Chang.
		 * 
		 * @link http://groups.yahoo.com/group/alloy-discuss/message/1122
		 * @author Nicolas.Rouquette@jpl.nasa.gov
		 */
		/*
		 * editorAction4 = new Action() { public void run() { try { if
		 * (multiPageEditor != null) {
		 * multiPageEditor.saveCurrentVisualizationAsDOTFile(); } } catch
		 * (Exception e) { AlloyPlugin.getDefault().log(e); } } };
		 * editorAction4.setText("Save Alloy4 visualization DOT file");
		 * editorAction4 .setToolTipText("Save the current Alloy4 instance
		 * visualization as a DOT file");
		 * editorAction4.setImageDescriptor(ALSImageRegistry
		 * .getImageDescriptor(ALSImageRegistry.THEME_EXPORT_DOT_ICON_ID));
		 */

		editorAction4 = new Action() {
			public void run() {
				try {
					if (multiPageEditor != null) {
						multiPageEditor.saveCurrentVisualizationAsImageFile();
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
		editorAction4.setText("Save Alloy4 visualization converted image file");
		editorAction4
				.setToolTipText("Save the current Alloy4 instance visualization as a pdf or png converted image file");
		editorAction4.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages().getImageDescriptor(
						IDE.SharedImages.IMG_OBJS_TASK_TSK));

		saveAsTheme = new Action() {
			public void run() {
				try {
					if (multiPageEditor != null) {
						FileDialog dialog = new FileDialog(multiPageEditor
								.getEditorSite().getShell(), SWT.SAVE);
						dialog.setFilterExtensions(new String[] { "*.thm" });
						IResource resource = (IResource) multiPageEditor
								.getEditorInput().getAdapter(IResource.class);
						dialog.setFilterPath(resource.getProject()
								.getLocation().toPortableString());
						dialog
								.setText("Where do you want to save your theme file?");
						dialog.open();
						final IPath dir = new Path(dialog.getFilterPath());
						final String filename = dialog.getFileName();
						if (filename != null && !"".equals(filename)) {
							IPath path = dir.addTrailingSeparator().append(
									filename);
							final String extension = path.getFileExtension();
							if (extension == null) {
								path = path.addFileExtension("thm");
							} else {
								if (!"thm".equals(extension)) {
									path = path.removeFileExtension()
											.addFileExtension("thm");
								}
							}
							multiPageEditor.doSaveAsTheme(path);
						}
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}

		};
		saveAsTheme.setText("Save theme in a new file");
		saveAsTheme
				.setToolTipText("Save the current theme settings in a new file");
		saveAsTheme.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.THEME_EXPORT_ICON_ID));
	}

	public static final String A4E_MENU_ID = MultiPageEditorContributor.class
			.getPackage().getName()
			+ ".a4e.menu"; //$NON-NLS-1$

	public IToolBarManager getToolBarManager() {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.getToolBarManager()");
		IActionBars actionBar = getActionBars();
		if (null == actionBar)
			return null;

		return actionBar.getToolBarManager();
	}

	public IMenuManager getA4EMenu() {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.getA4EMenu()");
		IActionBars actionBar = getActionBars();
		if (null == actionBar)
			return null;

		IMenuManager menuManager = actionBar.getMenuManager();
		if (null == menuManager)
			return null;

		IContributionItem item = menuManager.find(A4E_MENU_ID);
		if (null == item)
			return null;

		if (!(item instanceof IMenuManager))
			return null;
		return (IMenuManager) item;
	}

	public void contributeToMenu(IMenuManager manager) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.contributeToMenu(manager="
							+ manager + ").begin");
		IMenuManager menu = new MenuManager("&A4E Menu", A4E_MENU_ID);
		manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menu.add(editorAction1);
		menu.add(editorAction2);
		menu.add(editorAction3);
		// menu.add(editorAction4);
		menu.add(editorAction4);
		menu.add(saveAsTheme);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.contributeToMenu(manager="
							+ manager + ").end");
	}

	public void contributeToToolBar(IToolBarManager manager) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.contributeToToolBar(manager="
							+ manager + ").begin");
		manager.add(new Separator());
		manager.add(editorAction1);
		manager.add(editorAction2);
		manager.add(editorAction3);
		// manager.add(editorAction4);
		manager.add(editorAction4);
		manager.add(saveAsTheme);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.contributeToToolBar(manager="
							+ manager + ").end");
	}

	@Override
	public void setActiveEditor(IEditorPart part) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.setActiveEditor(part=" + part
							+ ").begin");
		if (part instanceof MultiPageEditor) {
			setMultiPageEditor((MultiPageEditor) part);
		} else {
			setMultiPageEditor(null);
		}
		super.setActiveEditor(part);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo(
					"MultiPageEditorContributor.setActiveEditor(part=" + part
							+ ").end");
	}

}
