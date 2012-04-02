package fr.univartois.cril.xtext2.serializer;

import com.google.inject.Inject;
import fr.univartois.cril.xtext2.services.AlsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractAlsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AlsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ArrowOp___LoneKeyword_0_2_or_OneKeyword_0_1_or_SetKeyword_0_3_or_SomeKeyword_0_0__q;
	protected AbstractElementAlias match_BinOp_AmpersandAmpersandKeyword_1_2_or_AmpersandKeyword_1_4_or_AndKeyword_1_3_or_ColonGreaterThanSignKeyword_1_11_or_GreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15_or_GreaterThanSignGreaterThanSignKeyword_1_14_or_HyphenMinusKeyword_1_8_or_IffKeyword_1_6_or_LessThanSignColonKeyword_1_10_or_LessThanSignEqualsSignGreaterThanSignKeyword_1_5_or_LessThanSignLessThanSignKeyword_1_13_or_OrKeyword_1_1_or_PlusSignKeyword_1_7_or_PlusSignPlusSignKeyword_1_9_or_VerticalLineVerticalLineKeyword_1_0;
	protected AbstractElementAlias match_BlockOrPossibleBar_VerticalLineKeyword_1_0_q;
	protected AbstractElementAlias match_CommonQuantUnOp_LoneKeyword_1_2_or_NoKeyword_1_0_or_OneKeyword_1_3_or_SomeKeyword_1_1;
	protected AbstractElementAlias match_Decl_DisjKeyword_1_q;
	protected AbstractElementAlias match_Decl_DisjKeyword_5_q;
	protected AbstractElementAlias match_Decl_PrivateKeyword_0_q;
	protected AbstractElementAlias match_Expression_EqualsSignGreaterThanSignKeyword_1_3_0_0_q;
	protected AbstractElementAlias match_Expression_ExclamationMarkKeyword_1_1_0_0_q_or_NotKeyword_1_1_0_1_q;
	protected AbstractElementAlias match_Expression_ImpliesKeyword_1_3_0_1_q;
	protected AbstractElementAlias match_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a;
	protected AbstractElementAlias match_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p;
	protected AbstractElementAlias match_Expression___ExclamationMarkKeyword_1_1_0_0_or_NotKeyword_1_1_0_1__q;
	protected AbstractElementAlias match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a__a;
	protected AbstractElementAlias match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a;
	protected AbstractElementAlias match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a;
	protected AbstractElementAlias match_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__a;
	protected AbstractElementAlias match_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__p;
	protected AbstractElementAlias match_Expression_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____ImpliesKeyword_1_3_0_1_q__a;
	protected AbstractElementAlias match_Expression_____ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or_____ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_________or_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___or___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a______;
	protected AbstractElementAlias match_Expression_____ImpliesKeyword_1_3_0_1_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q__a;
	protected AbstractElementAlias match_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a__q;
	protected AbstractElementAlias match_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a;
	protected AbstractElementAlias match_FunDeclWParam_PrivateKeyword_0_q;
	protected AbstractElementAlias match_FunDecl_PrivateKeyword_0_q;
	protected AbstractElementAlias match_Open_PrivateKeyword_0_q;
	protected AbstractElementAlias match_PredDecl_PrivateKeyword_0_q;
	protected AbstractElementAlias match_Ref_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1;
	protected AbstractElementAlias match_ReferencesSig_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1;
	protected AbstractElementAlias match_ReferencesSig_____FunKeyword_1_0_0_0_1_or_PredKeyword_1_0_0_0_2_or_ThisKeyword_1_0_0_0_3___SolidusKeyword_1_0_0_1__q;
	protected AbstractElementAlias match_SigQual___AbstractKeyword_1_0_or_LoneKeyword_1_1_or_OneKeyword_1_2_or_PrivateKeyword_1_4_or_SomeKeyword_1_3__a;
	protected AbstractElementAlias match_TerminalExpression_CommercialAtKeyword_13_1_q;
	protected AbstractElementAlias match_TerminalExpression_IntKeyword_13_2_q;
	protected AbstractElementAlias match_TerminalExpression___CommercialAtKeyword_13_1_q_IntKeyword_13_2_q_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q_ThisKeyword_13_4_1___or___INTTerminalRuleCall_5_1_or_NEGATIVE_INTEGERTerminalRuleCall_6_1__;
	protected AbstractElementAlias match_TerminalExpression_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q;
	protected AbstractElementAlias match_UnOp_NotKeyword_1_0_or_SeqKeyword_1_2_or_SetKeyword_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlsGrammarAccess) access;
		match_ArrowOp___LoneKeyword_0_2_or_OneKeyword_0_1_or_SetKeyword_0_3_or_SomeKeyword_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getArrowOpAccess().getLoneKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getArrowOpAccess().getOneKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getArrowOpAccess().getSetKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getArrowOpAccess().getSomeKeyword_0_0()));
		match_BinOp_AmpersandAmpersandKeyword_1_2_or_AmpersandKeyword_1_4_or_AndKeyword_1_3_or_ColonGreaterThanSignKeyword_1_11_or_GreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15_or_GreaterThanSignGreaterThanSignKeyword_1_14_or_HyphenMinusKeyword_1_8_or_IffKeyword_1_6_or_LessThanSignColonKeyword_1_10_or_LessThanSignEqualsSignGreaterThanSignKeyword_1_5_or_LessThanSignLessThanSignKeyword_1_13_or_OrKeyword_1_1_or_PlusSignKeyword_1_7_or_PlusSignPlusSignKeyword_1_9_or_VerticalLineVerticalLineKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBinOpAccess().getAmpersandAmpersandKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getAmpersandKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getAndKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getColonGreaterThanSignKeyword_1_11()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignKeyword_1_14()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getHyphenMinusKeyword_1_8()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getIffKeyword_1_6()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getLessThanSignColonKeyword_1_10()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_5()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getLessThanSignLessThanSignKeyword_1_13()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getOrKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getPlusSignKeyword_1_7()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getPlusSignPlusSignKeyword_1_9()), new TokenAlias(false, false, grammarAccess.getBinOpAccess().getVerticalLineVerticalLineKeyword_1_0()));
		match_BlockOrPossibleBar_VerticalLineKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getBlockOrPossibleBarAccess().getVerticalLineKeyword_1_0());
		match_CommonQuantUnOp_LoneKeyword_1_2_or_NoKeyword_1_0_or_OneKeyword_1_3_or_SomeKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCommonQuantUnOpAccess().getLoneKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getCommonQuantUnOpAccess().getNoKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getCommonQuantUnOpAccess().getOneKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getCommonQuantUnOpAccess().getSomeKeyword_1_1()));
		match_Decl_DisjKeyword_1_q = new TokenAlias(false, true, grammarAccess.getDeclAccess().getDisjKeyword_1());
		match_Decl_DisjKeyword_5_q = new TokenAlias(false, true, grammarAccess.getDeclAccess().getDisjKeyword_5());
		match_Decl_PrivateKeyword_0_q = new TokenAlias(false, true, grammarAccess.getDeclAccess().getPrivateKeyword_0());
		match_Expression_EqualsSignGreaterThanSignKeyword_1_3_0_0_q = new TokenAlias(false, true, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0());
		match_Expression_ExclamationMarkKeyword_1_1_0_0_q_or_NotKeyword_1_1_0_1_q = new AlternativeAlias(false, false, new TokenAlias(false, true, grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_1_0_0()), new TokenAlias(false, true, grammarAccess.getExpressionAccess().getNotKeyword_1_1_0_1()));
		match_Expression_ImpliesKeyword_1_3_0_1_q = new TokenAlias(false, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1());
		match_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()));
		match_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()));
		match_Expression___ExclamationMarkKeyword_1_1_0_0_or_NotKeyword_1_1_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_1_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getNotKeyword_1_1_0_1()));
		match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()), new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())));
		match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())));
		match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()));
		match_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()), new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()));
		match_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()), new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()));
		match_Expression_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____ImpliesKeyword_1_3_0_1_q__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new TokenAlias(false, true, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(false, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()));
		match_Expression_____ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or_____ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_________or_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___or___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a______ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()))), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())))), new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()))), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())))), new GroupAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()))), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())))), new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()))), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()))))), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())))), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()), new TokenAlias(true, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new TokenAlias(true, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()))));
		match_Expression_____ImpliesKeyword_1_3_0_1_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new TokenAlias(false, true, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new TokenAlias(false, true, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()));
		match_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a__q = new GroupAlias(false, true, new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())), new GroupAlias(true, true, new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1()))));
		match_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a = new GroupAlias(true, true, new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2())), new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1())));
		match_FunDeclWParam_PrivateKeyword_0_q = new TokenAlias(false, true, grammarAccess.getFunDeclWParamAccess().getPrivateKeyword_0());
		match_FunDecl_PrivateKeyword_0_q = new TokenAlias(false, true, grammarAccess.getFunDeclAccess().getPrivateKeyword_0());
		match_Open_PrivateKeyword_0_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getPrivateKeyword_0());
		match_PredDecl_PrivateKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPredDeclAccess().getPrivateKeyword_0());
		match_Ref_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRefAccess().getIntKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getRefAccess().getSeqIntKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getRefAccess().getUnivKeyword_1_1()));
		match_ReferencesSig_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getReferencesSigAccess().getIntKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getReferencesSigAccess().getSeqIntKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getReferencesSigAccess().getUnivKeyword_1_1()));
		match_ReferencesSig_____FunKeyword_1_0_0_0_1_or_PredKeyword_1_0_0_0_2_or_ThisKeyword_1_0_0_0_3___SolidusKeyword_1_0_0_1__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getReferencesSigAccess().getFunKeyword_1_0_0_0_1()), new TokenAlias(false, false, grammarAccess.getReferencesSigAccess().getPredKeyword_1_0_0_0_2()), new TokenAlias(false, false, grammarAccess.getReferencesSigAccess().getThisKeyword_1_0_0_0_3())), new TokenAlias(false, false, grammarAccess.getReferencesSigAccess().getSolidusKeyword_1_0_0_1()));
		match_SigQual___AbstractKeyword_1_0_or_LoneKeyword_1_1_or_OneKeyword_1_2_or_PrivateKeyword_1_4_or_SomeKeyword_1_3__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getSigQualAccess().getAbstractKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSigQualAccess().getLoneKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSigQualAccess().getOneKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getSigQualAccess().getPrivateKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getSigQualAccess().getSomeKeyword_1_3()));
		match_TerminalExpression_CommercialAtKeyword_13_1_q = new TokenAlias(false, true, grammarAccess.getTerminalExpressionAccess().getCommercialAtKeyword_13_1());
		match_TerminalExpression_IntKeyword_13_2_q = new TokenAlias(false, true, grammarAccess.getTerminalExpressionAccess().getIntKeyword_13_2());
		match_TerminalExpression___CommercialAtKeyword_13_1_q_IntKeyword_13_2_q_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q_ThisKeyword_13_4_1___or___INTTerminalRuleCall_5_1_or_NEGATIVE_INTEGERTerminalRuleCall_6_1__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getNEGATIVE_INTEGERTerminalRuleCall_6_1())), new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getTerminalExpressionAccess().getCommercialAtKeyword_13_1()), new TokenAlias(false, true, grammarAccess.getTerminalExpressionAccess().getIntKeyword_13_2()), new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getFunKeyword_13_3_0_1()), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getPredKeyword_13_3_0_2()), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getThisKeyword_13_3_0_3())), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getSolidusKeyword_13_3_1())), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getThisKeyword_13_4_1())));
		match_TerminalExpression_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getFunKeyword_13_3_0_1()), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getPredKeyword_13_3_0_2()), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getThisKeyword_13_3_0_3())), new TokenAlias(false, false, grammarAccess.getTerminalExpressionAccess().getSolidusKeyword_13_3_1()));
		match_UnOp_NotKeyword_1_0_or_SeqKeyword_1_2_or_SetKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnOpAccess().getNotKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getUnOpAccess().getSeqKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getUnOpAccess().getSetKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNEGATIVE_INTEGERRule())
			return getNEGATIVE_INTEGERToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getNEGATIVE_INTEGERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ArrowOp___LoneKeyword_0_2_or_OneKeyword_0_1_or_SetKeyword_0_3_or_SomeKeyword_0_0__q.equals(syntax))
				emit_ArrowOp___LoneKeyword_0_2_or_OneKeyword_0_1_or_SetKeyword_0_3_or_SomeKeyword_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BinOp_AmpersandAmpersandKeyword_1_2_or_AmpersandKeyword_1_4_or_AndKeyword_1_3_or_ColonGreaterThanSignKeyword_1_11_or_GreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15_or_GreaterThanSignGreaterThanSignKeyword_1_14_or_HyphenMinusKeyword_1_8_or_IffKeyword_1_6_or_LessThanSignColonKeyword_1_10_or_LessThanSignEqualsSignGreaterThanSignKeyword_1_5_or_LessThanSignLessThanSignKeyword_1_13_or_OrKeyword_1_1_or_PlusSignKeyword_1_7_or_PlusSignPlusSignKeyword_1_9_or_VerticalLineVerticalLineKeyword_1_0.equals(syntax))
				emit_BinOp_AmpersandAmpersandKeyword_1_2_or_AmpersandKeyword_1_4_or_AndKeyword_1_3_or_ColonGreaterThanSignKeyword_1_11_or_GreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15_or_GreaterThanSignGreaterThanSignKeyword_1_14_or_HyphenMinusKeyword_1_8_or_IffKeyword_1_6_or_LessThanSignColonKeyword_1_10_or_LessThanSignEqualsSignGreaterThanSignKeyword_1_5_or_LessThanSignLessThanSignKeyword_1_13_or_OrKeyword_1_1_or_PlusSignKeyword_1_7_or_PlusSignPlusSignKeyword_1_9_or_VerticalLineVerticalLineKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BlockOrPossibleBar_VerticalLineKeyword_1_0_q.equals(syntax))
				emit_BlockOrPossibleBar_VerticalLineKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CommonQuantUnOp_LoneKeyword_1_2_or_NoKeyword_1_0_or_OneKeyword_1_3_or_SomeKeyword_1_1.equals(syntax))
				emit_CommonQuantUnOp_LoneKeyword_1_2_or_NoKeyword_1_0_or_OneKeyword_1_3_or_SomeKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Decl_DisjKeyword_1_q.equals(syntax))
				emit_Decl_DisjKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Decl_DisjKeyword_5_q.equals(syntax))
				emit_Decl_DisjKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Decl_PrivateKeyword_0_q.equals(syntax))
				emit_Decl_PrivateKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_EqualsSignGreaterThanSignKeyword_1_3_0_0_q.equals(syntax))
				emit_Expression_EqualsSignGreaterThanSignKeyword_1_3_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_ExclamationMarkKeyword_1_1_0_0_q_or_NotKeyword_1_1_0_1_q.equals(syntax))
				emit_Expression_ExclamationMarkKeyword_1_1_0_0_q_or_NotKeyword_1_1_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_ImpliesKeyword_1_3_0_1_q.equals(syntax))
				emit_Expression_ImpliesKeyword_1_3_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a.equals(syntax))
				emit_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p.equals(syntax))
				emit_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___ExclamationMarkKeyword_1_1_0_0_or_NotKeyword_1_1_0_1__q.equals(syntax))
				emit_Expression___ExclamationMarkKeyword_1_1_0_0_or_NotKeyword_1_1_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a__a.equals(syntax))
				emit_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a.equals(syntax))
				emit_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a.equals(syntax))
				emit_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__a.equals(syntax))
				emit_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__p.equals(syntax))
				emit_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____ImpliesKeyword_1_3_0_1_q__a.equals(syntax))
				emit_Expression_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____ImpliesKeyword_1_3_0_1_q__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_____ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or_____ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_________or_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___or___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a______.equals(syntax))
				emit_Expression_____ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or_____ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_________or_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___or___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a______(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_____ImpliesKeyword_1_3_0_1_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q__a.equals(syntax))
				emit_Expression_____ImpliesKeyword_1_3_0_1_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a__q.equals(syntax))
				emit_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a.equals(syntax))
				emit_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunDeclWParam_PrivateKeyword_0_q.equals(syntax))
				emit_FunDeclWParam_PrivateKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunDecl_PrivateKeyword_0_q.equals(syntax))
				emit_FunDecl_PrivateKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_PrivateKeyword_0_q.equals(syntax))
				emit_Open_PrivateKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PredDecl_PrivateKeyword_0_q.equals(syntax))
				emit_PredDecl_PrivateKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ref_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1.equals(syntax))
				emit_Ref_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferencesSig_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1.equals(syntax))
				emit_ReferencesSig_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferencesSig_____FunKeyword_1_0_0_0_1_or_PredKeyword_1_0_0_0_2_or_ThisKeyword_1_0_0_0_3___SolidusKeyword_1_0_0_1__q.equals(syntax))
				emit_ReferencesSig_____FunKeyword_1_0_0_0_1_or_PredKeyword_1_0_0_0_2_or_ThisKeyword_1_0_0_0_3___SolidusKeyword_1_0_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigQual___AbstractKeyword_1_0_or_LoneKeyword_1_1_or_OneKeyword_1_2_or_PrivateKeyword_1_4_or_SomeKeyword_1_3__a.equals(syntax))
				emit_SigQual___AbstractKeyword_1_0_or_LoneKeyword_1_1_or_OneKeyword_1_2_or_PrivateKeyword_1_4_or_SomeKeyword_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpression_CommercialAtKeyword_13_1_q.equals(syntax))
				emit_TerminalExpression_CommercialAtKeyword_13_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpression_IntKeyword_13_2_q.equals(syntax))
				emit_TerminalExpression_IntKeyword_13_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpression___CommercialAtKeyword_13_1_q_IntKeyword_13_2_q_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q_ThisKeyword_13_4_1___or___INTTerminalRuleCall_5_1_or_NEGATIVE_INTEGERTerminalRuleCall_6_1__.equals(syntax))
				emit_TerminalExpression___CommercialAtKeyword_13_1_q_IntKeyword_13_2_q_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q_ThisKeyword_13_4_1___or___INTTerminalRuleCall_5_1_or_NEGATIVE_INTEGERTerminalRuleCall_6_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpression_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q.equals(syntax))
				emit_TerminalExpression_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnOp_NotKeyword_1_0_or_SeqKeyword_1_2_or_SetKeyword_1_1.equals(syntax))
				emit_UnOp_NotKeyword_1_0_or_SeqKeyword_1_2_or_SetKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('lone' | 'set' | 'some' | 'one')?
	 */
	protected void emit_ArrowOp___LoneKeyword_0_2_or_OneKeyword_0_1_or_SetKeyword_0_3_or_SomeKeyword_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '&' | 
	     'iff' | 
	     '<=>' | 
	     '<<' | 
	     '<:' | 
	     '>>>' | 
	     '||' | 
	     'or' | 
	     '>>' | 
	     'and' | 
	     '++' | 
	     '-' | 
	     '&&' | 
	     '+' | 
	     ':>'
	 )
	 */
	protected void emit_BinOp_AmpersandAmpersandKeyword_1_2_or_AmpersandKeyword_1_4_or_AndKeyword_1_3_or_ColonGreaterThanSignKeyword_1_11_or_GreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15_or_GreaterThanSignGreaterThanSignKeyword_1_14_or_HyphenMinusKeyword_1_8_or_IffKeyword_1_6_or_LessThanSignColonKeyword_1_10_or_LessThanSignEqualsSignGreaterThanSignKeyword_1_5_or_LessThanSignLessThanSignKeyword_1_13_or_OrKeyword_1_1_or_PlusSignKeyword_1_7_or_PlusSignPlusSignKeyword_1_9_or_VerticalLineVerticalLineKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '|'?
	 */
	protected void emit_BlockOrPossibleBar_VerticalLineKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'lone' | 'no' | 'some' | 'one'
	 */
	protected void emit_CommonQuantUnOp_LoneKeyword_1_2_or_NoKeyword_1_0_or_OneKeyword_1_3_or_SomeKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'disj'?
	 */
	protected void emit_Decl_DisjKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'disj'?
	 */
	protected void emit_Decl_DisjKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'private'?
	 */
	protected void emit_Decl_PrivateKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=>'?
	 */
	protected void emit_Expression_EqualsSignGreaterThanSignKeyword_1_3_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'not'? | '!'?
	 */
	protected void emit_Expression_ExclamationMarkKeyword_1_1_0_0_q_or_NotKeyword_1_1_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'implies'?
	 */
	protected void emit_Expression_ImpliesKeyword_1_3_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=>' | 'implies')*
	 */
	protected void emit_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=>' | 'implies')+
	 */
	protected void emit_Expression___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('!' | 'not')?
	 */
	protected void emit_Expression___ExclamationMarkKeyword_1_1_0_0_or_NotKeyword_1_1_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']' ('=>' | 'implies')*)*
	 */
	protected void emit_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']' ('[' ']')* ('=>' | 'implies')+)*
	 */
	protected void emit_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')*
	 */
	protected void emit_Expression___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (']' ('=>' | 'implies')* '[')*
	 */
	protected void emit_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (']' ('=>' | 'implies')* '[')+
	 */
	protected void emit_Expression___RightSquareBracketKeyword_1_4_2___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__a_LeftSquareBracketKeyword_1_4_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('[' ']') | '=>'?) 'implies'?)*
	 */
	protected void emit_Expression_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____ImpliesKeyword_1_3_0_1_q__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (
	         (
	             (
	                 'implies'* 
	                 '=>'+ 
	                 ('implies'* '=>'+)* 
	                 'implies'* 
	                 ('[' ']')+ 
	                 ('implies'* ('[' ']')+)* 
	                 'implies'* 
	                 '=>'+ 
	                 ('implies'* '=>'+)* 
	                 'implies'* 
	                 ('[' ']')+ 
	                 ('implies'* ('[' ']')+)*
	             ) | 
	             (
	                 'implies'* 
	                 ('[' ']')+ 
	                 ('implies'* ('[' ']')+)* 
	                 'implies'* 
	                 '=>'+ 
	                 ('implies'* '=>'+)* 
	                 'implies'* 
	                 ('[' ']')+ 
	                 ('implies'* ('[' ']')+)*
	             )
	         ) 
	         (
	             'implies'* 
	             '=>'+ 
	             ('implies'* '=>'+)* 
	             'implies'* 
	             ('[' ']')+ 
	             ('implies'* ('[' ']')+)*
	         )* 
	         (('implies'* '=>'+ ('implies'* '=>'+)* 'implies'*) | 'implies'*)
	     ) | 
	     (
	         (
	             (('implies'* '=>'+ ('implies'* '=>'+)* 'implies'*) | 'implies'*) | 
	             ('implies'* ('[' ']')+ ('implies'* ('[' ']')+)* (('implies'* '=>'+ ('implies'* '=>'+)* 'implies'*) | 'implies'*))
	         ) | 
	         (
	             'implies'* 
	             '=>'+ 
	             ('implies'* '=>'+)* 
	             'implies'* 
	             ('[' ']')+ 
	             ('implies'* ('[' ']')+)* 
	             (('implies'* '=>'+ ('implies'* '=>'+)* 'implies'*) | 'implies'*)
	         )
	     )
	 )
	 */
	protected void emit_Expression_____ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or_____ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_______or___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a_________or_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a___or___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a_______ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p___ImpliesKeyword_1_3_0_1_a___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__p__a__a___ImpliesKeyword_1_3_0_1_a_or___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p___ImpliesKeyword_1_3_0_1_a_EqualsSignGreaterThanSignKeyword_1_3_0_0_p__a_ImpliesKeyword_1_3_0_1_a______(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('[' ']') | 'implies'?) '=>'?)*
	 */
	protected void emit_Expression_____ImpliesKeyword_1_3_0_1_q_or___LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2_____EqualsSignGreaterThanSignKeyword_1_3_0_0_q__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('[' ']')* ('=>' | 'implies')+ (('[' ']')* ('=>' | 'implies')+)*)?
	 */
	protected void emit_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('[' ']')* ('=>' | 'implies')+)*
	 */
	protected void emit_Expression_____LeftSquareBracketKeyword_1_4_0_RightSquareBracketKeyword_1_4_2__a___EqualsSignGreaterThanSignKeyword_1_3_0_0_or_ImpliesKeyword_1_3_0_1__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'private'?
	 */
	protected void emit_FunDeclWParam_PrivateKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'private'?
	 */
	protected void emit_FunDecl_PrivateKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'private'?
	 */
	protected void emit_Open_PrivateKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'private'?
	 */
	protected void emit_PredDecl_PrivateKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Int' | 'seq/Int' | 'univ'
	 */
	protected void emit_Ref_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Int' | 'univ' | 'seq/Int'
	 */
	protected void emit_ReferencesSig_IntKeyword_1_2_or_SeqIntKeyword_1_3_or_UnivKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('fun' | 'this' | 'pred') '/')?
	 */
	protected void emit_ReferencesSig_____FunKeyword_1_0_0_0_1_or_PredKeyword_1_0_0_0_2_or_ThisKeyword_1_0_0_0_3___SolidusKeyword_1_0_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('lone' | 'some' | 'private' | 'one' | 'abstract')*
	 */
	protected void emit_SigQual___AbstractKeyword_1_0_or_LoneKeyword_1_1_or_OneKeyword_1_2_or_PrivateKeyword_1_4_or_SomeKeyword_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@'?
	 */
	protected void emit_TerminalExpression_CommercialAtKeyword_13_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'int'?
	 */
	protected void emit_TerminalExpression_IntKeyword_13_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (NEGATIVE_INTEGER | INT) | ('@'? 'int'? (('fun' | 'pred' | 'this') '/')? 'this')
	 */
	protected void emit_TerminalExpression___CommercialAtKeyword_13_1_q_IntKeyword_13_2_q_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q_ThisKeyword_13_4_1___or___INTTerminalRuleCall_5_1_or_NEGATIVE_INTEGERTerminalRuleCall_6_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('fun' | 'pred' | 'this') '/')?
	 */
	protected void emit_TerminalExpression_____FunKeyword_13_3_0_1_or_PredKeyword_13_3_0_2_or_ThisKeyword_13_3_0_3___SolidusKeyword_13_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'not' | 'seq' | 'set'
	 */
	protected void emit_UnOp_NotKeyword_1_0_or_SeqKeyword_1_2_or_SetKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
