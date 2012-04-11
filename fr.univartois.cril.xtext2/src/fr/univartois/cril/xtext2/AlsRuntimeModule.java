/*
 * generated by Xtext
 */
package fr.univartois.cril.xtext2;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;

import fr.univartois.cril.xtext2.uri.AlsConverters;
import fr.univartois.cril.xtext2.uri.AlsImportUriGlobalScopeProvider;
import fr.univartois.cril.xtext2.navigation.AlsHyperlinkHelper;
import fr.univartois.cril.xtext2.scoping.AlsImportedNamespaceAwareLocalScopeProvider;
import fr.univartois.cril.xtext2.scoping.AlsQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AlsRuntimeModule extends fr.univartois.cril.xtext2.AbstractAlsRuntimeModule {
        
        @Override
        public Class<? extends IValueConverterService> bindIValueConverterService() {
                return AlsConverters.class;
        }
        
        @Override
        public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
                return AlsQualifiedNameProvider.class;
        }
                
        public Class<? extends ImportUriResolver> bindImportUriResolver(){
                return fr.univartois.cril.xtext2.uri.AlsImportUriResolver.class;
        }

        @Override
        public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
                return AlsImportUriGlobalScopeProvider.class;
        }
        
        public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
                binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named("org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.delegate")).to(AlsImportedNamespaceAwareLocalScopeProvider.class);
        }
        
        public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
                return AlsHyperlinkHelper.class;
        }

}