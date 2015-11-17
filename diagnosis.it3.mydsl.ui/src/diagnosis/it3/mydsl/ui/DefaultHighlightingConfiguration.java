package diagnosis.it3.mydsl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class DefaultHighlightingConfiguration implements IHighlightingConfiguration {
	public static final String Disease = "disease";
	public static final String Effect = "effect";
	public static final String Diagnosis = "diagnosis";
	public static final String MainKeyword = "mainKeyword";
	public static final String Keyword = "keyword";
	
	
		
	 // configure the acceptor providing the id, the description string
	 // that will appear in the preference page and the initial text style
	 public void configure(IHighlightingConfigurationAcceptor acceptor) {
		 addType( acceptor, Disease, 50, 0, 100, SWT.ITALIC);
		 addType( acceptor, Effect, 50, 0, 100, SWT.BOLD );
		 
		 addType( acceptor, Diagnosis, 0, 0, 200, SWT.BOLD );
		 addType( acceptor, MainKeyword, 200, 0, 0, SWT.BOLD );
		 addType( acceptor, Keyword, 127, 0, 85, SWT.BOLD );
		 
	 }
	 
	 public void addType(IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style )
	 {
		 TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }

}
