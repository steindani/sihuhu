/*
* generated by Xtext
*/
grammar InternalBehaviorDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package hu.bme.mit.rnd.behavior.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package hu.bme.mit.rnd.behavior.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.rnd.behavior.text.services.BehaviorDSLGrammarAccess;

}

@parser::members {

 	private BehaviorDSLGrammarAccess grammarAccess;
 	
    public InternalBehaviorDSLParser(TokenStream input, BehaviorDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "System";	
   	}
   	
   	@Override
   	protected BehaviorDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSystem
entryRuleSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSystemRule()); }
	 iv_ruleSystem=ruleSystem 
	 { $current=$iv_ruleSystem.current; } 
	 EOF 
;

// Rule System
ruleSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='System' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSystemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSystemAccess().getEventsEventParserRuleCall_3_0()); 
	    }
		lv_events_3_0=ruleEvent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSystemRule());
	        }
       		add(
       			$current, 
       			"events",
        		lv_events_3_0, 
        		"Event");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_0()); 
	    }
		lv_components_4_0=ruleComponent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSystemRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_4_0, 
        		"Component");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	 iv_ruleComponent=ruleComponent 
	 { $current=$iv_ruleComponent.current; } 
	 EOF 
;

// Rule Component
ruleComponent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Component' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getStatesStateParserRuleCall_3_0()); 
	    }
		lv_states_3_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_3_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='*' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getAsteriskKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getCurrentStateStateCrossReference_5_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getTransitionsTransitionParserRuleCall_6_0()); 
	    }
		lv_transitions_6_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"transitions",
        		lv_transitions_6_0, 
        		"Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Transition' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0()); 
	}

)
)	otherlv_4='->' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0()); 
	}

)
)	otherlv_6='on' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getOnKeyword_6());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTriggeringEventEventCrossReference_7_0()); 
	}

)
)((	otherlv_8='guard' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getGuardKeyword_8_0_0());
    }
	otherlv_9=':' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getColonKeyword_8_0_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getGuardStatesStateCrossReference_8_0_2_0()); 
	}

)
))
    |(	otherlv_11='guards' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getGuardsKeyword_8_1_0());
    }
	otherlv_12=':' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getColonKeyword_8_1_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_13=RULE_ID
	{
		newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getGuardStatesStateCrossReference_8_1_2_0()); 
	}

)
)(	otherlv_14=',' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getCommaKeyword_8_1_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_15=RULE_ID
	{
		newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getGuardStatesStateCrossReference_8_1_3_1_0()); 
	}

)
))+))?(	otherlv_16='generates' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getGeneratesKeyword_9_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_17=RULE_ID
	{
		newLeafNode(otherlv_17, grammarAccess.getTransitionAccess().getGeneratedEventEventCrossReference_9_1_0()); 
	}

)
))?	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getSemicolonKeyword_10());
    }
)
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='State' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	 iv_ruleEvent=ruleEvent 
	 { $current=$iv_ruleEvent.current; } 
	 EOF 
;

// Rule Event
ruleEvent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Event' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getSemicolonKeyword_2());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


