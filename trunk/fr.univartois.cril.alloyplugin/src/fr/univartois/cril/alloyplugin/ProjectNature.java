package fr.univartois.cril.alloyplugin;

import java.util.ArrayList;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;



public class ProjectNature implements IProjectNature {

	public static final String NATURE_ID = "fr.univartois.cril.alloyplugin.AlloyProjectNature" ;
	private IProject project;


	public void configure() throws CoreException {
		//TODO implements projectnature
		System.out.println("nature project:configure");
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();
		ArrayList <String>buildersNotFound=getBuildersIdNotFound(commands);
		if (buildersNotFound.size()!=0)
		{
			addBuilders(buildersNotFound,commands,desc);
		}
	}

	private void addBuilders(ArrayList<String> buildersNotFound,ICommand[] commands,IProjectDescription desc) throws CoreException {
		ICommand[] newCommands = new ICommand[commands.length + buildersNotFound.size()];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		int i=0;
		for (String builderId : buildersNotFound) {				
			ICommand command = desc.newCommand();
			command.setBuilderName(builderId);
			newCommands[commands.length + i] = command;
			System.out.println("nature project:ajoute le builder:"+builderId);
			i++;
		}
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);		
	}

	private ArrayList<String> getBuildersIdNotFound(ICommand[] commands) {
		ArrayList <String>buildersNotFound=new ArrayList<String>();
		
		for(String projectBuilderId:AlloyPlugin.getDefault().getProjectBuildersID())
		{
			
			boolean present=false;
			for (int i = 0; i < commands.length; ++i) {
				if (commands[i].getBuilderName().equals(projectBuilderId)) {
					{present=true;break;}
				}
			}
			if(!present)
			{			
				buildersNotFound.add(projectBuilderId);
			}
		}
		return buildersNotFound;
	}

	public void deconfigure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();
		ArrayList <String>buildersFound=getBuildersIdFound(commands);
		if (buildersFound.size()!=0)
		{
			removeBuilders(buildersFound,commands,desc);
		}
		
		
	}
	
	
	private void removeBuilders(ArrayList<String> buildersFound,ICommand[] commands,IProjectDescription desc) throws CoreException {
		ICommand[] newCommands = new ICommand[commands.length - buildersFound.size()];		
		int i=0;
		
		for (int j = 0; j < commands.length; j++) {
			if(!buildersFound.contains(commands[j].getBuilderName()))
				newCommands[i++]=commands[j];
			else System.out.println("nature project:enlève le builder:"+commands[j].getBuilderName());
		}
		
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);		
	}

	private ArrayList<String> getBuildersIdFound(ICommand[] commands) {
		ArrayList <String>buildersFound=new ArrayList<String>();		
		for(String projectBuilderId:AlloyPlugin.getDefault().getProjectBuildersID())
		{			
			boolean present=false;
			for (int i = 0; i < commands.length; ++i) {
				if (commands[i].getBuilderName().equals(projectBuilderId)) {
					{present=true;break;}
				}
			}
			if(present)
			{			
				buildersFound.add(projectBuilderId);
			}
		}
		return buildersFound;
	}

	public IProject getProject() {
		return project;

	}

	public void setProject(IProject project) {
		this.project = project;
		
	}

}
