package fr.univartois.cril.xtext2.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.univartois.cril.xtext2.als.Alias;
import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.ArrowOp;
import fr.univartois.cril.xtext2.als.AsName;
import fr.univartois.cril.xtext2.als.Assertion;
import fr.univartois.cril.xtext2.als.AssertionName;
import fr.univartois.cril.xtext2.als.BinOp;
import fr.univartois.cril.xtext2.als.Block;
import fr.univartois.cril.xtext2.als.BlockOrBar;
import fr.univartois.cril.xtext2.als.BlockOrPossibleBar;
import fr.univartois.cril.xtext2.als.CheckCommand;
import fr.univartois.cril.xtext2.als.Colon;
import fr.univartois.cril.xtext2.als.Comma;
import fr.univartois.cril.xtext2.als.CommonQuantUnOp;
import fr.univartois.cril.xtext2.als.Decl;
import fr.univartois.cril.xtext2.als.Dot;
import fr.univartois.cril.xtext2.als.EnumDecl;
import fr.univartois.cril.xtext2.als.EnumName;
import fr.univartois.cril.xtext2.als.EnumPropertyName;
import fr.univartois.cril.xtext2.als.ExactlyName;
import fr.univartois.cril.xtext2.als.Expectation;
import fr.univartois.cril.xtext2.als.Expression;
import fr.univartois.cril.xtext2.als.Fact;
import fr.univartois.cril.xtext2.als.FactName;
import fr.univartois.cril.xtext2.als.Function;
import fr.univartois.cril.xtext2.als.FunctionName;
import fr.univartois.cril.xtext2.als.FunctionNamewParam;
import fr.univartois.cril.xtext2.als.LeftCurlyBracket;
import fr.univartois.cril.xtext2.als.LeftParenthesis;
import fr.univartois.cril.xtext2.als.LeftSquareBracketKeyword;
import fr.univartois.cril.xtext2.als.Let;
import fr.univartois.cril.xtext2.als.LetDecl;
import fr.univartois.cril.xtext2.als.LetName;
import fr.univartois.cril.xtext2.als.Module;
import fr.univartois.cril.xtext2.als.Open;
import fr.univartois.cril.xtext2.als.OpenName;
import fr.univartois.cril.xtext2.als.Param;
import fr.univartois.cril.xtext2.als.ParanthesisandExpression;
import fr.univartois.cril.xtext2.als.Predicate;
import fr.univartois.cril.xtext2.als.PredicateName;
import fr.univartois.cril.xtext2.als.PropertyName;
import fr.univartois.cril.xtext2.als.Ref;
import fr.univartois.cril.xtext2.als.ReferencesSig;
import fr.univartois.cril.xtext2.als.RightCurlyBracket;
import fr.univartois.cril.xtext2.als.RightParenthesis;
import fr.univartois.cril.xtext2.als.RightSquareBracketKeyword;
import fr.univartois.cril.xtext2.als.RunCommand;
import fr.univartois.cril.xtext2.als.Scope;
import fr.univartois.cril.xtext2.als.SigExt;
import fr.univartois.cril.xtext2.als.Signature;
import fr.univartois.cril.xtext2.als.SignatureName;
import fr.univartois.cril.xtext2.als.Specification;
import fr.univartois.cril.xtext2.als.Typescope;
import fr.univartois.cril.xtext2.als.UnOp;
import fr.univartois.cril.xtext2.services.AlsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractAlsSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected AlsGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AlsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AlsPackage.ALIAS:
				if(context == grammarAccess.getAliasRule()) {
					sequence_Alias(context, (Alias) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.ARROW_OP:
				if(context == grammarAccess.getArrowOpRule()) {
					sequence_ArrowOp(context, (ArrowOp) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.AS_NAME:
				if(context == grammarAccess.getAsNameRule()) {
					sequence_AsName(context, (AsName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.ASSERTION:
				if(context == grammarAccess.getAssertDeclRule() ||
				   context == grammarAccess.getParagraphRule()) {
					sequence_AssertDecl(context, (Assertion) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.ASSERTION_NAME:
				if(context == grammarAccess.getAssertionNameRule()) {
					sequence_AssertionName(context, (AssertionName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.BIN_OP:
				if(context == grammarAccess.getBinOpRule()) {
					sequence_BinOp(context, (BinOp) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.BLOCK_OR_BAR:
				if(context == grammarAccess.getBlockOrBarRule()) {
					sequence_BlockOrBar(context, (BlockOrBar) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.BLOCK_OR_POSSIBLE_BAR:
				if(context == grammarAccess.getBlockOrPossibleBarRule()) {
					sequence_BlockOrPossibleBar(context, (BlockOrPossibleBar) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.CHECK_COMMAND:
				if(context == grammarAccess.getCheckDeclRule() ||
				   context == grammarAccess.getParagraphRule()) {
					sequence_CheckDecl(context, (CheckCommand) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.COLON:
				if(context == grammarAccess.getColonRule()) {
					sequence_Colon(context, (Colon) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.COMMA:
				if(context == grammarAccess.getCommaRule()) {
					sequence_Comma(context, (Comma) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.COMMON_QUANT_UN_OP:
				if(context == grammarAccess.getCommonQuantUnOpRule()) {
					sequence_CommonQuantUnOp(context, (CommonQuantUnOp) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.DECL:
				if(context == grammarAccess.getDeclRule()) {
					sequence_Decl(context, (Decl) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.DOT:
				if(context == grammarAccess.getDotRule()) {
					sequence_Dot(context, (Dot) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.ENUM_DECL:
				if(context == grammarAccess.getEnumDeclRule() ||
				   context == grammarAccess.getParagraphRule()) {
					sequence_EnumDecl(context, (EnumDecl) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.ENUM_NAME:
				if(context == grammarAccess.getEnumNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_EnumName(context, (EnumName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.ENUM_PROPERTY_NAME:
				if(context == grammarAccess.getEnumPropertyNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_EnumPropertyName(context, (EnumPropertyName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.EXACTLY_NAME:
				if(context == grammarAccess.getExactlyNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_ExactlyName(context, (ExactlyName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.EXPECTATION:
				if(context == grammarAccess.getExpectationRule()) {
					sequence_Expectation(context, (Expectation) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.FACT:
				if(context == grammarAccess.getFactDeclRule() ||
				   context == grammarAccess.getParagraphRule()) {
					sequence_FactDecl(context, (Fact) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.FACT_NAME:
				if(context == grammarAccess.getFactNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_FactName(context, (FactName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.FUNCTION:
				if(context == grammarAccess.getFunDeclWParamRule()) {
					sequence_FunDeclWParam(context, (Function) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunDeclRule()) {
					sequence_FunDecl(context, (Function) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParagraphRule()) {
					sequence_Paragraph(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.FUNCTION_NAME:
				if(context == grammarAccess.getFunctionNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_FunctionName(context, (FunctionName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.FUNCTION_NAMEW_PARAM:
				if(context == grammarAccess.getFunctionNamewParamRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_FunctionNamewParam(context, (FunctionNamewParam) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.LEFT_CURLY_BRACKET:
				if(context == grammarAccess.getLeftCurlyBracketRule()) {
					sequence_LeftCurlyBracket(context, (LeftCurlyBracket) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.LEFT_PARENTHESIS:
				if(context == grammarAccess.getLeftParenthesisRule()) {
					sequence_LeftParenthesis(context, (LeftParenthesis) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.LEFT_SQUARE_BRACKET_KEYWORD:
				if(context == grammarAccess.getLeftSquareBracketKeywordRule()) {
					sequence_LeftSquareBracketKeyword(context, (LeftSquareBracketKeyword) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.LET:
				if(context == grammarAccess.getLetOutDeclRule() ||
				   context == grammarAccess.getParagraphRule()) {
					sequence_LetOutDecl(context, (Let) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.LET_DECL:
				if(context == grammarAccess.getLetDeclRule()) {
					sequence_LetDecl(context, (LetDecl) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.LET_NAME:
				if(context == grammarAccess.getLetNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_LetName(context, (LetName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.OPEN:
				if(context == grammarAccess.getOpenRule()) {
					sequence_Open(context, (Open) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.OPEN_NAME:
				if(context == grammarAccess.getOpenNameRule()) {
					sequence_OpenName(context, (OpenName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.PARANTHESISAND_EXPRESSION:
				if(context == grammarAccess.getParanthesisandExpressionRule()) {
					sequence_ParanthesisandExpression(context, (ParanthesisandExpression) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.PREDICATE:
				if(context == grammarAccess.getParagraphRule() ||
				   context == grammarAccess.getPredDeclRule()) {
					sequence_PredDecl(context, (Predicate) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.PREDICATE_NAME:
				if(context == grammarAccess.getPredicateNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_PredicateName(context, (PredicateName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.PROPERTY_NAME:
				if(context == grammarAccess.getPropertyNameRule() ||
				   context == grammarAccess.getReferencesNameRule()) {
					sequence_PropertyName(context, (PropertyName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.REF:
				if(context == grammarAccess.getRefRule()) {
					sequence_Ref(context, (Ref) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.REFERENCES_SIG:
				if(context == grammarAccess.getReferencesSigRule()) {
					sequence_ReferencesSig(context, (ReferencesSig) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.RIGHT_CURLY_BRACKET:
				if(context == grammarAccess.getRightCurlyBracketRule()) {
					sequence_RightCurlyBracket(context, (RightCurlyBracket) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.RIGHT_PARENTHESIS:
				if(context == grammarAccess.getRightParenthesisRule()) {
					sequence_RightParenthesis(context, (RightParenthesis) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.RIGHT_SQUARE_BRACKET_KEYWORD:
				if(context == grammarAccess.getRightSquareBracketKeywordRule()) {
					sequence_RightSquareBracketKeyword(context, (RightSquareBracketKeyword) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.RUN_COMMAND:
				if(context == grammarAccess.getParagraphRule() ||
				   context == grammarAccess.getRunDeclRule()) {
					sequence_RunDecl(context, (RunCommand) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.SCOPE:
				if(context == grammarAccess.getScopeRule()) {
					sequence_Scope(context, (Scope) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.SIG_EXT:
				if(context == grammarAccess.getSigExtRule()) {
					sequence_SigExt(context, (SigExt) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.SIGNATURE:
				if(context == grammarAccess.getParagraphRule() ||
				   context == grammarAccess.getSigDeclRule()) {
					sequence_SigDecl(context, (Signature) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.SIGNATURE_NAME:
				if(context == grammarAccess.getReferencesNameRule() ||
				   context == grammarAccess.getSignatureNameRule()) {
					sequence_SignatureName(context, (SignatureName) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.SPECIFICATION:
				if(context == grammarAccess.getSpecificationRule()) {
					sequence_Specification(context, (Specification) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.TYPESCOPE:
				if(context == grammarAccess.getTypescopeRule()) {
					sequence_Typescope(context, (Typescope) semanticObject); 
					return; 
				}
				else break;
			case AlsPackage.UN_OP:
				if(context == grammarAccess.getUnOpRule()) {
					sequence_UnOp(context, (UnOp) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=NameAlias
	 */
	protected void sequence_Alias(EObject context, Alias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.ALIAS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.ALIAS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasAccess().getNameNameAliasParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arrow='->'
	 */
	protected void sequence_ArrowOp(EObject context, ArrowOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.ARROW_OP__ARROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.ARROW_OP__ARROW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrowOpAccess().getArrowHyphenMinusGreaterThanSignKeyword_1_0(), semanticObject.getArrow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AsName(EObject context, AsName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.AS_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.AS_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=AssertionName block=Block)
	 */
	protected void sequence_AssertDecl(EObject context, Assertion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.ASSERTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.ASSERTION__NAME));
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.ASSERTION__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.ASSERTION__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertDeclAccess().getNameAssertionNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssertDeclAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name?)
	 */
	protected void sequence_AssertionName(EObject context, AssertionName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dot=Dot?)
	 */
	protected void sequence_BinOp(EObject context, BinOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block | expr=Expression)
	 */
	protected void sequence_BlockOrBar(EObject context, BlockOrBar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block | expr=Expression)
	 */
	protected void sequence_BlockOrPossibleBar(EObject context, BlockOrPossibleBar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftC=LeftCurlyBracket expr+=Expression* rightC=RightCurlyBracket)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (checkName=Alias? (name=[AssertionName|ID] | block=Block) scope=Scope)
	 */
	protected void sequence_CheckDecl(EObject context, CheckCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     colon=':'
	 */
	protected void sequence_Colon(EObject context, Colon semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.COLON__COLON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.COLON__COLON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColonAccess().getColonColonKeyword_0(), semanticObject.getColon());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     comma=','
	 */
	protected void sequence_Comma(EObject context, Comma semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.COMMA__COMMA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.COMMA__COMMA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommaAccess().getCommaCommaKeyword_0(), semanticObject.getComma());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {CommonQuantUnOp}
	 */
	protected void sequence_CommonQuantUnOp(EObject context, CommonQuantUnOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyName+=PropertyName (comma+=Comma propertyName+=PropertyName)* colon=Colon expr=Expression)
	 */
	protected void sequence_Decl(EObject context, Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dot='.'
	 */
	protected void sequence_Dot(EObject context, Dot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.DOT__DOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.DOT__DOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDotAccess().getDotFullStopKeyword_0(), semanticObject.getDot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation+=DOC_COMMENT? 
	 *         enumName=EnumName 
	 *         leftC=LeftCurlyBracket 
	 *         propertyEnum+=EnumPropertyName 
	 *         (comma+=Comma propertyEnum+=EnumPropertyName)* 
	 *         rightC=RightCurlyBracket
	 *     )
	 */
	protected void sequence_EnumDecl(EObject context, EnumDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_EnumName(EObject context, EnumName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumNameAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_EnumPropertyName(EObject context, EnumPropertyName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumPropertyNameAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_ExactlyName(EObject context, ExactlyName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExactlyNameAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expect='expect' value=INT)
	 */
	protected void sequence_Expectation(EObject context, Expectation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.EXPECTATION__EXPECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.EXPECTATION__EXPECT));
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.EXPECTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.EXPECTATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpectationAccess().getExpectExpectKeyword_0_0(), semanticObject.getExpect());
		feeder.accept(grammarAccess.getExpectationAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (parO='(' expr+=Expression+ parF=')') | 
	 *             (let='let' letdecl+=LetDecl (comma+=Comma letdecl+=LetDecl)* blockOrBar+=BlockOrBar) | 
	 *             (quant=Quant (decl+=Decl (comma+=Comma decl+=Decl)*)? (blockOrBar+=BlockOrBar | expr+=Expression)?) | 
	 *             (unOp=UnOp expr+=Expression) | 
	 *             (common+=CommonQuantUnOp (decl+=Decl (comma+=Comma decl+=Decl)*)? (blockOrBar+=BlockOrBar | expr+=Expression)?) | 
	 *             none='none' | 
	 *             iden='iden' | 
	 *             univ='univ' | 
	 *             (int='int' nameRef=[ReferencesName|ID]?) | 
	 *             seq='seq/Int' | 
	 *             (
	 *                 asname=[AsName|ID]? 
	 *                 (
	 *                     nameRef=[ReferencesName|ID] | 
	 *                     name='pred/totalOrder' | 
	 *                     name='fun/add' | 
	 *                     name='fun/sub' | 
	 *                     name='fun/mul' | 
	 *                     name='fun/div' | 
	 *                     name='fun/rem' | 
	 *                     name='fun/min' | 
	 *                     name='fun/max' | 
	 *                     name='fun/next'
	 *                 )?
	 *             ) | 
	 *             block+=Block | 
	 *             (leftCurlyBracket=LeftCurlyBracket decl+=Decl (comma+=Comma decl+=Decl)* blockOrBar+=BlockOrBar rightCurlyBracket=RightCurlyBracket)
	 *         ) 
	 *         (
	 *             (binOp+=BinOp expr+=Expression) | 
	 *             (cmp+=CompareOp expr+=Expression) | 
	 *             (arrowOp+=ArrowOp expr+=Expression) | 
	 *             ((par+=ParanthesisandExpression | expr+=Expression)? expr+=Expression?) | 
	 *             (expr+=Expression (comma+=Comma expr+=Expression)*)?
	 *         )*
	 *     )
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation+=DOC_COMMENT? name=FactName block=Block)
	 */
	protected void sequence_FactDecl(EObject context, Fact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name?)
	 */
	protected void sequence_FactName(EObject context, FactName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation+=DOC_COMMENT? 
	 *         (ref=Ref dot=Dot)? 
	 *         name=FunctionNamewParam 
	 *         colon=Colon 
	 *         expr=Expression 
	 *         block=Block
	 *     )
	 */
	protected void sequence_FunDeclWParam(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation+=DOC_COMMENT? 
	 *         (ref=Ref dot=Dot)? 
	 *         name=FunctionName 
	 *         (
	 *             (leftS=LeftSquareBracketKeyword (param+=Param (comma+=Comma param+=Param)*)? rightS=RightSquareBracketKeyword) | 
	 *             (leftP=LeftParenthesis (decl+=Decl (comma+=Comma decl+=Decl)*)? rightP=RightParenthesis)
	 *         ) 
	 *         colon=Colon 
	 *         expr=Expression 
	 *         block=Block
	 *     )
	 */
	protected void sequence_FunDecl(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_FunctionName(EObject context, FunctionName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionNameAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_FunctionNamewParam(EObject context, FunctionNamewParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionNamewParamAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     leftCurlyBracket='{'
	 */
	protected void sequence_LeftCurlyBracket(EObject context, LeftCurlyBracket semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.LEFT_CURLY_BRACKET__LEFT_CURLY_BRACKET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLeftCurlyBracketAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0(), semanticObject.getLeftCurlyBracket());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     leftParenthesis='('
	 */
	protected void sequence_LeftParenthesis(EObject context, LeftParenthesis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.LEFT_PARENTHESIS__LEFT_PARENTHESIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.LEFT_PARENTHESIS__LEFT_PARENTHESIS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLeftParenthesisAccess().getLeftParenthesisLeftParenthesisKeyword_0(), semanticObject.getLeftParenthesis());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     leftSquareBracketKeyword='['
	 */
	protected void sequence_LeftSquareBracketKeyword(EObject context, LeftSquareBracketKeyword semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.LEFT_SQUARE_BRACKET_KEYWORD__LEFT_SQUARE_BRACKET_KEYWORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLeftSquareBracketKeywordAccess().getLeftSquareBracketKeywordLeftSquareBracketKeyword_0(), semanticObject.getLeftSquareBracketKeyword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nameExpression=PropertyName expr=Expression)
	 */
	protected void sequence_LetDecl(EObject context, LetDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.LET_DECL__NAME_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.LET_DECL__NAME_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.LET_DECL__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.LET_DECL__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLetDeclAccess().getNameExpressionPropertyNameParserRuleCall_0_0(), semanticObject.getNameExpression());
		feeder.accept(grammarAccess.getLetDeclAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_LetName(EObject context, LetName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLetNameAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation+=DOC_COMMENT? 
	 *         name=LetName 
	 *         (leftS=LeftSquareBracketKeyword (nameRef+=ReferencesName (comma+=Comma nameRef+=ReferencesName)*)? rightS=RightSquareBracketKeyword)? 
	 *         (block=Block | exprName=Expression)
	 *     )
	 */
	protected void sequence_LetOutDecl(EObject context, Let semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         moduleName=Name 
	 *         (
	 *             left=LeftSquareBracketKeyword 
	 *             exactly+='exactly'? 
	 *             name+=ExactlyName 
	 *             (comma+=Comma ((exactly+='exactly'? number+=INT) | name+=ExactlyName))* 
	 *             right=RightSquareBracketKeyword
	 *         )?
	 *     )
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=Name
	 */
	protected void sequence_OpenName(EObject context, OpenName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.OPEN_NAME__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.OPEN_NAME__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpenNameAccess().getImportURINameParserRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         openName=OpenName 
	 *         (left=LeftSquareBracketKeyword previousNameAs=AsName? refname=[SignatureName|ID] right=RightSquareBracketKeyword)? 
	 *         nameAs=AsName?
	 *     )
	 */
	protected void sequence_Open(EObject context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             documentation+=DOC_COMMENT? 
	 *             (ref=Ref dot=Dot)? 
	 *             name=FunctionName 
	 *             (
	 *                 (leftS=LeftSquareBracketKeyword (param+=Param (comma+=Comma param+=Param)*)? rightS=RightSquareBracketKeyword) | 
	 *                 (leftP=LeftParenthesis (decl+=Decl (comma+=Comma decl+=Decl)*)? rightP=RightParenthesis)
	 *             ) 
	 *             colon=Colon 
	 *             expr=Expression 
	 *             block=Block
	 *         ) | 
	 *         (
	 *             documentation+=DOC_COMMENT? 
	 *             (ref=Ref dot=Dot)? 
	 *             name=FunctionNamewParam 
	 *             colon=Colon 
	 *             expr=Expression 
	 *             block=Block
	 *         )
	 *     )
	 */
	protected void sequence_Paragraph(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyName+=PropertyName (comma+=Comma propertyName+=PropertyName)* colon=Colon expr=Expression)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr+=Expression
	 */
	protected void sequence_ParanthesisandExpression(EObject context, ParanthesisandExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation+=DOC_COMMENT? 
	 *         (ref=Ref dot=Dot)? 
	 *         name=PredicateName 
	 *         (
	 *             (leftS=LeftSquareBracketKeyword (param+=Param (comma+=Comma param+=Param)*)? rightS=RightSquareBracketKeyword) | 
	 *             (leftP=LeftParenthesis (param+=Param (comma+=Comma param+=Param)*)? rightP=RightParenthesis)
	 *         )? 
	 *         block=Block
	 *     )
	 */
	protected void sequence_PredDecl(EObject context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_PredicateName(EObject context, PredicateName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateNameAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_PropertyName(EObject context, PropertyName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyNameAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nameRef=[ReferencesName|ID]?)
	 */
	protected void sequence_Ref(EObject context, Ref semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((asname=[AsName|ID]? nameRef=[SignatureName|ID])?)
	 */
	protected void sequence_ReferencesSig(EObject context, ReferencesSig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     rightCurlyBracket='}'
	 */
	protected void sequence_RightCurlyBracket(EObject context, RightCurlyBracket semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.RIGHT_CURLY_BRACKET__RIGHT_CURLY_BRACKET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRightCurlyBracketAccess().getRightCurlyBracketRightCurlyBracketKeyword_0(), semanticObject.getRightCurlyBracket());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rightParenthesis=')'
	 */
	protected void sequence_RightParenthesis(EObject context, RightParenthesis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.RIGHT_PARENTHESIS__RIGHT_PARENTHESIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.RIGHT_PARENTHESIS__RIGHT_PARENTHESIS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRightParenthesisAccess().getRightParenthesisRightParenthesisKeyword_0(), semanticObject.getRightParenthesis());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rightSquareBracketKeyword=']'
	 */
	protected void sequence_RightSquareBracketKeyword(EObject context, RightSquareBracketKeyword semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.RIGHT_SQUARE_BRACKET_KEYWORD__RIGHT_SQUARE_BRACKET_KEYWORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRightSquareBracketKeywordAccess().getRightSquareBracketKeywordRightSquareBracketKeyword_0(), semanticObject.getRightSquareBracketKeyword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (runName=Alias? (name=[PredicateName|ID] | block=Block) scope=Scope)
	 */
	protected void sequence_RunDecl(EObject context, RunCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (for='for' value=INT expect=Expectation?) | 
	 *         (
	 *             for='for' 
	 *             value=INT 
	 *             but='but' 
	 *             typescope+=Typescope 
	 *             (comma+=Comma typescope+=Typescope)* 
	 *             expect=Expectation?
	 *         ) | 
	 *         (for='for' typescope+=Typescope (comma+=Comma typescope+=Typescope)* expect=Expectation?) | 
	 *         (expect=Expectation?)
	 *     )
	 */
	protected void sequence_Scope(EObject context, Scope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         documentation+=DOC_COMMENT? 
	 *         signatureName+=SignatureName 
	 *         (comma+=Comma signatureName+=SignatureName)* 
	 *         sigExt=SigExt? 
	 *         (decl+=Decl (comma2+=',' decl+=Decl)*)? 
	 *         block=Block?
	 *     )
	 */
	protected void sequence_SigDecl(EObject context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=ReferencesSig | (ref=ReferencesSig ref2+=ReferencesSig*))
	 */
	protected void sequence_SigExt(EObject context, SigExt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_SignatureName(EObject context, SignatureName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlsPackage.Literals.REFERENCES_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSignatureNameAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (module=Module? open+=Open* paragraph+=Paragraph*)
	 */
	protected void sequence_Specification(EObject context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (parO='(' expr+=Expression+ parF=')') | 
	 *         (let='let' letdecl+=LetDecl (comma+=Comma letdecl+=LetDecl)* blockOrBar+=BlockOrBar) | 
	 *         (quant=Quant (decl+=Decl (comma+=Comma decl+=Decl)*)? (blockOrBar+=BlockOrBar | expr+=Expression)?) | 
	 *         (unOp=UnOp expr+=Expression) | 
	 *         (common+=CommonQuantUnOp (decl+=Decl (comma+=Comma decl+=Decl)*)? (blockOrBar+=BlockOrBar | expr+=Expression)?) | 
	 *         none='none' | 
	 *         iden='iden' | 
	 *         univ='univ' | 
	 *         (int='int' nameRef=[ReferencesName|ID]?) | 
	 *         seq='seq/Int' | 
	 *         (
	 *             asname=[AsName|ID]? 
	 *             (
	 *                 nameRef=[ReferencesName|ID] | 
	 *                 name='pred/totalOrder' | 
	 *                 name='fun/add' | 
	 *                 name='fun/sub' | 
	 *                 name='fun/mul' | 
	 *                 name='fun/div' | 
	 *                 name='fun/rem' | 
	 *                 name='fun/min' | 
	 *                 name='fun/max' | 
	 *                 name='fun/next'
	 *             )?
	 *         ) | 
	 *         block+=Block | 
	 *         (leftCurlyBracket=LeftCurlyBracket decl+=Decl (comma+=Comma decl+=Decl)* blockOrBar+=BlockOrBar rightCurlyBracket=RightCurlyBracket)
	 *     )
	 */
	protected void sequence_TerminalExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exactly='exactly'? value=INT ((asname=[AsName|ID] | prev='this') sl='/')? (name=[ReferencesName|ID] | post='int' | post='seq'))
	 */
	protected void sequence_Typescope(EObject context, Typescope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((op='!' | op='#' | op='~' | op='*' | op='^')?)
	 */
	protected void sequence_UnOp(EObject context, UnOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
