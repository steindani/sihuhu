/*
* generated by Xtext
*/
package hu.bme.mit.rnd.behavior.text.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class BehaviorDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "System");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEventsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEventsEventParserRuleCall_3_0 = (RuleCall)cEventsAssignment_3.eContents().get(0);
		private final Assignment cComponentsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cComponentsComponentParserRuleCall_4_0 = (RuleCall)cComponentsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//System returns behav::System:
		//	"System" name=ID "{" events+=Event* components+=Component* "}";
		public ParserRule getRule() { return rule; }

		//"System" name=ID "{" events+=Event* components+=Component* "}"
		public Group getGroup() { return cGroup; }

		//"System"
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//events+=Event*
		public Assignment getEventsAssignment_3() { return cEventsAssignment_3; }

		//Event
		public RuleCall getEventsEventParserRuleCall_3_0() { return cEventsEventParserRuleCall_3_0; }

		//components+=Component*
		public Assignment getComponentsAssignment_4() { return cComponentsAssignment_4; }

		//Component
		public RuleCall getComponentsComponentParserRuleCall_4_0() { return cComponentsComponentParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStatesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatesStateParserRuleCall_3_0 = (RuleCall)cStatesAssignment_3.eContents().get(0);
		private final Keyword cAsteriskKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCurrentStateAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cCurrentStateStateCrossReference_5_0 = (CrossReference)cCurrentStateAssignment_5.eContents().get(0);
		private final RuleCall cCurrentStateStateIDTerminalRuleCall_5_0_1 = (RuleCall)cCurrentStateStateCrossReference_5_0.eContents().get(1);
		private final Assignment cTransitionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTransitionsTransitionParserRuleCall_6_0 = (RuleCall)cTransitionsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Component returns behav::Component:
		//	"Component" name=ID "{" states+=State* "*" currentState=[behav::State] transitions+=Transition* "}";
		public ParserRule getRule() { return rule; }

		//"Component" name=ID "{" states+=State* "*" currentState=[behav::State] transitions+=Transition* "}"
		public Group getGroup() { return cGroup; }

		//"Component"
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//states+=State*
		public Assignment getStatesAssignment_3() { return cStatesAssignment_3; }

		//State
		public RuleCall getStatesStateParserRuleCall_3_0() { return cStatesStateParserRuleCall_3_0; }

		//"*"
		public Keyword getAsteriskKeyword_4() { return cAsteriskKeyword_4; }

		//currentState=[behav::State]
		public Assignment getCurrentStateAssignment_5() { return cCurrentStateAssignment_5; }

		//[behav::State]
		public CrossReference getCurrentStateStateCrossReference_5_0() { return cCurrentStateStateCrossReference_5_0; }

		//ID
		public RuleCall getCurrentStateStateIDTerminalRuleCall_5_0_1() { return cCurrentStateStateIDTerminalRuleCall_5_0_1; }

		//transitions+=Transition*
		public Assignment getTransitionsAssignment_6() { return cTransitionsAssignment_6; }

		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_6_0() { return cTransitionsTransitionParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFromStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromStateStateCrossReference_3_0 = (CrossReference)cFromStateAssignment_3.eContents().get(0);
		private final RuleCall cFromStateStateIDTerminalRuleCall_3_0_1 = (RuleCall)cFromStateStateCrossReference_3_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToStateAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cToStateStateCrossReference_5_0 = (CrossReference)cToStateAssignment_5.eContents().get(0);
		private final RuleCall cToStateStateIDTerminalRuleCall_5_0_1 = (RuleCall)cToStateStateCrossReference_5_0.eContents().get(1);
		private final Keyword cOnKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTriggeringEventAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cTriggeringEventEventCrossReference_7_0 = (CrossReference)cTriggeringEventAssignment_7.eContents().get(0);
		private final RuleCall cTriggeringEventEventIDTerminalRuleCall_7_0_1 = (RuleCall)cTriggeringEventEventCrossReference_7_0.eContents().get(1);
		private final Alternatives cAlternatives_8 = (Alternatives)cGroup.eContents().get(8);
		private final Group cGroup_8_0 = (Group)cAlternatives_8.eContents().get(0);
		private final Keyword cGuardKeyword_8_0_0 = (Keyword)cGroup_8_0.eContents().get(0);
		private final Keyword cColonKeyword_8_0_1 = (Keyword)cGroup_8_0.eContents().get(1);
		private final Assignment cGuardStatesAssignment_8_0_2 = (Assignment)cGroup_8_0.eContents().get(2);
		private final CrossReference cGuardStatesStateCrossReference_8_0_2_0 = (CrossReference)cGuardStatesAssignment_8_0_2.eContents().get(0);
		private final RuleCall cGuardStatesStateIDTerminalRuleCall_8_0_2_0_1 = (RuleCall)cGuardStatesStateCrossReference_8_0_2_0.eContents().get(1);
		private final Group cGroup_8_1 = (Group)cAlternatives_8.eContents().get(1);
		private final Keyword cGuardsKeyword_8_1_0 = (Keyword)cGroup_8_1.eContents().get(0);
		private final Keyword cColonKeyword_8_1_1 = (Keyword)cGroup_8_1.eContents().get(1);
		private final Assignment cGuardStatesAssignment_8_1_2 = (Assignment)cGroup_8_1.eContents().get(2);
		private final CrossReference cGuardStatesStateCrossReference_8_1_2_0 = (CrossReference)cGuardStatesAssignment_8_1_2.eContents().get(0);
		private final RuleCall cGuardStatesStateIDTerminalRuleCall_8_1_2_0_1 = (RuleCall)cGuardStatesStateCrossReference_8_1_2_0.eContents().get(1);
		private final Group cGroup_8_1_3 = (Group)cGroup_8_1.eContents().get(3);
		private final Keyword cCommaKeyword_8_1_3_0 = (Keyword)cGroup_8_1_3.eContents().get(0);
		private final Assignment cGuardStatesAssignment_8_1_3_1 = (Assignment)cGroup_8_1_3.eContents().get(1);
		private final CrossReference cGuardStatesStateCrossReference_8_1_3_1_0 = (CrossReference)cGuardStatesAssignment_8_1_3_1.eContents().get(0);
		private final RuleCall cGuardStatesStateIDTerminalRuleCall_8_1_3_1_0_1 = (RuleCall)cGuardStatesStateCrossReference_8_1_3_1_0.eContents().get(1);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cGeneratesKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cGeneratedEventAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cGeneratedEventEventCrossReference_9_1_0 = (CrossReference)cGeneratedEventAssignment_9_1.eContents().get(0);
		private final RuleCall cGeneratedEventEventIDTerminalRuleCall_9_1_0_1 = (RuleCall)cGeneratedEventEventCrossReference_9_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Transition returns behav::Transition:
		//	"Transition" name=ID ":" fromState=[behav::State] "->" toState=[behav::State] "on" triggeringEvent=[behav::Event]
		//	("guard" ":" guardStates+=[behav::State] | "guards" ":" guardStates+=[behav::State] (","
		//	guardStates+=[behav::State])+)? ("generates" generatedEvent=[behav::Event])? ";";
		public ParserRule getRule() { return rule; }

		//"Transition" name=ID ":" fromState=[behav::State] "->" toState=[behav::State] "on" triggeringEvent=[behav::Event]
		//("guard" ":" guardStates+=[behav::State] | "guards" ":" guardStates+=[behav::State] (","
		//guardStates+=[behav::State])+)? ("generates" generatedEvent=[behav::Event])? ";"
		public Group getGroup() { return cGroup; }

		//"Transition"
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//fromState=[behav::State]
		public Assignment getFromStateAssignment_3() { return cFromStateAssignment_3; }

		//[behav::State]
		public CrossReference getFromStateStateCrossReference_3_0() { return cFromStateStateCrossReference_3_0; }

		//ID
		public RuleCall getFromStateStateIDTerminalRuleCall_3_0_1() { return cFromStateStateIDTerminalRuleCall_3_0_1; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }

		//toState=[behav::State]
		public Assignment getToStateAssignment_5() { return cToStateAssignment_5; }

		//[behav::State]
		public CrossReference getToStateStateCrossReference_5_0() { return cToStateStateCrossReference_5_0; }

		//ID
		public RuleCall getToStateStateIDTerminalRuleCall_5_0_1() { return cToStateStateIDTerminalRuleCall_5_0_1; }

		//"on"
		public Keyword getOnKeyword_6() { return cOnKeyword_6; }

		//triggeringEvent=[behav::Event]
		public Assignment getTriggeringEventAssignment_7() { return cTriggeringEventAssignment_7; }

		//[behav::Event]
		public CrossReference getTriggeringEventEventCrossReference_7_0() { return cTriggeringEventEventCrossReference_7_0; }

		//ID
		public RuleCall getTriggeringEventEventIDTerminalRuleCall_7_0_1() { return cTriggeringEventEventIDTerminalRuleCall_7_0_1; }

		//("guard" ":" guardStates+=[behav::State] | "guards" ":" guardStates+=[behav::State] ("," guardStates+=[behav::State])+)?
		public Alternatives getAlternatives_8() { return cAlternatives_8; }

		//"guard" ":" guardStates+=[behav::State]
		public Group getGroup_8_0() { return cGroup_8_0; }

		//"guard"
		public Keyword getGuardKeyword_8_0_0() { return cGuardKeyword_8_0_0; }

		//":"
		public Keyword getColonKeyword_8_0_1() { return cColonKeyword_8_0_1; }

		//guardStates+=[behav::State]
		public Assignment getGuardStatesAssignment_8_0_2() { return cGuardStatesAssignment_8_0_2; }

		//[behav::State]
		public CrossReference getGuardStatesStateCrossReference_8_0_2_0() { return cGuardStatesStateCrossReference_8_0_2_0; }

		//ID
		public RuleCall getGuardStatesStateIDTerminalRuleCall_8_0_2_0_1() { return cGuardStatesStateIDTerminalRuleCall_8_0_2_0_1; }

		//"guards" ":" guardStates+=[behav::State] ("," guardStates+=[behav::State])+
		public Group getGroup_8_1() { return cGroup_8_1; }

		//"guards"
		public Keyword getGuardsKeyword_8_1_0() { return cGuardsKeyword_8_1_0; }

		//":"
		public Keyword getColonKeyword_8_1_1() { return cColonKeyword_8_1_1; }

		//guardStates+=[behav::State]
		public Assignment getGuardStatesAssignment_8_1_2() { return cGuardStatesAssignment_8_1_2; }

		//[behav::State]
		public CrossReference getGuardStatesStateCrossReference_8_1_2_0() { return cGuardStatesStateCrossReference_8_1_2_0; }

		//ID
		public RuleCall getGuardStatesStateIDTerminalRuleCall_8_1_2_0_1() { return cGuardStatesStateIDTerminalRuleCall_8_1_2_0_1; }

		//("," guardStates+=[behav::State])+
		public Group getGroup_8_1_3() { return cGroup_8_1_3; }

		//","
		public Keyword getCommaKeyword_8_1_3_0() { return cCommaKeyword_8_1_3_0; }

		//guardStates+=[behav::State]
		public Assignment getGuardStatesAssignment_8_1_3_1() { return cGuardStatesAssignment_8_1_3_1; }

		//[behav::State]
		public CrossReference getGuardStatesStateCrossReference_8_1_3_1_0() { return cGuardStatesStateCrossReference_8_1_3_1_0; }

		//ID
		public RuleCall getGuardStatesStateIDTerminalRuleCall_8_1_3_1_0_1() { return cGuardStatesStateIDTerminalRuleCall_8_1_3_1_0_1; }

		//("generates" generatedEvent=[behav::Event])?
		public Group getGroup_9() { return cGroup_9; }

		//"generates"
		public Keyword getGeneratesKeyword_9_0() { return cGeneratesKeyword_9_0; }

		//generatedEvent=[behav::Event]
		public Assignment getGeneratedEventAssignment_9_1() { return cGeneratedEventAssignment_9_1; }

		//[behav::Event]
		public CrossReference getGeneratedEventEventCrossReference_9_1_0() { return cGeneratedEventEventCrossReference_9_1_0; }

		//ID
		public RuleCall getGeneratedEventEventIDTerminalRuleCall_9_1_0_1() { return cGeneratedEventEventIDTerminalRuleCall_9_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//State returns behav::State:
		//	"State" name=ID ";";
		public ParserRule getRule() { return rule; }

		//"State" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"State"
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Event returns behav::Event:
		//	"Event" name=ID ";";
		public ParserRule getRule() { return rule; }

		//"Event" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"Event"
		public Keyword getEventKeyword_0() { return cEventKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private final SystemElements pSystem;
	private final ComponentElements pComponent;
	private final TransitionElements pTransition;
	private final StateElements pState;
	private final EventElements pEvent;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BehaviorDSLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSystem = new SystemElements();
		this.pComponent = new ComponentElements();
		this.pTransition = new TransitionElements();
		this.pState = new StateElements();
		this.pEvent = new EventElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("hu.bme.mit.rnd.behavior.text.BehaviorDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//System returns behav::System:
	//	"System" name=ID "{" events+=Event* components+=Component* "}";
	public SystemElements getSystemAccess() {
		return pSystem;
	}
	
	public ParserRule getSystemRule() {
		return getSystemAccess().getRule();
	}

	//Component returns behav::Component:
	//	"Component" name=ID "{" states+=State* "*" currentState=[behav::State] transitions+=Transition* "}";
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}

	//Transition returns behav::Transition:
	//	"Transition" name=ID ":" fromState=[behav::State] "->" toState=[behav::State] "on" triggeringEvent=[behav::Event]
	//	("guard" ":" guardStates+=[behav::State] | "guards" ":" guardStates+=[behav::State] (","
	//	guardStates+=[behav::State])+)? ("generates" generatedEvent=[behav::Event])? ";";
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//State returns behav::State:
	//	"State" name=ID ";";
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Event returns behav::Event:
	//	"Event" name=ID ";";
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
