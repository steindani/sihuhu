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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBehaviorDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'}'", "'Component'", "'*'", "'Transition'", "':'", "'->'", "'on'", "'guard'", "'guards'", "','", "'generates'", "';'", "'State'", "'Event'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBehaviorDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBehaviorDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBehaviorDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g"; }



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



    // $ANTLR start "entryRuleSystem"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:67:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:68:2: (iv_ruleSystem= ruleSystem EOF )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:69:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem75);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:76:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_events_3_0 = null;

        EObject lv_components_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:79:28: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:80:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:80:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '}' )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:80:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:85:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem156); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:106:1: ( (lv_events_3_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:107:1: (lv_events_3_0= ruleEvent )
            	    {
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:107:1: (lv_events_3_0= ruleEvent )
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:108:3: lv_events_3_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getEventsEventParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleSystem177);
            	    lv_events_3_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_3_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:124:3: ( (lv_components_4_0= ruleComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:125:1: (lv_components_4_0= ruleComponent )
            	    {
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:125:1: (lv_components_4_0= ruleComponent )
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:126:3: lv_components_4_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleSystem199);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_4_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSystem212); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleComponent"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:154:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:155:2: (iv_ruleComponent= ruleComponent EOF )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:156:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent248);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:163:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '*' ( (otherlv_5= RULE_ID ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_states_3_0 = null;

        EObject lv_transitions_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:166:28: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '*' ( (otherlv_5= RULE_ID ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:167:1: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '*' ( (otherlv_5= RULE_ID ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:167:1: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '*' ( (otherlv_5= RULE_ID ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:167:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '*' ( (otherlv_5= RULE_ID ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComponent295); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:172:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:172:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent312); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponent329); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:193:1: ( (lv_states_3_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:194:1: (lv_states_3_0= ruleState )
            	    {
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:194:1: (lv_states_3_0= ruleState )
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:195:3: lv_states_3_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleComponent350);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_3_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleComponent363); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getAsteriskKeyword_4());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:215:1: ( (otherlv_5= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:216:1: (otherlv_5= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:216:1: (otherlv_5= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:217:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent383); 

            		newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getCurrentStateStateCrossReference_5_0()); 
            	

            }


            }

            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:228:2: ( (lv_transitions_6_0= ruleTransition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:229:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:229:1: (lv_transitions_6_0= ruleTransition )
            	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:230:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleComponent404);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_6_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleComponent417); 

                	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleTransition"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:258:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:259:2: (iv_ruleTransition= ruleTransition EOF )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:260:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition453);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:267:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ ) )? (otherlv_16= 'generates' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:270:28: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ ) )? (otherlv_16= 'generates' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= ';' ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:271:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ ) )? (otherlv_16= 'generates' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= ';' )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:271:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ ) )? (otherlv_16= 'generates' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= ';' )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:271:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ ) )? (otherlv_16= 'generates' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTransition500); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:276:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:276:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition517); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTransition534); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:297:1: ( (otherlv_3= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:298:1: (otherlv_3= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:298:1: (otherlv_3= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:299:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition554); 

            		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTransition566); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:314:1: ( (otherlv_5= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:315:1: (otherlv_5= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:315:1: (otherlv_5= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:316:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition586); 

            		newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleTransition598); 

                	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getOnKeyword_6());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:331:1: ( (otherlv_7= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:332:1: (otherlv_7= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:332:1: (otherlv_7= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:333:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition618); 

            		newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTriggeringEventEventCrossReference_7_0()); 
            	

            }


            }

            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:344:2: ( (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:344:3: (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:344:3: (otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:344:5: otherlv_8= 'guard' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTransition632); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getGuardKeyword_8_0_0());
                        
                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleTransition644); 

                        	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getColonKeyword_8_0_1());
                        
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:352:1: ( (otherlv_10= RULE_ID ) )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:353:1: (otherlv_10= RULE_ID )
                    {
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:353:1: (otherlv_10= RULE_ID )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:354:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition664); 

                    		newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getGuardStatesStateCrossReference_8_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:366:6: (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ )
                    {
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:366:6: (otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+ )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:366:8: otherlv_11= 'guards' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleTransition684); 

                        	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getGuardsKeyword_8_1_0());
                        
                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleTransition696); 

                        	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getColonKeyword_8_1_1());
                        
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:374:1: ( (otherlv_13= RULE_ID ) )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:375:1: (otherlv_13= RULE_ID )
                    {
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:375:1: (otherlv_13= RULE_ID )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:376:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition716); 

                    		newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getGuardStatesStateCrossReference_8_1_2_0()); 
                    	

                    }


                    }

                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:387:2: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:387:4: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleTransition729); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getCommaKeyword_8_1_3_0());
                    	        
                    	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:391:1: ( (otherlv_15= RULE_ID ) )
                    	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:392:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:392:1: (otherlv_15= RULE_ID )
                    	    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:393:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition749); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getGuardStatesStateCrossReference_8_1_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:404:7: (otherlv_16= 'generates' ( (otherlv_17= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:404:9: otherlv_16= 'generates' ( (otherlv_17= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleTransition767); 

                        	newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getGeneratesKeyword_9_0());
                        
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:408:1: ( (otherlv_17= RULE_ID ) )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:409:1: (otherlv_17= RULE_ID )
                    {
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:409:1: (otherlv_17= RULE_ID )
                    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:410:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition787); 

                    		newLeafNode(otherlv_17, grammarAccess.getTransitionAccess().getGeneratedEventEventCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleTransition801); 

                	newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getSemicolonKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:433:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:434:2: (iv_ruleState= ruleState EOF )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:435:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState837);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:442:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:445:28: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:446:1: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:446:1: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:446:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleState884); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:450:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:451:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:451:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:452:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState901); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleState918); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEvent"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:480:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:481:2: (iv_ruleEvent= ruleEvent EOF )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:482:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent954);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent964); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:489:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:492:28: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:493:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:493:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:493:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEvent1001); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:497:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:498:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:498:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.rnd.behavior.text/src-gen/hu/bme/mit/rnd/behavior/text/parser/antlr/internal/InternalBehaviorDSL.g:499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent1018); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleEvent1035); 

                	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystem122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem156 = new BitSet(new long[]{0x0000000004006000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleSystem177 = new BitSet(new long[]{0x0000000004006000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleSystem199 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSystem212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponent295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent312 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent329 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_ruleState_in_ruleComponent350 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent383 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleComponent404 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleComponent417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTransition500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition517 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTransition534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition554 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTransition566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition586 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransition598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition618 = new BitSet(new long[]{0x0000000001B00000L});
    public static final BitSet FOLLOW_20_in_ruleTransition632 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTransition644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition664 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_21_in_ruleTransition684 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTransition696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition716 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition749 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_23_in_ruleTransition767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition787 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTransition801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleState884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState901 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleState918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEvent1001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent1018 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEvent1035 = new BitSet(new long[]{0x0000000000000002L});

}