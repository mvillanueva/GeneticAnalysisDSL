/*
* generated by Xtext
*/
package diagnosis.it3.mydsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MyDiagUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return diagnosis.it3.mydsl.ui.internal.MyDiagActivator.getInstance().getInjector("diagnosis.it3.mydsl.MyDiag");
	}
	
}
