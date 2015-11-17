package diagnosis.it3.mydsl.ui;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import diagnosis.Analysis;
import diagnosis.Diagnosis;
import diagnosis.Disease;
import diagnosis.Effect;
import diagnosis.PredictionAlgorithm;
import diagnosis.PredictionF;
import diagnosis.Variations;

public class DefaultHighlightingCalculator implements ISemanticHighlightingCalculator {
	enum mainKeywords{Read,Annotate, Search,Filter,Prioritize,Report}
	
	
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		
		if (resource == null || resource.getParseResult() == null)
			return;
		
		INode root = resource.getParseResult().getRootNode();
		
		for (INode node : root.getAsTreeIterable()) {
			//Diagnosis
			if (node.getSemanticElement() instanceof PredictionF){
				if (node.getGrammarElement() instanceof EnumLiteralDeclaration) {
					acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.Effect);
				}
			}
			
			if (node.getSemanticElement() instanceof Disease){
				if (node.getGrammarElement() instanceof TerminalRule) {
					acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.Disease);
				}
			}
			
			if (node.getGrammarElement() instanceof Keyword) {
				acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.Keyword);
				//Diagnosis
				if(((Keyword) node.getGrammarElement()).getValue().compareTo("Find")==0)
				acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.Diagnosis);
				
				//Main keywords
				for( mainKeywords keyword: mainKeywords.values())
						if(((Keyword) node.getGrammarElement()).getValue().compareTo(keyword.toString())==0)
							acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.MainKeyword);
			}
		}
				
		
	}

}
