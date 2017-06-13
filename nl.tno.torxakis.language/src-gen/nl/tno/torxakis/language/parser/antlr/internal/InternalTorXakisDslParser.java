package nl.tno.torxakis.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.tno.torxakis.language.services.TorXakisDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTorXakisDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CAPSID", "RULE_SMALLID", "RULE_INT", "RULE_STRING", "RULE_OPERATOR", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "'TYPEDEF'", "';'", "'ENDDEF'", "'::='", "'FUNCDEF'", "'('", "')'", "'::'", "'CONSTDEF'", "'PROCDEF'", "'['", "']'", "'STAUTDEF'", "'CHANDEF'", "'MODELDEF'", "'CHAN'", "'IN'", "'OUT'", "'BEHAVIOUR'", "'MAPPERDEF'", "'CNECTDEF'", "'CLIENTSOCK'", "'SERVERSOCK'", "'STATE'", "'VAR'", "'INIT'", "'TRANS'", "'->'", "'{'", "'}'", "':='", "'|'", "','", "'EXIT'", "'HOST'", "'PORT'", "'ENCODE'", "'DECODE'", "'<-'", "'#'", "'>>>'", "'ACCEPT'", "'?'", "'!'", "'NI'", "'[>>'", "'[><'", "'||'", "'|||'", "'##'", "'HIDE'", "'LET'", "'>->'", "'=>>'", "'STOP'", "'|['", "']|'", "'[['", "']]'", "'='", "'ERROR'", "'IF'", "'THEN'", "'ELSE'", "'FI'", "'REGEX'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_SMALLID=5;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_OPERATOR=8;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_CAPSID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTorXakisDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTorXakisDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTorXakisDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTorXakisDsl.g"; }



     	private TorXakisDslGrammarAccess grammarAccess;

        public InternalTorXakisDslParser(TokenStream input, TorXakisDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TorXakisDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTorXakisDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTorXakisDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTorXakisDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTorXakisDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_typeDefs_0_0= ruleTypeDefs ) ) | ( (lv_funcDefs_1_0= ruleFuncDefs ) ) | ( (lv_constDefs_2_0= ruleConstDefs ) ) | ( (lv_procDefs_3_0= ruleProcDefs ) ) | ( (lv_stautDefs_4_0= ruleStautDefs ) ) | ( (lv_channelDefs_5_0= ruleChannelDefs ) ) | ( (lv_modelDef_6_0= ruleModelDef ) ) | ( (lv_mapperDef_7_0= ruleMapperDef ) ) | ( (lv_cnectDef_8_0= ruleCnectDef ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_typeDefs_0_0 = null;

        EObject lv_funcDefs_1_0 = null;

        EObject lv_constDefs_2_0 = null;

        EObject lv_procDefs_3_0 = null;

        EObject lv_stautDefs_4_0 = null;

        EObject lv_channelDefs_5_0 = null;

        EObject lv_modelDef_6_0 = null;

        EObject lv_mapperDef_7_0 = null;

        EObject lv_cnectDef_8_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:77:2: ( ( ( (lv_typeDefs_0_0= ruleTypeDefs ) ) | ( (lv_funcDefs_1_0= ruleFuncDefs ) ) | ( (lv_constDefs_2_0= ruleConstDefs ) ) | ( (lv_procDefs_3_0= ruleProcDefs ) ) | ( (lv_stautDefs_4_0= ruleStautDefs ) ) | ( (lv_channelDefs_5_0= ruleChannelDefs ) ) | ( (lv_modelDef_6_0= ruleModelDef ) ) | ( (lv_mapperDef_7_0= ruleMapperDef ) ) | ( (lv_cnectDef_8_0= ruleCnectDef ) ) )* )
            // InternalTorXakisDsl.g:78:2: ( ( (lv_typeDefs_0_0= ruleTypeDefs ) ) | ( (lv_funcDefs_1_0= ruleFuncDefs ) ) | ( (lv_constDefs_2_0= ruleConstDefs ) ) | ( (lv_procDefs_3_0= ruleProcDefs ) ) | ( (lv_stautDefs_4_0= ruleStautDefs ) ) | ( (lv_channelDefs_5_0= ruleChannelDefs ) ) | ( (lv_modelDef_6_0= ruleModelDef ) ) | ( (lv_mapperDef_7_0= ruleMapperDef ) ) | ( (lv_cnectDef_8_0= ruleCnectDef ) ) )*
            {
            // InternalTorXakisDsl.g:78:2: ( ( (lv_typeDefs_0_0= ruleTypeDefs ) ) | ( (lv_funcDefs_1_0= ruleFuncDefs ) ) | ( (lv_constDefs_2_0= ruleConstDefs ) ) | ( (lv_procDefs_3_0= ruleProcDefs ) ) | ( (lv_stautDefs_4_0= ruleStautDefs ) ) | ( (lv_channelDefs_5_0= ruleChannelDefs ) ) | ( (lv_modelDef_6_0= ruleModelDef ) ) | ( (lv_mapperDef_7_0= ruleMapperDef ) ) | ( (lv_cnectDef_8_0= ruleCnectDef ) ) )*
            loop1:
            do {
                int alt1=10;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt1=1;
                    }
                    break;
                case 18:
                    {
                    alt1=2;
                    }
                    break;
                case 22:
                    {
                    alt1=3;
                    }
                    break;
                case 23:
                    {
                    alt1=4;
                    }
                    break;
                case 26:
                    {
                    alt1=5;
                    }
                    break;
                case 27:
                    {
                    alt1=6;
                    }
                    break;
                case 28:
                    {
                    alt1=7;
                    }
                    break;
                case 33:
                    {
                    alt1=8;
                    }
                    break;
                case 34:
                    {
                    alt1=9;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalTorXakisDsl.g:79:3: ( (lv_typeDefs_0_0= ruleTypeDefs ) )
            	    {
            	    // InternalTorXakisDsl.g:79:3: ( (lv_typeDefs_0_0= ruleTypeDefs ) )
            	    // InternalTorXakisDsl.g:80:4: (lv_typeDefs_0_0= ruleTypeDefs )
            	    {
            	    // InternalTorXakisDsl.g:80:4: (lv_typeDefs_0_0= ruleTypeDefs )
            	    // InternalTorXakisDsl.g:81:5: lv_typeDefs_0_0= ruleTypeDefs
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTypeDefsTypeDefsParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_typeDefs_0_0=ruleTypeDefs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeDefs",
            	    						lv_typeDefs_0_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.TypeDefs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTorXakisDsl.g:99:3: ( (lv_funcDefs_1_0= ruleFuncDefs ) )
            	    {
            	    // InternalTorXakisDsl.g:99:3: ( (lv_funcDefs_1_0= ruleFuncDefs ) )
            	    // InternalTorXakisDsl.g:100:4: (lv_funcDefs_1_0= ruleFuncDefs )
            	    {
            	    // InternalTorXakisDsl.g:100:4: (lv_funcDefs_1_0= ruleFuncDefs )
            	    // InternalTorXakisDsl.g:101:5: lv_funcDefs_1_0= ruleFuncDefs
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFuncDefsFuncDefsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_funcDefs_1_0=ruleFuncDefs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"funcDefs",
            	    						lv_funcDefs_1_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.FuncDefs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTorXakisDsl.g:119:3: ( (lv_constDefs_2_0= ruleConstDefs ) )
            	    {
            	    // InternalTorXakisDsl.g:119:3: ( (lv_constDefs_2_0= ruleConstDefs ) )
            	    // InternalTorXakisDsl.g:120:4: (lv_constDefs_2_0= ruleConstDefs )
            	    {
            	    // InternalTorXakisDsl.g:120:4: (lv_constDefs_2_0= ruleConstDefs )
            	    // InternalTorXakisDsl.g:121:5: lv_constDefs_2_0= ruleConstDefs
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstDefsConstDefsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_constDefs_2_0=ruleConstDefs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constDefs",
            	    						lv_constDefs_2_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.ConstDefs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTorXakisDsl.g:139:3: ( (lv_procDefs_3_0= ruleProcDefs ) )
            	    {
            	    // InternalTorXakisDsl.g:139:3: ( (lv_procDefs_3_0= ruleProcDefs ) )
            	    // InternalTorXakisDsl.g:140:4: (lv_procDefs_3_0= ruleProcDefs )
            	    {
            	    // InternalTorXakisDsl.g:140:4: (lv_procDefs_3_0= ruleProcDefs )
            	    // InternalTorXakisDsl.g:141:5: lv_procDefs_3_0= ruleProcDefs
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getProcDefsProcDefsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_procDefs_3_0=ruleProcDefs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"procDefs",
            	    						lv_procDefs_3_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.ProcDefs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTorXakisDsl.g:159:3: ( (lv_stautDefs_4_0= ruleStautDefs ) )
            	    {
            	    // InternalTorXakisDsl.g:159:3: ( (lv_stautDefs_4_0= ruleStautDefs ) )
            	    // InternalTorXakisDsl.g:160:4: (lv_stautDefs_4_0= ruleStautDefs )
            	    {
            	    // InternalTorXakisDsl.g:160:4: (lv_stautDefs_4_0= ruleStautDefs )
            	    // InternalTorXakisDsl.g:161:5: lv_stautDefs_4_0= ruleStautDefs
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStautDefsStautDefsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_stautDefs_4_0=ruleStautDefs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stautDefs",
            	    						lv_stautDefs_4_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.StautDefs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalTorXakisDsl.g:179:3: ( (lv_channelDefs_5_0= ruleChannelDefs ) )
            	    {
            	    // InternalTorXakisDsl.g:179:3: ( (lv_channelDefs_5_0= ruleChannelDefs ) )
            	    // InternalTorXakisDsl.g:180:4: (lv_channelDefs_5_0= ruleChannelDefs )
            	    {
            	    // InternalTorXakisDsl.g:180:4: (lv_channelDefs_5_0= ruleChannelDefs )
            	    // InternalTorXakisDsl.g:181:5: lv_channelDefs_5_0= ruleChannelDefs
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getChannelDefsChannelDefsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_channelDefs_5_0=ruleChannelDefs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"channelDefs",
            	    						lv_channelDefs_5_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.ChannelDefs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalTorXakisDsl.g:199:3: ( (lv_modelDef_6_0= ruleModelDef ) )
            	    {
            	    // InternalTorXakisDsl.g:199:3: ( (lv_modelDef_6_0= ruleModelDef ) )
            	    // InternalTorXakisDsl.g:200:4: (lv_modelDef_6_0= ruleModelDef )
            	    {
            	    // InternalTorXakisDsl.g:200:4: (lv_modelDef_6_0= ruleModelDef )
            	    // InternalTorXakisDsl.g:201:5: lv_modelDef_6_0= ruleModelDef
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getModelDefModelDefParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_modelDef_6_0=ruleModelDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modelDef",
            	    						lv_modelDef_6_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.ModelDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalTorXakisDsl.g:219:3: ( (lv_mapperDef_7_0= ruleMapperDef ) )
            	    {
            	    // InternalTorXakisDsl.g:219:3: ( (lv_mapperDef_7_0= ruleMapperDef ) )
            	    // InternalTorXakisDsl.g:220:4: (lv_mapperDef_7_0= ruleMapperDef )
            	    {
            	    // InternalTorXakisDsl.g:220:4: (lv_mapperDef_7_0= ruleMapperDef )
            	    // InternalTorXakisDsl.g:221:5: lv_mapperDef_7_0= ruleMapperDef
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMapperDefMapperDefParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_mapperDef_7_0=ruleMapperDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mapperDef",
            	    						lv_mapperDef_7_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.MapperDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalTorXakisDsl.g:239:3: ( (lv_cnectDef_8_0= ruleCnectDef ) )
            	    {
            	    // InternalTorXakisDsl.g:239:3: ( (lv_cnectDef_8_0= ruleCnectDef ) )
            	    // InternalTorXakisDsl.g:240:4: (lv_cnectDef_8_0= ruleCnectDef )
            	    {
            	    // InternalTorXakisDsl.g:240:4: (lv_cnectDef_8_0= ruleCnectDef )
            	    // InternalTorXakisDsl.g:241:5: lv_cnectDef_8_0= ruleCnectDef
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCnectDefCnectDefParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_cnectDef_8_0=ruleCnectDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cnectDef",
            	    						lv_cnectDef_8_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.CnectDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDefs"
    // InternalTorXakisDsl.g:262:1: entryRuleTypeDefs returns [EObject current=null] : iv_ruleTypeDefs= ruleTypeDefs EOF ;
    public final EObject entryRuleTypeDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefs = null;


        try {
            // InternalTorXakisDsl.g:262:49: (iv_ruleTypeDefs= ruleTypeDefs EOF )
            // InternalTorXakisDsl.g:263:2: iv_ruleTypeDefs= ruleTypeDefs EOF
            {
             newCompositeNode(grammarAccess.getTypeDefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDefs=ruleTypeDefs();

            state._fsp--;

             current =iv_ruleTypeDefs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeDefs"


    // $ANTLR start "ruleTypeDefs"
    // InternalTorXakisDsl.g:269:1: ruleTypeDefs returns [EObject current=null] : (otherlv_0= 'TYPEDEF' ( (lv_typeDefs_1_0= ruleTypeDef ) ) (otherlv_2= ';' ( (lv_typeDefs_3_0= ruleTypeDef ) ) )* otherlv_4= 'ENDDEF' ) ;
    public final EObject ruleTypeDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeDefs_1_0 = null;

        EObject lv_typeDefs_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:275:2: ( (otherlv_0= 'TYPEDEF' ( (lv_typeDefs_1_0= ruleTypeDef ) ) (otherlv_2= ';' ( (lv_typeDefs_3_0= ruleTypeDef ) ) )* otherlv_4= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:276:2: (otherlv_0= 'TYPEDEF' ( (lv_typeDefs_1_0= ruleTypeDef ) ) (otherlv_2= ';' ( (lv_typeDefs_3_0= ruleTypeDef ) ) )* otherlv_4= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:276:2: (otherlv_0= 'TYPEDEF' ( (lv_typeDefs_1_0= ruleTypeDef ) ) (otherlv_2= ';' ( (lv_typeDefs_3_0= ruleTypeDef ) ) )* otherlv_4= 'ENDDEF' )
            // InternalTorXakisDsl.g:277:3: otherlv_0= 'TYPEDEF' ( (lv_typeDefs_1_0= ruleTypeDef ) ) (otherlv_2= ';' ( (lv_typeDefs_3_0= ruleTypeDef ) ) )* otherlv_4= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDefsAccess().getTYPEDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:281:3: ( (lv_typeDefs_1_0= ruleTypeDef ) )
            // InternalTorXakisDsl.g:282:4: (lv_typeDefs_1_0= ruleTypeDef )
            {
            // InternalTorXakisDsl.g:282:4: (lv_typeDefs_1_0= ruleTypeDef )
            // InternalTorXakisDsl.g:283:5: lv_typeDefs_1_0= ruleTypeDef
            {

            					newCompositeNode(grammarAccess.getTypeDefsAccess().getTypeDefsTypeDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_typeDefs_1_0=ruleTypeDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefsRule());
            					}
            					add(
            						current,
            						"typeDefs",
            						lv_typeDefs_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:300:3: (otherlv_2= ';' ( (lv_typeDefs_3_0= ruleTypeDef ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTorXakisDsl.g:301:4: otherlv_2= ';' ( (lv_typeDefs_3_0= ruleTypeDef ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDefsAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:305:4: ( (lv_typeDefs_3_0= ruleTypeDef ) )
            	    // InternalTorXakisDsl.g:306:5: (lv_typeDefs_3_0= ruleTypeDef )
            	    {
            	    // InternalTorXakisDsl.g:306:5: (lv_typeDefs_3_0= ruleTypeDef )
            	    // InternalTorXakisDsl.g:307:6: lv_typeDefs_3_0= ruleTypeDef
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDefsAccess().getTypeDefsTypeDefParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_typeDefs_3_0=ruleTypeDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDefsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeDefs",
            	    							lv_typeDefs_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.TypeDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeDefsAccess().getENDDEFKeyword_3());
            		

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
    // $ANTLR end "ruleTypeDefs"


    // $ANTLR start "entryRuleTypeDef"
    // InternalTorXakisDsl.g:333:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalTorXakisDsl.g:333:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalTorXakisDsl.g:334:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalTorXakisDsl.g:340:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleTypeName ) ) otherlv_1= '::=' ( (lv_neConstructorList_2_0= ruleNeConstructorList ) ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_neConstructorList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:346:2: ( ( ( (lv_name_0_0= ruleTypeName ) ) otherlv_1= '::=' ( (lv_neConstructorList_2_0= ruleNeConstructorList ) ) ) )
            // InternalTorXakisDsl.g:347:2: ( ( (lv_name_0_0= ruleTypeName ) ) otherlv_1= '::=' ( (lv_neConstructorList_2_0= ruleNeConstructorList ) ) )
            {
            // InternalTorXakisDsl.g:347:2: ( ( (lv_name_0_0= ruleTypeName ) ) otherlv_1= '::=' ( (lv_neConstructorList_2_0= ruleNeConstructorList ) ) )
            // InternalTorXakisDsl.g:348:3: ( (lv_name_0_0= ruleTypeName ) ) otherlv_1= '::=' ( (lv_neConstructorList_2_0= ruleNeConstructorList ) )
            {
            // InternalTorXakisDsl.g:348:3: ( (lv_name_0_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:349:4: (lv_name_0_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:349:4: (lv_name_0_0= ruleTypeName )
            // InternalTorXakisDsl.g:350:5: lv_name_0_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getTypeDefAccess().getNameTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeDefAccess().getColonColonEqualsSignKeyword_1());
            		
            // InternalTorXakisDsl.g:371:3: ( (lv_neConstructorList_2_0= ruleNeConstructorList ) )
            // InternalTorXakisDsl.g:372:4: (lv_neConstructorList_2_0= ruleNeConstructorList )
            {
            // InternalTorXakisDsl.g:372:4: (lv_neConstructorList_2_0= ruleNeConstructorList )
            // InternalTorXakisDsl.g:373:5: lv_neConstructorList_2_0= ruleNeConstructorList
            {

            					newCompositeNode(grammarAccess.getTypeDefAccess().getNeConstructorListNeConstructorListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_neConstructorList_2_0=ruleNeConstructorList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefRule());
            					}
            					set(
            						current,
            						"neConstructorList",
            						lv_neConstructorList_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeConstructorList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleFuncDefs"
    // InternalTorXakisDsl.g:394:1: entryRuleFuncDefs returns [EObject current=null] : iv_ruleFuncDefs= ruleFuncDefs EOF ;
    public final EObject entryRuleFuncDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDefs = null;


        try {
            // InternalTorXakisDsl.g:394:49: (iv_ruleFuncDefs= ruleFuncDefs EOF )
            // InternalTorXakisDsl.g:395:2: iv_ruleFuncDefs= ruleFuncDefs EOF
            {
             newCompositeNode(grammarAccess.getFuncDefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncDefs=ruleFuncDefs();

            state._fsp--;

             current =iv_ruleFuncDefs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFuncDefs"


    // $ANTLR start "ruleFuncDefs"
    // InternalTorXakisDsl.g:401:1: ruleFuncDefs returns [EObject current=null] : (otherlv_0= 'FUNCDEF' ( (lv_funcDefs_1_0= ruleFuncDef ) ) (otherlv_2= ';' ( (lv_funcDefs_3_0= ruleFuncDef ) ) )* otherlv_4= 'ENDDEF' ) ;
    public final EObject ruleFuncDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_funcDefs_1_0 = null;

        EObject lv_funcDefs_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:407:2: ( (otherlv_0= 'FUNCDEF' ( (lv_funcDefs_1_0= ruleFuncDef ) ) (otherlv_2= ';' ( (lv_funcDefs_3_0= ruleFuncDef ) ) )* otherlv_4= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:408:2: (otherlv_0= 'FUNCDEF' ( (lv_funcDefs_1_0= ruleFuncDef ) ) (otherlv_2= ';' ( (lv_funcDefs_3_0= ruleFuncDef ) ) )* otherlv_4= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:408:2: (otherlv_0= 'FUNCDEF' ( (lv_funcDefs_1_0= ruleFuncDef ) ) (otherlv_2= ';' ( (lv_funcDefs_3_0= ruleFuncDef ) ) )* otherlv_4= 'ENDDEF' )
            // InternalTorXakisDsl.g:409:3: otherlv_0= 'FUNCDEF' ( (lv_funcDefs_1_0= ruleFuncDef ) ) (otherlv_2= ';' ( (lv_funcDefs_3_0= ruleFuncDef ) ) )* otherlv_4= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncDefsAccess().getFUNCDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:413:3: ( (lv_funcDefs_1_0= ruleFuncDef ) )
            // InternalTorXakisDsl.g:414:4: (lv_funcDefs_1_0= ruleFuncDef )
            {
            // InternalTorXakisDsl.g:414:4: (lv_funcDefs_1_0= ruleFuncDef )
            // InternalTorXakisDsl.g:415:5: lv_funcDefs_1_0= ruleFuncDef
            {

            					newCompositeNode(grammarAccess.getFuncDefsAccess().getFuncDefsFuncDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_funcDefs_1_0=ruleFuncDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncDefsRule());
            					}
            					add(
            						current,
            						"funcDefs",
            						lv_funcDefs_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.FuncDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:432:3: (otherlv_2= ';' ( (lv_funcDefs_3_0= ruleFuncDef ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTorXakisDsl.g:433:4: otherlv_2= ';' ( (lv_funcDefs_3_0= ruleFuncDef ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFuncDefsAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:437:4: ( (lv_funcDefs_3_0= ruleFuncDef ) )
            	    // InternalTorXakisDsl.g:438:5: (lv_funcDefs_3_0= ruleFuncDef )
            	    {
            	    // InternalTorXakisDsl.g:438:5: (lv_funcDefs_3_0= ruleFuncDef )
            	    // InternalTorXakisDsl.g:439:6: lv_funcDefs_3_0= ruleFuncDef
            	    {

            	    						newCompositeNode(grammarAccess.getFuncDefsAccess().getFuncDefsFuncDefParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_funcDefs_3_0=ruleFuncDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncDefsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"funcDefs",
            	    							lv_funcDefs_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.FuncDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncDefsAccess().getENDDEFKeyword_3());
            		

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
    // $ANTLR end "ruleFuncDefs"


    // $ANTLR start "entryRuleFuncDef"
    // InternalTorXakisDsl.g:465:1: entryRuleFuncDef returns [EObject current=null] : iv_ruleFuncDef= ruleFuncDef EOF ;
    public final EObject entryRuleFuncDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDef = null;


        try {
            // InternalTorXakisDsl.g:465:48: (iv_ruleFuncDef= ruleFuncDef EOF )
            // InternalTorXakisDsl.g:466:2: iv_ruleFuncDef= ruleFuncDef EOF
            {
             newCompositeNode(grammarAccess.getFuncDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncDef=ruleFuncDef();

            state._fsp--;

             current =iv_ruleFuncDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFuncDef"


    // $ANTLR start "ruleFuncDef"
    // InternalTorXakisDsl.g:472:1: ruleFuncDef returns [EObject current=null] : ( ( (lv_funcName_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) ) otherlv_3= ')' otherlv_4= '::' ( (lv_typeName_5_0= ruleTypeName ) ) otherlv_6= '::=' ( (lv_valExpr_7_0= ruleValExpr ) ) ) ;
    public final EObject ruleFuncDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_funcName_0_0 = null;

        EObject lv_neVarsDelarationList_2_0 = null;

        EObject lv_typeName_5_0 = null;

        EObject lv_valExpr_7_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:478:2: ( ( ( (lv_funcName_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) ) otherlv_3= ')' otherlv_4= '::' ( (lv_typeName_5_0= ruleTypeName ) ) otherlv_6= '::=' ( (lv_valExpr_7_0= ruleValExpr ) ) ) )
            // InternalTorXakisDsl.g:479:2: ( ( (lv_funcName_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) ) otherlv_3= ')' otherlv_4= '::' ( (lv_typeName_5_0= ruleTypeName ) ) otherlv_6= '::=' ( (lv_valExpr_7_0= ruleValExpr ) ) )
            {
            // InternalTorXakisDsl.g:479:2: ( ( (lv_funcName_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) ) otherlv_3= ')' otherlv_4= '::' ( (lv_typeName_5_0= ruleTypeName ) ) otherlv_6= '::=' ( (lv_valExpr_7_0= ruleValExpr ) ) )
            // InternalTorXakisDsl.g:480:3: ( (lv_funcName_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) ) otherlv_3= ')' otherlv_4= '::' ( (lv_typeName_5_0= ruleTypeName ) ) otherlv_6= '::=' ( (lv_valExpr_7_0= ruleValExpr ) )
            {
            // InternalTorXakisDsl.g:480:3: ( (lv_funcName_0_0= ruleFuncName ) )
            // InternalTorXakisDsl.g:481:4: (lv_funcName_0_0= ruleFuncName )
            {
            // InternalTorXakisDsl.g:481:4: (lv_funcName_0_0= ruleFuncName )
            // InternalTorXakisDsl.g:482:5: lv_funcName_0_0= ruleFuncName
            {

            					newCompositeNode(grammarAccess.getFuncDefAccess().getFuncNameFuncNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_funcName_0_0=ruleFuncName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncDefRule());
            					}
            					set(
            						current,
            						"funcName",
            						lv_funcName_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.FuncName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncDefAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTorXakisDsl.g:503:3: ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) )
            // InternalTorXakisDsl.g:504:4: (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList )
            {
            // InternalTorXakisDsl.g:504:4: (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList )
            // InternalTorXakisDsl.g:505:5: lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList
            {

            					newCompositeNode(grammarAccess.getFuncDefAccess().getNeVarsDelarationListNeVarsDeclarationListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_neVarsDelarationList_2_0=ruleNeVarsDeclarationList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncDefRule());
            					}
            					set(
            						current,
            						"neVarsDelarationList",
            						lv_neVarsDelarationList_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeVarsDeclarationList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncDefAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncDefAccess().getColonColonKeyword_4());
            		
            // InternalTorXakisDsl.g:530:3: ( (lv_typeName_5_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:531:4: (lv_typeName_5_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:531:4: (lv_typeName_5_0= ruleTypeName )
            // InternalTorXakisDsl.g:532:5: lv_typeName_5_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getFuncDefAccess().getTypeNameTypeNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_typeName_5_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncDefRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_5_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getFuncDefAccess().getColonColonEqualsSignKeyword_6());
            		
            // InternalTorXakisDsl.g:553:3: ( (lv_valExpr_7_0= ruleValExpr ) )
            // InternalTorXakisDsl.g:554:4: (lv_valExpr_7_0= ruleValExpr )
            {
            // InternalTorXakisDsl.g:554:4: (lv_valExpr_7_0= ruleValExpr )
            // InternalTorXakisDsl.g:555:5: lv_valExpr_7_0= ruleValExpr
            {

            					newCompositeNode(grammarAccess.getFuncDefAccess().getValExprValExprParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_valExpr_7_0=ruleValExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncDefRule());
            					}
            					set(
            						current,
            						"valExpr",
            						lv_valExpr_7_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleFuncDef"


    // $ANTLR start "entryRuleConstDefs"
    // InternalTorXakisDsl.g:576:1: entryRuleConstDefs returns [EObject current=null] : iv_ruleConstDefs= ruleConstDefs EOF ;
    public final EObject entryRuleConstDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDefs = null;


        try {
            // InternalTorXakisDsl.g:576:50: (iv_ruleConstDefs= ruleConstDefs EOF )
            // InternalTorXakisDsl.g:577:2: iv_ruleConstDefs= ruleConstDefs EOF
            {
             newCompositeNode(grammarAccess.getConstDefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstDefs=ruleConstDefs();

            state._fsp--;

             current =iv_ruleConstDefs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstDefs"


    // $ANTLR start "ruleConstDefs"
    // InternalTorXakisDsl.g:583:1: ruleConstDefs returns [EObject current=null] : (otherlv_0= 'CONSTDEF' ( (lv_constDefs_1_0= ruleConstDef ) ) (otherlv_2= ';' ( (lv_constDefs_3_0= ruleConstDef ) ) )* otherlv_4= 'ENDDEF' ) ;
    public final EObject ruleConstDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constDefs_1_0 = null;

        EObject lv_constDefs_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:589:2: ( (otherlv_0= 'CONSTDEF' ( (lv_constDefs_1_0= ruleConstDef ) ) (otherlv_2= ';' ( (lv_constDefs_3_0= ruleConstDef ) ) )* otherlv_4= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:590:2: (otherlv_0= 'CONSTDEF' ( (lv_constDefs_1_0= ruleConstDef ) ) (otherlv_2= ';' ( (lv_constDefs_3_0= ruleConstDef ) ) )* otherlv_4= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:590:2: (otherlv_0= 'CONSTDEF' ( (lv_constDefs_1_0= ruleConstDef ) ) (otherlv_2= ';' ( (lv_constDefs_3_0= ruleConstDef ) ) )* otherlv_4= 'ENDDEF' )
            // InternalTorXakisDsl.g:591:3: otherlv_0= 'CONSTDEF' ( (lv_constDefs_1_0= ruleConstDef ) ) (otherlv_2= ';' ( (lv_constDefs_3_0= ruleConstDef ) ) )* otherlv_4= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDefsAccess().getCONSTDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:595:3: ( (lv_constDefs_1_0= ruleConstDef ) )
            // InternalTorXakisDsl.g:596:4: (lv_constDefs_1_0= ruleConstDef )
            {
            // InternalTorXakisDsl.g:596:4: (lv_constDefs_1_0= ruleConstDef )
            // InternalTorXakisDsl.g:597:5: lv_constDefs_1_0= ruleConstDef
            {

            					newCompositeNode(grammarAccess.getConstDefsAccess().getConstDefsConstDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_constDefs_1_0=ruleConstDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstDefsRule());
            					}
            					add(
            						current,
            						"constDefs",
            						lv_constDefs_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ConstDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:614:3: (otherlv_2= ';' ( (lv_constDefs_3_0= ruleConstDef ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTorXakisDsl.g:615:4: otherlv_2= ';' ( (lv_constDefs_3_0= ruleConstDef ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstDefsAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:619:4: ( (lv_constDefs_3_0= ruleConstDef ) )
            	    // InternalTorXakisDsl.g:620:5: (lv_constDefs_3_0= ruleConstDef )
            	    {
            	    // InternalTorXakisDsl.g:620:5: (lv_constDefs_3_0= ruleConstDef )
            	    // InternalTorXakisDsl.g:621:6: lv_constDefs_3_0= ruleConstDef
            	    {

            	    						newCompositeNode(grammarAccess.getConstDefsAccess().getConstDefsConstDefParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_constDefs_3_0=ruleConstDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstDefsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constDefs",
            	    							lv_constDefs_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.ConstDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstDefsAccess().getENDDEFKeyword_3());
            		

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
    // $ANTLR end "ruleConstDefs"


    // $ANTLR start "entryRuleConstDef"
    // InternalTorXakisDsl.g:647:1: entryRuleConstDef returns [EObject current=null] : iv_ruleConstDef= ruleConstDef EOF ;
    public final EObject entryRuleConstDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDef = null;


        try {
            // InternalTorXakisDsl.g:647:49: (iv_ruleConstDef= ruleConstDef EOF )
            // InternalTorXakisDsl.g:648:2: iv_ruleConstDef= ruleConstDef EOF
            {
             newCompositeNode(grammarAccess.getConstDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstDef=ruleConstDef();

            state._fsp--;

             current =iv_ruleConstDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstDef"


    // $ANTLR start "ruleConstDef"
    // InternalTorXakisDsl.g:654:1: ruleConstDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleConstName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) otherlv_3= '::=' ( (lv_valExpr_4_0= ruleValExpr ) ) ) ;
    public final EObject ruleConstDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_typeName_2_0 = null;

        EObject lv_valExpr_4_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:660:2: ( ( ( (lv_name_0_0= ruleConstName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) otherlv_3= '::=' ( (lv_valExpr_4_0= ruleValExpr ) ) ) )
            // InternalTorXakisDsl.g:661:2: ( ( (lv_name_0_0= ruleConstName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) otherlv_3= '::=' ( (lv_valExpr_4_0= ruleValExpr ) ) )
            {
            // InternalTorXakisDsl.g:661:2: ( ( (lv_name_0_0= ruleConstName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) otherlv_3= '::=' ( (lv_valExpr_4_0= ruleValExpr ) ) )
            // InternalTorXakisDsl.g:662:3: ( (lv_name_0_0= ruleConstName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) otherlv_3= '::=' ( (lv_valExpr_4_0= ruleValExpr ) )
            {
            // InternalTorXakisDsl.g:662:3: ( (lv_name_0_0= ruleConstName ) )
            // InternalTorXakisDsl.g:663:4: (lv_name_0_0= ruleConstName )
            {
            // InternalTorXakisDsl.g:663:4: (lv_name_0_0= ruleConstName )
            // InternalTorXakisDsl.g:664:5: lv_name_0_0= ruleConstName
            {

            					newCompositeNode(grammarAccess.getConstDefAccess().getNameConstNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_0_0=ruleConstName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ConstName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstDefAccess().getColonColonKeyword_1());
            		
            // InternalTorXakisDsl.g:685:3: ( (lv_typeName_2_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:686:4: (lv_typeName_2_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:686:4: (lv_typeName_2_0= ruleTypeName )
            // InternalTorXakisDsl.g:687:5: lv_typeName_2_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getConstDefAccess().getTypeNameTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_typeName_2_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstDefRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getConstDefAccess().getColonColonEqualsSignKeyword_3());
            		
            // InternalTorXakisDsl.g:708:3: ( (lv_valExpr_4_0= ruleValExpr ) )
            // InternalTorXakisDsl.g:709:4: (lv_valExpr_4_0= ruleValExpr )
            {
            // InternalTorXakisDsl.g:709:4: (lv_valExpr_4_0= ruleValExpr )
            // InternalTorXakisDsl.g:710:5: lv_valExpr_4_0= ruleValExpr
            {

            					newCompositeNode(grammarAccess.getConstDefAccess().getValExprValExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_valExpr_4_0=ruleValExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstDefRule());
            					}
            					set(
            						current,
            						"valExpr",
            						lv_valExpr_4_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleConstDef"


    // $ANTLR start "entryRuleProcDefs"
    // InternalTorXakisDsl.g:731:1: entryRuleProcDefs returns [EObject current=null] : iv_ruleProcDefs= ruleProcDefs EOF ;
    public final EObject entryRuleProcDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcDefs = null;


        try {
            // InternalTorXakisDsl.g:731:49: (iv_ruleProcDefs= ruleProcDefs EOF )
            // InternalTorXakisDsl.g:732:2: iv_ruleProcDefs= ruleProcDefs EOF
            {
             newCompositeNode(grammarAccess.getProcDefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcDefs=ruleProcDefs();

            state._fsp--;

             current =iv_ruleProcDefs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcDefs"


    // $ANTLR start "ruleProcDefs"
    // InternalTorXakisDsl.g:738:1: ruleProcDefs returns [EObject current=null] : (otherlv_0= 'PROCDEF' ( (lv_procDefs_1_0= ruleProcDef ) ) (otherlv_2= ';' ( (lv_procDefs_3_0= ruleProcDef ) ) )* otherlv_4= 'ENDDEF' ) ;
    public final EObject ruleProcDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_procDefs_1_0 = null;

        EObject lv_procDefs_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:744:2: ( (otherlv_0= 'PROCDEF' ( (lv_procDefs_1_0= ruleProcDef ) ) (otherlv_2= ';' ( (lv_procDefs_3_0= ruleProcDef ) ) )* otherlv_4= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:745:2: (otherlv_0= 'PROCDEF' ( (lv_procDefs_1_0= ruleProcDef ) ) (otherlv_2= ';' ( (lv_procDefs_3_0= ruleProcDef ) ) )* otherlv_4= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:745:2: (otherlv_0= 'PROCDEF' ( (lv_procDefs_1_0= ruleProcDef ) ) (otherlv_2= ';' ( (lv_procDefs_3_0= ruleProcDef ) ) )* otherlv_4= 'ENDDEF' )
            // InternalTorXakisDsl.g:746:3: otherlv_0= 'PROCDEF' ( (lv_procDefs_1_0= ruleProcDef ) ) (otherlv_2= ';' ( (lv_procDefs_3_0= ruleProcDef ) ) )* otherlv_4= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProcDefsAccess().getPROCDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:750:3: ( (lv_procDefs_1_0= ruleProcDef ) )
            // InternalTorXakisDsl.g:751:4: (lv_procDefs_1_0= ruleProcDef )
            {
            // InternalTorXakisDsl.g:751:4: (lv_procDefs_1_0= ruleProcDef )
            // InternalTorXakisDsl.g:752:5: lv_procDefs_1_0= ruleProcDef
            {

            					newCompositeNode(grammarAccess.getProcDefsAccess().getProcDefsProcDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_procDefs_1_0=ruleProcDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcDefsRule());
            					}
            					add(
            						current,
            						"procDefs",
            						lv_procDefs_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:769:3: (otherlv_2= ';' ( (lv_procDefs_3_0= ruleProcDef ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTorXakisDsl.g:770:4: otherlv_2= ';' ( (lv_procDefs_3_0= ruleProcDef ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProcDefsAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:774:4: ( (lv_procDefs_3_0= ruleProcDef ) )
            	    // InternalTorXakisDsl.g:775:5: (lv_procDefs_3_0= ruleProcDef )
            	    {
            	    // InternalTorXakisDsl.g:775:5: (lv_procDefs_3_0= ruleProcDef )
            	    // InternalTorXakisDsl.g:776:6: lv_procDefs_3_0= ruleProcDef
            	    {

            	    						newCompositeNode(grammarAccess.getProcDefsAccess().getProcDefsProcDefParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_procDefs_3_0=ruleProcDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcDefsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procDefs",
            	    							lv_procDefs_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.ProcDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcDefsAccess().getENDDEFKeyword_3());
            		

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
    // $ANTLR end "ruleProcDefs"


    // $ANTLR start "entryRuleProcDef"
    // InternalTorXakisDsl.g:802:1: entryRuleProcDef returns [EObject current=null] : iv_ruleProcDef= ruleProcDef EOF ;
    public final EObject entryRuleProcDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcDef = null;


        try {
            // InternalTorXakisDsl.g:802:48: (iv_ruleProcDef= ruleProcDef EOF )
            // InternalTorXakisDsl.g:803:2: iv_ruleProcDef= ruleProcDef EOF
            {
             newCompositeNode(grammarAccess.getProcDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcDef=ruleProcDef();

            state._fsp--;

             current =iv_ruleProcDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcDef"


    // $ANTLR start "ruleProcDef"
    // InternalTorXakisDsl.g:809:1: ruleProcDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_processBehaviour_9_0= ruleProcessBehaviour ) ) ) ;
    public final EObject ruleProcDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_name_0_0 = null;

        EObject lv_neChannelDeclList_2_0 = null;

        EObject lv_neVarDeclList_5_0 = null;

        EObject lv_exitDecl_7_0 = null;

        EObject lv_processBehaviour_9_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:815:2: ( ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_processBehaviour_9_0= ruleProcessBehaviour ) ) ) )
            // InternalTorXakisDsl.g:816:2: ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_processBehaviour_9_0= ruleProcessBehaviour ) ) )
            {
            // InternalTorXakisDsl.g:816:2: ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_processBehaviour_9_0= ruleProcessBehaviour ) ) )
            // InternalTorXakisDsl.g:817:3: ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_processBehaviour_9_0= ruleProcessBehaviour ) )
            {
            // InternalTorXakisDsl.g:817:3: ( (lv_name_0_0= ruleProcName ) )
            // InternalTorXakisDsl.g:818:4: (lv_name_0_0= ruleProcName )
            {
            // InternalTorXakisDsl.g:818:4: (lv_name_0_0= ruleProcName )
            // InternalTorXakisDsl.g:819:5: lv_name_0_0= ruleProcName
            {

            					newCompositeNode(grammarAccess.getProcDefAccess().getNameProcNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleProcName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProcDefAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTorXakisDsl.g:840:3: ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CAPSID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTorXakisDsl.g:841:4: (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList )
                    {
                    // InternalTorXakisDsl.g:841:4: (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList )
                    // InternalTorXakisDsl.g:842:5: lv_neChannelDeclList_2_0= ruleNeChannelsDeclList
                    {

                    					newCompositeNode(grammarAccess.getProcDefAccess().getNeChannelDeclListNeChannelsDeclListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_neChannelDeclList_2_0=ruleNeChannelsDeclList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcDefRule());
                    					}
                    					set(
                    						current,
                    						"neChannelDeclList",
                    						lv_neChannelDeclList_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelsDeclList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getProcDefAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getProcDefAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTorXakisDsl.g:867:3: ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SMALLID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTorXakisDsl.g:868:4: (lv_neVarDeclList_5_0= ruleNeVarDeclList )
                    {
                    // InternalTorXakisDsl.g:868:4: (lv_neVarDeclList_5_0= ruleNeVarDeclList )
                    // InternalTorXakisDsl.g:869:5: lv_neVarDeclList_5_0= ruleNeVarDeclList
                    {

                    					newCompositeNode(grammarAccess.getProcDefAccess().getNeVarDeclListNeVarDeclListParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_neVarDeclList_5_0=ruleNeVarDeclList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcDefRule());
                    					}
                    					set(
                    						current,
                    						"neVarDeclList",
                    						lv_neVarDeclList_5_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeVarDeclList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getProcDefAccess().getRightParenthesisKeyword_6());
            		
            // InternalTorXakisDsl.g:890:3: ( (lv_exitDecl_7_0= ruleExitDecl ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTorXakisDsl.g:891:4: (lv_exitDecl_7_0= ruleExitDecl )
                    {
                    // InternalTorXakisDsl.g:891:4: (lv_exitDecl_7_0= ruleExitDecl )
                    // InternalTorXakisDsl.g:892:5: lv_exitDecl_7_0= ruleExitDecl
                    {

                    					newCompositeNode(grammarAccess.getProcDefAccess().getExitDeclExitDeclParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_exitDecl_7_0=ruleExitDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcDefRule());
                    					}
                    					set(
                    						current,
                    						"exitDecl",
                    						lv_exitDecl_7_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.ExitDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getProcDefAccess().getColonColonEqualsSignKeyword_8());
            		
            // InternalTorXakisDsl.g:913:3: ( (lv_processBehaviour_9_0= ruleProcessBehaviour ) )
            // InternalTorXakisDsl.g:914:4: (lv_processBehaviour_9_0= ruleProcessBehaviour )
            {
            // InternalTorXakisDsl.g:914:4: (lv_processBehaviour_9_0= ruleProcessBehaviour )
            // InternalTorXakisDsl.g:915:5: lv_processBehaviour_9_0= ruleProcessBehaviour
            {

            					newCompositeNode(grammarAccess.getProcDefAccess().getProcessBehaviourProcessBehaviourParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_processBehaviour_9_0=ruleProcessBehaviour();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcDefRule());
            					}
            					set(
            						current,
            						"processBehaviour",
            						lv_processBehaviour_9_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviour");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleProcDef"


    // $ANTLR start "entryRuleStautDefs"
    // InternalTorXakisDsl.g:936:1: entryRuleStautDefs returns [EObject current=null] : iv_ruleStautDefs= ruleStautDefs EOF ;
    public final EObject entryRuleStautDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStautDefs = null;


        try {
            // InternalTorXakisDsl.g:936:50: (iv_ruleStautDefs= ruleStautDefs EOF )
            // InternalTorXakisDsl.g:937:2: iv_ruleStautDefs= ruleStautDefs EOF
            {
             newCompositeNode(grammarAccess.getStautDefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStautDefs=ruleStautDefs();

            state._fsp--;

             current =iv_ruleStautDefs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStautDefs"


    // $ANTLR start "ruleStautDefs"
    // InternalTorXakisDsl.g:943:1: ruleStautDefs returns [EObject current=null] : (otherlv_0= 'STAUTDEF' ( (lv_stautDefs_1_0= ruleStautDef ) ) (otherlv_2= ';' ( (lv_stautDefs_3_0= ruleStautDef ) ) )* otherlv_4= 'ENDDEF' ) ;
    public final EObject ruleStautDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_stautDefs_1_0 = null;

        EObject lv_stautDefs_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:949:2: ( (otherlv_0= 'STAUTDEF' ( (lv_stautDefs_1_0= ruleStautDef ) ) (otherlv_2= ';' ( (lv_stautDefs_3_0= ruleStautDef ) ) )* otherlv_4= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:950:2: (otherlv_0= 'STAUTDEF' ( (lv_stautDefs_1_0= ruleStautDef ) ) (otherlv_2= ';' ( (lv_stautDefs_3_0= ruleStautDef ) ) )* otherlv_4= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:950:2: (otherlv_0= 'STAUTDEF' ( (lv_stautDefs_1_0= ruleStautDef ) ) (otherlv_2= ';' ( (lv_stautDefs_3_0= ruleStautDef ) ) )* otherlv_4= 'ENDDEF' )
            // InternalTorXakisDsl.g:951:3: otherlv_0= 'STAUTDEF' ( (lv_stautDefs_1_0= ruleStautDef ) ) (otherlv_2= ';' ( (lv_stautDefs_3_0= ruleStautDef ) ) )* otherlv_4= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStautDefsAccess().getSTAUTDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:955:3: ( (lv_stautDefs_1_0= ruleStautDef ) )
            // InternalTorXakisDsl.g:956:4: (lv_stautDefs_1_0= ruleStautDef )
            {
            // InternalTorXakisDsl.g:956:4: (lv_stautDefs_1_0= ruleStautDef )
            // InternalTorXakisDsl.g:957:5: lv_stautDefs_1_0= ruleStautDef
            {

            					newCompositeNode(grammarAccess.getStautDefsAccess().getStautDefsStautDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_stautDefs_1_0=ruleStautDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStautDefsRule());
            					}
            					add(
            						current,
            						"stautDefs",
            						lv_stautDefs_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.StautDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:974:3: (otherlv_2= ';' ( (lv_stautDefs_3_0= ruleStautDef ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTorXakisDsl.g:975:4: otherlv_2= ';' ( (lv_stautDefs_3_0= ruleStautDef ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStautDefsAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:979:4: ( (lv_stautDefs_3_0= ruleStautDef ) )
            	    // InternalTorXakisDsl.g:980:5: (lv_stautDefs_3_0= ruleStautDef )
            	    {
            	    // InternalTorXakisDsl.g:980:5: (lv_stautDefs_3_0= ruleStautDef )
            	    // InternalTorXakisDsl.g:981:6: lv_stautDefs_3_0= ruleStautDef
            	    {

            	    						newCompositeNode(grammarAccess.getStautDefsAccess().getStautDefsStautDefParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_stautDefs_3_0=ruleStautDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStautDefsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stautDefs",
            	    							lv_stautDefs_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.StautDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStautDefsAccess().getENDDEFKeyword_3());
            		

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
    // $ANTLR end "ruleStautDefs"


    // $ANTLR start "entryRuleStautDef"
    // InternalTorXakisDsl.g:1007:1: entryRuleStautDef returns [EObject current=null] : iv_ruleStautDef= ruleStautDef EOF ;
    public final EObject entryRuleStautDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStautDef = null;


        try {
            // InternalTorXakisDsl.g:1007:49: (iv_ruleStautDef= ruleStautDef EOF )
            // InternalTorXakisDsl.g:1008:2: iv_ruleStautDef= ruleStautDef EOF
            {
             newCompositeNode(grammarAccess.getStautDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStautDef=ruleStautDef();

            state._fsp--;

             current =iv_ruleStautDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStautDef"


    // $ANTLR start "ruleStautDef"
    // InternalTorXakisDsl.g:1014:1: ruleStautDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleStautName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_stautItems_9_0= ruleStautItems ) ) ) ;
    public final EObject ruleStautDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_name_0_0 = null;

        EObject lv_neChannelDeclList_2_0 = null;

        EObject lv_neVarDeclList_5_0 = null;

        EObject lv_exitDecl_7_0 = null;

        EObject lv_stautItems_9_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1020:2: ( ( ( (lv_name_0_0= ruleStautName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_stautItems_9_0= ruleStautItems ) ) ) )
            // InternalTorXakisDsl.g:1021:2: ( ( (lv_name_0_0= ruleStautName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_stautItems_9_0= ruleStautItems ) ) )
            {
            // InternalTorXakisDsl.g:1021:2: ( ( (lv_name_0_0= ruleStautName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_stautItems_9_0= ruleStautItems ) ) )
            // InternalTorXakisDsl.g:1022:3: ( (lv_name_0_0= ruleStautName ) ) otherlv_1= '[' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )? otherlv_6= ')' ( (lv_exitDecl_7_0= ruleExitDecl ) )? otherlv_8= '::=' ( (lv_stautItems_9_0= ruleStautItems ) )
            {
            // InternalTorXakisDsl.g:1022:3: ( (lv_name_0_0= ruleStautName ) )
            // InternalTorXakisDsl.g:1023:4: (lv_name_0_0= ruleStautName )
            {
            // InternalTorXakisDsl.g:1023:4: (lv_name_0_0= ruleStautName )
            // InternalTorXakisDsl.g:1024:5: lv_name_0_0= ruleStautName
            {

            					newCompositeNode(grammarAccess.getStautDefAccess().getNameStautNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleStautName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStautDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.StautName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStautDefAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTorXakisDsl.g:1045:3: ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_CAPSID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTorXakisDsl.g:1046:4: (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList )
                    {
                    // InternalTorXakisDsl.g:1046:4: (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList )
                    // InternalTorXakisDsl.g:1047:5: lv_neChannelDeclList_2_0= ruleNeChannelsDeclList
                    {

                    					newCompositeNode(grammarAccess.getStautDefAccess().getNeChannelDeclListNeChannelsDeclListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_neChannelDeclList_2_0=ruleNeChannelsDeclList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStautDefRule());
                    					}
                    					set(
                    						current,
                    						"neChannelDeclList",
                    						lv_neChannelDeclList_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelsDeclList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getStautDefAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getStautDefAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTorXakisDsl.g:1072:3: ( (lv_neVarDeclList_5_0= ruleNeVarDeclList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SMALLID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTorXakisDsl.g:1073:4: (lv_neVarDeclList_5_0= ruleNeVarDeclList )
                    {
                    // InternalTorXakisDsl.g:1073:4: (lv_neVarDeclList_5_0= ruleNeVarDeclList )
                    // InternalTorXakisDsl.g:1074:5: lv_neVarDeclList_5_0= ruleNeVarDeclList
                    {

                    					newCompositeNode(grammarAccess.getStautDefAccess().getNeVarDeclListNeVarDeclListParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_neVarDeclList_5_0=ruleNeVarDeclList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStautDefRule());
                    					}
                    					set(
                    						current,
                    						"neVarDeclList",
                    						lv_neVarDeclList_5_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeVarDeclList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getStautDefAccess().getRightParenthesisKeyword_6());
            		
            // InternalTorXakisDsl.g:1095:3: ( (lv_exitDecl_7_0= ruleExitDecl ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTorXakisDsl.g:1096:4: (lv_exitDecl_7_0= ruleExitDecl )
                    {
                    // InternalTorXakisDsl.g:1096:4: (lv_exitDecl_7_0= ruleExitDecl )
                    // InternalTorXakisDsl.g:1097:5: lv_exitDecl_7_0= ruleExitDecl
                    {

                    					newCompositeNode(grammarAccess.getStautDefAccess().getExitDeclExitDeclParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_exitDecl_7_0=ruleExitDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStautDefRule());
                    					}
                    					set(
                    						current,
                    						"exitDecl",
                    						lv_exitDecl_7_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.ExitDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getStautDefAccess().getColonColonEqualsSignKeyword_8());
            		
            // InternalTorXakisDsl.g:1118:3: ( (lv_stautItems_9_0= ruleStautItems ) )
            // InternalTorXakisDsl.g:1119:4: (lv_stautItems_9_0= ruleStautItems )
            {
            // InternalTorXakisDsl.g:1119:4: (lv_stautItems_9_0= ruleStautItems )
            // InternalTorXakisDsl.g:1120:5: lv_stautItems_9_0= ruleStautItems
            {

            					newCompositeNode(grammarAccess.getStautDefAccess().getStautItemsStautItemsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_stautItems_9_0=ruleStautItems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStautDefRule());
            					}
            					set(
            						current,
            						"stautItems",
            						lv_stautItems_9_0,
            						"nl.tno.torxakis.language.TorXakisDsl.StautItems");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleStautDef"


    // $ANTLR start "entryRuleChannelDefs"
    // InternalTorXakisDsl.g:1141:1: entryRuleChannelDefs returns [EObject current=null] : iv_ruleChannelDefs= ruleChannelDefs EOF ;
    public final EObject entryRuleChannelDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDefs = null;


        try {
            // InternalTorXakisDsl.g:1141:52: (iv_ruleChannelDefs= ruleChannelDefs EOF )
            // InternalTorXakisDsl.g:1142:2: iv_ruleChannelDefs= ruleChannelDefs EOF
            {
             newCompositeNode(grammarAccess.getChannelDefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelDefs=ruleChannelDefs();

            state._fsp--;

             current =iv_ruleChannelDefs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChannelDefs"


    // $ANTLR start "ruleChannelDefs"
    // InternalTorXakisDsl.g:1148:1: ruleChannelDefs returns [EObject current=null] : (otherlv_0= 'CHANDEF' ( (lv_ChannelDefs_1_0= ruleChannelDef ) ) otherlv_2= 'ENDDEF' ) ;
    public final EObject ruleChannelDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ChannelDefs_1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1154:2: ( (otherlv_0= 'CHANDEF' ( (lv_ChannelDefs_1_0= ruleChannelDef ) ) otherlv_2= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:1155:2: (otherlv_0= 'CHANDEF' ( (lv_ChannelDefs_1_0= ruleChannelDef ) ) otherlv_2= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:1155:2: (otherlv_0= 'CHANDEF' ( (lv_ChannelDefs_1_0= ruleChannelDef ) ) otherlv_2= 'ENDDEF' )
            // InternalTorXakisDsl.g:1156:3: otherlv_0= 'CHANDEF' ( (lv_ChannelDefs_1_0= ruleChannelDef ) ) otherlv_2= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelDefsAccess().getCHANDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:1160:3: ( (lv_ChannelDefs_1_0= ruleChannelDef ) )
            // InternalTorXakisDsl.g:1161:4: (lv_ChannelDefs_1_0= ruleChannelDef )
            {
            // InternalTorXakisDsl.g:1161:4: (lv_ChannelDefs_1_0= ruleChannelDef )
            // InternalTorXakisDsl.g:1162:5: lv_ChannelDefs_1_0= ruleChannelDef
            {

            					newCompositeNode(grammarAccess.getChannelDefsAccess().getChannelDefsChannelDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_ChannelDefs_1_0=ruleChannelDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelDefsRule());
            					}
            					add(
            						current,
            						"ChannelDefs",
            						lv_ChannelDefs_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelDefsAccess().getENDDEFKeyword_2());
            		

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
    // $ANTLR end "ruleChannelDefs"


    // $ANTLR start "entryRuleChannelDef"
    // InternalTorXakisDsl.g:1187:1: entryRuleChannelDef returns [EObject current=null] : iv_ruleChannelDef= ruleChannelDef EOF ;
    public final EObject entryRuleChannelDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDef = null;


        try {
            // InternalTorXakisDsl.g:1187:51: (iv_ruleChannelDef= ruleChannelDef EOF )
            // InternalTorXakisDsl.g:1188:2: iv_ruleChannelDef= ruleChannelDef EOF
            {
             newCompositeNode(grammarAccess.getChannelDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelDef=ruleChannelDef();

            state._fsp--;

             current =iv_ruleChannelDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChannelDef"


    // $ANTLR start "ruleChannelDef"
    // InternalTorXakisDsl.g:1194:1: ruleChannelDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleChannelDefName ) ) otherlv_1= '::=' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) ) ) ;
    public final EObject ruleChannelDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_neChannelDeclList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1200:2: ( ( ( (lv_name_0_0= ruleChannelDefName ) ) otherlv_1= '::=' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) ) ) )
            // InternalTorXakisDsl.g:1201:2: ( ( (lv_name_0_0= ruleChannelDefName ) ) otherlv_1= '::=' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) ) )
            {
            // InternalTorXakisDsl.g:1201:2: ( ( (lv_name_0_0= ruleChannelDefName ) ) otherlv_1= '::=' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) ) )
            // InternalTorXakisDsl.g:1202:3: ( (lv_name_0_0= ruleChannelDefName ) ) otherlv_1= '::=' ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )
            {
            // InternalTorXakisDsl.g:1202:3: ( (lv_name_0_0= ruleChannelDefName ) )
            // InternalTorXakisDsl.g:1203:4: (lv_name_0_0= ruleChannelDefName )
            {
            // InternalTorXakisDsl.g:1203:4: (lv_name_0_0= ruleChannelDefName )
            // InternalTorXakisDsl.g:1204:5: lv_name_0_0= ruleChannelDefName
            {

            					newCompositeNode(grammarAccess.getChannelDefAccess().getNameChannelDefNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleChannelDefName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelDefName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChannelDefAccess().getColonColonEqualsSignKeyword_1());
            		
            // InternalTorXakisDsl.g:1225:3: ( (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList ) )
            // InternalTorXakisDsl.g:1226:4: (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList )
            {
            // InternalTorXakisDsl.g:1226:4: (lv_neChannelDeclList_2_0= ruleNeChannelsDeclList )
            // InternalTorXakisDsl.g:1227:5: lv_neChannelDeclList_2_0= ruleNeChannelsDeclList
            {

            					newCompositeNode(grammarAccess.getChannelDefAccess().getNeChannelDeclListNeChannelsDeclListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_neChannelDeclList_2_0=ruleNeChannelsDeclList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelDefRule());
            					}
            					set(
            						current,
            						"neChannelDeclList",
            						lv_neChannelDeclList_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeChannelsDeclList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleChannelDef"


    // $ANTLR start "entryRuleModelDef"
    // InternalTorXakisDsl.g:1248:1: entryRuleModelDef returns [EObject current=null] : iv_ruleModelDef= ruleModelDef EOF ;
    public final EObject entryRuleModelDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDef = null;


        try {
            // InternalTorXakisDsl.g:1248:49: (iv_ruleModelDef= ruleModelDef EOF )
            // InternalTorXakisDsl.g:1249:2: iv_ruleModelDef= ruleModelDef EOF
            {
             newCompositeNode(grammarAccess.getModelDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelDef=ruleModelDef();

            state._fsp--;

             current =iv_ruleModelDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelDef"


    // $ANTLR start "ruleModelDef"
    // InternalTorXakisDsl.g:1255:1: ruleModelDef returns [EObject current=null] : (otherlv_0= 'MODELDEF' ( (lv_modelName_1_0= ruleModelName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_neInputChannelNameList_5_0= ruleNeChannelNameList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' ) ;
    public final EObject ruleModelDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_modelName_1_0 = null;

        EObject lv_neInputChannelNameList_5_0 = null;

        EObject lv_neOutputChannelNameList_8_0 = null;

        EObject lv_processBehaviour_10_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1261:2: ( (otherlv_0= 'MODELDEF' ( (lv_modelName_1_0= ruleModelName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_neInputChannelNameList_5_0= ruleNeChannelNameList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:1262:2: (otherlv_0= 'MODELDEF' ( (lv_modelName_1_0= ruleModelName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_neInputChannelNameList_5_0= ruleNeChannelNameList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:1262:2: (otherlv_0= 'MODELDEF' ( (lv_modelName_1_0= ruleModelName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_neInputChannelNameList_5_0= ruleNeChannelNameList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' )
            // InternalTorXakisDsl.g:1263:3: otherlv_0= 'MODELDEF' ( (lv_modelName_1_0= ruleModelName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_neInputChannelNameList_5_0= ruleNeChannelNameList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelDefAccess().getMODELDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:1267:3: ( (lv_modelName_1_0= ruleModelName ) )
            // InternalTorXakisDsl.g:1268:4: (lv_modelName_1_0= ruleModelName )
            {
            // InternalTorXakisDsl.g:1268:4: (lv_modelName_1_0= ruleModelName )
            // InternalTorXakisDsl.g:1269:5: lv_modelName_1_0= ruleModelName
            {

            					newCompositeNode(grammarAccess.getModelDefAccess().getModelNameModelNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_modelName_1_0=ruleModelName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelDefRule());
            					}
            					set(
            						current,
            						"modelName",
            						lv_modelName_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ModelName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getModelDefAccess().getColonColonEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getModelDefAccess().getCHANKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getModelDefAccess().getINKeyword_4());
            		
            // InternalTorXakisDsl.g:1298:3: ( (lv_neInputChannelNameList_5_0= ruleNeChannelNameList ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_CAPSID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTorXakisDsl.g:1299:4: (lv_neInputChannelNameList_5_0= ruleNeChannelNameList )
                    {
                    // InternalTorXakisDsl.g:1299:4: (lv_neInputChannelNameList_5_0= ruleNeChannelNameList )
                    // InternalTorXakisDsl.g:1300:5: lv_neInputChannelNameList_5_0= ruleNeChannelNameList
                    {

                    					newCompositeNode(grammarAccess.getModelDefAccess().getNeInputChannelNameListNeChannelNameListParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_neInputChannelNameList_5_0=ruleNeChannelNameList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelDefRule());
                    					}
                    					set(
                    						current,
                    						"neInputChannelNameList",
                    						lv_neInputChannelNameList_5_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelNameList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getModelDefAccess().getCHANKeyword_6());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getModelDefAccess().getOUTKeyword_7());
            		
            // InternalTorXakisDsl.g:1325:3: ( (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_CAPSID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTorXakisDsl.g:1326:4: (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList )
                    {
                    // InternalTorXakisDsl.g:1326:4: (lv_neOutputChannelNameList_8_0= ruleNeChannelNameList )
                    // InternalTorXakisDsl.g:1327:5: lv_neOutputChannelNameList_8_0= ruleNeChannelNameList
                    {

                    					newCompositeNode(grammarAccess.getModelDefAccess().getNeOutputChannelNameListNeChannelNameListParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_neOutputChannelNameList_8_0=ruleNeChannelNameList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelDefRule());
                    					}
                    					set(
                    						current,
                    						"neOutputChannelNameList",
                    						lv_neOutputChannelNameList_8_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelNameList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getModelDefAccess().getBEHAVIOURKeyword_9());
            		
            // InternalTorXakisDsl.g:1348:3: ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) )
            // InternalTorXakisDsl.g:1349:4: (lv_processBehaviour_10_0= ruleProcessBehaviour )
            {
            // InternalTorXakisDsl.g:1349:4: (lv_processBehaviour_10_0= ruleProcessBehaviour )
            // InternalTorXakisDsl.g:1350:5: lv_processBehaviour_10_0= ruleProcessBehaviour
            {

            					newCompositeNode(grammarAccess.getModelDefAccess().getProcessBehaviourProcessBehaviourParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_processBehaviour_10_0=ruleProcessBehaviour();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelDefRule());
            					}
            					set(
            						current,
            						"processBehaviour",
            						lv_processBehaviour_10_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviour");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getModelDefAccess().getENDDEFKeyword_11());
            		

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
    // $ANTLR end "ruleModelDef"


    // $ANTLR start "entryRuleMapperDef"
    // InternalTorXakisDsl.g:1375:1: entryRuleMapperDef returns [EObject current=null] : iv_ruleMapperDef= ruleMapperDef EOF ;
    public final EObject entryRuleMapperDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapperDef = null;


        try {
            // InternalTorXakisDsl.g:1375:50: (iv_ruleMapperDef= ruleMapperDef EOF )
            // InternalTorXakisDsl.g:1376:2: iv_ruleMapperDef= ruleMapperDef EOF
            {
             newCompositeNode(grammarAccess.getMapperDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapperDef=ruleMapperDef();

            state._fsp--;

             current =iv_ruleMapperDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMapperDef"


    // $ANTLR start "ruleMapperDef"
    // InternalTorXakisDsl.g:1382:1: ruleMapperDef returns [EObject current=null] : (otherlv_0= 'MAPPERDEF' ( (lv_mapperName_1_0= ruleMapperName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' ) ;
    public final EObject ruleMapperDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_mapperName_1_0 = null;

        EObject lv_chanInNeChannelsDeclList_5_0 = null;

        EObject lv_chanOutNeChannelsDeclList_8_0 = null;

        EObject lv_processBehaviour_10_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1388:2: ( (otherlv_0= 'MAPPERDEF' ( (lv_mapperName_1_0= ruleMapperName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:1389:2: (otherlv_0= 'MAPPERDEF' ( (lv_mapperName_1_0= ruleMapperName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:1389:2: (otherlv_0= 'MAPPERDEF' ( (lv_mapperName_1_0= ruleMapperName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF' )
            // InternalTorXakisDsl.g:1390:3: otherlv_0= 'MAPPERDEF' ( (lv_mapperName_1_0= ruleMapperName ) ) otherlv_2= '::=' otherlv_3= 'CHAN' otherlv_4= 'IN' ( (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList ) )? otherlv_6= 'CHAN' otherlv_7= 'OUT' ( (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList ) )? otherlv_9= 'BEHAVIOUR' ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) ) otherlv_11= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMapperDefAccess().getMAPPERDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:1394:3: ( (lv_mapperName_1_0= ruleMapperName ) )
            // InternalTorXakisDsl.g:1395:4: (lv_mapperName_1_0= ruleMapperName )
            {
            // InternalTorXakisDsl.g:1395:4: (lv_mapperName_1_0= ruleMapperName )
            // InternalTorXakisDsl.g:1396:5: lv_mapperName_1_0= ruleMapperName
            {

            					newCompositeNode(grammarAccess.getMapperDefAccess().getMapperNameMapperNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_mapperName_1_0=ruleMapperName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapperDefRule());
            					}
            					set(
            						current,
            						"mapperName",
            						lv_mapperName_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.MapperName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMapperDefAccess().getColonColonEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getMapperDefAccess().getCHANKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getMapperDefAccess().getINKeyword_4());
            		
            // InternalTorXakisDsl.g:1425:3: ( (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_CAPSID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTorXakisDsl.g:1426:4: (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList )
                    {
                    // InternalTorXakisDsl.g:1426:4: (lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList )
                    // InternalTorXakisDsl.g:1427:5: lv_chanInNeChannelsDeclList_5_0= ruleNeChannelsDeclList
                    {

                    					newCompositeNode(grammarAccess.getMapperDefAccess().getChanInNeChannelsDeclListNeChannelsDeclListParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_chanInNeChannelsDeclList_5_0=ruleNeChannelsDeclList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMapperDefRule());
                    					}
                    					set(
                    						current,
                    						"chanInNeChannelsDeclList",
                    						lv_chanInNeChannelsDeclList_5_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelsDeclList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getMapperDefAccess().getCHANKeyword_6());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getMapperDefAccess().getOUTKeyword_7());
            		
            // InternalTorXakisDsl.g:1452:3: ( (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CAPSID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTorXakisDsl.g:1453:4: (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList )
                    {
                    // InternalTorXakisDsl.g:1453:4: (lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList )
                    // InternalTorXakisDsl.g:1454:5: lv_chanOutNeChannelsDeclList_8_0= ruleNeChannelsDeclList
                    {

                    					newCompositeNode(grammarAccess.getMapperDefAccess().getChanOutNeChannelsDeclListNeChannelsDeclListParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_chanOutNeChannelsDeclList_8_0=ruleNeChannelsDeclList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMapperDefRule());
                    					}
                    					set(
                    						current,
                    						"chanOutNeChannelsDeclList",
                    						lv_chanOutNeChannelsDeclList_8_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelsDeclList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getMapperDefAccess().getBEHAVIOURKeyword_9());
            		
            // InternalTorXakisDsl.g:1475:3: ( (lv_processBehaviour_10_0= ruleProcessBehaviour ) )
            // InternalTorXakisDsl.g:1476:4: (lv_processBehaviour_10_0= ruleProcessBehaviour )
            {
            // InternalTorXakisDsl.g:1476:4: (lv_processBehaviour_10_0= ruleProcessBehaviour )
            // InternalTorXakisDsl.g:1477:5: lv_processBehaviour_10_0= ruleProcessBehaviour
            {

            					newCompositeNode(grammarAccess.getMapperDefAccess().getProcessBehaviourProcessBehaviourParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_processBehaviour_10_0=ruleProcessBehaviour();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapperDefRule());
            					}
            					set(
            						current,
            						"processBehaviour",
            						lv_processBehaviour_10_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviour");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMapperDefAccess().getENDDEFKeyword_11());
            		

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
    // $ANTLR end "ruleMapperDef"


    // $ANTLR start "entryRuleCnectDef"
    // InternalTorXakisDsl.g:1502:1: entryRuleCnectDef returns [EObject current=null] : iv_ruleCnectDef= ruleCnectDef EOF ;
    public final EObject entryRuleCnectDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnectDef = null;


        try {
            // InternalTorXakisDsl.g:1502:49: (iv_ruleCnectDef= ruleCnectDef EOF )
            // InternalTorXakisDsl.g:1503:2: iv_ruleCnectDef= ruleCnectDef EOF
            {
             newCompositeNode(grammarAccess.getCnectDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnectDef=ruleCnectDef();

            state._fsp--;

             current =iv_ruleCnectDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCnectDef"


    // $ANTLR start "ruleCnectDef"
    // InternalTorXakisDsl.g:1509:1: ruleCnectDef returns [EObject current=null] : (otherlv_0= 'CNECTDEF' ( (lv_cnectName_1_0= ruleCnectName ) ) otherlv_2= '::=' ( ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) ) ) ( (lv_connectionItems_4_0= ruleConnectionItem ) )* otherlv_5= 'ENDDEF' ) ;
    public final EObject ruleCnectDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_cnectType_3_1=null;
        Token lv_cnectType_3_2=null;
        Token otherlv_5=null;
        EObject lv_cnectName_1_0 = null;

        EObject lv_connectionItems_4_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1515:2: ( (otherlv_0= 'CNECTDEF' ( (lv_cnectName_1_0= ruleCnectName ) ) otherlv_2= '::=' ( ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) ) ) ( (lv_connectionItems_4_0= ruleConnectionItem ) )* otherlv_5= 'ENDDEF' ) )
            // InternalTorXakisDsl.g:1516:2: (otherlv_0= 'CNECTDEF' ( (lv_cnectName_1_0= ruleCnectName ) ) otherlv_2= '::=' ( ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) ) ) ( (lv_connectionItems_4_0= ruleConnectionItem ) )* otherlv_5= 'ENDDEF' )
            {
            // InternalTorXakisDsl.g:1516:2: (otherlv_0= 'CNECTDEF' ( (lv_cnectName_1_0= ruleCnectName ) ) otherlv_2= '::=' ( ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) ) ) ( (lv_connectionItems_4_0= ruleConnectionItem ) )* otherlv_5= 'ENDDEF' )
            // InternalTorXakisDsl.g:1517:3: otherlv_0= 'CNECTDEF' ( (lv_cnectName_1_0= ruleCnectName ) ) otherlv_2= '::=' ( ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) ) ) ( (lv_connectionItems_4_0= ruleConnectionItem ) )* otherlv_5= 'ENDDEF'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCnectDefAccess().getCNECTDEFKeyword_0());
            		
            // InternalTorXakisDsl.g:1521:3: ( (lv_cnectName_1_0= ruleCnectName ) )
            // InternalTorXakisDsl.g:1522:4: (lv_cnectName_1_0= ruleCnectName )
            {
            // InternalTorXakisDsl.g:1522:4: (lv_cnectName_1_0= ruleCnectName )
            // InternalTorXakisDsl.g:1523:5: lv_cnectName_1_0= ruleCnectName
            {

            					newCompositeNode(grammarAccess.getCnectDefAccess().getCnectNameCnectNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_cnectName_1_0=ruleCnectName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnectDefRule());
            					}
            					set(
            						current,
            						"cnectName",
            						lv_cnectName_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.CnectName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getCnectDefAccess().getColonColonEqualsSignKeyword_2());
            		
            // InternalTorXakisDsl.g:1544:3: ( ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) ) )
            // InternalTorXakisDsl.g:1545:4: ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) )
            {
            // InternalTorXakisDsl.g:1545:4: ( (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' ) )
            // InternalTorXakisDsl.g:1546:5: (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' )
            {
            // InternalTorXakisDsl.g:1546:5: (lv_cnectType_3_1= 'CLIENTSOCK' | lv_cnectType_3_2= 'SERVERSOCK' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTorXakisDsl.g:1547:6: lv_cnectType_3_1= 'CLIENTSOCK'
                    {
                    lv_cnectType_3_1=(Token)match(input,35,FOLLOW_27); 

                    						newLeafNode(lv_cnectType_3_1, grammarAccess.getCnectDefAccess().getCnectTypeCLIENTSOCKKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnectDefRule());
                    						}
                    						setWithLastConsumed(current, "cnectType", lv_cnectType_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:1558:6: lv_cnectType_3_2= 'SERVERSOCK'
                    {
                    lv_cnectType_3_2=(Token)match(input,36,FOLLOW_27); 

                    						newLeafNode(lv_cnectType_3_2, grammarAccess.getCnectDefAccess().getCnectTypeSERVERSOCKKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnectDefRule());
                    						}
                    						setWithLastConsumed(current, "cnectType", lv_cnectType_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalTorXakisDsl.g:1571:3: ( (lv_connectionItems_4_0= ruleConnectionItem ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29||(LA18_0>=50 && LA18_0<=51)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTorXakisDsl.g:1572:4: (lv_connectionItems_4_0= ruleConnectionItem )
            	    {
            	    // InternalTorXakisDsl.g:1572:4: (lv_connectionItems_4_0= ruleConnectionItem )
            	    // InternalTorXakisDsl.g:1573:5: lv_connectionItems_4_0= ruleConnectionItem
            	    {

            	    					newCompositeNode(grammarAccess.getCnectDefAccess().getConnectionItemsConnectionItemParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_connectionItems_4_0=ruleConnectionItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCnectDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectionItems",
            	    						lv_connectionItems_4_0,
            	    						"nl.tno.torxakis.language.TorXakisDsl.ConnectionItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCnectDefAccess().getENDDEFKeyword_5());
            		

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
    // $ANTLR end "ruleCnectDef"


    // $ANTLR start "entryRuleStautItems"
    // InternalTorXakisDsl.g:1598:1: entryRuleStautItems returns [EObject current=null] : iv_ruleStautItems= ruleStautItems EOF ;
    public final EObject entryRuleStautItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStautItems = null;


        try {
            // InternalTorXakisDsl.g:1598:51: (iv_ruleStautItems= ruleStautItems EOF )
            // InternalTorXakisDsl.g:1599:2: iv_ruleStautItems= ruleStautItems EOF
            {
             newCompositeNode(grammarAccess.getStautItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStautItems=ruleStautItems();

            state._fsp--;

             current =iv_ruleStautItems; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStautItems"


    // $ANTLR start "ruleStautItems"
    // InternalTorXakisDsl.g:1605:1: ruleStautItems returns [EObject current=null] : ( () ( ( (lv_stateItems_1_0= ruleStateItem ) ) | ( (lv_varItems_2_0= ruleVarItem ) ) | ( (lv_initItems_3_0= ruleInitItem ) ) | ( (lv_transItems_4_0= ruleTransItem ) ) )* ) ;
    public final EObject ruleStautItems() throws RecognitionException {
        EObject current = null;

        EObject lv_stateItems_1_0 = null;

        EObject lv_varItems_2_0 = null;

        EObject lv_initItems_3_0 = null;

        EObject lv_transItems_4_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1611:2: ( ( () ( ( (lv_stateItems_1_0= ruleStateItem ) ) | ( (lv_varItems_2_0= ruleVarItem ) ) | ( (lv_initItems_3_0= ruleInitItem ) ) | ( (lv_transItems_4_0= ruleTransItem ) ) )* ) )
            // InternalTorXakisDsl.g:1612:2: ( () ( ( (lv_stateItems_1_0= ruleStateItem ) ) | ( (lv_varItems_2_0= ruleVarItem ) ) | ( (lv_initItems_3_0= ruleInitItem ) ) | ( (lv_transItems_4_0= ruleTransItem ) ) )* )
            {
            // InternalTorXakisDsl.g:1612:2: ( () ( ( (lv_stateItems_1_0= ruleStateItem ) ) | ( (lv_varItems_2_0= ruleVarItem ) ) | ( (lv_initItems_3_0= ruleInitItem ) ) | ( (lv_transItems_4_0= ruleTransItem ) ) )* )
            // InternalTorXakisDsl.g:1613:3: () ( ( (lv_stateItems_1_0= ruleStateItem ) ) | ( (lv_varItems_2_0= ruleVarItem ) ) | ( (lv_initItems_3_0= ruleInitItem ) ) | ( (lv_transItems_4_0= ruleTransItem ) ) )*
            {
            // InternalTorXakisDsl.g:1613:3: ()
            // InternalTorXakisDsl.g:1614:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStautItemsAccess().getStautItemsAction_0(),
            					current);
            			

            }

            // InternalTorXakisDsl.g:1620:3: ( ( (lv_stateItems_1_0= ruleStateItem ) ) | ( (lv_varItems_2_0= ruleVarItem ) ) | ( (lv_initItems_3_0= ruleInitItem ) ) | ( (lv_transItems_4_0= ruleTransItem ) ) )*
            loop19:
            do {
                int alt19=5;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt19=1;
                    }
                    break;
                case 38:
                    {
                    alt19=2;
                    }
                    break;
                case 39:
                    {
                    alt19=3;
                    }
                    break;
                case 40:
                    {
                    alt19=4;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalTorXakisDsl.g:1621:4: ( (lv_stateItems_1_0= ruleStateItem ) )
            	    {
            	    // InternalTorXakisDsl.g:1621:4: ( (lv_stateItems_1_0= ruleStateItem ) )
            	    // InternalTorXakisDsl.g:1622:5: (lv_stateItems_1_0= ruleStateItem )
            	    {
            	    // InternalTorXakisDsl.g:1622:5: (lv_stateItems_1_0= ruleStateItem )
            	    // InternalTorXakisDsl.g:1623:6: lv_stateItems_1_0= ruleStateItem
            	    {

            	    						newCompositeNode(grammarAccess.getStautItemsAccess().getStateItemsStateItemParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_stateItems_1_0=ruleStateItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStautItemsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stateItems",
            	    							lv_stateItems_1_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.StateItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTorXakisDsl.g:1641:4: ( (lv_varItems_2_0= ruleVarItem ) )
            	    {
            	    // InternalTorXakisDsl.g:1641:4: ( (lv_varItems_2_0= ruleVarItem ) )
            	    // InternalTorXakisDsl.g:1642:5: (lv_varItems_2_0= ruleVarItem )
            	    {
            	    // InternalTorXakisDsl.g:1642:5: (lv_varItems_2_0= ruleVarItem )
            	    // InternalTorXakisDsl.g:1643:6: lv_varItems_2_0= ruleVarItem
            	    {

            	    						newCompositeNode(grammarAccess.getStautItemsAccess().getVarItemsVarItemParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_varItems_2_0=ruleVarItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStautItemsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varItems",
            	    							lv_varItems_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.VarItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTorXakisDsl.g:1661:4: ( (lv_initItems_3_0= ruleInitItem ) )
            	    {
            	    // InternalTorXakisDsl.g:1661:4: ( (lv_initItems_3_0= ruleInitItem ) )
            	    // InternalTorXakisDsl.g:1662:5: (lv_initItems_3_0= ruleInitItem )
            	    {
            	    // InternalTorXakisDsl.g:1662:5: (lv_initItems_3_0= ruleInitItem )
            	    // InternalTorXakisDsl.g:1663:6: lv_initItems_3_0= ruleInitItem
            	    {

            	    						newCompositeNode(grammarAccess.getStautItemsAccess().getInitItemsInitItemParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_initItems_3_0=ruleInitItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStautItemsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"initItems",
            	    							lv_initItems_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.InitItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTorXakisDsl.g:1681:4: ( (lv_transItems_4_0= ruleTransItem ) )
            	    {
            	    // InternalTorXakisDsl.g:1681:4: ( (lv_transItems_4_0= ruleTransItem ) )
            	    // InternalTorXakisDsl.g:1682:5: (lv_transItems_4_0= ruleTransItem )
            	    {
            	    // InternalTorXakisDsl.g:1682:5: (lv_transItems_4_0= ruleTransItem )
            	    // InternalTorXakisDsl.g:1683:6: lv_transItems_4_0= ruleTransItem
            	    {

            	    						newCompositeNode(grammarAccess.getStautItemsAccess().getTransItemsTransItemParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_transItems_4_0=ruleTransItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStautItemsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transItems",
            	    							lv_transItems_4_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.TransItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleStautItems"


    // $ANTLR start "entryRuleStateItem"
    // InternalTorXakisDsl.g:1705:1: entryRuleStateItem returns [EObject current=null] : iv_ruleStateItem= ruleStateItem EOF ;
    public final EObject entryRuleStateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateItem = null;


        try {
            // InternalTorXakisDsl.g:1705:50: (iv_ruleStateItem= ruleStateItem EOF )
            // InternalTorXakisDsl.g:1706:2: iv_ruleStateItem= ruleStateItem EOF
            {
             newCompositeNode(grammarAccess.getStateItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateItem=ruleStateItem();

            state._fsp--;

             current =iv_ruleStateItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateItem"


    // $ANTLR start "ruleStateItem"
    // InternalTorXakisDsl.g:1712:1: ruleStateItem returns [EObject current=null] : (otherlv_0= 'STATE' ( (lv_list_1_0= ruleNeIdNameList ) ) ) ;
    public final EObject ruleStateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1718:2: ( (otherlv_0= 'STATE' ( (lv_list_1_0= ruleNeIdNameList ) ) ) )
            // InternalTorXakisDsl.g:1719:2: (otherlv_0= 'STATE' ( (lv_list_1_0= ruleNeIdNameList ) ) )
            {
            // InternalTorXakisDsl.g:1719:2: (otherlv_0= 'STATE' ( (lv_list_1_0= ruleNeIdNameList ) ) )
            // InternalTorXakisDsl.g:1720:3: otherlv_0= 'STATE' ( (lv_list_1_0= ruleNeIdNameList ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getStateItemAccess().getSTATEKeyword_0());
            		
            // InternalTorXakisDsl.g:1724:3: ( (lv_list_1_0= ruleNeIdNameList ) )
            // InternalTorXakisDsl.g:1725:4: (lv_list_1_0= ruleNeIdNameList )
            {
            // InternalTorXakisDsl.g:1725:4: (lv_list_1_0= ruleNeIdNameList )
            // InternalTorXakisDsl.g:1726:5: lv_list_1_0= ruleNeIdNameList
            {

            					newCompositeNode(grammarAccess.getStateItemAccess().getListNeIdNameListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_1_0=ruleNeIdNameList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateItemRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeIdNameList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleStateItem"


    // $ANTLR start "entryRuleVarItem"
    // InternalTorXakisDsl.g:1747:1: entryRuleVarItem returns [EObject current=null] : iv_ruleVarItem= ruleVarItem EOF ;
    public final EObject entryRuleVarItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarItem = null;


        try {
            // InternalTorXakisDsl.g:1747:48: (iv_ruleVarItem= ruleVarItem EOF )
            // InternalTorXakisDsl.g:1748:2: iv_ruleVarItem= ruleVarItem EOF
            {
             newCompositeNode(grammarAccess.getVarItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarItem=ruleVarItem();

            state._fsp--;

             current =iv_ruleVarItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarItem"


    // $ANTLR start "ruleVarItem"
    // InternalTorXakisDsl.g:1754:1: ruleVarItem returns [EObject current=null] : ( () otherlv_1= 'VAR' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) )? ) ;
    public final EObject ruleVarItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neVarsDelarationList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1760:2: ( ( () otherlv_1= 'VAR' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) )? ) )
            // InternalTorXakisDsl.g:1761:2: ( () otherlv_1= 'VAR' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) )? )
            {
            // InternalTorXakisDsl.g:1761:2: ( () otherlv_1= 'VAR' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) )? )
            // InternalTorXakisDsl.g:1762:3: () otherlv_1= 'VAR' ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) )?
            {
            // InternalTorXakisDsl.g:1762:3: ()
            // InternalTorXakisDsl.g:1763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarItemAccess().getVarItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getVarItemAccess().getVARKeyword_1());
            		
            // InternalTorXakisDsl.g:1773:3: ( (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SMALLID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTorXakisDsl.g:1774:4: (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList )
                    {
                    // InternalTorXakisDsl.g:1774:4: (lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList )
                    // InternalTorXakisDsl.g:1775:5: lv_neVarsDelarationList_2_0= ruleNeVarsDeclarationList
                    {

                    					newCompositeNode(grammarAccess.getVarItemAccess().getNeVarsDelarationListNeVarsDeclarationListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_neVarsDelarationList_2_0=ruleNeVarsDeclarationList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarItemRule());
                    					}
                    					set(
                    						current,
                    						"neVarsDelarationList",
                    						lv_neVarsDelarationList_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeVarsDeclarationList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleVarItem"


    // $ANTLR start "entryRuleInitItem"
    // InternalTorXakisDsl.g:1796:1: entryRuleInitItem returns [EObject current=null] : iv_ruleInitItem= ruleInitItem EOF ;
    public final EObject entryRuleInitItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitItem = null;


        try {
            // InternalTorXakisDsl.g:1796:49: (iv_ruleInitItem= ruleInitItem EOF )
            // InternalTorXakisDsl.g:1797:2: iv_ruleInitItem= ruleInitItem EOF
            {
             newCompositeNode(grammarAccess.getInitItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitItem=ruleInitItem();

            state._fsp--;

             current =iv_ruleInitItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitItem"


    // $ANTLR start "ruleInitItem"
    // InternalTorXakisDsl.g:1803:1: ruleInitItem returns [EObject current=null] : (otherlv_0= 'INIT' ( (lv_idName_1_0= ruleIdName ) ) ( (lv_updateList_2_0= ruleUpdateList ) )? ) ;
    public final EObject ruleInitItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_idName_1_0 = null;

        EObject lv_updateList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1809:2: ( (otherlv_0= 'INIT' ( (lv_idName_1_0= ruleIdName ) ) ( (lv_updateList_2_0= ruleUpdateList ) )? ) )
            // InternalTorXakisDsl.g:1810:2: (otherlv_0= 'INIT' ( (lv_idName_1_0= ruleIdName ) ) ( (lv_updateList_2_0= ruleUpdateList ) )? )
            {
            // InternalTorXakisDsl.g:1810:2: (otherlv_0= 'INIT' ( (lv_idName_1_0= ruleIdName ) ) ( (lv_updateList_2_0= ruleUpdateList ) )? )
            // InternalTorXakisDsl.g:1811:3: otherlv_0= 'INIT' ( (lv_idName_1_0= ruleIdName ) ) ( (lv_updateList_2_0= ruleUpdateList ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getInitItemAccess().getINITKeyword_0());
            		
            // InternalTorXakisDsl.g:1815:3: ( (lv_idName_1_0= ruleIdName ) )
            // InternalTorXakisDsl.g:1816:4: (lv_idName_1_0= ruleIdName )
            {
            // InternalTorXakisDsl.g:1816:4: (lv_idName_1_0= ruleIdName )
            // InternalTorXakisDsl.g:1817:5: lv_idName_1_0= ruleIdName
            {

            					newCompositeNode(grammarAccess.getInitItemAccess().getIdNameIdNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_idName_1_0=ruleIdName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitItemRule());
            					}
            					set(
            						current,
            						"idName",
            						lv_idName_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.IdName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:1834:3: ( (lv_updateList_2_0= ruleUpdateList ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTorXakisDsl.g:1835:4: (lv_updateList_2_0= ruleUpdateList )
                    {
                    // InternalTorXakisDsl.g:1835:4: (lv_updateList_2_0= ruleUpdateList )
                    // InternalTorXakisDsl.g:1836:5: lv_updateList_2_0= ruleUpdateList
                    {

                    					newCompositeNode(grammarAccess.getInitItemAccess().getUpdateListUpdateListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_updateList_2_0=ruleUpdateList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInitItemRule());
                    					}
                    					set(
                    						current,
                    						"updateList",
                    						lv_updateList_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.UpdateList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleInitItem"


    // $ANTLR start "entryRuleTransItem"
    // InternalTorXakisDsl.g:1857:1: entryRuleTransItem returns [EObject current=null] : iv_ruleTransItem= ruleTransItem EOF ;
    public final EObject entryRuleTransItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransItem = null;


        try {
            // InternalTorXakisDsl.g:1857:50: (iv_ruleTransItem= ruleTransItem EOF )
            // InternalTorXakisDsl.g:1858:2: iv_ruleTransItem= ruleTransItem EOF
            {
             newCompositeNode(grammarAccess.getTransItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransItem=ruleTransItem();

            state._fsp--;

             current =iv_ruleTransItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransItem"


    // $ANTLR start "ruleTransItem"
    // InternalTorXakisDsl.g:1864:1: ruleTransItem returns [EObject current=null] : (otherlv_0= 'TRANS' ( (lv_transitions_1_0= ruleTransition ) ) (otherlv_2= ';' ( (lv_transitions_3_0= ruleTransition ) ) )* ) ;
    public final EObject ruleTransItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_transitions_1_0 = null;

        EObject lv_transitions_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1870:2: ( (otherlv_0= 'TRANS' ( (lv_transitions_1_0= ruleTransition ) ) (otherlv_2= ';' ( (lv_transitions_3_0= ruleTransition ) ) )* ) )
            // InternalTorXakisDsl.g:1871:2: (otherlv_0= 'TRANS' ( (lv_transitions_1_0= ruleTransition ) ) (otherlv_2= ';' ( (lv_transitions_3_0= ruleTransition ) ) )* )
            {
            // InternalTorXakisDsl.g:1871:2: (otherlv_0= 'TRANS' ( (lv_transitions_1_0= ruleTransition ) ) (otherlv_2= ';' ( (lv_transitions_3_0= ruleTransition ) ) )* )
            // InternalTorXakisDsl.g:1872:3: otherlv_0= 'TRANS' ( (lv_transitions_1_0= ruleTransition ) ) (otherlv_2= ';' ( (lv_transitions_3_0= ruleTransition ) ) )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getTransItemAccess().getTRANSKeyword_0());
            		
            // InternalTorXakisDsl.g:1876:3: ( (lv_transitions_1_0= ruleTransition ) )
            // InternalTorXakisDsl.g:1877:4: (lv_transitions_1_0= ruleTransition )
            {
            // InternalTorXakisDsl.g:1877:4: (lv_transitions_1_0= ruleTransition )
            // InternalTorXakisDsl.g:1878:5: lv_transitions_1_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getTransItemAccess().getTransitionsTransitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_transitions_1_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransItemRule());
            					}
            					add(
            						current,
            						"transitions",
            						lv_transitions_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:1895:3: (otherlv_2= ';' ( (lv_transitions_3_0= ruleTransition ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_SMALLID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_1==RULE_CAPSID) ) {
                        int LA22_4 = input.LA(3);

                        if ( (LA22_4==41) ) {
                            alt22=1;
                        }


                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalTorXakisDsl.g:1896:4: otherlv_2= ';' ( (lv_transitions_3_0= ruleTransition ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTransItemAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:1900:4: ( (lv_transitions_3_0= ruleTransition ) )
            	    // InternalTorXakisDsl.g:1901:5: (lv_transitions_3_0= ruleTransition )
            	    {
            	    // InternalTorXakisDsl.g:1901:5: (lv_transitions_3_0= ruleTransition )
            	    // InternalTorXakisDsl.g:1902:6: lv_transitions_3_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getTransItemAccess().getTransitionsTransitionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_transitions_3_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransItemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleTransItem"


    // $ANTLR start "entryRuleTransition"
    // InternalTorXakisDsl.g:1924:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalTorXakisDsl.g:1924:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalTorXakisDsl.g:1925:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalTorXakisDsl.g:1931:1: ruleTransition returns [EObject current=null] : ( ( (lv_fromName_0_0= ruleIdName ) ) otherlv_1= '->' ( (lv_conditionalCommunications_2_0= ruleConditionalCommunications ) ) ( (lv_updateList_3_0= ruleUpdateList ) )? otherlv_4= '->' ( (lv_toName_5_0= ruleIdName ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fromName_0_0 = null;

        EObject lv_conditionalCommunications_2_0 = null;

        EObject lv_updateList_3_0 = null;

        EObject lv_toName_5_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:1937:2: ( ( ( (lv_fromName_0_0= ruleIdName ) ) otherlv_1= '->' ( (lv_conditionalCommunications_2_0= ruleConditionalCommunications ) ) ( (lv_updateList_3_0= ruleUpdateList ) )? otherlv_4= '->' ( (lv_toName_5_0= ruleIdName ) ) ) )
            // InternalTorXakisDsl.g:1938:2: ( ( (lv_fromName_0_0= ruleIdName ) ) otherlv_1= '->' ( (lv_conditionalCommunications_2_0= ruleConditionalCommunications ) ) ( (lv_updateList_3_0= ruleUpdateList ) )? otherlv_4= '->' ( (lv_toName_5_0= ruleIdName ) ) )
            {
            // InternalTorXakisDsl.g:1938:2: ( ( (lv_fromName_0_0= ruleIdName ) ) otherlv_1= '->' ( (lv_conditionalCommunications_2_0= ruleConditionalCommunications ) ) ( (lv_updateList_3_0= ruleUpdateList ) )? otherlv_4= '->' ( (lv_toName_5_0= ruleIdName ) ) )
            // InternalTorXakisDsl.g:1939:3: ( (lv_fromName_0_0= ruleIdName ) ) otherlv_1= '->' ( (lv_conditionalCommunications_2_0= ruleConditionalCommunications ) ) ( (lv_updateList_3_0= ruleUpdateList ) )? otherlv_4= '->' ( (lv_toName_5_0= ruleIdName ) )
            {
            // InternalTorXakisDsl.g:1939:3: ( (lv_fromName_0_0= ruleIdName ) )
            // InternalTorXakisDsl.g:1940:4: (lv_fromName_0_0= ruleIdName )
            {
            // InternalTorXakisDsl.g:1940:4: (lv_fromName_0_0= ruleIdName )
            // InternalTorXakisDsl.g:1941:5: lv_fromName_0_0= ruleIdName
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromNameIdNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_fromName_0_0=ruleIdName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"fromName",
            						lv_fromName_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.IdName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalTorXakisDsl.g:1962:3: ( (lv_conditionalCommunications_2_0= ruleConditionalCommunications ) )
            // InternalTorXakisDsl.g:1963:4: (lv_conditionalCommunications_2_0= ruleConditionalCommunications )
            {
            // InternalTorXakisDsl.g:1963:4: (lv_conditionalCommunications_2_0= ruleConditionalCommunications )
            // InternalTorXakisDsl.g:1964:5: lv_conditionalCommunications_2_0= ruleConditionalCommunications
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionalCommunicationsConditionalCommunicationsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
            lv_conditionalCommunications_2_0=ruleConditionalCommunications();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"conditionalCommunications",
            						lv_conditionalCommunications_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ConditionalCommunications");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:1981:3: ( (lv_updateList_3_0= ruleUpdateList ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTorXakisDsl.g:1982:4: (lv_updateList_3_0= ruleUpdateList )
                    {
                    // InternalTorXakisDsl.g:1982:4: (lv_updateList_3_0= ruleUpdateList )
                    // InternalTorXakisDsl.g:1983:5: lv_updateList_3_0= ruleUpdateList
                    {

                    					newCompositeNode(grammarAccess.getTransitionAccess().getUpdateListUpdateListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_updateList_3_0=ruleUpdateList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransitionRule());
                    					}
                    					set(
                    						current,
                    						"updateList",
                    						lv_updateList_3_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.UpdateList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalTorXakisDsl.g:2004:3: ( (lv_toName_5_0= ruleIdName ) )
            // InternalTorXakisDsl.g:2005:4: (lv_toName_5_0= ruleIdName )
            {
            // InternalTorXakisDsl.g:2005:4: (lv_toName_5_0= ruleIdName )
            // InternalTorXakisDsl.g:2006:5: lv_toName_5_0= ruleIdName
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getToNameIdNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_toName_5_0=ruleIdName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"toName",
            						lv_toName_5_0,
            						"nl.tno.torxakis.language.TorXakisDsl.IdName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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


    // $ANTLR start "entryRuleUpdateList"
    // InternalTorXakisDsl.g:2027:1: entryRuleUpdateList returns [EObject current=null] : iv_ruleUpdateList= ruleUpdateList EOF ;
    public final EObject entryRuleUpdateList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateList = null;


        try {
            // InternalTorXakisDsl.g:2027:51: (iv_ruleUpdateList= ruleUpdateList EOF )
            // InternalTorXakisDsl.g:2028:2: iv_ruleUpdateList= ruleUpdateList EOF
            {
             newCompositeNode(grammarAccess.getUpdateListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateList=ruleUpdateList();

            state._fsp--;

             current =iv_ruleUpdateList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUpdateList"


    // $ANTLR start "ruleUpdateList"
    // InternalTorXakisDsl.g:2034:1: ruleUpdateList returns [EObject current=null] : (otherlv_0= '{' ( (lv_updates_1_0= ruleUpdate ) ) (otherlv_2= ';' ( (lv_updates_3_0= ruleUpdate ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleUpdateList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_updates_1_0 = null;

        EObject lv_updates_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2040:2: ( (otherlv_0= '{' ( (lv_updates_1_0= ruleUpdate ) ) (otherlv_2= ';' ( (lv_updates_3_0= ruleUpdate ) ) )* otherlv_4= '}' ) )
            // InternalTorXakisDsl.g:2041:2: (otherlv_0= '{' ( (lv_updates_1_0= ruleUpdate ) ) (otherlv_2= ';' ( (lv_updates_3_0= ruleUpdate ) ) )* otherlv_4= '}' )
            {
            // InternalTorXakisDsl.g:2041:2: (otherlv_0= '{' ( (lv_updates_1_0= ruleUpdate ) ) (otherlv_2= ';' ( (lv_updates_3_0= ruleUpdate ) ) )* otherlv_4= '}' )
            // InternalTorXakisDsl.g:2042:3: otherlv_0= '{' ( (lv_updates_1_0= ruleUpdate ) ) (otherlv_2= ';' ( (lv_updates_3_0= ruleUpdate ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTorXakisDsl.g:2046:3: ( (lv_updates_1_0= ruleUpdate ) )
            // InternalTorXakisDsl.g:2047:4: (lv_updates_1_0= ruleUpdate )
            {
            // InternalTorXakisDsl.g:2047:4: (lv_updates_1_0= ruleUpdate )
            // InternalTorXakisDsl.g:2048:5: lv_updates_1_0= ruleUpdate
            {

            					newCompositeNode(grammarAccess.getUpdateListAccess().getUpdatesUpdateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_updates_1_0=ruleUpdate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateListRule());
            					}
            					add(
            						current,
            						"updates",
            						lv_updates_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Update");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:2065:3: (otherlv_2= ';' ( (lv_updates_3_0= ruleUpdate ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTorXakisDsl.g:2066:4: otherlv_2= ';' ( (lv_updates_3_0= ruleUpdate ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUpdateListAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:2070:4: ( (lv_updates_3_0= ruleUpdate ) )
            	    // InternalTorXakisDsl.g:2071:5: (lv_updates_3_0= ruleUpdate )
            	    {
            	    // InternalTorXakisDsl.g:2071:5: (lv_updates_3_0= ruleUpdate )
            	    // InternalTorXakisDsl.g:2072:6: lv_updates_3_0= ruleUpdate
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateListAccess().getUpdatesUpdateParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_updates_3_0=ruleUpdate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"updates",
            	    							lv_updates_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.Update");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateListAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleUpdateList"


    // $ANTLR start "entryRuleUpdate"
    // InternalTorXakisDsl.g:2098:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalTorXakisDsl.g:2098:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalTorXakisDsl.g:2099:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalTorXakisDsl.g:2105:1: ruleUpdate returns [EObject current=null] : ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= ':=' ( (lv_valExpr_2_0= ruleValExpr ) ) ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varName_0_0 = null;

        EObject lv_valExpr_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2111:2: ( ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= ':=' ( (lv_valExpr_2_0= ruleValExpr ) ) ) )
            // InternalTorXakisDsl.g:2112:2: ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= ':=' ( (lv_valExpr_2_0= ruleValExpr ) ) )
            {
            // InternalTorXakisDsl.g:2112:2: ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= ':=' ( (lv_valExpr_2_0= ruleValExpr ) ) )
            // InternalTorXakisDsl.g:2113:3: ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= ':=' ( (lv_valExpr_2_0= ruleValExpr ) )
            {
            // InternalTorXakisDsl.g:2113:3: ( (lv_varName_0_0= ruleVarName ) )
            // InternalTorXakisDsl.g:2114:4: (lv_varName_0_0= ruleVarName )
            {
            // InternalTorXakisDsl.g:2114:4: (lv_varName_0_0= ruleVarName )
            // InternalTorXakisDsl.g:2115:5: lv_varName_0_0= ruleVarName
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getVarNameVarNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_varName_0_0=ruleVarName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.VarName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getColonEqualsSignKeyword_1());
            		
            // InternalTorXakisDsl.g:2136:3: ( (lv_valExpr_2_0= ruleValExpr ) )
            // InternalTorXakisDsl.g:2137:4: (lv_valExpr_2_0= ruleValExpr )
            {
            // InternalTorXakisDsl.g:2137:4: (lv_valExpr_2_0= ruleValExpr )
            // InternalTorXakisDsl.g:2138:5: lv_valExpr_2_0= ruleValExpr
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getValExprValExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valExpr_2_0=ruleValExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"valExpr",
            						lv_valExpr_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleMapperName"
    // InternalTorXakisDsl.g:2159:1: entryRuleMapperName returns [EObject current=null] : iv_ruleMapperName= ruleMapperName EOF ;
    public final EObject entryRuleMapperName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapperName = null;


        try {
            // InternalTorXakisDsl.g:2159:51: (iv_ruleMapperName= ruleMapperName EOF )
            // InternalTorXakisDsl.g:2160:2: iv_ruleMapperName= ruleMapperName EOF
            {
             newCompositeNode(grammarAccess.getMapperNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapperName=ruleMapperName();

            state._fsp--;

             current =iv_ruleMapperName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMapperName"


    // $ANTLR start "ruleMapperName"
    // InternalTorXakisDsl.g:2166:1: ruleMapperName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleMapperName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:2172:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:2173:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:2173:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:2174:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:2174:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:2175:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMapperNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMapperNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleMapperName"


    // $ANTLR start "entryRuleNeConstructorList"
    // InternalTorXakisDsl.g:2194:1: entryRuleNeConstructorList returns [EObject current=null] : iv_ruleNeConstructorList= ruleNeConstructorList EOF ;
    public final EObject entryRuleNeConstructorList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeConstructorList = null;


        try {
            // InternalTorXakisDsl.g:2194:58: (iv_ruleNeConstructorList= ruleNeConstructorList EOF )
            // InternalTorXakisDsl.g:2195:2: iv_ruleNeConstructorList= ruleNeConstructorList EOF
            {
             newCompositeNode(grammarAccess.getNeConstructorListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeConstructorList=ruleNeConstructorList();

            state._fsp--;

             current =iv_ruleNeConstructorList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeConstructorList"


    // $ANTLR start "ruleNeConstructorList"
    // InternalTorXakisDsl.g:2201:1: ruleNeConstructorList returns [EObject current=null] : ( ( (lv_constructors_0_0= ruleConstructor ) ) (otherlv_1= '|' ( (lv_constructor_2_0= ruleConstructor ) ) )* ) ;
    public final EObject ruleNeConstructorList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constructors_0_0 = null;

        EObject lv_constructor_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2207:2: ( ( ( (lv_constructors_0_0= ruleConstructor ) ) (otherlv_1= '|' ( (lv_constructor_2_0= ruleConstructor ) ) )* ) )
            // InternalTorXakisDsl.g:2208:2: ( ( (lv_constructors_0_0= ruleConstructor ) ) (otherlv_1= '|' ( (lv_constructor_2_0= ruleConstructor ) ) )* )
            {
            // InternalTorXakisDsl.g:2208:2: ( ( (lv_constructors_0_0= ruleConstructor ) ) (otherlv_1= '|' ( (lv_constructor_2_0= ruleConstructor ) ) )* )
            // InternalTorXakisDsl.g:2209:3: ( (lv_constructors_0_0= ruleConstructor ) ) (otherlv_1= '|' ( (lv_constructor_2_0= ruleConstructor ) ) )*
            {
            // InternalTorXakisDsl.g:2209:3: ( (lv_constructors_0_0= ruleConstructor ) )
            // InternalTorXakisDsl.g:2210:4: (lv_constructors_0_0= ruleConstructor )
            {
            // InternalTorXakisDsl.g:2210:4: (lv_constructors_0_0= ruleConstructor )
            // InternalTorXakisDsl.g:2211:5: lv_constructors_0_0= ruleConstructor
            {

            					newCompositeNode(grammarAccess.getNeConstructorListAccess().getConstructorsConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_constructors_0_0=ruleConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeConstructorListRule());
            					}
            					add(
            						current,
            						"constructors",
            						lv_constructors_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Constructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:2228:3: (otherlv_1= '|' ( (lv_constructor_2_0= ruleConstructor ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==45) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTorXakisDsl.g:2229:4: otherlv_1= '|' ( (lv_constructor_2_0= ruleConstructor ) )
            	    {
            	    otherlv_1=(Token)match(input,45,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeConstructorListAccess().getVerticalLineKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:2233:4: ( (lv_constructor_2_0= ruleConstructor ) )
            	    // InternalTorXakisDsl.g:2234:5: (lv_constructor_2_0= ruleConstructor )
            	    {
            	    // InternalTorXakisDsl.g:2234:5: (lv_constructor_2_0= ruleConstructor )
            	    // InternalTorXakisDsl.g:2235:6: lv_constructor_2_0= ruleConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getNeConstructorListAccess().getConstructorConstructorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_constructor_2_0=ruleConstructor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeConstructorListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constructor",
            	    							lv_constructor_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.Constructor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleNeConstructorList"


    // $ANTLR start "entryRuleConstructor"
    // InternalTorXakisDsl.g:2257:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalTorXakisDsl.g:2257:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalTorXakisDsl.g:2258:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalTorXakisDsl.g:2264:1: ruleConstructor returns [EObject current=null] : ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '{' ( (lv_neFieldsList_2_0= ruleNeFieldList ) ) otherlv_3= '}' )? ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_neFieldsList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2270:2: ( ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '{' ( (lv_neFieldsList_2_0= ruleNeFieldList ) ) otherlv_3= '}' )? ) )
            // InternalTorXakisDsl.g:2271:2: ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '{' ( (lv_neFieldsList_2_0= ruleNeFieldList ) ) otherlv_3= '}' )? )
            {
            // InternalTorXakisDsl.g:2271:2: ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '{' ( (lv_neFieldsList_2_0= ruleNeFieldList ) ) otherlv_3= '}' )? )
            // InternalTorXakisDsl.g:2272:3: ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '{' ( (lv_neFieldsList_2_0= ruleNeFieldList ) ) otherlv_3= '}' )?
            {
            // InternalTorXakisDsl.g:2272:3: ( (lv_name_0_0= ruleConstructorName ) )
            // InternalTorXakisDsl.g:2273:4: (lv_name_0_0= ruleConstructorName )
            {
            // InternalTorXakisDsl.g:2273:4: (lv_name_0_0= ruleConstructorName )
            // InternalTorXakisDsl.g:2274:5: lv_name_0_0= ruleConstructorName
            {

            					newCompositeNode(grammarAccess.getConstructorAccess().getNameConstructorNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_0_0=ruleConstructorName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ConstructorName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:2291:3: (otherlv_1= '{' ( (lv_neFieldsList_2_0= ruleNeFieldList ) ) otherlv_3= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTorXakisDsl.g:2292:4: otherlv_1= '{' ( (lv_neFieldsList_2_0= ruleNeFieldList ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalTorXakisDsl.g:2296:4: ( (lv_neFieldsList_2_0= ruleNeFieldList ) )
                    // InternalTorXakisDsl.g:2297:5: (lv_neFieldsList_2_0= ruleNeFieldList )
                    {
                    // InternalTorXakisDsl.g:2297:5: (lv_neFieldsList_2_0= ruleNeFieldList )
                    // InternalTorXakisDsl.g:2298:6: lv_neFieldsList_2_0= ruleNeFieldList
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getNeFieldsListNeFieldListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_neFieldsList_2_0=ruleNeFieldList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						set(
                    							current,
                    							"neFieldsList",
                    							lv_neFieldsList_2_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.NeFieldList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleNeFieldList"
    // InternalTorXakisDsl.g:2324:1: entryRuleNeFieldList returns [EObject current=null] : iv_ruleNeFieldList= ruleNeFieldList EOF ;
    public final EObject entryRuleNeFieldList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeFieldList = null;


        try {
            // InternalTorXakisDsl.g:2324:52: (iv_ruleNeFieldList= ruleNeFieldList EOF )
            // InternalTorXakisDsl.g:2325:2: iv_ruleNeFieldList= ruleNeFieldList EOF
            {
             newCompositeNode(grammarAccess.getNeFieldListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeFieldList=ruleNeFieldList();

            state._fsp--;

             current =iv_ruleNeFieldList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeFieldList"


    // $ANTLR start "ruleNeFieldList"
    // InternalTorXakisDsl.g:2331:1: ruleNeFieldList returns [EObject current=null] : ( ( (lv_fields_0_0= ruleFields ) ) (otherlv_1= ';' ( (lv_fields_2_0= ruleFields ) ) )* ) ;
    public final EObject ruleNeFieldList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2337:2: ( ( ( (lv_fields_0_0= ruleFields ) ) (otherlv_1= ';' ( (lv_fields_2_0= ruleFields ) ) )* ) )
            // InternalTorXakisDsl.g:2338:2: ( ( (lv_fields_0_0= ruleFields ) ) (otherlv_1= ';' ( (lv_fields_2_0= ruleFields ) ) )* )
            {
            // InternalTorXakisDsl.g:2338:2: ( ( (lv_fields_0_0= ruleFields ) ) (otherlv_1= ';' ( (lv_fields_2_0= ruleFields ) ) )* )
            // InternalTorXakisDsl.g:2339:3: ( (lv_fields_0_0= ruleFields ) ) (otherlv_1= ';' ( (lv_fields_2_0= ruleFields ) ) )*
            {
            // InternalTorXakisDsl.g:2339:3: ( (lv_fields_0_0= ruleFields ) )
            // InternalTorXakisDsl.g:2340:4: (lv_fields_0_0= ruleFields )
            {
            // InternalTorXakisDsl.g:2340:4: (lv_fields_0_0= ruleFields )
            // InternalTorXakisDsl.g:2341:5: lv_fields_0_0= ruleFields
            {

            					newCompositeNode(grammarAccess.getNeFieldListAccess().getFieldsFieldsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_fields_0_0=ruleFields();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeFieldListRule());
            					}
            					add(
            						current,
            						"fields",
            						lv_fields_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Fields");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:2358:3: (otherlv_1= ';' ( (lv_fields_2_0= ruleFields ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTorXakisDsl.g:2359:4: otherlv_1= ';' ( (lv_fields_2_0= ruleFields ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeFieldListAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:2363:4: ( (lv_fields_2_0= ruleFields ) )
            	    // InternalTorXakisDsl.g:2364:5: (lv_fields_2_0= ruleFields )
            	    {
            	    // InternalTorXakisDsl.g:2364:5: (lv_fields_2_0= ruleFields )
            	    // InternalTorXakisDsl.g:2365:6: lv_fields_2_0= ruleFields
            	    {

            	    						newCompositeNode(grammarAccess.getNeFieldListAccess().getFieldsFieldsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_fields_2_0=ruleFields();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeFieldListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fields",
            	    							lv_fields_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.Fields");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "ruleNeFieldList"


    // $ANTLR start "entryRuleFields"
    // InternalTorXakisDsl.g:2387:1: entryRuleFields returns [EObject current=null] : iv_ruleFields= ruleFields EOF ;
    public final EObject entryRuleFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFields = null;


        try {
            // InternalTorXakisDsl.g:2387:47: (iv_ruleFields= ruleFields EOF )
            // InternalTorXakisDsl.g:2388:2: iv_ruleFields= ruleFields EOF
            {
             newCompositeNode(grammarAccess.getFieldsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFields=ruleFields();

            state._fsp--;

             current =iv_ruleFields; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFields"


    // $ANTLR start "ruleFields"
    // InternalTorXakisDsl.g:2394:1: ruleFields returns [EObject current=null] : ( ( (lv_neFieldNameList_0_0= ruleNeFieldNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) ;
    public final EObject ruleFields() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neFieldNameList_0_0 = null;

        EObject lv_typeName_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2400:2: ( ( ( (lv_neFieldNameList_0_0= ruleNeFieldNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) )
            // InternalTorXakisDsl.g:2401:2: ( ( (lv_neFieldNameList_0_0= ruleNeFieldNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            {
            // InternalTorXakisDsl.g:2401:2: ( ( (lv_neFieldNameList_0_0= ruleNeFieldNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            // InternalTorXakisDsl.g:2402:3: ( (lv_neFieldNameList_0_0= ruleNeFieldNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) )
            {
            // InternalTorXakisDsl.g:2402:3: ( (lv_neFieldNameList_0_0= ruleNeFieldNameList ) )
            // InternalTorXakisDsl.g:2403:4: (lv_neFieldNameList_0_0= ruleNeFieldNameList )
            {
            // InternalTorXakisDsl.g:2403:4: (lv_neFieldNameList_0_0= ruleNeFieldNameList )
            // InternalTorXakisDsl.g:2404:5: lv_neFieldNameList_0_0= ruleNeFieldNameList
            {

            					newCompositeNode(grammarAccess.getFieldsAccess().getNeFieldNameListNeFieldNameListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_neFieldNameList_0_0=ruleNeFieldNameList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldsRule());
            					}
            					set(
            						current,
            						"neFieldNameList",
            						lv_neFieldNameList_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeFieldNameList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldsAccess().getColonColonKeyword_1());
            		
            // InternalTorXakisDsl.g:2425:3: ( (lv_typeName_2_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:2426:4: (lv_typeName_2_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:2426:4: (lv_typeName_2_0= ruleTypeName )
            // InternalTorXakisDsl.g:2427:5: lv_typeName_2_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getFieldsAccess().getTypeNameTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeName_2_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldsRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleFields"


    // $ANTLR start "entryRuleNeFieldNameList"
    // InternalTorXakisDsl.g:2448:1: entryRuleNeFieldNameList returns [EObject current=null] : iv_ruleNeFieldNameList= ruleNeFieldNameList EOF ;
    public final EObject entryRuleNeFieldNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeFieldNameList = null;


        try {
            // InternalTorXakisDsl.g:2448:56: (iv_ruleNeFieldNameList= ruleNeFieldNameList EOF )
            // InternalTorXakisDsl.g:2449:2: iv_ruleNeFieldNameList= ruleNeFieldNameList EOF
            {
             newCompositeNode(grammarAccess.getNeFieldNameListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeFieldNameList=ruleNeFieldNameList();

            state._fsp--;

             current =iv_ruleNeFieldNameList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeFieldNameList"


    // $ANTLR start "ruleNeFieldNameList"
    // InternalTorXakisDsl.g:2455:1: ruleNeFieldNameList returns [EObject current=null] : ( ( (lv_fieldNames_0_0= ruleFieldName ) ) (otherlv_1= ',' ( (lv_fieldNames_2_0= ruleFieldName ) ) )* ) ;
    public final EObject ruleNeFieldNameList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fieldNames_0_0 = null;

        EObject lv_fieldNames_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2461:2: ( ( ( (lv_fieldNames_0_0= ruleFieldName ) ) (otherlv_1= ',' ( (lv_fieldNames_2_0= ruleFieldName ) ) )* ) )
            // InternalTorXakisDsl.g:2462:2: ( ( (lv_fieldNames_0_0= ruleFieldName ) ) (otherlv_1= ',' ( (lv_fieldNames_2_0= ruleFieldName ) ) )* )
            {
            // InternalTorXakisDsl.g:2462:2: ( ( (lv_fieldNames_0_0= ruleFieldName ) ) (otherlv_1= ',' ( (lv_fieldNames_2_0= ruleFieldName ) ) )* )
            // InternalTorXakisDsl.g:2463:3: ( (lv_fieldNames_0_0= ruleFieldName ) ) (otherlv_1= ',' ( (lv_fieldNames_2_0= ruleFieldName ) ) )*
            {
            // InternalTorXakisDsl.g:2463:3: ( (lv_fieldNames_0_0= ruleFieldName ) )
            // InternalTorXakisDsl.g:2464:4: (lv_fieldNames_0_0= ruleFieldName )
            {
            // InternalTorXakisDsl.g:2464:4: (lv_fieldNames_0_0= ruleFieldName )
            // InternalTorXakisDsl.g:2465:5: lv_fieldNames_0_0= ruleFieldName
            {

            					newCompositeNode(grammarAccess.getNeFieldNameListAccess().getFieldNamesFieldNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_fieldNames_0_0=ruleFieldName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeFieldNameListRule());
            					}
            					add(
            						current,
            						"fieldNames",
            						lv_fieldNames_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.FieldName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:2482:3: (otherlv_1= ',' ( (lv_fieldNames_2_0= ruleFieldName ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTorXakisDsl.g:2483:4: otherlv_1= ',' ( (lv_fieldNames_2_0= ruleFieldName ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeFieldNameListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:2487:4: ( (lv_fieldNames_2_0= ruleFieldName ) )
            	    // InternalTorXakisDsl.g:2488:5: (lv_fieldNames_2_0= ruleFieldName )
            	    {
            	    // InternalTorXakisDsl.g:2488:5: (lv_fieldNames_2_0= ruleFieldName )
            	    // InternalTorXakisDsl.g:2489:6: lv_fieldNames_2_0= ruleFieldName
            	    {

            	    						newCompositeNode(grammarAccess.getNeFieldNameListAccess().getFieldNamesFieldNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_fieldNames_2_0=ruleFieldName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeFieldNameListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fieldNames",
            	    							lv_fieldNames_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.FieldName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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
    // $ANTLR end "ruleNeFieldNameList"


    // $ANTLR start "entryRuleFieldName"
    // InternalTorXakisDsl.g:2511:1: entryRuleFieldName returns [EObject current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final EObject entryRuleFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldName = null;


        try {
            // InternalTorXakisDsl.g:2511:50: (iv_ruleFieldName= ruleFieldName EOF )
            // InternalTorXakisDsl.g:2512:2: iv_ruleFieldName= ruleFieldName EOF
            {
             newCompositeNode(grammarAccess.getFieldNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;

             current =iv_ruleFieldName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldName"


    // $ANTLR start "ruleFieldName"
    // InternalTorXakisDsl.g:2518:1: ruleFieldName returns [EObject current=null] : ( (lv_name_0_0= RULE_SMALLID ) ) ;
    public final EObject ruleFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:2524:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) )
            // InternalTorXakisDsl.g:2525:2: ( (lv_name_0_0= RULE_SMALLID ) )
            {
            // InternalTorXakisDsl.g:2525:2: ( (lv_name_0_0= RULE_SMALLID ) )
            // InternalTorXakisDsl.g:2526:3: (lv_name_0_0= RULE_SMALLID )
            {
            // InternalTorXakisDsl.g:2526:3: (lv_name_0_0= RULE_SMALLID )
            // InternalTorXakisDsl.g:2527:4: lv_name_0_0= RULE_SMALLID
            {
            lv_name_0_0=(Token)match(input,RULE_SMALLID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFieldNameAccess().getNameSMALLIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFieldNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.SMALLID");
            			

            }


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
    // $ANTLR end "ruleFieldName"


    // $ANTLR start "entryRuleExitDecl"
    // InternalTorXakisDsl.g:2546:1: entryRuleExitDecl returns [EObject current=null] : iv_ruleExitDecl= ruleExitDecl EOF ;
    public final EObject entryRuleExitDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitDecl = null;


        try {
            // InternalTorXakisDsl.g:2546:49: (iv_ruleExitDecl= ruleExitDecl EOF )
            // InternalTorXakisDsl.g:2547:2: iv_ruleExitDecl= ruleExitDecl EOF
            {
             newCompositeNode(grammarAccess.getExitDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExitDecl=ruleExitDecl();

            state._fsp--;

             current =iv_ruleExitDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExitDecl"


    // $ANTLR start "ruleExitDecl"
    // InternalTorXakisDsl.g:2553:1: ruleExitDecl returns [EObject current=null] : ( ( (lv_exit_0_0= 'EXIT' ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? ) ;
    public final EObject ruleExitDecl() throws RecognitionException {
        EObject current = null;

        Token lv_exit_0_0=null;
        Token otherlv_1=null;
        EObject lv_neTypeNameList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2559:2: ( ( ( (lv_exit_0_0= 'EXIT' ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? ) )
            // InternalTorXakisDsl.g:2560:2: ( ( (lv_exit_0_0= 'EXIT' ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? )
            {
            // InternalTorXakisDsl.g:2560:2: ( ( (lv_exit_0_0= 'EXIT' ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? )
            // InternalTorXakisDsl.g:2561:3: ( (lv_exit_0_0= 'EXIT' ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )?
            {
            // InternalTorXakisDsl.g:2561:3: ( (lv_exit_0_0= 'EXIT' ) )
            // InternalTorXakisDsl.g:2562:4: (lv_exit_0_0= 'EXIT' )
            {
            // InternalTorXakisDsl.g:2562:4: (lv_exit_0_0= 'EXIT' )
            // InternalTorXakisDsl.g:2563:5: lv_exit_0_0= 'EXIT'
            {
            lv_exit_0_0=(Token)match(input,47,FOLLOW_41); 

            					newLeafNode(lv_exit_0_0, grammarAccess.getExitDeclAccess().getExitEXITKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExitDeclRule());
            					}
            					setWithLastConsumed(current, "exit", lv_exit_0_0, "EXIT");
            				

            }


            }

            // InternalTorXakisDsl.g:2575:3: (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTorXakisDsl.g:2576:4: otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getExitDeclAccess().getColonColonKeyword_1_0());
                    			
                    // InternalTorXakisDsl.g:2580:4: ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) )
                    // InternalTorXakisDsl.g:2581:5: (lv_neTypeNameList_2_0= ruleNeTypeNameList )
                    {
                    // InternalTorXakisDsl.g:2581:5: (lv_neTypeNameList_2_0= ruleNeTypeNameList )
                    // InternalTorXakisDsl.g:2582:6: lv_neTypeNameList_2_0= ruleNeTypeNameList
                    {

                    						newCompositeNode(grammarAccess.getExitDeclAccess().getNeTypeNameListNeTypeNameListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_neTypeNameList_2_0=ruleNeTypeNameList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExitDeclRule());
                    						}
                    						set(
                    							current,
                    							"neTypeNameList",
                    							lv_neTypeNameList_2_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.NeTypeNameList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleExitDecl"


    // $ANTLR start "entryRuleModelName"
    // InternalTorXakisDsl.g:2604:1: entryRuleModelName returns [EObject current=null] : iv_ruleModelName= ruleModelName EOF ;
    public final EObject entryRuleModelName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelName = null;


        try {
            // InternalTorXakisDsl.g:2604:50: (iv_ruleModelName= ruleModelName EOF )
            // InternalTorXakisDsl.g:2605:2: iv_ruleModelName= ruleModelName EOF
            {
             newCompositeNode(grammarAccess.getModelNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelName=ruleModelName();

            state._fsp--;

             current =iv_ruleModelName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelName"


    // $ANTLR start "ruleModelName"
    // InternalTorXakisDsl.g:2611:1: ruleModelName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleModelName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:2617:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:2618:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:2618:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:2619:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:2619:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:2620:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getModelNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModelNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleModelName"


    // $ANTLR start "entryRuleConnectionItem"
    // InternalTorXakisDsl.g:2639:1: entryRuleConnectionItem returns [EObject current=null] : iv_ruleConnectionItem= ruleConnectionItem EOF ;
    public final EObject entryRuleConnectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionItem = null;


        try {
            // InternalTorXakisDsl.g:2639:55: (iv_ruleConnectionItem= ruleConnectionItem EOF )
            // InternalTorXakisDsl.g:2640:2: iv_ruleConnectionItem= ruleConnectionItem EOF
            {
             newCompositeNode(grammarAccess.getConnectionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionItem=ruleConnectionItem();

            state._fsp--;

             current =iv_ruleConnectionItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectionItem"


    // $ANTLR start "ruleConnectionItem"
    // InternalTorXakisDsl.g:2646:1: ruleConnectionItem returns [EObject current=null] : (this_ConnectionOut_0= ruleConnectionOut | this_ConnectionIn_1= ruleConnectionIn | this_Encoding_2= ruleEncoding | this_Decoding_3= ruleDecoding ) ;
    public final EObject ruleConnectionItem() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectionOut_0 = null;

        EObject this_ConnectionIn_1 = null;

        EObject this_Encoding_2 = null;

        EObject this_Decoding_3 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2652:2: ( (this_ConnectionOut_0= ruleConnectionOut | this_ConnectionIn_1= ruleConnectionIn | this_Encoding_2= ruleEncoding | this_Decoding_3= ruleDecoding ) )
            // InternalTorXakisDsl.g:2653:2: (this_ConnectionOut_0= ruleConnectionOut | this_ConnectionIn_1= ruleConnectionIn | this_Encoding_2= ruleEncoding | this_Decoding_3= ruleDecoding )
            {
            // InternalTorXakisDsl.g:2653:2: (this_ConnectionOut_0= ruleConnectionOut | this_ConnectionIn_1= ruleConnectionIn | this_Encoding_2= ruleEncoding | this_Decoding_3= ruleDecoding )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==30) ) {
                    alt30=2;
                }
                else if ( (LA30_1==31) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                alt30=3;
                }
                break;
            case 51:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalTorXakisDsl.g:2654:3: this_ConnectionOut_0= ruleConnectionOut
                    {

                    			newCompositeNode(grammarAccess.getConnectionItemAccess().getConnectionOutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectionOut_0=ruleConnectionOut();

                    state._fsp--;


                    			current = this_ConnectionOut_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:2663:3: this_ConnectionIn_1= ruleConnectionIn
                    {

                    			newCompositeNode(grammarAccess.getConnectionItemAccess().getConnectionInParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectionIn_1=ruleConnectionIn();

                    state._fsp--;


                    			current = this_ConnectionIn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTorXakisDsl.g:2672:3: this_Encoding_2= ruleEncoding
                    {

                    			newCompositeNode(grammarAccess.getConnectionItemAccess().getEncodingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Encoding_2=ruleEncoding();

                    state._fsp--;


                    			current = this_Encoding_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTorXakisDsl.g:2681:3: this_Decoding_3= ruleDecoding
                    {

                    			newCompositeNode(grammarAccess.getConnectionItemAccess().getDecodingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decoding_3=ruleDecoding();

                    state._fsp--;


                    			current = this_Decoding_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleConnectionItem"


    // $ANTLR start "entryRuleConnectionOut"
    // InternalTorXakisDsl.g:2693:1: entryRuleConnectionOut returns [EObject current=null] : iv_ruleConnectionOut= ruleConnectionOut EOF ;
    public final EObject entryRuleConnectionOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionOut = null;


        try {
            // InternalTorXakisDsl.g:2693:54: (iv_ruleConnectionOut= ruleConnectionOut EOF )
            // InternalTorXakisDsl.g:2694:2: iv_ruleConnectionOut= ruleConnectionOut EOF
            {
             newCompositeNode(grammarAccess.getConnectionOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionOut=ruleConnectionOut();

            state._fsp--;

             current =iv_ruleConnectionOut; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectionOut"


    // $ANTLR start "ruleConnectionOut"
    // InternalTorXakisDsl.g:2700:1: ruleConnectionOut returns [EObject current=null] : (otherlv_0= 'CHAN' otherlv_1= 'OUT' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) ) ;
    public final EObject ruleConnectionOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_channelsDecl_2_0 = null;

        EObject lv_hostName_4_0 = null;

        EObject lv_portNumber_6_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2706:2: ( (otherlv_0= 'CHAN' otherlv_1= 'OUT' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) ) )
            // InternalTorXakisDsl.g:2707:2: (otherlv_0= 'CHAN' otherlv_1= 'OUT' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) )
            {
            // InternalTorXakisDsl.g:2707:2: (otherlv_0= 'CHAN' otherlv_1= 'OUT' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) )
            // InternalTorXakisDsl.g:2708:3: otherlv_0= 'CHAN' otherlv_1= 'OUT' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionOutAccess().getCHANKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionOutAccess().getOUTKeyword_1());
            		
            // InternalTorXakisDsl.g:2716:3: ( (lv_channelsDecl_2_0= ruleChannelsDecl ) )
            // InternalTorXakisDsl.g:2717:4: (lv_channelsDecl_2_0= ruleChannelsDecl )
            {
            // InternalTorXakisDsl.g:2717:4: (lv_channelsDecl_2_0= ruleChannelsDecl )
            // InternalTorXakisDsl.g:2718:5: lv_channelsDecl_2_0= ruleChannelsDecl
            {

            					newCompositeNode(grammarAccess.getConnectionOutAccess().getChannelsDeclChannelsDeclParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
            lv_channelsDecl_2_0=ruleChannelsDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionOutRule());
            					}
            					set(
            						current,
            						"channelsDecl",
            						lv_channelsDecl_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelsDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectionOutAccess().getHOSTKeyword_3());
            		
            // InternalTorXakisDsl.g:2739:3: ( (lv_hostName_4_0= ruleHostName ) )
            // InternalTorXakisDsl.g:2740:4: (lv_hostName_4_0= ruleHostName )
            {
            // InternalTorXakisDsl.g:2740:4: (lv_hostName_4_0= ruleHostName )
            // InternalTorXakisDsl.g:2741:5: lv_hostName_4_0= ruleHostName
            {

            					newCompositeNode(grammarAccess.getConnectionOutAccess().getHostNameHostNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_44);
            lv_hostName_4_0=ruleHostName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionOutRule());
            					}
            					set(
            						current,
            						"hostName",
            						lv_hostName_4_0,
            						"nl.tno.torxakis.language.TorXakisDsl.HostName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectionOutAccess().getPORTKeyword_5());
            		
            // InternalTorXakisDsl.g:2762:3: ( (lv_portNumber_6_0= rulePortNumber ) )
            // InternalTorXakisDsl.g:2763:4: (lv_portNumber_6_0= rulePortNumber )
            {
            // InternalTorXakisDsl.g:2763:4: (lv_portNumber_6_0= rulePortNumber )
            // InternalTorXakisDsl.g:2764:5: lv_portNumber_6_0= rulePortNumber
            {

            					newCompositeNode(grammarAccess.getConnectionOutAccess().getPortNumberPortNumberParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_portNumber_6_0=rulePortNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionOutRule());
            					}
            					set(
            						current,
            						"portNumber",
            						lv_portNumber_6_0,
            						"nl.tno.torxakis.language.TorXakisDsl.PortNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleConnectionOut"


    // $ANTLR start "entryRuleConnectionIn"
    // InternalTorXakisDsl.g:2785:1: entryRuleConnectionIn returns [EObject current=null] : iv_ruleConnectionIn= ruleConnectionIn EOF ;
    public final EObject entryRuleConnectionIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionIn = null;


        try {
            // InternalTorXakisDsl.g:2785:53: (iv_ruleConnectionIn= ruleConnectionIn EOF )
            // InternalTorXakisDsl.g:2786:2: iv_ruleConnectionIn= ruleConnectionIn EOF
            {
             newCompositeNode(grammarAccess.getConnectionInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionIn=ruleConnectionIn();

            state._fsp--;

             current =iv_ruleConnectionIn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectionIn"


    // $ANTLR start "ruleConnectionIn"
    // InternalTorXakisDsl.g:2792:1: ruleConnectionIn returns [EObject current=null] : (otherlv_0= 'CHAN' otherlv_1= 'IN' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) ) ;
    public final EObject ruleConnectionIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_channelsDecl_2_0 = null;

        EObject lv_hostName_4_0 = null;

        EObject lv_portNumber_6_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2798:2: ( (otherlv_0= 'CHAN' otherlv_1= 'IN' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) ) )
            // InternalTorXakisDsl.g:2799:2: (otherlv_0= 'CHAN' otherlv_1= 'IN' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) )
            {
            // InternalTorXakisDsl.g:2799:2: (otherlv_0= 'CHAN' otherlv_1= 'IN' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) ) )
            // InternalTorXakisDsl.g:2800:3: otherlv_0= 'CHAN' otherlv_1= 'IN' ( (lv_channelsDecl_2_0= ruleChannelsDecl ) ) otherlv_3= 'HOST' ( (lv_hostName_4_0= ruleHostName ) ) otherlv_5= 'PORT' ( (lv_portNumber_6_0= rulePortNumber ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionInAccess().getCHANKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionInAccess().getINKeyword_1());
            		
            // InternalTorXakisDsl.g:2808:3: ( (lv_channelsDecl_2_0= ruleChannelsDecl ) )
            // InternalTorXakisDsl.g:2809:4: (lv_channelsDecl_2_0= ruleChannelsDecl )
            {
            // InternalTorXakisDsl.g:2809:4: (lv_channelsDecl_2_0= ruleChannelsDecl )
            // InternalTorXakisDsl.g:2810:5: lv_channelsDecl_2_0= ruleChannelsDecl
            {

            					newCompositeNode(grammarAccess.getConnectionInAccess().getChannelsDeclChannelsDeclParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
            lv_channelsDecl_2_0=ruleChannelsDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionInRule());
            					}
            					set(
            						current,
            						"channelsDecl",
            						lv_channelsDecl_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelsDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectionInAccess().getHOSTKeyword_3());
            		
            // InternalTorXakisDsl.g:2831:3: ( (lv_hostName_4_0= ruleHostName ) )
            // InternalTorXakisDsl.g:2832:4: (lv_hostName_4_0= ruleHostName )
            {
            // InternalTorXakisDsl.g:2832:4: (lv_hostName_4_0= ruleHostName )
            // InternalTorXakisDsl.g:2833:5: lv_hostName_4_0= ruleHostName
            {

            					newCompositeNode(grammarAccess.getConnectionInAccess().getHostNameHostNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_44);
            lv_hostName_4_0=ruleHostName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionInRule());
            					}
            					set(
            						current,
            						"hostName",
            						lv_hostName_4_0,
            						"nl.tno.torxakis.language.TorXakisDsl.HostName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectionInAccess().getPORTKeyword_5());
            		
            // InternalTorXakisDsl.g:2854:3: ( (lv_portNumber_6_0= rulePortNumber ) )
            // InternalTorXakisDsl.g:2855:4: (lv_portNumber_6_0= rulePortNumber )
            {
            // InternalTorXakisDsl.g:2855:4: (lv_portNumber_6_0= rulePortNumber )
            // InternalTorXakisDsl.g:2856:5: lv_portNumber_6_0= rulePortNumber
            {

            					newCompositeNode(grammarAccess.getConnectionInAccess().getPortNumberPortNumberParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_portNumber_6_0=rulePortNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionInRule());
            					}
            					set(
            						current,
            						"portNumber",
            						lv_portNumber_6_0,
            						"nl.tno.torxakis.language.TorXakisDsl.PortNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleConnectionIn"


    // $ANTLR start "entryRuleEncoding"
    // InternalTorXakisDsl.g:2877:1: entryRuleEncoding returns [EObject current=null] : iv_ruleEncoding= ruleEncoding EOF ;
    public final EObject entryRuleEncoding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncoding = null;


        try {
            // InternalTorXakisDsl.g:2877:49: (iv_ruleEncoding= ruleEncoding EOF )
            // InternalTorXakisDsl.g:2878:2: iv_ruleEncoding= ruleEncoding EOF
            {
             newCompositeNode(grammarAccess.getEncodingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEncoding=ruleEncoding();

            state._fsp--;

             current =iv_ruleEncoding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEncoding"


    // $ANTLR start "ruleEncoding"
    // InternalTorXakisDsl.g:2884:1: ruleEncoding returns [EObject current=null] : (otherlv_0= 'ENCODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '->' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) ) ;
    public final EObject ruleEncoding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_communication_1_0 = null;

        EObject lv_channelOffer_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2890:2: ( (otherlv_0= 'ENCODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '->' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) ) )
            // InternalTorXakisDsl.g:2891:2: (otherlv_0= 'ENCODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '->' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) )
            {
            // InternalTorXakisDsl.g:2891:2: (otherlv_0= 'ENCODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '->' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) )
            // InternalTorXakisDsl.g:2892:3: otherlv_0= 'ENCODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '->' ( (lv_channelOffer_3_0= ruleChannelOffer ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getEncodingAccess().getENCODEKeyword_0());
            		
            // InternalTorXakisDsl.g:2896:3: ( (lv_communication_1_0= ruleCommunication ) )
            // InternalTorXakisDsl.g:2897:4: (lv_communication_1_0= ruleCommunication )
            {
            // InternalTorXakisDsl.g:2897:4: (lv_communication_1_0= ruleCommunication )
            // InternalTorXakisDsl.g:2898:5: lv_communication_1_0= ruleCommunication
            {

            					newCompositeNode(grammarAccess.getEncodingAccess().getCommunicationCommunicationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_communication_1_0=ruleCommunication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEncodingRule());
            					}
            					set(
            						current,
            						"communication",
            						lv_communication_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Communication");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getEncodingAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalTorXakisDsl.g:2919:3: ( (lv_channelOffer_3_0= ruleChannelOffer ) )
            // InternalTorXakisDsl.g:2920:4: (lv_channelOffer_3_0= ruleChannelOffer )
            {
            // InternalTorXakisDsl.g:2920:4: (lv_channelOffer_3_0= ruleChannelOffer )
            // InternalTorXakisDsl.g:2921:5: lv_channelOffer_3_0= ruleChannelOffer
            {

            					newCompositeNode(grammarAccess.getEncodingAccess().getChannelOfferChannelOfferParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_channelOffer_3_0=ruleChannelOffer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEncodingRule());
            					}
            					set(
            						current,
            						"channelOffer",
            						lv_channelOffer_3_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelOffer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleEncoding"


    // $ANTLR start "entryRuleDecoding"
    // InternalTorXakisDsl.g:2942:1: entryRuleDecoding returns [EObject current=null] : iv_ruleDecoding= ruleDecoding EOF ;
    public final EObject entryRuleDecoding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoding = null;


        try {
            // InternalTorXakisDsl.g:2942:49: (iv_ruleDecoding= ruleDecoding EOF )
            // InternalTorXakisDsl.g:2943:2: iv_ruleDecoding= ruleDecoding EOF
            {
             newCompositeNode(grammarAccess.getDecodingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecoding=ruleDecoding();

            state._fsp--;

             current =iv_ruleDecoding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDecoding"


    // $ANTLR start "ruleDecoding"
    // InternalTorXakisDsl.g:2949:1: ruleDecoding returns [EObject current=null] : (otherlv_0= 'DECODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '<-' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) ) ;
    public final EObject ruleDecoding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_communication_1_0 = null;

        EObject lv_channelOffer_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:2955:2: ( (otherlv_0= 'DECODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '<-' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) ) )
            // InternalTorXakisDsl.g:2956:2: (otherlv_0= 'DECODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '<-' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) )
            {
            // InternalTorXakisDsl.g:2956:2: (otherlv_0= 'DECODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '<-' ( (lv_channelOffer_3_0= ruleChannelOffer ) ) )
            // InternalTorXakisDsl.g:2957:3: otherlv_0= 'DECODE' ( (lv_communication_1_0= ruleCommunication ) ) otherlv_2= '<-' ( (lv_channelOffer_3_0= ruleChannelOffer ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getDecodingAccess().getDECODEKeyword_0());
            		
            // InternalTorXakisDsl.g:2961:3: ( (lv_communication_1_0= ruleCommunication ) )
            // InternalTorXakisDsl.g:2962:4: (lv_communication_1_0= ruleCommunication )
            {
            // InternalTorXakisDsl.g:2962:4: (lv_communication_1_0= ruleCommunication )
            // InternalTorXakisDsl.g:2963:5: lv_communication_1_0= ruleCommunication
            {

            					newCompositeNode(grammarAccess.getDecodingAccess().getCommunicationCommunicationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_communication_1_0=ruleCommunication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecodingRule());
            					}
            					set(
            						current,
            						"communication",
            						lv_communication_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Communication");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getDecodingAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalTorXakisDsl.g:2984:3: ( (lv_channelOffer_3_0= ruleChannelOffer ) )
            // InternalTorXakisDsl.g:2985:4: (lv_channelOffer_3_0= ruleChannelOffer )
            {
            // InternalTorXakisDsl.g:2985:4: (lv_channelOffer_3_0= ruleChannelOffer )
            // InternalTorXakisDsl.g:2986:5: lv_channelOffer_3_0= ruleChannelOffer
            {

            					newCompositeNode(grammarAccess.getDecodingAccess().getChannelOfferChannelOfferParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_channelOffer_3_0=ruleChannelOffer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecodingRule());
            					}
            					set(
            						current,
            						"channelOffer",
            						lv_channelOffer_3_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelOffer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDecoding"


    // $ANTLR start "entryRulePortNumber"
    // InternalTorXakisDsl.g:3007:1: entryRulePortNumber returns [EObject current=null] : iv_rulePortNumber= rulePortNumber EOF ;
    public final EObject entryRulePortNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortNumber = null;


        try {
            // InternalTorXakisDsl.g:3007:51: (iv_rulePortNumber= rulePortNumber EOF )
            // InternalTorXakisDsl.g:3008:2: iv_rulePortNumber= rulePortNumber EOF
            {
             newCompositeNode(grammarAccess.getPortNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortNumber=rulePortNumber();

            state._fsp--;

             current =iv_rulePortNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePortNumber"


    // $ANTLR start "rulePortNumber"
    // InternalTorXakisDsl.g:3014:1: rulePortNumber returns [EObject current=null] : ( (lv_portNumber_0_0= RULE_INT ) ) ;
    public final EObject rulePortNumber() throws RecognitionException {
        EObject current = null;

        Token lv_portNumber_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3020:2: ( ( (lv_portNumber_0_0= RULE_INT ) ) )
            // InternalTorXakisDsl.g:3021:2: ( (lv_portNumber_0_0= RULE_INT ) )
            {
            // InternalTorXakisDsl.g:3021:2: ( (lv_portNumber_0_0= RULE_INT ) )
            // InternalTorXakisDsl.g:3022:3: (lv_portNumber_0_0= RULE_INT )
            {
            // InternalTorXakisDsl.g:3022:3: (lv_portNumber_0_0= RULE_INT )
            // InternalTorXakisDsl.g:3023:4: lv_portNumber_0_0= RULE_INT
            {
            lv_portNumber_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_portNumber_0_0, grammarAccess.getPortNumberAccess().getPortNumberINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPortNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"portNumber",
            					lv_portNumber_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


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
    // $ANTLR end "rulePortNumber"


    // $ANTLR start "entryRuleHostName"
    // InternalTorXakisDsl.g:3042:1: entryRuleHostName returns [EObject current=null] : iv_ruleHostName= ruleHostName EOF ;
    public final EObject entryRuleHostName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostName = null;


        try {
            // InternalTorXakisDsl.g:3042:49: (iv_ruleHostName= ruleHostName EOF )
            // InternalTorXakisDsl.g:3043:2: iv_ruleHostName= ruleHostName EOF
            {
             newCompositeNode(grammarAccess.getHostNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHostName=ruleHostName();

            state._fsp--;

             current =iv_ruleHostName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHostName"


    // $ANTLR start "ruleHostName"
    // InternalTorXakisDsl.g:3049:1: ruleHostName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleHostName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3055:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalTorXakisDsl.g:3056:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalTorXakisDsl.g:3056:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalTorXakisDsl.g:3057:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalTorXakisDsl.g:3057:3: (lv_name_0_0= RULE_STRING )
            // InternalTorXakisDsl.g:3058:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getHostNameAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getHostNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleHostName"


    // $ANTLR start "entryRuleStautName"
    // InternalTorXakisDsl.g:3077:1: entryRuleStautName returns [EObject current=null] : iv_ruleStautName= ruleStautName EOF ;
    public final EObject entryRuleStautName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStautName = null;


        try {
            // InternalTorXakisDsl.g:3077:50: (iv_ruleStautName= ruleStautName EOF )
            // InternalTorXakisDsl.g:3078:2: iv_ruleStautName= ruleStautName EOF
            {
             newCompositeNode(grammarAccess.getStautNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStautName=ruleStautName();

            state._fsp--;

             current =iv_ruleStautName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStautName"


    // $ANTLR start "ruleStautName"
    // InternalTorXakisDsl.g:3084:1: ruleStautName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleStautName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3090:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:3091:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:3091:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:3092:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:3092:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:3093:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStautNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStautNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleStautName"


    // $ANTLR start "entryRuleChannelDefName"
    // InternalTorXakisDsl.g:3112:1: entryRuleChannelDefName returns [EObject current=null] : iv_ruleChannelDefName= ruleChannelDefName EOF ;
    public final EObject entryRuleChannelDefName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDefName = null;


        try {
            // InternalTorXakisDsl.g:3112:55: (iv_ruleChannelDefName= ruleChannelDefName EOF )
            // InternalTorXakisDsl.g:3113:2: iv_ruleChannelDefName= ruleChannelDefName EOF
            {
             newCompositeNode(grammarAccess.getChannelDefNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelDefName=ruleChannelDefName();

            state._fsp--;

             current =iv_ruleChannelDefName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChannelDefName"


    // $ANTLR start "ruleChannelDefName"
    // InternalTorXakisDsl.g:3119:1: ruleChannelDefName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleChannelDefName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3125:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:3126:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:3126:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:3127:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:3127:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:3128:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getChannelDefNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChannelDefNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleChannelDefName"


    // $ANTLR start "entryRuleProcName"
    // InternalTorXakisDsl.g:3147:1: entryRuleProcName returns [EObject current=null] : iv_ruleProcName= ruleProcName EOF ;
    public final EObject entryRuleProcName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcName = null;


        try {
            // InternalTorXakisDsl.g:3147:49: (iv_ruleProcName= ruleProcName EOF )
            // InternalTorXakisDsl.g:3148:2: iv_ruleProcName= ruleProcName EOF
            {
             newCompositeNode(grammarAccess.getProcNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcName=ruleProcName();

            state._fsp--;

             current =iv_ruleProcName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcName"


    // $ANTLR start "ruleProcName"
    // InternalTorXakisDsl.g:3154:1: ruleProcName returns [EObject current=null] : ( (lv_name_0_0= RULE_SMALLID ) ) ;
    public final EObject ruleProcName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3160:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) )
            // InternalTorXakisDsl.g:3161:2: ( (lv_name_0_0= RULE_SMALLID ) )
            {
            // InternalTorXakisDsl.g:3161:2: ( (lv_name_0_0= RULE_SMALLID ) )
            // InternalTorXakisDsl.g:3162:3: (lv_name_0_0= RULE_SMALLID )
            {
            // InternalTorXakisDsl.g:3162:3: (lv_name_0_0= RULE_SMALLID )
            // InternalTorXakisDsl.g:3163:4: lv_name_0_0= RULE_SMALLID
            {
            lv_name_0_0=(Token)match(input,RULE_SMALLID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProcNameAccess().getNameSMALLIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProcNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.SMALLID");
            			

            }


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
    // $ANTLR end "ruleProcName"


    // $ANTLR start "entryRuleCnectName"
    // InternalTorXakisDsl.g:3182:1: entryRuleCnectName returns [EObject current=null] : iv_ruleCnectName= ruleCnectName EOF ;
    public final EObject entryRuleCnectName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnectName = null;


        try {
            // InternalTorXakisDsl.g:3182:50: (iv_ruleCnectName= ruleCnectName EOF )
            // InternalTorXakisDsl.g:3183:2: iv_ruleCnectName= ruleCnectName EOF
            {
             newCompositeNode(grammarAccess.getCnectNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnectName=ruleCnectName();

            state._fsp--;

             current =iv_ruleCnectName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCnectName"


    // $ANTLR start "ruleCnectName"
    // InternalTorXakisDsl.g:3189:1: ruleCnectName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleCnectName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3195:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:3196:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:3196:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:3197:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:3197:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:3198:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCnectNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCnectNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleCnectName"


    // $ANTLR start "entryRuleNeVarsDeclarationList"
    // InternalTorXakisDsl.g:3217:1: entryRuleNeVarsDeclarationList returns [EObject current=null] : iv_ruleNeVarsDeclarationList= ruleNeVarsDeclarationList EOF ;
    public final EObject entryRuleNeVarsDeclarationList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeVarsDeclarationList = null;


        try {
            // InternalTorXakisDsl.g:3217:62: (iv_ruleNeVarsDeclarationList= ruleNeVarsDeclarationList EOF )
            // InternalTorXakisDsl.g:3218:2: iv_ruleNeVarsDeclarationList= ruleNeVarsDeclarationList EOF
            {
             newCompositeNode(grammarAccess.getNeVarsDeclarationListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeVarsDeclarationList=ruleNeVarsDeclarationList();

            state._fsp--;

             current =iv_ruleNeVarsDeclarationList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeVarsDeclarationList"


    // $ANTLR start "ruleNeVarsDeclarationList"
    // InternalTorXakisDsl.g:3224:1: ruleNeVarsDeclarationList returns [EObject current=null] : ( ( (lv_varsDeclarations_0_0= ruleVarsDeclaration ) ) (otherlv_1= ';' ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) ) )* ) ;
    public final EObject ruleNeVarsDeclarationList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varsDeclarations_0_0 = null;

        EObject lv_varsDeclarations_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3230:2: ( ( ( (lv_varsDeclarations_0_0= ruleVarsDeclaration ) ) (otherlv_1= ';' ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) ) )* ) )
            // InternalTorXakisDsl.g:3231:2: ( ( (lv_varsDeclarations_0_0= ruleVarsDeclaration ) ) (otherlv_1= ';' ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) ) )* )
            {
            // InternalTorXakisDsl.g:3231:2: ( ( (lv_varsDeclarations_0_0= ruleVarsDeclaration ) ) (otherlv_1= ';' ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) ) )* )
            // InternalTorXakisDsl.g:3232:3: ( (lv_varsDeclarations_0_0= ruleVarsDeclaration ) ) (otherlv_1= ';' ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) ) )*
            {
            // InternalTorXakisDsl.g:3232:3: ( (lv_varsDeclarations_0_0= ruleVarsDeclaration ) )
            // InternalTorXakisDsl.g:3233:4: (lv_varsDeclarations_0_0= ruleVarsDeclaration )
            {
            // InternalTorXakisDsl.g:3233:4: (lv_varsDeclarations_0_0= ruleVarsDeclaration )
            // InternalTorXakisDsl.g:3234:5: lv_varsDeclarations_0_0= ruleVarsDeclaration
            {

            					newCompositeNode(grammarAccess.getNeVarsDeclarationListAccess().getVarsDeclarationsVarsDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_varsDeclarations_0_0=ruleVarsDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeVarsDeclarationListRule());
            					}
            					add(
            						current,
            						"varsDeclarations",
            						lv_varsDeclarations_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.VarsDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3251:3: (otherlv_1= ';' ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_SMALLID) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalTorXakisDsl.g:3252:4: otherlv_1= ';' ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeVarsDeclarationListAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:3256:4: ( (lv_varsDeclarations_2_0= ruleVarsDeclaration ) )
            	    // InternalTorXakisDsl.g:3257:5: (lv_varsDeclarations_2_0= ruleVarsDeclaration )
            	    {
            	    // InternalTorXakisDsl.g:3257:5: (lv_varsDeclarations_2_0= ruleVarsDeclaration )
            	    // InternalTorXakisDsl.g:3258:6: lv_varsDeclarations_2_0= ruleVarsDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getNeVarsDeclarationListAccess().getVarsDeclarationsVarsDeclarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_varsDeclarations_2_0=ruleVarsDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeVarsDeclarationListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varsDeclarations",
            	    							lv_varsDeclarations_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.VarsDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


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
    // $ANTLR end "ruleNeVarsDeclarationList"


    // $ANTLR start "entryRuleVarsDeclaration"
    // InternalTorXakisDsl.g:3280:1: entryRuleVarsDeclaration returns [EObject current=null] : iv_ruleVarsDeclaration= ruleVarsDeclaration EOF ;
    public final EObject entryRuleVarsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsDeclaration = null;


        try {
            // InternalTorXakisDsl.g:3280:56: (iv_ruleVarsDeclaration= ruleVarsDeclaration EOF )
            // InternalTorXakisDsl.g:3281:2: iv_ruleVarsDeclaration= ruleVarsDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarsDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarsDeclaration=ruleVarsDeclaration();

            state._fsp--;

             current =iv_ruleVarsDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarsDeclaration"


    // $ANTLR start "ruleVarsDeclaration"
    // InternalTorXakisDsl.g:3287:1: ruleVarsDeclaration returns [EObject current=null] : ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) ;
    public final EObject ruleVarsDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neVarNameList_0_0 = null;

        EObject lv_typeName_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3293:2: ( ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) )
            // InternalTorXakisDsl.g:3294:2: ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            {
            // InternalTorXakisDsl.g:3294:2: ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            // InternalTorXakisDsl.g:3295:3: ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) )
            {
            // InternalTorXakisDsl.g:3295:3: ( (lv_neVarNameList_0_0= ruleNeVarNameList ) )
            // InternalTorXakisDsl.g:3296:4: (lv_neVarNameList_0_0= ruleNeVarNameList )
            {
            // InternalTorXakisDsl.g:3296:4: (lv_neVarNameList_0_0= ruleNeVarNameList )
            // InternalTorXakisDsl.g:3297:5: lv_neVarNameList_0_0= ruleNeVarNameList
            {

            					newCompositeNode(grammarAccess.getVarsDeclarationAccess().getNeVarNameListNeVarNameListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_neVarNameList_0_0=ruleNeVarNameList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarsDeclarationRule());
            					}
            					set(
            						current,
            						"neVarNameList",
            						lv_neVarNameList_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeVarNameList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVarsDeclarationAccess().getColonColonKeyword_1());
            		
            // InternalTorXakisDsl.g:3318:3: ( (lv_typeName_2_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:3319:4: (lv_typeName_2_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:3319:4: (lv_typeName_2_0= ruleTypeName )
            // InternalTorXakisDsl.g:3320:5: lv_typeName_2_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getVarsDeclarationAccess().getTypeNameTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeName_2_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarsDeclarationRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleVarsDeclaration"


    // $ANTLR start "entryRuleNeVarDeclList"
    // InternalTorXakisDsl.g:3341:1: entryRuleNeVarDeclList returns [EObject current=null] : iv_ruleNeVarDeclList= ruleNeVarDeclList EOF ;
    public final EObject entryRuleNeVarDeclList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeVarDeclList = null;


        try {
            // InternalTorXakisDsl.g:3341:54: (iv_ruleNeVarDeclList= ruleNeVarDeclList EOF )
            // InternalTorXakisDsl.g:3342:2: iv_ruleNeVarDeclList= ruleNeVarDeclList EOF
            {
             newCompositeNode(grammarAccess.getNeVarDeclListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeVarDeclList=ruleNeVarDeclList();

            state._fsp--;

             current =iv_ruleNeVarDeclList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeVarDeclList"


    // $ANTLR start "ruleNeVarDeclList"
    // InternalTorXakisDsl.g:3348:1: ruleNeVarDeclList returns [EObject current=null] : ( ( (lv_varsDecls_0_0= ruleVarsDecl ) ) (otherlv_1= ';' ( (lv_varsDecls_2_0= ruleVarsDecl ) ) )* ) ;
    public final EObject ruleNeVarDeclList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varsDecls_0_0 = null;

        EObject lv_varsDecls_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3354:2: ( ( ( (lv_varsDecls_0_0= ruleVarsDecl ) ) (otherlv_1= ';' ( (lv_varsDecls_2_0= ruleVarsDecl ) ) )* ) )
            // InternalTorXakisDsl.g:3355:2: ( ( (lv_varsDecls_0_0= ruleVarsDecl ) ) (otherlv_1= ';' ( (lv_varsDecls_2_0= ruleVarsDecl ) ) )* )
            {
            // InternalTorXakisDsl.g:3355:2: ( ( (lv_varsDecls_0_0= ruleVarsDecl ) ) (otherlv_1= ';' ( (lv_varsDecls_2_0= ruleVarsDecl ) ) )* )
            // InternalTorXakisDsl.g:3356:3: ( (lv_varsDecls_0_0= ruleVarsDecl ) ) (otherlv_1= ';' ( (lv_varsDecls_2_0= ruleVarsDecl ) ) )*
            {
            // InternalTorXakisDsl.g:3356:3: ( (lv_varsDecls_0_0= ruleVarsDecl ) )
            // InternalTorXakisDsl.g:3357:4: (lv_varsDecls_0_0= ruleVarsDecl )
            {
            // InternalTorXakisDsl.g:3357:4: (lv_varsDecls_0_0= ruleVarsDecl )
            // InternalTorXakisDsl.g:3358:5: lv_varsDecls_0_0= ruleVarsDecl
            {

            					newCompositeNode(grammarAccess.getNeVarDeclListAccess().getVarsDeclsVarsDeclParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_varsDecls_0_0=ruleVarsDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeVarDeclListRule());
            					}
            					add(
            						current,
            						"varsDecls",
            						lv_varsDecls_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.VarsDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3375:3: (otherlv_1= ';' ( (lv_varsDecls_2_0= ruleVarsDecl ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalTorXakisDsl.g:3376:4: otherlv_1= ';' ( (lv_varsDecls_2_0= ruleVarsDecl ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeVarDeclListAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:3380:4: ( (lv_varsDecls_2_0= ruleVarsDecl ) )
            	    // InternalTorXakisDsl.g:3381:5: (lv_varsDecls_2_0= ruleVarsDecl )
            	    {
            	    // InternalTorXakisDsl.g:3381:5: (lv_varsDecls_2_0= ruleVarsDecl )
            	    // InternalTorXakisDsl.g:3382:6: lv_varsDecls_2_0= ruleVarsDecl
            	    {

            	    						newCompositeNode(grammarAccess.getNeVarDeclListAccess().getVarsDeclsVarsDeclParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_varsDecls_2_0=ruleVarsDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeVarDeclListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varsDecls",
            	    							lv_varsDecls_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.VarsDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
    // $ANTLR end "ruleNeVarDeclList"


    // $ANTLR start "entryRuleVarsDecl"
    // InternalTorXakisDsl.g:3404:1: entryRuleVarsDecl returns [EObject current=null] : iv_ruleVarsDecl= ruleVarsDecl EOF ;
    public final EObject entryRuleVarsDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsDecl = null;


        try {
            // InternalTorXakisDsl.g:3404:49: (iv_ruleVarsDecl= ruleVarsDecl EOF )
            // InternalTorXakisDsl.g:3405:2: iv_ruleVarsDecl= ruleVarsDecl EOF
            {
             newCompositeNode(grammarAccess.getVarsDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarsDecl=ruleVarsDecl();

            state._fsp--;

             current =iv_ruleVarsDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarsDecl"


    // $ANTLR start "ruleVarsDecl"
    // InternalTorXakisDsl.g:3411:1: ruleVarsDecl returns [EObject current=null] : ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) ;
    public final EObject ruleVarsDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neVarNameList_0_0 = null;

        EObject lv_typeName_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3417:2: ( ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) )
            // InternalTorXakisDsl.g:3418:2: ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            {
            // InternalTorXakisDsl.g:3418:2: ( ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            // InternalTorXakisDsl.g:3419:3: ( (lv_neVarNameList_0_0= ruleNeVarNameList ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) )
            {
            // InternalTorXakisDsl.g:3419:3: ( (lv_neVarNameList_0_0= ruleNeVarNameList ) )
            // InternalTorXakisDsl.g:3420:4: (lv_neVarNameList_0_0= ruleNeVarNameList )
            {
            // InternalTorXakisDsl.g:3420:4: (lv_neVarNameList_0_0= ruleNeVarNameList )
            // InternalTorXakisDsl.g:3421:5: lv_neVarNameList_0_0= ruleNeVarNameList
            {

            					newCompositeNode(grammarAccess.getVarsDeclAccess().getNeVarNameListNeVarNameListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_neVarNameList_0_0=ruleNeVarNameList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarsDeclRule());
            					}
            					set(
            						current,
            						"neVarNameList",
            						lv_neVarNameList_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeVarNameList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVarsDeclAccess().getColonColonKeyword_1());
            		
            // InternalTorXakisDsl.g:3442:3: ( (lv_typeName_2_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:3443:4: (lv_typeName_2_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:3443:4: (lv_typeName_2_0= ruleTypeName )
            // InternalTorXakisDsl.g:3444:5: lv_typeName_2_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getVarsDeclAccess().getTypeNameTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeName_2_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarsDeclRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleVarsDecl"


    // $ANTLR start "entryRuleNeChannelsDeclList"
    // InternalTorXakisDsl.g:3465:1: entryRuleNeChannelsDeclList returns [EObject current=null] : iv_ruleNeChannelsDeclList= ruleNeChannelsDeclList EOF ;
    public final EObject entryRuleNeChannelsDeclList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeChannelsDeclList = null;


        try {
            // InternalTorXakisDsl.g:3465:59: (iv_ruleNeChannelsDeclList= ruleNeChannelsDeclList EOF )
            // InternalTorXakisDsl.g:3466:2: iv_ruleNeChannelsDeclList= ruleNeChannelsDeclList EOF
            {
             newCompositeNode(grammarAccess.getNeChannelsDeclListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeChannelsDeclList=ruleNeChannelsDeclList();

            state._fsp--;

             current =iv_ruleNeChannelsDeclList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeChannelsDeclList"


    // $ANTLR start "ruleNeChannelsDeclList"
    // InternalTorXakisDsl.g:3472:1: ruleNeChannelsDeclList returns [EObject current=null] : ( ( (lv_channelsDecls_0_0= ruleChannelsDecl ) ) (otherlv_1= ';' ( (lv_channelsDecls_2_0= ruleChannelsDecl ) ) )* ) ;
    public final EObject ruleNeChannelsDeclList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_channelsDecls_0_0 = null;

        EObject lv_channelsDecls_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3478:2: ( ( ( (lv_channelsDecls_0_0= ruleChannelsDecl ) ) (otherlv_1= ';' ( (lv_channelsDecls_2_0= ruleChannelsDecl ) ) )* ) )
            // InternalTorXakisDsl.g:3479:2: ( ( (lv_channelsDecls_0_0= ruleChannelsDecl ) ) (otherlv_1= ';' ( (lv_channelsDecls_2_0= ruleChannelsDecl ) ) )* )
            {
            // InternalTorXakisDsl.g:3479:2: ( ( (lv_channelsDecls_0_0= ruleChannelsDecl ) ) (otherlv_1= ';' ( (lv_channelsDecls_2_0= ruleChannelsDecl ) ) )* )
            // InternalTorXakisDsl.g:3480:3: ( (lv_channelsDecls_0_0= ruleChannelsDecl ) ) (otherlv_1= ';' ( (lv_channelsDecls_2_0= ruleChannelsDecl ) ) )*
            {
            // InternalTorXakisDsl.g:3480:3: ( (lv_channelsDecls_0_0= ruleChannelsDecl ) )
            // InternalTorXakisDsl.g:3481:4: (lv_channelsDecls_0_0= ruleChannelsDecl )
            {
            // InternalTorXakisDsl.g:3481:4: (lv_channelsDecls_0_0= ruleChannelsDecl )
            // InternalTorXakisDsl.g:3482:5: lv_channelsDecls_0_0= ruleChannelsDecl
            {

            					newCompositeNode(grammarAccess.getNeChannelsDeclListAccess().getChannelsDeclsChannelsDeclParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_channelsDecls_0_0=ruleChannelsDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeChannelsDeclListRule());
            					}
            					add(
            						current,
            						"channelsDecls",
            						lv_channelsDecls_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelsDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3499:3: (otherlv_1= ';' ( (lv_channelsDecls_2_0= ruleChannelsDecl ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==15) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalTorXakisDsl.g:3500:4: otherlv_1= ';' ( (lv_channelsDecls_2_0= ruleChannelsDecl ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeChannelsDeclListAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:3504:4: ( (lv_channelsDecls_2_0= ruleChannelsDecl ) )
            	    // InternalTorXakisDsl.g:3505:5: (lv_channelsDecls_2_0= ruleChannelsDecl )
            	    {
            	    // InternalTorXakisDsl.g:3505:5: (lv_channelsDecls_2_0= ruleChannelsDecl )
            	    // InternalTorXakisDsl.g:3506:6: lv_channelsDecls_2_0= ruleChannelsDecl
            	    {

            	    						newCompositeNode(grammarAccess.getNeChannelsDeclListAccess().getChannelsDeclsChannelsDeclParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_channelsDecls_2_0=ruleChannelsDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeChannelsDeclListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"channelsDecls",
            	    							lv_channelsDecls_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.ChannelsDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


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
    // $ANTLR end "ruleNeChannelsDeclList"


    // $ANTLR start "entryRuleChannelsDecl"
    // InternalTorXakisDsl.g:3528:1: entryRuleChannelsDecl returns [EObject current=null] : iv_ruleChannelsDecl= ruleChannelsDecl EOF ;
    public final EObject entryRuleChannelsDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelsDecl = null;


        try {
            // InternalTorXakisDsl.g:3528:53: (iv_ruleChannelsDecl= ruleChannelsDecl EOF )
            // InternalTorXakisDsl.g:3529:2: iv_ruleChannelsDecl= ruleChannelsDecl EOF
            {
             newCompositeNode(grammarAccess.getChannelsDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelsDecl=ruleChannelsDecl();

            state._fsp--;

             current =iv_ruleChannelsDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChannelsDecl"


    // $ANTLR start "ruleChannelsDecl"
    // InternalTorXakisDsl.g:3535:1: ruleChannelsDecl returns [EObject current=null] : ( ( (lv_neChannelNameList_0_0= ruleNeChannelNameList ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? ) ;
    public final EObject ruleChannelsDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neChannelNameList_0_0 = null;

        EObject lv_neTypeNameList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3541:2: ( ( ( (lv_neChannelNameList_0_0= ruleNeChannelNameList ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? ) )
            // InternalTorXakisDsl.g:3542:2: ( ( (lv_neChannelNameList_0_0= ruleNeChannelNameList ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? )
            {
            // InternalTorXakisDsl.g:3542:2: ( ( (lv_neChannelNameList_0_0= ruleNeChannelNameList ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )? )
            // InternalTorXakisDsl.g:3543:3: ( (lv_neChannelNameList_0_0= ruleNeChannelNameList ) ) (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )?
            {
            // InternalTorXakisDsl.g:3543:3: ( (lv_neChannelNameList_0_0= ruleNeChannelNameList ) )
            // InternalTorXakisDsl.g:3544:4: (lv_neChannelNameList_0_0= ruleNeChannelNameList )
            {
            // InternalTorXakisDsl.g:3544:4: (lv_neChannelNameList_0_0= ruleNeChannelNameList )
            // InternalTorXakisDsl.g:3545:5: lv_neChannelNameList_0_0= ruleNeChannelNameList
            {

            					newCompositeNode(grammarAccess.getChannelsDeclAccess().getNeChannelNameListNeChannelNameListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_neChannelNameList_0_0=ruleNeChannelNameList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelsDeclRule());
            					}
            					set(
            						current,
            						"neChannelNameList",
            						lv_neChannelNameList_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeChannelNameList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3562:3: (otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTorXakisDsl.g:3563:4: otherlv_1= '::' ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getChannelsDeclAccess().getColonColonKeyword_1_0());
                    			
                    // InternalTorXakisDsl.g:3567:4: ( (lv_neTypeNameList_2_0= ruleNeTypeNameList ) )
                    // InternalTorXakisDsl.g:3568:5: (lv_neTypeNameList_2_0= ruleNeTypeNameList )
                    {
                    // InternalTorXakisDsl.g:3568:5: (lv_neTypeNameList_2_0= ruleNeTypeNameList )
                    // InternalTorXakisDsl.g:3569:6: lv_neTypeNameList_2_0= ruleNeTypeNameList
                    {

                    						newCompositeNode(grammarAccess.getChannelsDeclAccess().getNeTypeNameListNeTypeNameListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_neTypeNameList_2_0=ruleNeTypeNameList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChannelsDeclRule());
                    						}
                    						set(
                    							current,
                    							"neTypeNameList",
                    							lv_neTypeNameList_2_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.NeTypeNameList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleChannelsDecl"


    // $ANTLR start "entryRuleNeTypeNameList"
    // InternalTorXakisDsl.g:3591:1: entryRuleNeTypeNameList returns [EObject current=null] : iv_ruleNeTypeNameList= ruleNeTypeNameList EOF ;
    public final EObject entryRuleNeTypeNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeTypeNameList = null;


        try {
            // InternalTorXakisDsl.g:3591:55: (iv_ruleNeTypeNameList= ruleNeTypeNameList EOF )
            // InternalTorXakisDsl.g:3592:2: iv_ruleNeTypeNameList= ruleNeTypeNameList EOF
            {
             newCompositeNode(grammarAccess.getNeTypeNameListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeTypeNameList=ruleNeTypeNameList();

            state._fsp--;

             current =iv_ruleNeTypeNameList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeTypeNameList"


    // $ANTLR start "ruleNeTypeNameList"
    // InternalTorXakisDsl.g:3598:1: ruleNeTypeNameList returns [EObject current=null] : ( ( (lv_typeNames_0_0= ruleTypeName ) ) (otherlv_1= '#' ( (lv_typeNames_2_0= ruleTypeName ) ) )* ) ;
    public final EObject ruleNeTypeNameList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_typeNames_0_0 = null;

        EObject lv_typeNames_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3604:2: ( ( ( (lv_typeNames_0_0= ruleTypeName ) ) (otherlv_1= '#' ( (lv_typeNames_2_0= ruleTypeName ) ) )* ) )
            // InternalTorXakisDsl.g:3605:2: ( ( (lv_typeNames_0_0= ruleTypeName ) ) (otherlv_1= '#' ( (lv_typeNames_2_0= ruleTypeName ) ) )* )
            {
            // InternalTorXakisDsl.g:3605:2: ( ( (lv_typeNames_0_0= ruleTypeName ) ) (otherlv_1= '#' ( (lv_typeNames_2_0= ruleTypeName ) ) )* )
            // InternalTorXakisDsl.g:3606:3: ( (lv_typeNames_0_0= ruleTypeName ) ) (otherlv_1= '#' ( (lv_typeNames_2_0= ruleTypeName ) ) )*
            {
            // InternalTorXakisDsl.g:3606:3: ( (lv_typeNames_0_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:3607:4: (lv_typeNames_0_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:3607:4: (lv_typeNames_0_0= ruleTypeName )
            // InternalTorXakisDsl.g:3608:5: lv_typeNames_0_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getNeTypeNameListAccess().getTypeNamesTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
            lv_typeNames_0_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeTypeNameListRule());
            					}
            					add(
            						current,
            						"typeNames",
            						lv_typeNames_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3625:3: (otherlv_1= '#' ( (lv_typeNames_2_0= ruleTypeName ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==53) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalTorXakisDsl.g:3626:4: otherlv_1= '#' ( (lv_typeNames_2_0= ruleTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,53,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeTypeNameListAccess().getNumberSignKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:3630:4: ( (lv_typeNames_2_0= ruleTypeName ) )
            	    // InternalTorXakisDsl.g:3631:5: (lv_typeNames_2_0= ruleTypeName )
            	    {
            	    // InternalTorXakisDsl.g:3631:5: (lv_typeNames_2_0= ruleTypeName )
            	    // InternalTorXakisDsl.g:3632:6: lv_typeNames_2_0= ruleTypeName
            	    {

            	    						newCompositeNode(grammarAccess.getNeTypeNameListAccess().getTypeNamesTypeNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_typeNames_2_0=ruleTypeName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeTypeNameListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeNames",
            	    							lv_typeNames_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


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
    // $ANTLR end "ruleNeTypeNameList"


    // $ANTLR start "entryRuleTypeName"
    // InternalTorXakisDsl.g:3654:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalTorXakisDsl.g:3654:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalTorXakisDsl.g:3655:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalTorXakisDsl.g:3661:1: ruleTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3667:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:3668:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:3668:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:3669:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:3669:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:3670:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleNeChannelNameList"
    // InternalTorXakisDsl.g:3689:1: entryRuleNeChannelNameList returns [EObject current=null] : iv_ruleNeChannelNameList= ruleNeChannelNameList EOF ;
    public final EObject entryRuleNeChannelNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeChannelNameList = null;


        try {
            // InternalTorXakisDsl.g:3689:58: (iv_ruleNeChannelNameList= ruleNeChannelNameList EOF )
            // InternalTorXakisDsl.g:3690:2: iv_ruleNeChannelNameList= ruleNeChannelNameList EOF
            {
             newCompositeNode(grammarAccess.getNeChannelNameListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeChannelNameList=ruleNeChannelNameList();

            state._fsp--;

             current =iv_ruleNeChannelNameList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeChannelNameList"


    // $ANTLR start "ruleNeChannelNameList"
    // InternalTorXakisDsl.g:3696:1: ruleNeChannelNameList returns [EObject current=null] : ( ( (lv_channelNames_0_0= ruleChannelName ) ) (otherlv_1= ',' ( (lv_channelNames_2_0= ruleChannelName ) ) )* ) ;
    public final EObject ruleNeChannelNameList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_channelNames_0_0 = null;

        EObject lv_channelNames_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3702:2: ( ( ( (lv_channelNames_0_0= ruleChannelName ) ) (otherlv_1= ',' ( (lv_channelNames_2_0= ruleChannelName ) ) )* ) )
            // InternalTorXakisDsl.g:3703:2: ( ( (lv_channelNames_0_0= ruleChannelName ) ) (otherlv_1= ',' ( (lv_channelNames_2_0= ruleChannelName ) ) )* )
            {
            // InternalTorXakisDsl.g:3703:2: ( ( (lv_channelNames_0_0= ruleChannelName ) ) (otherlv_1= ',' ( (lv_channelNames_2_0= ruleChannelName ) ) )* )
            // InternalTorXakisDsl.g:3704:3: ( (lv_channelNames_0_0= ruleChannelName ) ) (otherlv_1= ',' ( (lv_channelNames_2_0= ruleChannelName ) ) )*
            {
            // InternalTorXakisDsl.g:3704:3: ( (lv_channelNames_0_0= ruleChannelName ) )
            // InternalTorXakisDsl.g:3705:4: (lv_channelNames_0_0= ruleChannelName )
            {
            // InternalTorXakisDsl.g:3705:4: (lv_channelNames_0_0= ruleChannelName )
            // InternalTorXakisDsl.g:3706:5: lv_channelNames_0_0= ruleChannelName
            {

            					newCompositeNode(grammarAccess.getNeChannelNameListAccess().getChannelNamesChannelNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_channelNames_0_0=ruleChannelName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeChannelNameListRule());
            					}
            					add(
            						current,
            						"channelNames",
            						lv_channelNames_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ChannelName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3723:3: (otherlv_1= ',' ( (lv_channelNames_2_0= ruleChannelName ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==46) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalTorXakisDsl.g:3724:4: otherlv_1= ',' ( (lv_channelNames_2_0= ruleChannelName ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeChannelNameListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:3728:4: ( (lv_channelNames_2_0= ruleChannelName ) )
            	    // InternalTorXakisDsl.g:3729:5: (lv_channelNames_2_0= ruleChannelName )
            	    {
            	    // InternalTorXakisDsl.g:3729:5: (lv_channelNames_2_0= ruleChannelName )
            	    // InternalTorXakisDsl.g:3730:6: lv_channelNames_2_0= ruleChannelName
            	    {

            	    						newCompositeNode(grammarAccess.getNeChannelNameListAccess().getChannelNamesChannelNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_channelNames_2_0=ruleChannelName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeChannelNameListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"channelNames",
            	    							lv_channelNames_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.ChannelName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


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
    // $ANTLR end "ruleNeChannelNameList"


    // $ANTLR start "entryRuleNeIdNameList"
    // InternalTorXakisDsl.g:3752:1: entryRuleNeIdNameList returns [EObject current=null] : iv_ruleNeIdNameList= ruleNeIdNameList EOF ;
    public final EObject entryRuleNeIdNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeIdNameList = null;


        try {
            // InternalTorXakisDsl.g:3752:53: (iv_ruleNeIdNameList= ruleNeIdNameList EOF )
            // InternalTorXakisDsl.g:3753:2: iv_ruleNeIdNameList= ruleNeIdNameList EOF
            {
             newCompositeNode(grammarAccess.getNeIdNameListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeIdNameList=ruleNeIdNameList();

            state._fsp--;

             current =iv_ruleNeIdNameList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeIdNameList"


    // $ANTLR start "ruleNeIdNameList"
    // InternalTorXakisDsl.g:3759:1: ruleNeIdNameList returns [EObject current=null] : ( ( (lv_idNames_0_0= ruleIdName ) ) (otherlv_1= ',' ( (lv_idNames_2_0= ruleIdName ) ) )* ) ;
    public final EObject ruleNeIdNameList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_idNames_0_0 = null;

        EObject lv_idNames_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3765:2: ( ( ( (lv_idNames_0_0= ruleIdName ) ) (otherlv_1= ',' ( (lv_idNames_2_0= ruleIdName ) ) )* ) )
            // InternalTorXakisDsl.g:3766:2: ( ( (lv_idNames_0_0= ruleIdName ) ) (otherlv_1= ',' ( (lv_idNames_2_0= ruleIdName ) ) )* )
            {
            // InternalTorXakisDsl.g:3766:2: ( ( (lv_idNames_0_0= ruleIdName ) ) (otherlv_1= ',' ( (lv_idNames_2_0= ruleIdName ) ) )* )
            // InternalTorXakisDsl.g:3767:3: ( (lv_idNames_0_0= ruleIdName ) ) (otherlv_1= ',' ( (lv_idNames_2_0= ruleIdName ) ) )*
            {
            // InternalTorXakisDsl.g:3767:3: ( (lv_idNames_0_0= ruleIdName ) )
            // InternalTorXakisDsl.g:3768:4: (lv_idNames_0_0= ruleIdName )
            {
            // InternalTorXakisDsl.g:3768:4: (lv_idNames_0_0= ruleIdName )
            // InternalTorXakisDsl.g:3769:5: lv_idNames_0_0= ruleIdName
            {

            					newCompositeNode(grammarAccess.getNeIdNameListAccess().getIdNamesIdNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_idNames_0_0=ruleIdName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeIdNameListRule());
            					}
            					add(
            						current,
            						"idNames",
            						lv_idNames_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.IdName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3786:3: (otherlv_1= ',' ( (lv_idNames_2_0= ruleIdName ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalTorXakisDsl.g:3787:4: otherlv_1= ',' ( (lv_idNames_2_0= ruleIdName ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeIdNameListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:3791:4: ( (lv_idNames_2_0= ruleIdName ) )
            	    // InternalTorXakisDsl.g:3792:5: (lv_idNames_2_0= ruleIdName )
            	    {
            	    // InternalTorXakisDsl.g:3792:5: (lv_idNames_2_0= ruleIdName )
            	    // InternalTorXakisDsl.g:3793:6: lv_idNames_2_0= ruleIdName
            	    {

            	    						newCompositeNode(grammarAccess.getNeIdNameListAccess().getIdNamesIdNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_idNames_2_0=ruleIdName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeIdNameListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"idNames",
            	    							lv_idNames_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.IdName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


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
    // $ANTLR end "ruleNeIdNameList"


    // $ANTLR start "entryRuleIdName"
    // InternalTorXakisDsl.g:3815:1: entryRuleIdName returns [EObject current=null] : iv_ruleIdName= ruleIdName EOF ;
    public final EObject entryRuleIdName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdName = null;


        try {
            // InternalTorXakisDsl.g:3815:47: (iv_ruleIdName= ruleIdName EOF )
            // InternalTorXakisDsl.g:3816:2: iv_ruleIdName= ruleIdName EOF
            {
             newCompositeNode(grammarAccess.getIdNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdName=ruleIdName();

            state._fsp--;

             current =iv_ruleIdName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIdName"


    // $ANTLR start "ruleIdName"
    // InternalTorXakisDsl.g:3822:1: ruleIdName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_SMALLID ) ) | ( (lv_name_1_0= RULE_CAPSID ) ) ) ;
    public final EObject ruleIdName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3828:2: ( ( ( (lv_name_0_0= RULE_SMALLID ) ) | ( (lv_name_1_0= RULE_CAPSID ) ) ) )
            // InternalTorXakisDsl.g:3829:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) | ( (lv_name_1_0= RULE_CAPSID ) ) )
            {
            // InternalTorXakisDsl.g:3829:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) | ( (lv_name_1_0= RULE_CAPSID ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_SMALLID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_CAPSID) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalTorXakisDsl.g:3830:3: ( (lv_name_0_0= RULE_SMALLID ) )
                    {
                    // InternalTorXakisDsl.g:3830:3: ( (lv_name_0_0= RULE_SMALLID ) )
                    // InternalTorXakisDsl.g:3831:4: (lv_name_0_0= RULE_SMALLID )
                    {
                    // InternalTorXakisDsl.g:3831:4: (lv_name_0_0= RULE_SMALLID )
                    // InternalTorXakisDsl.g:3832:5: lv_name_0_0= RULE_SMALLID
                    {
                    lv_name_0_0=(Token)match(input,RULE_SMALLID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getIdNameAccess().getNameSMALLIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIdNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.SMALLID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:3849:3: ( (lv_name_1_0= RULE_CAPSID ) )
                    {
                    // InternalTorXakisDsl.g:3849:3: ( (lv_name_1_0= RULE_CAPSID ) )
                    // InternalTorXakisDsl.g:3850:4: (lv_name_1_0= RULE_CAPSID )
                    {
                    // InternalTorXakisDsl.g:3850:4: (lv_name_1_0= RULE_CAPSID )
                    // InternalTorXakisDsl.g:3851:5: lv_name_1_0= RULE_CAPSID
                    {
                    lv_name_1_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getIdNameAccess().getNameCAPSIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIdNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleIdName"


    // $ANTLR start "entryRuleChannelName"
    // InternalTorXakisDsl.g:3871:1: entryRuleChannelName returns [EObject current=null] : iv_ruleChannelName= ruleChannelName EOF ;
    public final EObject entryRuleChannelName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelName = null;


        try {
            // InternalTorXakisDsl.g:3871:52: (iv_ruleChannelName= ruleChannelName EOF )
            // InternalTorXakisDsl.g:3872:2: iv_ruleChannelName= ruleChannelName EOF
            {
             newCompositeNode(grammarAccess.getChannelNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelName=ruleChannelName();

            state._fsp--;

             current =iv_ruleChannelName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChannelName"


    // $ANTLR start "ruleChannelName"
    // InternalTorXakisDsl.g:3878:1: ruleChannelName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleChannelName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3884:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:3885:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:3885:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:3886:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:3886:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:3887:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getChannelNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChannelNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleChannelName"


    // $ANTLR start "entryRuleNeVarNameList"
    // InternalTorXakisDsl.g:3906:1: entryRuleNeVarNameList returns [EObject current=null] : iv_ruleNeVarNameList= ruleNeVarNameList EOF ;
    public final EObject entryRuleNeVarNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeVarNameList = null;


        try {
            // InternalTorXakisDsl.g:3906:54: (iv_ruleNeVarNameList= ruleNeVarNameList EOF )
            // InternalTorXakisDsl.g:3907:2: iv_ruleNeVarNameList= ruleNeVarNameList EOF
            {
             newCompositeNode(grammarAccess.getNeVarNameListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeVarNameList=ruleNeVarNameList();

            state._fsp--;

             current =iv_ruleNeVarNameList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeVarNameList"


    // $ANTLR start "ruleNeVarNameList"
    // InternalTorXakisDsl.g:3913:1: ruleNeVarNameList returns [EObject current=null] : ( ( (lv_varNames_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_varNames_2_0= ruleVarName ) ) )* ) ;
    public final EObject ruleNeVarNameList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varNames_0_0 = null;

        EObject lv_varNames_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:3919:2: ( ( ( (lv_varNames_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_varNames_2_0= ruleVarName ) ) )* ) )
            // InternalTorXakisDsl.g:3920:2: ( ( (lv_varNames_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_varNames_2_0= ruleVarName ) ) )* )
            {
            // InternalTorXakisDsl.g:3920:2: ( ( (lv_varNames_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_varNames_2_0= ruleVarName ) ) )* )
            // InternalTorXakisDsl.g:3921:3: ( (lv_varNames_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_varNames_2_0= ruleVarName ) ) )*
            {
            // InternalTorXakisDsl.g:3921:3: ( (lv_varNames_0_0= ruleVarName ) )
            // InternalTorXakisDsl.g:3922:4: (lv_varNames_0_0= ruleVarName )
            {
            // InternalTorXakisDsl.g:3922:4: (lv_varNames_0_0= ruleVarName )
            // InternalTorXakisDsl.g:3923:5: lv_varNames_0_0= ruleVarName
            {

            					newCompositeNode(grammarAccess.getNeVarNameListAccess().getVarNamesVarNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_varNames_0_0=ruleVarName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeVarNameListRule());
            					}
            					add(
            						current,
            						"varNames",
            						lv_varNames_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.VarName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:3940:3: (otherlv_1= ',' ( (lv_varNames_2_0= ruleVarName ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==46) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalTorXakisDsl.g:3941:4: otherlv_1= ',' ( (lv_varNames_2_0= ruleVarName ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeVarNameListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:3945:4: ( (lv_varNames_2_0= ruleVarName ) )
            	    // InternalTorXakisDsl.g:3946:5: (lv_varNames_2_0= ruleVarName )
            	    {
            	    // InternalTorXakisDsl.g:3946:5: (lv_varNames_2_0= ruleVarName )
            	    // InternalTorXakisDsl.g:3947:6: lv_varNames_2_0= ruleVarName
            	    {

            	    						newCompositeNode(grammarAccess.getNeVarNameListAccess().getVarNamesVarNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_varNames_2_0=ruleVarName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeVarNameListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varNames",
            	    							lv_varNames_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.VarName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


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
    // $ANTLR end "ruleNeVarNameList"


    // $ANTLR start "entryRuleVarName"
    // InternalTorXakisDsl.g:3969:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // InternalTorXakisDsl.g:3969:48: (iv_ruleVarName= ruleVarName EOF )
            // InternalTorXakisDsl.g:3970:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // InternalTorXakisDsl.g:3976:1: ruleVarName returns [EObject current=null] : ( (lv_name_0_0= RULE_SMALLID ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:3982:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) )
            // InternalTorXakisDsl.g:3983:2: ( (lv_name_0_0= RULE_SMALLID ) )
            {
            // InternalTorXakisDsl.g:3983:2: ( (lv_name_0_0= RULE_SMALLID ) )
            // InternalTorXakisDsl.g:3984:3: (lv_name_0_0= RULE_SMALLID )
            {
            // InternalTorXakisDsl.g:3984:3: (lv_name_0_0= RULE_SMALLID )
            // InternalTorXakisDsl.g:3985:4: lv_name_0_0= RULE_SMALLID
            {
            lv_name_0_0=(Token)match(input,RULE_SMALLID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVarNameAccess().getNameSMALLIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.SMALLID");
            			

            }


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
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleProcessBehaviour"
    // InternalTorXakisDsl.g:4004:1: entryRuleProcessBehaviour returns [EObject current=null] : iv_ruleProcessBehaviour= ruleProcessBehaviour EOF ;
    public final EObject entryRuleProcessBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviour = null;


        try {
            // InternalTorXakisDsl.g:4004:57: (iv_ruleProcessBehaviour= ruleProcessBehaviour EOF )
            // InternalTorXakisDsl.g:4005:2: iv_ruleProcessBehaviour= ruleProcessBehaviour EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviour=ruleProcessBehaviour();

            state._fsp--;

             current =iv_ruleProcessBehaviour; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviour"


    // $ANTLR start "ruleProcessBehaviour"
    // InternalTorXakisDsl.g:4011:1: ruleProcessBehaviour returns [EObject current=null] : this_ProcessBehaviourLevel1_0= ruleProcessBehaviourLevel1 ;
    public final EObject ruleProcessBehaviour() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessBehaviourLevel1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4017:2: (this_ProcessBehaviourLevel1_0= ruleProcessBehaviourLevel1 )
            // InternalTorXakisDsl.g:4018:2: this_ProcessBehaviourLevel1_0= ruleProcessBehaviourLevel1
            {

            		newCompositeNode(grammarAccess.getProcessBehaviourAccess().getProcessBehaviourLevel1ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ProcessBehaviourLevel1_0=ruleProcessBehaviourLevel1();

            state._fsp--;


            		current = this_ProcessBehaviourLevel1_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleProcessBehaviour"


    // $ANTLR start "entryRuleProcessBehaviourLevel1"
    // InternalTorXakisDsl.g:4029:1: entryRuleProcessBehaviourLevel1 returns [EObject current=null] : iv_ruleProcessBehaviourLevel1= ruleProcessBehaviourLevel1 EOF ;
    public final EObject entryRuleProcessBehaviourLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourLevel1 = null;


        try {
            // InternalTorXakisDsl.g:4029:63: (iv_ruleProcessBehaviourLevel1= ruleProcessBehaviourLevel1 EOF )
            // InternalTorXakisDsl.g:4030:2: iv_ruleProcessBehaviourLevel1= ruleProcessBehaviourLevel1 EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourLevel1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourLevel1=ruleProcessBehaviourLevel1();

            state._fsp--;

             current =iv_ruleProcessBehaviourLevel1; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourLevel1"


    // $ANTLR start "ruleProcessBehaviourLevel1"
    // InternalTorXakisDsl.g:4036:1: ruleProcessBehaviourLevel1 returns [EObject current=null] : (this_ProcessBehaviourLevel2_0= ruleProcessBehaviourLevel2 ( ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' ) | ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) ) )* ) ;
    public final EObject ruleProcessBehaviourLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        EObject this_ProcessBehaviourLevel2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_varDecls_8_0 = null;

        EObject lv_varNames_9_0 = null;

        EObject lv_valExprs_11_0 = null;

        EObject lv_right_13_0 = null;

        EObject lv_right_17_0 = null;

        EObject lv_right_20_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4042:2: ( (this_ProcessBehaviourLevel2_0= ruleProcessBehaviourLevel2 ( ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' ) | ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) ) )* ) )
            // InternalTorXakisDsl.g:4043:2: (this_ProcessBehaviourLevel2_0= ruleProcessBehaviourLevel2 ( ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' ) | ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) ) )* )
            {
            // InternalTorXakisDsl.g:4043:2: (this_ProcessBehaviourLevel2_0= ruleProcessBehaviourLevel2 ( ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' ) | ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) ) )* )
            // InternalTorXakisDsl.g:4044:3: this_ProcessBehaviourLevel2_0= ruleProcessBehaviourLevel2 ( ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' ) | ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getProcessBehaviourLevel2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_ProcessBehaviourLevel2_0=ruleProcessBehaviourLevel2();

            state._fsp--;


            			current = this_ProcessBehaviourLevel2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTorXakisDsl.g:4052:3: ( ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' ) | ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) ) | ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) ) )*
            loop42:
            do {
                int alt42=5;
                switch ( input.LA(1) ) {
                case 54:
                    {
                    int LA42_2 = input.LA(2);

                    if ( ((LA42_2>=RULE_CAPSID && LA42_2<=RULE_SMALLID)||LA42_2==19||LA42_2==47||(LA42_2>=64 && LA42_2<=65)||LA42_2==68||LA42_2==71) ) {
                        alt42=1;
                    }
                    else if ( (LA42_2==55) ) {
                        alt42=2;
                    }


                    }
                    break;
                case 59:
                    {
                    alt42=3;
                    }
                    break;
                case 60:
                    {
                    alt42=4;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalTorXakisDsl.g:4053:4: ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) )
            	    {
            	    // InternalTorXakisDsl.g:4053:4: ( () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) ) )
            	    // InternalTorXakisDsl.g:4054:5: () otherlv_2= '>>>' ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) )
            	    {
            	    // InternalTorXakisDsl.g:4054:5: ()
            	    // InternalTorXakisDsl.g:4055:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProcessBehaviourLevel1Access().getProcessBehaviourEnableLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_17); 

            	    					newLeafNode(otherlv_2, grammarAccess.getProcessBehaviourLevel1Access().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_0_1());
            	    				
            	    // InternalTorXakisDsl.g:4065:5: ( (lv_right_3_0= ruleProcessBehaviourLevel2 ) )
            	    // InternalTorXakisDsl.g:4066:6: (lv_right_3_0= ruleProcessBehaviourLevel2 )
            	    {
            	    // InternalTorXakisDsl.g:4066:6: (lv_right_3_0= ruleProcessBehaviourLevel2 )
            	    // InternalTorXakisDsl.g:4067:7: lv_right_3_0= ruleProcessBehaviourLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getRightProcessBehaviourLevel2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_49);
            	    lv_right_3_0=ruleProcessBehaviourLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTorXakisDsl.g:4086:4: ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' )
            	    {
            	    // InternalTorXakisDsl.g:4086:4: ( () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI' )
            	    // InternalTorXakisDsl.g:4087:5: () otherlv_5= '>>>' otherlv_6= 'ACCEPT' ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )* otherlv_12= 'IN' ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) ) otherlv_14= 'NI'
            	    {
            	    // InternalTorXakisDsl.g:4087:5: ()
            	    // InternalTorXakisDsl.g:4088:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProcessBehaviourLevel1Access().getProcessBehaviourEnableAcceptLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,54,FOLLOW_50); 

            	    					newLeafNode(otherlv_5, grammarAccess.getProcessBehaviourLevel1Access().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_1_1());
            	    				
            	    otherlv_6=(Token)match(input,55,FOLLOW_51); 

            	    					newLeafNode(otherlv_6, grammarAccess.getProcessBehaviourLevel1Access().getACCEPTKeyword_1_1_2());
            	    				
            	    // InternalTorXakisDsl.g:4102:5: ( (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) ) | (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) ) )*
            	    loop41:
            	    do {
            	        int alt41=3;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==56) ) {
            	            alt41=1;
            	        }
            	        else if ( (LA41_0==57) ) {
            	            alt41=2;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalTorXakisDsl.g:4103:6: (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) )
            	    	    {
            	    	    // InternalTorXakisDsl.g:4103:6: (otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) ) )
            	    	    // InternalTorXakisDsl.g:4104:7: otherlv_7= '?' ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,56,FOLLOW_7); 

            	    	    							newLeafNode(otherlv_7, grammarAccess.getProcessBehaviourLevel1Access().getQuestionMarkKeyword_1_1_3_0_0());
            	    	    						
            	    	    // InternalTorXakisDsl.g:4108:7: ( ( (lv_varDecls_8_0= ruleVarDecl ) ) | ( (lv_varNames_9_0= ruleVarName ) ) )
            	    	    int alt40=2;
            	    	    int LA40_0 = input.LA(1);

            	    	    if ( (LA40_0==RULE_SMALLID) ) {
            	    	        int LA40_1 = input.LA(2);

            	    	        if ( (LA40_1==21) ) {
            	    	            alt40=1;
            	    	        }
            	    	        else if ( (LA40_1==30||(LA40_1>=56 && LA40_1<=57)) ) {
            	    	            alt40=2;
            	    	        }
            	    	        else {
            	    	            NoViableAltException nvae =
            	    	                new NoViableAltException("", 40, 1, input);

            	    	            throw nvae;
            	    	        }
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 40, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt40) {
            	    	        case 1 :
            	    	            // InternalTorXakisDsl.g:4109:8: ( (lv_varDecls_8_0= ruleVarDecl ) )
            	    	            {
            	    	            // InternalTorXakisDsl.g:4109:8: ( (lv_varDecls_8_0= ruleVarDecl ) )
            	    	            // InternalTorXakisDsl.g:4110:9: (lv_varDecls_8_0= ruleVarDecl )
            	    	            {
            	    	            // InternalTorXakisDsl.g:4110:9: (lv_varDecls_8_0= ruleVarDecl )
            	    	            // InternalTorXakisDsl.g:4111:10: lv_varDecls_8_0= ruleVarDecl
            	    	            {

            	    	            										newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getVarDeclsVarDeclParserRuleCall_1_1_3_0_1_0_0());
            	    	            									
            	    	            pushFollow(FOLLOW_51);
            	    	            lv_varDecls_8_0=ruleVarDecl();

            	    	            state._fsp--;


            	    	            										if (current==null) {
            	    	            											current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel1Rule());
            	    	            										}
            	    	            										add(
            	    	            											current,
            	    	            											"varDecls",
            	    	            											lv_varDecls_8_0,
            	    	            											"nl.tno.torxakis.language.TorXakisDsl.VarDecl");
            	    	            										afterParserOrEnumRuleCall();
            	    	            									

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalTorXakisDsl.g:4129:8: ( (lv_varNames_9_0= ruleVarName ) )
            	    	            {
            	    	            // InternalTorXakisDsl.g:4129:8: ( (lv_varNames_9_0= ruleVarName ) )
            	    	            // InternalTorXakisDsl.g:4130:9: (lv_varNames_9_0= ruleVarName )
            	    	            {
            	    	            // InternalTorXakisDsl.g:4130:9: (lv_varNames_9_0= ruleVarName )
            	    	            // InternalTorXakisDsl.g:4131:10: lv_varNames_9_0= ruleVarName
            	    	            {

            	    	            										newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getVarNamesVarNameParserRuleCall_1_1_3_0_1_1_0());
            	    	            									
            	    	            pushFollow(FOLLOW_51);
            	    	            lv_varNames_9_0=ruleVarName();

            	    	            state._fsp--;


            	    	            										if (current==null) {
            	    	            											current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel1Rule());
            	    	            										}
            	    	            										add(
            	    	            											current,
            	    	            											"varNames",
            	    	            											lv_varNames_9_0,
            	    	            											"nl.tno.torxakis.language.TorXakisDsl.VarName");
            	    	            										afterParserOrEnumRuleCall();
            	    	            									

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalTorXakisDsl.g:4151:6: (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) )
            	    	    {
            	    	    // InternalTorXakisDsl.g:4151:6: (otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) ) )
            	    	    // InternalTorXakisDsl.g:4152:7: otherlv_10= '!' ( (lv_valExprs_11_0= ruleValExpr ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,57,FOLLOW_11); 

            	    	    							newLeafNode(otherlv_10, grammarAccess.getProcessBehaviourLevel1Access().getExclamationMarkKeyword_1_1_3_1_0());
            	    	    						
            	    	    // InternalTorXakisDsl.g:4156:7: ( (lv_valExprs_11_0= ruleValExpr ) )
            	    	    // InternalTorXakisDsl.g:4157:8: (lv_valExprs_11_0= ruleValExpr )
            	    	    {
            	    	    // InternalTorXakisDsl.g:4157:8: (lv_valExprs_11_0= ruleValExpr )
            	    	    // InternalTorXakisDsl.g:4158:9: lv_valExprs_11_0= ruleValExpr
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getValExprsValExprParserRuleCall_1_1_3_1_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_51);
            	    	    lv_valExprs_11_0=ruleValExpr();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel1Rule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"valExprs",
            	    	    										lv_valExprs_11_0,
            	    	    										"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,30,FOLLOW_17); 

            	    					newLeafNode(otherlv_12, grammarAccess.getProcessBehaviourLevel1Access().getINKeyword_1_1_4());
            	    				
            	    // InternalTorXakisDsl.g:4181:5: ( (lv_right_13_0= ruleProcessBehaviourLevel2 ) )
            	    // InternalTorXakisDsl.g:4182:6: (lv_right_13_0= ruleProcessBehaviourLevel2 )
            	    {
            	    // InternalTorXakisDsl.g:4182:6: (lv_right_13_0= ruleProcessBehaviourLevel2 )
            	    // InternalTorXakisDsl.g:4183:7: lv_right_13_0= ruleProcessBehaviourLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getRightProcessBehaviourLevel2ParserRuleCall_1_1_5_0());
            	    						
            	    pushFollow(FOLLOW_52);
            	    lv_right_13_0=ruleProcessBehaviourLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_13_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_14=(Token)match(input,58,FOLLOW_49); 

            	    					newLeafNode(otherlv_14, grammarAccess.getProcessBehaviourLevel1Access().getNIKeyword_1_1_6());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTorXakisDsl.g:4206:4: ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) )
            	    {
            	    // InternalTorXakisDsl.g:4206:4: ( () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) ) )
            	    // InternalTorXakisDsl.g:4207:5: () otherlv_16= '[>>' ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) )
            	    {
            	    // InternalTorXakisDsl.g:4207:5: ()
            	    // InternalTorXakisDsl.g:4208:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProcessBehaviourLevel1Access().getProcessBehaviourDisableLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_16=(Token)match(input,59,FOLLOW_17); 

            	    					newLeafNode(otherlv_16, grammarAccess.getProcessBehaviourLevel1Access().getLeftSquareBracketGreaterThanSignGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalTorXakisDsl.g:4218:5: ( (lv_right_17_0= ruleProcessBehaviourLevel2 ) )
            	    // InternalTorXakisDsl.g:4219:6: (lv_right_17_0= ruleProcessBehaviourLevel2 )
            	    {
            	    // InternalTorXakisDsl.g:4219:6: (lv_right_17_0= ruleProcessBehaviourLevel2 )
            	    // InternalTorXakisDsl.g:4220:7: lv_right_17_0= ruleProcessBehaviourLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getRightProcessBehaviourLevel2ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_49);
            	    lv_right_17_0=ruleProcessBehaviourLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_17_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTorXakisDsl.g:4239:4: ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) )
            	    {
            	    // InternalTorXakisDsl.g:4239:4: ( () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) ) )
            	    // InternalTorXakisDsl.g:4240:5: () otherlv_19= '[><' ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) )
            	    {
            	    // InternalTorXakisDsl.g:4240:5: ()
            	    // InternalTorXakisDsl.g:4241:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProcessBehaviourLevel1Access().getProcessBehaviourInterruptLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_19=(Token)match(input,60,FOLLOW_17); 

            	    					newLeafNode(otherlv_19, grammarAccess.getProcessBehaviourLevel1Access().getLeftSquareBracketGreaterThanSignLessThanSignKeyword_1_3_1());
            	    				
            	    // InternalTorXakisDsl.g:4251:5: ( (lv_right_20_0= ruleProcessBehaviourLevel2 ) )
            	    // InternalTorXakisDsl.g:4252:6: (lv_right_20_0= ruleProcessBehaviourLevel2 )
            	    {
            	    // InternalTorXakisDsl.g:4252:6: (lv_right_20_0= ruleProcessBehaviourLevel2 )
            	    // InternalTorXakisDsl.g:4253:7: lv_right_20_0= ruleProcessBehaviourLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel1Access().getRightProcessBehaviourLevel2ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_49);
            	    lv_right_20_0=ruleProcessBehaviourLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_20_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


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
    // $ANTLR end "ruleProcessBehaviourLevel1"


    // $ANTLR start "entryRuleProcessBehaviourLevel2"
    // InternalTorXakisDsl.g:4276:1: entryRuleProcessBehaviourLevel2 returns [EObject current=null] : iv_ruleProcessBehaviourLevel2= ruleProcessBehaviourLevel2 EOF ;
    public final EObject entryRuleProcessBehaviourLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourLevel2 = null;


        try {
            // InternalTorXakisDsl.g:4276:63: (iv_ruleProcessBehaviourLevel2= ruleProcessBehaviourLevel2 EOF )
            // InternalTorXakisDsl.g:4277:2: iv_ruleProcessBehaviourLevel2= ruleProcessBehaviourLevel2 EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourLevel2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourLevel2=ruleProcessBehaviourLevel2();

            state._fsp--;

             current =iv_ruleProcessBehaviourLevel2; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourLevel2"


    // $ANTLR start "ruleProcessBehaviourLevel2"
    // InternalTorXakisDsl.g:4283:1: ruleProcessBehaviourLevel2 returns [EObject current=null] : (this_ProcessBehaviourLevel3_0= ruleProcessBehaviourLevel3 ( ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) ) | ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) ) | ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) ) )* ) ;
    public final EObject ruleProcessBehaviourLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ProcessBehaviourLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_synchronizedChannels_8_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4289:2: ( (this_ProcessBehaviourLevel3_0= ruleProcessBehaviourLevel3 ( ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) ) | ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) ) | ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) ) )* ) )
            // InternalTorXakisDsl.g:4290:2: (this_ProcessBehaviourLevel3_0= ruleProcessBehaviourLevel3 ( ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) ) | ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) ) | ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) ) )* )
            {
            // InternalTorXakisDsl.g:4290:2: (this_ProcessBehaviourLevel3_0= ruleProcessBehaviourLevel3 ( ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) ) | ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) ) | ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) ) )* )
            // InternalTorXakisDsl.g:4291:3: this_ProcessBehaviourLevel3_0= ruleProcessBehaviourLevel3 ( ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) ) | ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) ) | ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getProcessBehaviourLevel2Access().getProcessBehaviourLevel3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_ProcessBehaviourLevel3_0=ruleProcessBehaviourLevel3();

            state._fsp--;


            			current = this_ProcessBehaviourLevel3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTorXakisDsl.g:4299:3: ( ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) ) | ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) ) | ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) ) )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case 61:
                    {
                    alt43=1;
                    }
                    break;
                case 62:
                    {
                    alt43=2;
                    }
                    break;
                case 69:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // InternalTorXakisDsl.g:4300:4: ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) )
            	    {
            	    // InternalTorXakisDsl.g:4300:4: ( () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) ) )
            	    // InternalTorXakisDsl.g:4301:5: () otherlv_2= '||' ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) )
            	    {
            	    // InternalTorXakisDsl.g:4301:5: ()
            	    // InternalTorXakisDsl.g:4302:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProcessBehaviourLevel2Access().getProcessBehaviourSynchronizedLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_17); 

            	    					newLeafNode(otherlv_2, grammarAccess.getProcessBehaviourLevel2Access().getVerticalLineVerticalLineKeyword_1_0_1());
            	    				
            	    // InternalTorXakisDsl.g:4312:5: ( (lv_right_3_0= ruleProcessBehaviourLevel3 ) )
            	    // InternalTorXakisDsl.g:4313:6: (lv_right_3_0= ruleProcessBehaviourLevel3 )
            	    {
            	    // InternalTorXakisDsl.g:4313:6: (lv_right_3_0= ruleProcessBehaviourLevel3 )
            	    // InternalTorXakisDsl.g:4314:7: lv_right_3_0= ruleProcessBehaviourLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel2Access().getRightProcessBehaviourLevel3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_right_3_0=ruleProcessBehaviourLevel3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel3");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTorXakisDsl.g:4333:4: ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) )
            	    {
            	    // InternalTorXakisDsl.g:4333:4: ( () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) ) )
            	    // InternalTorXakisDsl.g:4334:5: () otherlv_5= '|||' ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) )
            	    {
            	    // InternalTorXakisDsl.g:4334:5: ()
            	    // InternalTorXakisDsl.g:4335:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProcessBehaviourLevel2Access().getProcessBehaviourParallelLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,62,FOLLOW_17); 

            	    					newLeafNode(otherlv_5, grammarAccess.getProcessBehaviourLevel2Access().getVerticalLineVerticalLineVerticalLineKeyword_1_1_1());
            	    				
            	    // InternalTorXakisDsl.g:4345:5: ( (lv_right_6_0= ruleProcessBehaviourLevel3 ) )
            	    // InternalTorXakisDsl.g:4346:6: (lv_right_6_0= ruleProcessBehaviourLevel3 )
            	    {
            	    // InternalTorXakisDsl.g:4346:6: (lv_right_6_0= ruleProcessBehaviourLevel3 )
            	    // InternalTorXakisDsl.g:4347:7: lv_right_6_0= ruleProcessBehaviourLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel2Access().getRightProcessBehaviourLevel3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_right_6_0=ruleProcessBehaviourLevel3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel3");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTorXakisDsl.g:4366:4: ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) )
            	    {
            	    // InternalTorXakisDsl.g:4366:4: ( () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) ) )
            	    // InternalTorXakisDsl.g:4367:5: () ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) ) ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) )
            	    {
            	    // InternalTorXakisDsl.g:4367:5: ()
            	    // InternalTorXakisDsl.g:4368:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProcessBehaviourLevel2Access().getProcessBehaviourSynchronizeChannelsLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    // InternalTorXakisDsl.g:4374:5: ( (lv_synchronizedChannels_8_0= ruleSynchronizedChannels ) )
            	    // InternalTorXakisDsl.g:4375:6: (lv_synchronizedChannels_8_0= ruleSynchronizedChannels )
            	    {
            	    // InternalTorXakisDsl.g:4375:6: (lv_synchronizedChannels_8_0= ruleSynchronizedChannels )
            	    // InternalTorXakisDsl.g:4376:7: lv_synchronizedChannels_8_0= ruleSynchronizedChannels
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel2Access().getSynchronizedChannelsSynchronizedChannelsParserRuleCall_1_2_1_0());
            	    						
            	    pushFollow(FOLLOW_17);
            	    lv_synchronizedChannels_8_0=ruleSynchronizedChannels();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"synchronizedChannels",
            	    								lv_synchronizedChannels_8_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.SynchronizedChannels");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalTorXakisDsl.g:4393:5: ( (lv_right_9_0= ruleProcessBehaviourLevel3 ) )
            	    // InternalTorXakisDsl.g:4394:6: (lv_right_9_0= ruleProcessBehaviourLevel3 )
            	    {
            	    // InternalTorXakisDsl.g:4394:6: (lv_right_9_0= ruleProcessBehaviourLevel3 )
            	    // InternalTorXakisDsl.g:4395:7: lv_right_9_0= ruleProcessBehaviourLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getProcessBehaviourLevel2Access().getRightProcessBehaviourLevel3ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_right_9_0=ruleProcessBehaviourLevel3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel3");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


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
    // $ANTLR end "ruleProcessBehaviourLevel2"


    // $ANTLR start "entryRuleProcessBehaviourLevel3"
    // InternalTorXakisDsl.g:4418:1: entryRuleProcessBehaviourLevel3 returns [EObject current=null] : iv_ruleProcessBehaviourLevel3= ruleProcessBehaviourLevel3 EOF ;
    public final EObject entryRuleProcessBehaviourLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourLevel3 = null;


        try {
            // InternalTorXakisDsl.g:4418:63: (iv_ruleProcessBehaviourLevel3= ruleProcessBehaviourLevel3 EOF )
            // InternalTorXakisDsl.g:4419:2: iv_ruleProcessBehaviourLevel3= ruleProcessBehaviourLevel3 EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourLevel3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourLevel3=ruleProcessBehaviourLevel3();

            state._fsp--;

             current =iv_ruleProcessBehaviourLevel3; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourLevel3"


    // $ANTLR start "ruleProcessBehaviourLevel3"
    // InternalTorXakisDsl.g:4425:1: ruleProcessBehaviourLevel3 returns [EObject current=null] : (this_ProcessBehaviourLevel4_0= ruleProcessBehaviourLevel4 ( () otherlv_2= '##' ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) ) )* ) ;
    public final EObject ruleProcessBehaviourLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ProcessBehaviourLevel4_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4431:2: ( (this_ProcessBehaviourLevel4_0= ruleProcessBehaviourLevel4 ( () otherlv_2= '##' ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) ) )* ) )
            // InternalTorXakisDsl.g:4432:2: (this_ProcessBehaviourLevel4_0= ruleProcessBehaviourLevel4 ( () otherlv_2= '##' ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) ) )* )
            {
            // InternalTorXakisDsl.g:4432:2: (this_ProcessBehaviourLevel4_0= ruleProcessBehaviourLevel4 ( () otherlv_2= '##' ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) ) )* )
            // InternalTorXakisDsl.g:4433:3: this_ProcessBehaviourLevel4_0= ruleProcessBehaviourLevel4 ( () otherlv_2= '##' ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) ) )*
            {

            			newCompositeNode(grammarAccess.getProcessBehaviourLevel3Access().getProcessBehaviourLevel4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_ProcessBehaviourLevel4_0=ruleProcessBehaviourLevel4();

            state._fsp--;


            			current = this_ProcessBehaviourLevel4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTorXakisDsl.g:4441:3: ( () otherlv_2= '##' ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==63) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalTorXakisDsl.g:4442:4: () otherlv_2= '##' ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) )
            	    {
            	    // InternalTorXakisDsl.g:4442:4: ()
            	    // InternalTorXakisDsl.g:4443:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getProcessBehaviourLevel3Access().getProcessBehaviourChoiceLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProcessBehaviourLevel3Access().getNumberSignNumberSignKeyword_1_1());
            	    			
            	    // InternalTorXakisDsl.g:4453:4: ( (lv_right_3_0= ruleProcessBehaviourLevel4 ) )
            	    // InternalTorXakisDsl.g:4454:5: (lv_right_3_0= ruleProcessBehaviourLevel4 )
            	    {
            	    // InternalTorXakisDsl.g:4454:5: (lv_right_3_0= ruleProcessBehaviourLevel4 )
            	    // InternalTorXakisDsl.g:4455:6: lv_right_3_0= ruleProcessBehaviourLevel4
            	    {

            	    						newCompositeNode(grammarAccess.getProcessBehaviourLevel3Access().getRightProcessBehaviourLevel4ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_right_3_0=ruleProcessBehaviourLevel4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessBehaviourLevel3Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


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
    // $ANTLR end "ruleProcessBehaviourLevel3"


    // $ANTLR start "entryRuleProcessBehaviourLevel4"
    // InternalTorXakisDsl.g:4477:1: entryRuleProcessBehaviourLevel4 returns [EObject current=null] : iv_ruleProcessBehaviourLevel4= ruleProcessBehaviourLevel4 EOF ;
    public final EObject entryRuleProcessBehaviourLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourLevel4 = null;


        try {
            // InternalTorXakisDsl.g:4477:63: (iv_ruleProcessBehaviourLevel4= ruleProcessBehaviourLevel4 EOF )
            // InternalTorXakisDsl.g:4478:2: iv_ruleProcessBehaviourLevel4= ruleProcessBehaviourLevel4 EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourLevel4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourLevel4=ruleProcessBehaviourLevel4();

            state._fsp--;

             current =iv_ruleProcessBehaviourLevel4; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourLevel4"


    // $ANTLR start "ruleProcessBehaviourLevel4"
    // InternalTorXakisDsl.g:4484:1: ruleProcessBehaviourLevel4 returns [EObject current=null] : (this_ProcessBehaviourGuarded_0= ruleProcessBehaviourGuarded | this_ProcessBehaviourStop_1= ruleProcessBehaviourStop | this_ProcessBehaviourSequence_2= ruleProcessBehaviourSequence | this_ProcCall_3= ruleProcCall | this_ProcessBehaviourLet_4= ruleProcessBehaviourLet | this_ProcessBehaviourHide_5= ruleProcessBehaviourHide | this_ProcessBehaviourBracket_6= ruleProcessBehaviourBracket ) ;
    public final EObject ruleProcessBehaviourLevel4() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessBehaviourGuarded_0 = null;

        EObject this_ProcessBehaviourStop_1 = null;

        EObject this_ProcessBehaviourSequence_2 = null;

        EObject this_ProcCall_3 = null;

        EObject this_ProcessBehaviourLet_4 = null;

        EObject this_ProcessBehaviourHide_5 = null;

        EObject this_ProcessBehaviourBracket_6 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4490:2: ( (this_ProcessBehaviourGuarded_0= ruleProcessBehaviourGuarded | this_ProcessBehaviourStop_1= ruleProcessBehaviourStop | this_ProcessBehaviourSequence_2= ruleProcessBehaviourSequence | this_ProcCall_3= ruleProcCall | this_ProcessBehaviourLet_4= ruleProcessBehaviourLet | this_ProcessBehaviourHide_5= ruleProcessBehaviourHide | this_ProcessBehaviourBracket_6= ruleProcessBehaviourBracket ) )
            // InternalTorXakisDsl.g:4491:2: (this_ProcessBehaviourGuarded_0= ruleProcessBehaviourGuarded | this_ProcessBehaviourStop_1= ruleProcessBehaviourStop | this_ProcessBehaviourSequence_2= ruleProcessBehaviourSequence | this_ProcCall_3= ruleProcCall | this_ProcessBehaviourLet_4= ruleProcessBehaviourLet | this_ProcessBehaviourHide_5= ruleProcessBehaviourHide | this_ProcessBehaviourBracket_6= ruleProcessBehaviourBracket )
            {
            // InternalTorXakisDsl.g:4491:2: (this_ProcessBehaviourGuarded_0= ruleProcessBehaviourGuarded | this_ProcessBehaviourStop_1= ruleProcessBehaviourStop | this_ProcessBehaviourSequence_2= ruleProcessBehaviourSequence | this_ProcCall_3= ruleProcCall | this_ProcessBehaviourLet_4= ruleProcessBehaviourLet | this_ProcessBehaviourHide_5= ruleProcessBehaviourHide | this_ProcessBehaviourBracket_6= ruleProcessBehaviourBracket )
            int alt45=7;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt45=1;
                }
                break;
            case 68:
                {
                alt45=2;
                }
                break;
            case RULE_CAPSID:
            case 47:
                {
                alt45=3;
                }
                break;
            case RULE_SMALLID:
                {
                alt45=4;
                }
                break;
            case 65:
                {
                alt45=5;
                }
                break;
            case 64:
                {
                alt45=6;
                }
                break;
            case 19:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalTorXakisDsl.g:4492:3: this_ProcessBehaviourGuarded_0= ruleProcessBehaviourGuarded
                    {

                    			newCompositeNode(grammarAccess.getProcessBehaviourLevel4Access().getProcessBehaviourGuardedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessBehaviourGuarded_0=ruleProcessBehaviourGuarded();

                    state._fsp--;


                    			current = this_ProcessBehaviourGuarded_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:4501:3: this_ProcessBehaviourStop_1= ruleProcessBehaviourStop
                    {

                    			newCompositeNode(grammarAccess.getProcessBehaviourLevel4Access().getProcessBehaviourStopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessBehaviourStop_1=ruleProcessBehaviourStop();

                    state._fsp--;


                    			current = this_ProcessBehaviourStop_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTorXakisDsl.g:4510:3: this_ProcessBehaviourSequence_2= ruleProcessBehaviourSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessBehaviourLevel4Access().getProcessBehaviourSequenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessBehaviourSequence_2=ruleProcessBehaviourSequence();

                    state._fsp--;


                    			current = this_ProcessBehaviourSequence_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTorXakisDsl.g:4519:3: this_ProcCall_3= ruleProcCall
                    {

                    			newCompositeNode(grammarAccess.getProcessBehaviourLevel4Access().getProcCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcCall_3=ruleProcCall();

                    state._fsp--;


                    			current = this_ProcCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTorXakisDsl.g:4528:3: this_ProcessBehaviourLet_4= ruleProcessBehaviourLet
                    {

                    			newCompositeNode(grammarAccess.getProcessBehaviourLevel4Access().getProcessBehaviourLetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessBehaviourLet_4=ruleProcessBehaviourLet();

                    state._fsp--;


                    			current = this_ProcessBehaviourLet_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTorXakisDsl.g:4537:3: this_ProcessBehaviourHide_5= ruleProcessBehaviourHide
                    {

                    			newCompositeNode(grammarAccess.getProcessBehaviourLevel4Access().getProcessBehaviourHideParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessBehaviourHide_5=ruleProcessBehaviourHide();

                    state._fsp--;


                    			current = this_ProcessBehaviourHide_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTorXakisDsl.g:4546:3: this_ProcessBehaviourBracket_6= ruleProcessBehaviourBracket
                    {

                    			newCompositeNode(grammarAccess.getProcessBehaviourLevel4Access().getProcessBehaviourBracketParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessBehaviourBracket_6=ruleProcessBehaviourBracket();

                    state._fsp--;


                    			current = this_ProcessBehaviourBracket_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleProcessBehaviourLevel4"


    // $ANTLR start "entryRuleProcCall"
    // InternalTorXakisDsl.g:4558:1: entryRuleProcCall returns [EObject current=null] : iv_ruleProcCall= ruleProcCall EOF ;
    public final EObject entryRuleProcCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcCall = null;


        try {
            // InternalTorXakisDsl.g:4558:49: (iv_ruleProcCall= ruleProcCall EOF )
            // InternalTorXakisDsl.g:4559:2: iv_ruleProcCall= ruleProcCall EOF
            {
             newCompositeNode(grammarAccess.getProcCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcCall=ruleProcCall();

            state._fsp--;

             current =iv_ruleProcCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcCall"


    // $ANTLR start "ruleProcCall"
    // InternalTorXakisDsl.g:4565:1: ruleProcCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelNameList_2_0= ruleNeChannelNameList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neValExprList_5_0= ruleNeValExprList ) )? otherlv_6= ')' ) ;
    public final EObject ruleProcCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_0_0 = null;

        EObject lv_neChannelNameList_2_0 = null;

        EObject lv_neValExprList_5_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4571:2: ( ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelNameList_2_0= ruleNeChannelNameList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neValExprList_5_0= ruleNeValExprList ) )? otherlv_6= ')' ) )
            // InternalTorXakisDsl.g:4572:2: ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelNameList_2_0= ruleNeChannelNameList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neValExprList_5_0= ruleNeValExprList ) )? otherlv_6= ')' )
            {
            // InternalTorXakisDsl.g:4572:2: ( ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelNameList_2_0= ruleNeChannelNameList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neValExprList_5_0= ruleNeValExprList ) )? otherlv_6= ')' )
            // InternalTorXakisDsl.g:4573:3: ( (lv_name_0_0= ruleProcName ) ) otherlv_1= '[' ( (lv_neChannelNameList_2_0= ruleNeChannelNameList ) )? otherlv_3= ']' otherlv_4= '(' ( (lv_neValExprList_5_0= ruleNeValExprList ) )? otherlv_6= ')'
            {
            // InternalTorXakisDsl.g:4573:3: ( (lv_name_0_0= ruleProcName ) )
            // InternalTorXakisDsl.g:4574:4: (lv_name_0_0= ruleProcName )
            {
            // InternalTorXakisDsl.g:4574:4: (lv_name_0_0= ruleProcName )
            // InternalTorXakisDsl.g:4575:5: lv_name_0_0= ruleProcName
            {

            					newCompositeNode(grammarAccess.getProcCallAccess().getNameProcNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleProcName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProcCallAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTorXakisDsl.g:4596:3: ( (lv_neChannelNameList_2_0= ruleNeChannelNameList ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_CAPSID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTorXakisDsl.g:4597:4: (lv_neChannelNameList_2_0= ruleNeChannelNameList )
                    {
                    // InternalTorXakisDsl.g:4597:4: (lv_neChannelNameList_2_0= ruleNeChannelNameList )
                    // InternalTorXakisDsl.g:4598:5: lv_neChannelNameList_2_0= ruleNeChannelNameList
                    {

                    					newCompositeNode(grammarAccess.getProcCallAccess().getNeChannelNameListNeChannelNameListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_neChannelNameList_2_0=ruleNeChannelNameList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcCallRule());
                    					}
                    					set(
                    						current,
                    						"neChannelNameList",
                    						lv_neChannelNameList_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelNameList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getProcCallAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_55); 

            			newLeafNode(otherlv_4, grammarAccess.getProcCallAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTorXakisDsl.g:4623:3: ( (lv_neValExprList_5_0= ruleNeValExprList ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_CAPSID && LA47_0<=RULE_OPERATOR)||LA47_0==19||LA47_0==65||(LA47_0>=74 && LA47_0<=75)||LA47_0==79) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTorXakisDsl.g:4624:4: (lv_neValExprList_5_0= ruleNeValExprList )
                    {
                    // InternalTorXakisDsl.g:4624:4: (lv_neValExprList_5_0= ruleNeValExprList )
                    // InternalTorXakisDsl.g:4625:5: lv_neValExprList_5_0= ruleNeValExprList
                    {

                    					newCompositeNode(grammarAccess.getProcCallAccess().getNeValExprListNeValExprListParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_neValExprList_5_0=ruleNeValExprList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcCallRule());
                    					}
                    					set(
                    						current,
                    						"neValExprList",
                    						lv_neValExprList_5_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeValExprList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcCallAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleProcCall"


    // $ANTLR start "entryRuleNeValExprList"
    // InternalTorXakisDsl.g:4650:1: entryRuleNeValExprList returns [EObject current=null] : iv_ruleNeValExprList= ruleNeValExprList EOF ;
    public final EObject entryRuleNeValExprList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeValExprList = null;


        try {
            // InternalTorXakisDsl.g:4650:54: (iv_ruleNeValExprList= ruleNeValExprList EOF )
            // InternalTorXakisDsl.g:4651:2: iv_ruleNeValExprList= ruleNeValExprList EOF
            {
             newCompositeNode(grammarAccess.getNeValExprListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeValExprList=ruleNeValExprList();

            state._fsp--;

             current =iv_ruleNeValExprList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeValExprList"


    // $ANTLR start "ruleNeValExprList"
    // InternalTorXakisDsl.g:4657:1: ruleNeValExprList returns [EObject current=null] : ( ( (lv_valExprs_0_0= ruleValExpr ) ) (otherlv_1= ',' ( (lv_valExprs_2_0= ruleValExpr ) ) )* ) ;
    public final EObject ruleNeValExprList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valExprs_0_0 = null;

        EObject lv_valExprs_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4663:2: ( ( ( (lv_valExprs_0_0= ruleValExpr ) ) (otherlv_1= ',' ( (lv_valExprs_2_0= ruleValExpr ) ) )* ) )
            // InternalTorXakisDsl.g:4664:2: ( ( (lv_valExprs_0_0= ruleValExpr ) ) (otherlv_1= ',' ( (lv_valExprs_2_0= ruleValExpr ) ) )* )
            {
            // InternalTorXakisDsl.g:4664:2: ( ( (lv_valExprs_0_0= ruleValExpr ) ) (otherlv_1= ',' ( (lv_valExprs_2_0= ruleValExpr ) ) )* )
            // InternalTorXakisDsl.g:4665:3: ( (lv_valExprs_0_0= ruleValExpr ) ) (otherlv_1= ',' ( (lv_valExprs_2_0= ruleValExpr ) ) )*
            {
            // InternalTorXakisDsl.g:4665:3: ( (lv_valExprs_0_0= ruleValExpr ) )
            // InternalTorXakisDsl.g:4666:4: (lv_valExprs_0_0= ruleValExpr )
            {
            // InternalTorXakisDsl.g:4666:4: (lv_valExprs_0_0= ruleValExpr )
            // InternalTorXakisDsl.g:4667:5: lv_valExprs_0_0= ruleValExpr
            {

            					newCompositeNode(grammarAccess.getNeValExprListAccess().getValExprsValExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_valExprs_0_0=ruleValExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeValExprListRule());
            					}
            					add(
            						current,
            						"valExprs",
            						lv_valExprs_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:4684:3: (otherlv_1= ',' ( (lv_valExprs_2_0= ruleValExpr ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==46) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalTorXakisDsl.g:4685:4: otherlv_1= ',' ( (lv_valExprs_2_0= ruleValExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNeValExprListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTorXakisDsl.g:4689:4: ( (lv_valExprs_2_0= ruleValExpr ) )
            	    // InternalTorXakisDsl.g:4690:5: (lv_valExprs_2_0= ruleValExpr )
            	    {
            	    // InternalTorXakisDsl.g:4690:5: (lv_valExprs_2_0= ruleValExpr )
            	    // InternalTorXakisDsl.g:4691:6: lv_valExprs_2_0= ruleValExpr
            	    {

            	    						newCompositeNode(grammarAccess.getNeValExprListAccess().getValExprsValExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_valExprs_2_0=ruleValExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeValExprListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"valExprs",
            	    							lv_valExprs_2_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


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
    // $ANTLR end "ruleNeValExprList"


    // $ANTLR start "entryRuleProcessBehaviourBracket"
    // InternalTorXakisDsl.g:4713:1: entryRuleProcessBehaviourBracket returns [EObject current=null] : iv_ruleProcessBehaviourBracket= ruleProcessBehaviourBracket EOF ;
    public final EObject entryRuleProcessBehaviourBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourBracket = null;


        try {
            // InternalTorXakisDsl.g:4713:64: (iv_ruleProcessBehaviourBracket= ruleProcessBehaviourBracket EOF )
            // InternalTorXakisDsl.g:4714:2: iv_ruleProcessBehaviourBracket= ruleProcessBehaviourBracket EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourBracket=ruleProcessBehaviourBracket();

            state._fsp--;

             current =iv_ruleProcessBehaviourBracket; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourBracket"


    // $ANTLR start "ruleProcessBehaviourBracket"
    // InternalTorXakisDsl.g:4720:1: ruleProcessBehaviourBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleProcessBehaviourLevel1 ) ) otherlv_2= ')' ) ;
    public final EObject ruleProcessBehaviourBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4726:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleProcessBehaviourLevel1 ) ) otherlv_2= ')' ) )
            // InternalTorXakisDsl.g:4727:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleProcessBehaviourLevel1 ) ) otherlv_2= ')' )
            {
            // InternalTorXakisDsl.g:4727:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleProcessBehaviourLevel1 ) ) otherlv_2= ')' )
            // InternalTorXakisDsl.g:4728:3: otherlv_0= '(' ( (lv_sub_1_0= ruleProcessBehaviourLevel1 ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessBehaviourBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTorXakisDsl.g:4732:3: ( (lv_sub_1_0= ruleProcessBehaviourLevel1 ) )
            // InternalTorXakisDsl.g:4733:4: (lv_sub_1_0= ruleProcessBehaviourLevel1 )
            {
            // InternalTorXakisDsl.g:4733:4: (lv_sub_1_0= ruleProcessBehaviourLevel1 )
            // InternalTorXakisDsl.g:4734:5: lv_sub_1_0= ruleProcessBehaviourLevel1
            {

            					newCompositeNode(grammarAccess.getProcessBehaviourBracketAccess().getSubProcessBehaviourLevel1ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_sub_1_0=ruleProcessBehaviourLevel1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessBehaviourBracketRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessBehaviourBracketAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleProcessBehaviourBracket"


    // $ANTLR start "entryRuleProcessBehaviourHide"
    // InternalTorXakisDsl.g:4759:1: entryRuleProcessBehaviourHide returns [EObject current=null] : iv_ruleProcessBehaviourHide= ruleProcessBehaviourHide EOF ;
    public final EObject entryRuleProcessBehaviourHide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourHide = null;


        try {
            // InternalTorXakisDsl.g:4759:61: (iv_ruleProcessBehaviourHide= ruleProcessBehaviourHide EOF )
            // InternalTorXakisDsl.g:4760:2: iv_ruleProcessBehaviourHide= ruleProcessBehaviourHide EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourHideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourHide=ruleProcessBehaviourHide();

            state._fsp--;

             current =iv_ruleProcessBehaviourHide; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourHide"


    // $ANTLR start "ruleProcessBehaviourHide"
    // InternalTorXakisDsl.g:4766:1: ruleProcessBehaviourHide returns [EObject current=null] : (otherlv_0= 'HIDE' otherlv_1= '[' ( (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' ) ;
    public final EObject ruleProcessBehaviourHide() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_neChannelsDeclList_2_0 = null;

        EObject lv_sub_5_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4772:2: ( (otherlv_0= 'HIDE' otherlv_1= '[' ( (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' ) )
            // InternalTorXakisDsl.g:4773:2: (otherlv_0= 'HIDE' otherlv_1= '[' ( (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' )
            {
            // InternalTorXakisDsl.g:4773:2: (otherlv_0= 'HIDE' otherlv_1= '[' ( (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' )
            // InternalTorXakisDsl.g:4774:3: otherlv_0= 'HIDE' otherlv_1= '[' ( (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList ) )? otherlv_3= ']' otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessBehaviourHideAccess().getHIDEKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessBehaviourHideAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTorXakisDsl.g:4782:3: ( (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_CAPSID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTorXakisDsl.g:4783:4: (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList )
                    {
                    // InternalTorXakisDsl.g:4783:4: (lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList )
                    // InternalTorXakisDsl.g:4784:5: lv_neChannelsDeclList_2_0= ruleNeChannelsDeclList
                    {

                    					newCompositeNode(grammarAccess.getProcessBehaviourHideAccess().getNeChannelsDeclListNeChannelsDeclListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_neChannelsDeclList_2_0=ruleNeChannelsDeclList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcessBehaviourHideRule());
                    					}
                    					set(
                    						current,
                    						"neChannelsDeclList",
                    						lv_neChannelsDeclList_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeChannelsDeclList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessBehaviourHideAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessBehaviourHideAccess().getINKeyword_4());
            		
            // InternalTorXakisDsl.g:4809:3: ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) )
            // InternalTorXakisDsl.g:4810:4: (lv_sub_5_0= ruleProcessBehaviourLevel1 )
            {
            // InternalTorXakisDsl.g:4810:4: (lv_sub_5_0= ruleProcessBehaviourLevel1 )
            // InternalTorXakisDsl.g:4811:5: lv_sub_5_0= ruleProcessBehaviourLevel1
            {

            					newCompositeNode(grammarAccess.getProcessBehaviourHideAccess().getSubProcessBehaviourLevel1ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_52);
            lv_sub_5_0=ruleProcessBehaviourLevel1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessBehaviourHideRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_5_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessBehaviourHideAccess().getNIKeyword_6());
            		

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
    // $ANTLR end "ruleProcessBehaviourHide"


    // $ANTLR start "entryRuleProcessBehaviourLet"
    // InternalTorXakisDsl.g:4836:1: entryRuleProcessBehaviourLet returns [EObject current=null] : iv_ruleProcessBehaviourLet= ruleProcessBehaviourLet EOF ;
    public final EObject entryRuleProcessBehaviourLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourLet = null;


        try {
            // InternalTorXakisDsl.g:4836:60: (iv_ruleProcessBehaviourLet= ruleProcessBehaviourLet EOF )
            // InternalTorXakisDsl.g:4837:2: iv_ruleProcessBehaviourLet= ruleProcessBehaviourLet EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourLet=ruleProcessBehaviourLet();

            state._fsp--;

             current =iv_ruleProcessBehaviourLet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourLet"


    // $ANTLR start "ruleProcessBehaviourLet"
    // InternalTorXakisDsl.g:4843:1: ruleProcessBehaviourLet returns [EObject current=null] : (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' ) ;
    public final EObject ruleProcessBehaviourLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_assignments_1_0 = null;

        EObject lv_assignments_3_0 = null;

        EObject lv_sub_5_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4849:2: ( (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' ) )
            // InternalTorXakisDsl.g:4850:2: (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' )
            {
            // InternalTorXakisDsl.g:4850:2: (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI' )
            // InternalTorXakisDsl.g:4851:3: otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) ) otherlv_6= 'NI'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessBehaviourLetAccess().getLETKeyword_0());
            		
            // InternalTorXakisDsl.g:4855:3: ( (lv_assignments_1_0= ruleAssignment ) )
            // InternalTorXakisDsl.g:4856:4: (lv_assignments_1_0= ruleAssignment )
            {
            // InternalTorXakisDsl.g:4856:4: (lv_assignments_1_0= ruleAssignment )
            // InternalTorXakisDsl.g:4857:5: lv_assignments_1_0= ruleAssignment
            {

            					newCompositeNode(grammarAccess.getProcessBehaviourLetAccess().getAssignmentsAssignmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_56);
            lv_assignments_1_0=ruleAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessBehaviourLetRule());
            					}
            					add(
            						current,
            						"assignments",
            						lv_assignments_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Assignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:4874:3: (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==15) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalTorXakisDsl.g:4875:4: otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProcessBehaviourLetAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:4879:4: ( (lv_assignments_3_0= ruleAssignment ) )
            	    // InternalTorXakisDsl.g:4880:5: (lv_assignments_3_0= ruleAssignment )
            	    {
            	    // InternalTorXakisDsl.g:4880:5: (lv_assignments_3_0= ruleAssignment )
            	    // InternalTorXakisDsl.g:4881:6: lv_assignments_3_0= ruleAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getProcessBehaviourLetAccess().getAssignmentsAssignmentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_assignments_3_0=ruleAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessBehaviourLetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assignments",
            	    							lv_assignments_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.Assignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessBehaviourLetAccess().getINKeyword_3());
            		
            // InternalTorXakisDsl.g:4903:3: ( (lv_sub_5_0= ruleProcessBehaviourLevel1 ) )
            // InternalTorXakisDsl.g:4904:4: (lv_sub_5_0= ruleProcessBehaviourLevel1 )
            {
            // InternalTorXakisDsl.g:4904:4: (lv_sub_5_0= ruleProcessBehaviourLevel1 )
            // InternalTorXakisDsl.g:4905:5: lv_sub_5_0= ruleProcessBehaviourLevel1
            {

            					newCompositeNode(grammarAccess.getProcessBehaviourLetAccess().getSubProcessBehaviourLevel1ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_52);
            lv_sub_5_0=ruleProcessBehaviourLevel1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessBehaviourLetRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_5_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessBehaviourLetAccess().getNIKeyword_5());
            		

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
    // $ANTLR end "ruleProcessBehaviourLet"


    // $ANTLR start "entryRuleProcessBehaviourSequence"
    // InternalTorXakisDsl.g:4930:1: entryRuleProcessBehaviourSequence returns [EObject current=null] : iv_ruleProcessBehaviourSequence= ruleProcessBehaviourSequence EOF ;
    public final EObject entryRuleProcessBehaviourSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourSequence = null;


        try {
            // InternalTorXakisDsl.g:4930:65: (iv_ruleProcessBehaviourSequence= ruleProcessBehaviourSequence EOF )
            // InternalTorXakisDsl.g:4931:2: iv_ruleProcessBehaviourSequence= ruleProcessBehaviourSequence EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourSequence=ruleProcessBehaviourSequence();

            state._fsp--;

             current =iv_ruleProcessBehaviourSequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourSequence"


    // $ANTLR start "ruleProcessBehaviourSequence"
    // InternalTorXakisDsl.g:4937:1: ruleProcessBehaviourSequence returns [EObject current=null] : ( ( (lv_conditionalCommunications_0_0= ruleConditionalCommunications ) ) (otherlv_1= '>->' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )? ) ;
    public final EObject ruleProcessBehaviourSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_conditionalCommunications_0_0 = null;

        EObject lv_sub_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:4943:2: ( ( ( (lv_conditionalCommunications_0_0= ruleConditionalCommunications ) ) (otherlv_1= '>->' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )? ) )
            // InternalTorXakisDsl.g:4944:2: ( ( (lv_conditionalCommunications_0_0= ruleConditionalCommunications ) ) (otherlv_1= '>->' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )? )
            {
            // InternalTorXakisDsl.g:4944:2: ( ( (lv_conditionalCommunications_0_0= ruleConditionalCommunications ) ) (otherlv_1= '>->' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )? )
            // InternalTorXakisDsl.g:4945:3: ( (lv_conditionalCommunications_0_0= ruleConditionalCommunications ) ) (otherlv_1= '>->' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )?
            {
            // InternalTorXakisDsl.g:4945:3: ( (lv_conditionalCommunications_0_0= ruleConditionalCommunications ) )
            // InternalTorXakisDsl.g:4946:4: (lv_conditionalCommunications_0_0= ruleConditionalCommunications )
            {
            // InternalTorXakisDsl.g:4946:4: (lv_conditionalCommunications_0_0= ruleConditionalCommunications )
            // InternalTorXakisDsl.g:4947:5: lv_conditionalCommunications_0_0= ruleConditionalCommunications
            {

            					newCompositeNode(grammarAccess.getProcessBehaviourSequenceAccess().getConditionalCommunicationsConditionalCommunicationsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_57);
            lv_conditionalCommunications_0_0=ruleConditionalCommunications();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessBehaviourSequenceRule());
            					}
            					set(
            						current,
            						"conditionalCommunications",
            						lv_conditionalCommunications_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ConditionalCommunications");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:4964:3: (otherlv_1= '>->' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==66) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTorXakisDsl.g:4965:4: otherlv_1= '>->' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) )
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getProcessBehaviourSequenceAccess().getGreaterThanSignHyphenMinusGreaterThanSignKeyword_1_0());
                    			
                    // InternalTorXakisDsl.g:4969:4: ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) )
                    // InternalTorXakisDsl.g:4970:5: (lv_sub_2_0= ruleProcessBehaviourLevel4 )
                    {
                    // InternalTorXakisDsl.g:4970:5: (lv_sub_2_0= ruleProcessBehaviourLevel4 )
                    // InternalTorXakisDsl.g:4971:6: lv_sub_2_0= ruleProcessBehaviourLevel4
                    {

                    						newCompositeNode(grammarAccess.getProcessBehaviourSequenceAccess().getSubProcessBehaviourLevel4ParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sub_2_0=ruleProcessBehaviourLevel4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessBehaviourSequenceRule());
                    						}
                    						set(
                    							current,
                    							"sub",
                    							lv_sub_2_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleProcessBehaviourSequence"


    // $ANTLR start "entryRuleProcessBehaviourGuarded"
    // InternalTorXakisDsl.g:4993:1: entryRuleProcessBehaviourGuarded returns [EObject current=null] : iv_ruleProcessBehaviourGuarded= ruleProcessBehaviourGuarded EOF ;
    public final EObject entryRuleProcessBehaviourGuarded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourGuarded = null;


        try {
            // InternalTorXakisDsl.g:4993:64: (iv_ruleProcessBehaviourGuarded= ruleProcessBehaviourGuarded EOF )
            // InternalTorXakisDsl.g:4994:2: iv_ruleProcessBehaviourGuarded= ruleProcessBehaviourGuarded EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourGuardedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourGuarded=ruleProcessBehaviourGuarded();

            state._fsp--;

             current =iv_ruleProcessBehaviourGuarded; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourGuarded"


    // $ANTLR start "ruleProcessBehaviourGuarded"
    // InternalTorXakisDsl.g:5000:1: ruleProcessBehaviourGuarded returns [EObject current=null] : ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '=>>' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) ) ;
    public final EObject ruleProcessBehaviourGuarded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_sub_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5006:2: ( ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '=>>' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) ) )
            // InternalTorXakisDsl.g:5007:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '=>>' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )
            {
            // InternalTorXakisDsl.g:5007:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '=>>' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) ) )
            // InternalTorXakisDsl.g:5008:3: ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '=>>' ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) )
            {
            // InternalTorXakisDsl.g:5008:3: ( (lv_condition_0_0= ruleCondition ) )
            // InternalTorXakisDsl.g:5009:4: (lv_condition_0_0= ruleCondition )
            {
            // InternalTorXakisDsl.g:5009:4: (lv_condition_0_0= ruleCondition )
            // InternalTorXakisDsl.g:5010:5: lv_condition_0_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getProcessBehaviourGuardedAccess().getConditionConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_58);
            lv_condition_0_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessBehaviourGuardedRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessBehaviourGuardedAccess().getEqualsSignGreaterThanSignGreaterThanSignKeyword_1());
            		
            // InternalTorXakisDsl.g:5031:3: ( (lv_sub_2_0= ruleProcessBehaviourLevel4 ) )
            // InternalTorXakisDsl.g:5032:4: (lv_sub_2_0= ruleProcessBehaviourLevel4 )
            {
            // InternalTorXakisDsl.g:5032:4: (lv_sub_2_0= ruleProcessBehaviourLevel4 )
            // InternalTorXakisDsl.g:5033:5: lv_sub_2_0= ruleProcessBehaviourLevel4
            {

            					newCompositeNode(grammarAccess.getProcessBehaviourGuardedAccess().getSubProcessBehaviourLevel4ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_2_0=ruleProcessBehaviourLevel4();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessBehaviourGuardedRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ProcessBehaviourLevel4");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleProcessBehaviourGuarded"


    // $ANTLR start "entryRuleProcessBehaviourStop"
    // InternalTorXakisDsl.g:5054:1: entryRuleProcessBehaviourStop returns [EObject current=null] : iv_ruleProcessBehaviourStop= ruleProcessBehaviourStop EOF ;
    public final EObject entryRuleProcessBehaviourStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBehaviourStop = null;


        try {
            // InternalTorXakisDsl.g:5054:61: (iv_ruleProcessBehaviourStop= ruleProcessBehaviourStop EOF )
            // InternalTorXakisDsl.g:5055:2: iv_ruleProcessBehaviourStop= ruleProcessBehaviourStop EOF
            {
             newCompositeNode(grammarAccess.getProcessBehaviourStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBehaviourStop=ruleProcessBehaviourStop();

            state._fsp--;

             current =iv_ruleProcessBehaviourStop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessBehaviourStop"


    // $ANTLR start "ruleProcessBehaviourStop"
    // InternalTorXakisDsl.g:5061:1: ruleProcessBehaviourStop returns [EObject current=null] : ( (lv_stop_0_0= 'STOP' ) ) ;
    public final EObject ruleProcessBehaviourStop() throws RecognitionException {
        EObject current = null;

        Token lv_stop_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:5067:2: ( ( (lv_stop_0_0= 'STOP' ) ) )
            // InternalTorXakisDsl.g:5068:2: ( (lv_stop_0_0= 'STOP' ) )
            {
            // InternalTorXakisDsl.g:5068:2: ( (lv_stop_0_0= 'STOP' ) )
            // InternalTorXakisDsl.g:5069:3: (lv_stop_0_0= 'STOP' )
            {
            // InternalTorXakisDsl.g:5069:3: (lv_stop_0_0= 'STOP' )
            // InternalTorXakisDsl.g:5070:4: lv_stop_0_0= 'STOP'
            {
            lv_stop_0_0=(Token)match(input,68,FOLLOW_2); 

            				newLeafNode(lv_stop_0_0, grammarAccess.getProcessBehaviourStopAccess().getStopSTOPKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProcessBehaviourStopRule());
            				}
            				setWithLastConsumed(current, "stop", lv_stop_0_0, "STOP");
            			

            }


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
    // $ANTLR end "ruleProcessBehaviourStop"


    // $ANTLR start "entryRuleSynchronizedChannels"
    // InternalTorXakisDsl.g:5085:1: entryRuleSynchronizedChannels returns [EObject current=null] : iv_ruleSynchronizedChannels= ruleSynchronizedChannels EOF ;
    public final EObject entryRuleSynchronizedChannels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronizedChannels = null;


        try {
            // InternalTorXakisDsl.g:5085:61: (iv_ruleSynchronizedChannels= ruleSynchronizedChannels EOF )
            // InternalTorXakisDsl.g:5086:2: iv_ruleSynchronizedChannels= ruleSynchronizedChannels EOF
            {
             newCompositeNode(grammarAccess.getSynchronizedChannelsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSynchronizedChannels=ruleSynchronizedChannels();

            state._fsp--;

             current =iv_ruleSynchronizedChannels; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSynchronizedChannels"


    // $ANTLR start "ruleSynchronizedChannels"
    // InternalTorXakisDsl.g:5092:1: ruleSynchronizedChannels returns [EObject current=null] : (otherlv_0= '|[' ( (lv_neChannelNameList_1_0= ruleNeChannelNameList ) ) otherlv_2= ']|' ) ;
    public final EObject ruleSynchronizedChannels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_neChannelNameList_1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5098:2: ( (otherlv_0= '|[' ( (lv_neChannelNameList_1_0= ruleNeChannelNameList ) ) otherlv_2= ']|' ) )
            // InternalTorXakisDsl.g:5099:2: (otherlv_0= '|[' ( (lv_neChannelNameList_1_0= ruleNeChannelNameList ) ) otherlv_2= ']|' )
            {
            // InternalTorXakisDsl.g:5099:2: (otherlv_0= '|[' ( (lv_neChannelNameList_1_0= ruleNeChannelNameList ) ) otherlv_2= ']|' )
            // InternalTorXakisDsl.g:5100:3: otherlv_0= '|[' ( (lv_neChannelNameList_1_0= ruleNeChannelNameList ) ) otherlv_2= ']|'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSynchronizedChannelsAccess().getVerticalLineLeftSquareBracketKeyword_0());
            		
            // InternalTorXakisDsl.g:5104:3: ( (lv_neChannelNameList_1_0= ruleNeChannelNameList ) )
            // InternalTorXakisDsl.g:5105:4: (lv_neChannelNameList_1_0= ruleNeChannelNameList )
            {
            // InternalTorXakisDsl.g:5105:4: (lv_neChannelNameList_1_0= ruleNeChannelNameList )
            // InternalTorXakisDsl.g:5106:5: lv_neChannelNameList_1_0= ruleNeChannelNameList
            {

            					newCompositeNode(grammarAccess.getSynchronizedChannelsAccess().getNeChannelNameListNeChannelNameListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_59);
            lv_neChannelNameList_1_0=ruleNeChannelNameList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSynchronizedChannelsRule());
            					}
            					set(
            						current,
            						"neChannelNameList",
            						lv_neChannelNameList_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.NeChannelNameList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSynchronizedChannelsAccess().getRightSquareBracketVerticalLineKeyword_2());
            		

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
    // $ANTLR end "ruleSynchronizedChannels"


    // $ANTLR start "entryRuleConditionalCommunications"
    // InternalTorXakisDsl.g:5131:1: entryRuleConditionalCommunications returns [EObject current=null] : iv_ruleConditionalCommunications= ruleConditionalCommunications EOF ;
    public final EObject entryRuleConditionalCommunications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalCommunications = null;


        try {
            // InternalTorXakisDsl.g:5131:66: (iv_ruleConditionalCommunications= ruleConditionalCommunications EOF )
            // InternalTorXakisDsl.g:5132:2: iv_ruleConditionalCommunications= ruleConditionalCommunications EOF
            {
             newCompositeNode(grammarAccess.getConditionalCommunicationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalCommunications=ruleConditionalCommunications();

            state._fsp--;

             current =iv_ruleConditionalCommunications; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalCommunications"


    // $ANTLR start "ruleConditionalCommunications"
    // InternalTorXakisDsl.g:5138:1: ruleConditionalCommunications returns [EObject current=null] : ( () ( (lv_communications_1_0= ruleCommunications ) ) ( (lv_condition_2_0= ruleCondition ) )? ) ;
    public final EObject ruleConditionalCommunications() throws RecognitionException {
        EObject current = null;

        EObject lv_communications_1_0 = null;

        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5144:2: ( ( () ( (lv_communications_1_0= ruleCommunications ) ) ( (lv_condition_2_0= ruleCondition ) )? ) )
            // InternalTorXakisDsl.g:5145:2: ( () ( (lv_communications_1_0= ruleCommunications ) ) ( (lv_condition_2_0= ruleCondition ) )? )
            {
            // InternalTorXakisDsl.g:5145:2: ( () ( (lv_communications_1_0= ruleCommunications ) ) ( (lv_condition_2_0= ruleCondition ) )? )
            // InternalTorXakisDsl.g:5146:3: () ( (lv_communications_1_0= ruleCommunications ) ) ( (lv_condition_2_0= ruleCondition ) )?
            {
            // InternalTorXakisDsl.g:5146:3: ()
            // InternalTorXakisDsl.g:5147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionalCommunicationsAccess().getConditionalCommunicationsAction_0(),
            					current);
            			

            }

            // InternalTorXakisDsl.g:5153:3: ( (lv_communications_1_0= ruleCommunications ) )
            // InternalTorXakisDsl.g:5154:4: (lv_communications_1_0= ruleCommunications )
            {
            // InternalTorXakisDsl.g:5154:4: (lv_communications_1_0= ruleCommunications )
            // InternalTorXakisDsl.g:5155:5: lv_communications_1_0= ruleCommunications
            {

            					newCompositeNode(grammarAccess.getConditionalCommunicationsAccess().getCommunicationsCommunicationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_60);
            lv_communications_1_0=ruleCommunications();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalCommunicationsRule());
            					}
            					add(
            						current,
            						"communications",
            						lv_communications_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Communications");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:5172:3: ( (lv_condition_2_0= ruleCondition ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==71) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTorXakisDsl.g:5173:4: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalTorXakisDsl.g:5173:4: (lv_condition_2_0= ruleCondition )
                    // InternalTorXakisDsl.g:5174:5: lv_condition_2_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalCommunicationsAccess().getConditionConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalCommunicationsRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleConditionalCommunications"


    // $ANTLR start "entryRuleCommunications"
    // InternalTorXakisDsl.g:5195:1: entryRuleCommunications returns [EObject current=null] : iv_ruleCommunications= ruleCommunications EOF ;
    public final EObject entryRuleCommunications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunications = null;


        try {
            // InternalTorXakisDsl.g:5195:55: (iv_ruleCommunications= ruleCommunications EOF )
            // InternalTorXakisDsl.g:5196:2: iv_ruleCommunications= ruleCommunications EOF
            {
             newCompositeNode(grammarAccess.getCommunicationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunications=ruleCommunications();

            state._fsp--;

             current =iv_ruleCommunications; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommunications"


    // $ANTLR start "ruleCommunications"
    // InternalTorXakisDsl.g:5202:1: ruleCommunications returns [EObject current=null] : ( () ( (lv_communications_1_0= ruleCommunication ) ) (otherlv_2= '|' ( (lv_communications_3_0= ruleCommunication ) ) )* ) ;
    public final EObject ruleCommunications() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_communications_1_0 = null;

        EObject lv_communications_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5208:2: ( ( () ( (lv_communications_1_0= ruleCommunication ) ) (otherlv_2= '|' ( (lv_communications_3_0= ruleCommunication ) ) )* ) )
            // InternalTorXakisDsl.g:5209:2: ( () ( (lv_communications_1_0= ruleCommunication ) ) (otherlv_2= '|' ( (lv_communications_3_0= ruleCommunication ) ) )* )
            {
            // InternalTorXakisDsl.g:5209:2: ( () ( (lv_communications_1_0= ruleCommunication ) ) (otherlv_2= '|' ( (lv_communications_3_0= ruleCommunication ) ) )* )
            // InternalTorXakisDsl.g:5210:3: () ( (lv_communications_1_0= ruleCommunication ) ) (otherlv_2= '|' ( (lv_communications_3_0= ruleCommunication ) ) )*
            {
            // InternalTorXakisDsl.g:5210:3: ()
            // InternalTorXakisDsl.g:5211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationsAccess().getCommunicationsAction_0(),
            					current);
            			

            }

            // InternalTorXakisDsl.g:5217:3: ( (lv_communications_1_0= ruleCommunication ) )
            // InternalTorXakisDsl.g:5218:4: (lv_communications_1_0= ruleCommunication )
            {
            // InternalTorXakisDsl.g:5218:4: (lv_communications_1_0= ruleCommunication )
            // InternalTorXakisDsl.g:5219:5: lv_communications_1_0= ruleCommunication
            {

            					newCompositeNode(grammarAccess.getCommunicationsAccess().getCommunicationsCommunicationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_communications_1_0=ruleCommunication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationsRule());
            					}
            					add(
            						current,
            						"communications",
            						lv_communications_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Communication");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:5236:3: (otherlv_2= '|' ( (lv_communications_3_0= ruleCommunication ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==45) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalTorXakisDsl.g:5237:4: otherlv_2= '|' ( (lv_communications_3_0= ruleCommunication ) )
            	    {
            	    otherlv_2=(Token)match(input,45,FOLLOW_34); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCommunicationsAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:5241:4: ( (lv_communications_3_0= ruleCommunication ) )
            	    // InternalTorXakisDsl.g:5242:5: (lv_communications_3_0= ruleCommunication )
            	    {
            	    // InternalTorXakisDsl.g:5242:5: (lv_communications_3_0= ruleCommunication )
            	    // InternalTorXakisDsl.g:5243:6: lv_communications_3_0= ruleCommunication
            	    {

            	    						newCompositeNode(grammarAccess.getCommunicationsAccess().getCommunicationsCommunicationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_communications_3_0=ruleCommunication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommunicationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"communications",
            	    							lv_communications_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.Communication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


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
    // $ANTLR end "ruleCommunications"


    // $ANTLR start "entryRuleCommunication"
    // InternalTorXakisDsl.g:5265:1: entryRuleCommunication returns [EObject current=null] : iv_ruleCommunication= ruleCommunication EOF ;
    public final EObject entryRuleCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunication = null;


        try {
            // InternalTorXakisDsl.g:5265:54: (iv_ruleCommunication= ruleCommunication EOF )
            // InternalTorXakisDsl.g:5266:2: iv_ruleCommunication= ruleCommunication EOF
            {
             newCompositeNode(grammarAccess.getCommunicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunication=ruleCommunication();

            state._fsp--;

             current =iv_ruleCommunication; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommunication"


    // $ANTLR start "ruleCommunication"
    // InternalTorXakisDsl.g:5272:1: ruleCommunication returns [EObject current=null] : ( () ( ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) ) ( (lv_channelOffers_3_0= ruleChannelOffer ) )* ) ) ;
    public final EObject ruleCommunication() throws RecognitionException {
        EObject current = null;

        Token lv_exit_2_0=null;
        EObject lv_channelName_1_0 = null;

        EObject lv_channelOffers_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5278:2: ( ( () ( ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) ) ( (lv_channelOffers_3_0= ruleChannelOffer ) )* ) ) )
            // InternalTorXakisDsl.g:5279:2: ( () ( ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) ) ( (lv_channelOffers_3_0= ruleChannelOffer ) )* ) )
            {
            // InternalTorXakisDsl.g:5279:2: ( () ( ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) ) ( (lv_channelOffers_3_0= ruleChannelOffer ) )* ) )
            // InternalTorXakisDsl.g:5280:3: () ( ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) ) ( (lv_channelOffers_3_0= ruleChannelOffer ) )* )
            {
            // InternalTorXakisDsl.g:5280:3: ()
            // InternalTorXakisDsl.g:5281:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationAccess().getCommunicationAction_0(),
            					current);
            			

            }

            // InternalTorXakisDsl.g:5287:3: ( ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) ) ( (lv_channelOffers_3_0= ruleChannelOffer ) )* )
            // InternalTorXakisDsl.g:5288:4: ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) ) ( (lv_channelOffers_3_0= ruleChannelOffer ) )*
            {
            // InternalTorXakisDsl.g:5288:4: ( ( (lv_channelName_1_0= ruleChannelName ) ) | ( (lv_exit_2_0= 'EXIT' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_CAPSID) ) {
                alt54=1;
            }
            else if ( (LA54_0==47) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalTorXakisDsl.g:5289:5: ( (lv_channelName_1_0= ruleChannelName ) )
                    {
                    // InternalTorXakisDsl.g:5289:5: ( (lv_channelName_1_0= ruleChannelName ) )
                    // InternalTorXakisDsl.g:5290:6: (lv_channelName_1_0= ruleChannelName )
                    {
                    // InternalTorXakisDsl.g:5290:6: (lv_channelName_1_0= ruleChannelName )
                    // InternalTorXakisDsl.g:5291:7: lv_channelName_1_0= ruleChannelName
                    {

                    							newCompositeNode(grammarAccess.getCommunicationAccess().getChannelNameChannelNameParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_61);
                    lv_channelName_1_0=ruleChannelName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCommunicationRule());
                    							}
                    							set(
                    								current,
                    								"channelName",
                    								lv_channelName_1_0,
                    								"nl.tno.torxakis.language.TorXakisDsl.ChannelName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:5309:5: ( (lv_exit_2_0= 'EXIT' ) )
                    {
                    // InternalTorXakisDsl.g:5309:5: ( (lv_exit_2_0= 'EXIT' ) )
                    // InternalTorXakisDsl.g:5310:6: (lv_exit_2_0= 'EXIT' )
                    {
                    // InternalTorXakisDsl.g:5310:6: (lv_exit_2_0= 'EXIT' )
                    // InternalTorXakisDsl.g:5311:7: lv_exit_2_0= 'EXIT'
                    {
                    lv_exit_2_0=(Token)match(input,47,FOLLOW_61); 

                    							newLeafNode(lv_exit_2_0, grammarAccess.getCommunicationAccess().getExitEXITKeyword_1_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCommunicationRule());
                    							}
                    							setWithLastConsumed(current, "exit", lv_exit_2_0, "EXIT");
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalTorXakisDsl.g:5324:4: ( (lv_channelOffers_3_0= ruleChannelOffer ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=56 && LA55_0<=57)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalTorXakisDsl.g:5325:5: (lv_channelOffers_3_0= ruleChannelOffer )
            	    {
            	    // InternalTorXakisDsl.g:5325:5: (lv_channelOffers_3_0= ruleChannelOffer )
            	    // InternalTorXakisDsl.g:5326:6: lv_channelOffers_3_0= ruleChannelOffer
            	    {

            	    						newCompositeNode(grammarAccess.getCommunicationAccess().getChannelOffersChannelOfferParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_61);
            	    lv_channelOffers_3_0=ruleChannelOffer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommunicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"channelOffers",
            	    							lv_channelOffers_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.ChannelOffer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleCommunication"


    // $ANTLR start "entryRuleChannelOffer"
    // InternalTorXakisDsl.g:5348:1: entryRuleChannelOffer returns [EObject current=null] : iv_ruleChannelOffer= ruleChannelOffer EOF ;
    public final EObject entryRuleChannelOffer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelOffer = null;


        try {
            // InternalTorXakisDsl.g:5348:53: (iv_ruleChannelOffer= ruleChannelOffer EOF )
            // InternalTorXakisDsl.g:5349:2: iv_ruleChannelOffer= ruleChannelOffer EOF
            {
             newCompositeNode(grammarAccess.getChannelOfferRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelOffer=ruleChannelOffer();

            state._fsp--;

             current =iv_ruleChannelOffer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChannelOffer"


    // $ANTLR start "ruleChannelOffer"
    // InternalTorXakisDsl.g:5355:1: ruleChannelOffer returns [EObject current=null] : ( (otherlv_0= '!' ( (lv_valExprs_1_0= ruleValExpr ) ) ) | (otherlv_2= '?' ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) ) ) ) ;
    public final EObject ruleChannelOffer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_valExprs_1_0 = null;

        EObject lv_varDecls_3_0 = null;

        EObject lv_varNames_4_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5361:2: ( ( (otherlv_0= '!' ( (lv_valExprs_1_0= ruleValExpr ) ) ) | (otherlv_2= '?' ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) ) ) ) )
            // InternalTorXakisDsl.g:5362:2: ( (otherlv_0= '!' ( (lv_valExprs_1_0= ruleValExpr ) ) ) | (otherlv_2= '?' ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) ) ) )
            {
            // InternalTorXakisDsl.g:5362:2: ( (otherlv_0= '!' ( (lv_valExprs_1_0= ruleValExpr ) ) ) | (otherlv_2= '?' ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==57) ) {
                alt57=1;
            }
            else if ( (LA57_0==56) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalTorXakisDsl.g:5363:3: (otherlv_0= '!' ( (lv_valExprs_1_0= ruleValExpr ) ) )
                    {
                    // InternalTorXakisDsl.g:5363:3: (otherlv_0= '!' ( (lv_valExprs_1_0= ruleValExpr ) ) )
                    // InternalTorXakisDsl.g:5364:4: otherlv_0= '!' ( (lv_valExprs_1_0= ruleValExpr ) )
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getChannelOfferAccess().getExclamationMarkKeyword_0_0());
                    			
                    // InternalTorXakisDsl.g:5368:4: ( (lv_valExprs_1_0= ruleValExpr ) )
                    // InternalTorXakisDsl.g:5369:5: (lv_valExprs_1_0= ruleValExpr )
                    {
                    // InternalTorXakisDsl.g:5369:5: (lv_valExprs_1_0= ruleValExpr )
                    // InternalTorXakisDsl.g:5370:6: lv_valExprs_1_0= ruleValExpr
                    {

                    						newCompositeNode(grammarAccess.getChannelOfferAccess().getValExprsValExprParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valExprs_1_0=ruleValExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChannelOfferRule());
                    						}
                    						add(
                    							current,
                    							"valExprs",
                    							lv_valExprs_1_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:5389:3: (otherlv_2= '?' ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) ) )
                    {
                    // InternalTorXakisDsl.g:5389:3: (otherlv_2= '?' ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) ) )
                    // InternalTorXakisDsl.g:5390:4: otherlv_2= '?' ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) )
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getChannelOfferAccess().getQuestionMarkKeyword_1_0());
                    			
                    // InternalTorXakisDsl.g:5394:4: ( ( (lv_varDecls_3_0= ruleVarDecl ) ) | ( (lv_varNames_4_0= ruleVarName ) ) )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_SMALLID) ) {
                        int LA56_1 = input.LA(2);

                        if ( (LA56_1==21) ) {
                            alt56=1;
                        }
                        else if ( (LA56_1==EOF||(LA56_1>=15 && LA56_1<=16)||LA56_1==20||LA56_1==29||(LA56_1>=41 && LA56_1<=42)||LA56_1==45||(LA56_1>=50 && LA56_1<=52)||LA56_1==54||(LA56_1>=56 && LA56_1<=63)||LA56_1==66||LA56_1==69||LA56_1==71) ) {
                            alt56=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalTorXakisDsl.g:5395:5: ( (lv_varDecls_3_0= ruleVarDecl ) )
                            {
                            // InternalTorXakisDsl.g:5395:5: ( (lv_varDecls_3_0= ruleVarDecl ) )
                            // InternalTorXakisDsl.g:5396:6: (lv_varDecls_3_0= ruleVarDecl )
                            {
                            // InternalTorXakisDsl.g:5396:6: (lv_varDecls_3_0= ruleVarDecl )
                            // InternalTorXakisDsl.g:5397:7: lv_varDecls_3_0= ruleVarDecl
                            {

                            							newCompositeNode(grammarAccess.getChannelOfferAccess().getVarDeclsVarDeclParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_varDecls_3_0=ruleVarDecl();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getChannelOfferRule());
                            							}
                            							add(
                            								current,
                            								"varDecls",
                            								lv_varDecls_3_0,
                            								"nl.tno.torxakis.language.TorXakisDsl.VarDecl");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTorXakisDsl.g:5415:5: ( (lv_varNames_4_0= ruleVarName ) )
                            {
                            // InternalTorXakisDsl.g:5415:5: ( (lv_varNames_4_0= ruleVarName ) )
                            // InternalTorXakisDsl.g:5416:6: (lv_varNames_4_0= ruleVarName )
                            {
                            // InternalTorXakisDsl.g:5416:6: (lv_varNames_4_0= ruleVarName )
                            // InternalTorXakisDsl.g:5417:7: lv_varNames_4_0= ruleVarName
                            {

                            							newCompositeNode(grammarAccess.getChannelOfferAccess().getVarNamesVarNameParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_varNames_4_0=ruleVarName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getChannelOfferRule());
                            							}
                            							add(
                            								current,
                            								"varNames",
                            								lv_varNames_4_0,
                            								"nl.tno.torxakis.language.TorXakisDsl.VarName");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleChannelOffer"


    // $ANTLR start "entryRuleCondition"
    // InternalTorXakisDsl.g:5440:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalTorXakisDsl.g:5440:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalTorXakisDsl.g:5441:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalTorXakisDsl.g:5447:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_valExpr_2_0= ruleValExpr ) ) otherlv_3= ']]' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valExpr_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5453:2: ( ( () otherlv_1= '[[' ( (lv_valExpr_2_0= ruleValExpr ) ) otherlv_3= ']]' ) )
            // InternalTorXakisDsl.g:5454:2: ( () otherlv_1= '[[' ( (lv_valExpr_2_0= ruleValExpr ) ) otherlv_3= ']]' )
            {
            // InternalTorXakisDsl.g:5454:2: ( () otherlv_1= '[[' ( (lv_valExpr_2_0= ruleValExpr ) ) otherlv_3= ']]' )
            // InternalTorXakisDsl.g:5455:3: () otherlv_1= '[[' ( (lv_valExpr_2_0= ruleValExpr ) ) otherlv_3= ']]'
            {
            // InternalTorXakisDsl.g:5455:3: ()
            // InternalTorXakisDsl.g:5456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
            		
            // InternalTorXakisDsl.g:5466:3: ( (lv_valExpr_2_0= ruleValExpr ) )
            // InternalTorXakisDsl.g:5467:4: (lv_valExpr_2_0= ruleValExpr )
            {
            // InternalTorXakisDsl.g:5467:4: (lv_valExpr_2_0= ruleValExpr )
            // InternalTorXakisDsl.g:5468:5: lv_valExpr_2_0= ruleValExpr
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getValExprValExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_62);
            lv_valExpr_2_0=ruleValExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"valExpr",
            						lv_valExpr_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,72,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRightSquareBracketRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAssignment"
    // InternalTorXakisDsl.g:5493:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalTorXakisDsl.g:5493:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalTorXakisDsl.g:5494:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalTorXakisDsl.g:5500:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_varDecl_0_0= ruleVarDecl ) ) | ( (lv_varName_1_0= ruleVarName ) ) ) otherlv_2= '=' ( (lv_valExpr_3_0= ruleValExpr ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_varDecl_0_0 = null;

        EObject lv_varName_1_0 = null;

        EObject lv_valExpr_3_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5506:2: ( ( ( ( (lv_varDecl_0_0= ruleVarDecl ) ) | ( (lv_varName_1_0= ruleVarName ) ) ) otherlv_2= '=' ( (lv_valExpr_3_0= ruleValExpr ) ) ) )
            // InternalTorXakisDsl.g:5507:2: ( ( ( (lv_varDecl_0_0= ruleVarDecl ) ) | ( (lv_varName_1_0= ruleVarName ) ) ) otherlv_2= '=' ( (lv_valExpr_3_0= ruleValExpr ) ) )
            {
            // InternalTorXakisDsl.g:5507:2: ( ( ( (lv_varDecl_0_0= ruleVarDecl ) ) | ( (lv_varName_1_0= ruleVarName ) ) ) otherlv_2= '=' ( (lv_valExpr_3_0= ruleValExpr ) ) )
            // InternalTorXakisDsl.g:5508:3: ( ( (lv_varDecl_0_0= ruleVarDecl ) ) | ( (lv_varName_1_0= ruleVarName ) ) ) otherlv_2= '=' ( (lv_valExpr_3_0= ruleValExpr ) )
            {
            // InternalTorXakisDsl.g:5508:3: ( ( (lv_varDecl_0_0= ruleVarDecl ) ) | ( (lv_varName_1_0= ruleVarName ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_SMALLID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==21) ) {
                    alt58=1;
                }
                else if ( (LA58_1==73) ) {
                    alt58=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalTorXakisDsl.g:5509:4: ( (lv_varDecl_0_0= ruleVarDecl ) )
                    {
                    // InternalTorXakisDsl.g:5509:4: ( (lv_varDecl_0_0= ruleVarDecl ) )
                    // InternalTorXakisDsl.g:5510:5: (lv_varDecl_0_0= ruleVarDecl )
                    {
                    // InternalTorXakisDsl.g:5510:5: (lv_varDecl_0_0= ruleVarDecl )
                    // InternalTorXakisDsl.g:5511:6: lv_varDecl_0_0= ruleVarDecl
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getVarDeclVarDeclParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_varDecl_0_0=ruleVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"varDecl",
                    							lv_varDecl_0_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.VarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:5529:4: ( (lv_varName_1_0= ruleVarName ) )
                    {
                    // InternalTorXakisDsl.g:5529:4: ( (lv_varName_1_0= ruleVarName ) )
                    // InternalTorXakisDsl.g:5530:5: (lv_varName_1_0= ruleVarName )
                    {
                    // InternalTorXakisDsl.g:5530:5: (lv_varName_1_0= ruleVarName )
                    // InternalTorXakisDsl.g:5531:6: lv_varName_1_0= ruleVarName
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getVarNameVarNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_varName_1_0=ruleVarName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"varName",
                    							lv_varName_1_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.VarName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,73,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalTorXakisDsl.g:5553:3: ( (lv_valExpr_3_0= ruleValExpr ) )
            // InternalTorXakisDsl.g:5554:4: (lv_valExpr_3_0= ruleValExpr )
            {
            // InternalTorXakisDsl.g:5554:4: (lv_valExpr_3_0= ruleValExpr )
            // InternalTorXakisDsl.g:5555:5: lv_valExpr_3_0= ruleValExpr
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValExprValExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valExpr_3_0=ruleValExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"valExpr",
            						lv_valExpr_3_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVarDecl"
    // InternalTorXakisDsl.g:5576:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalTorXakisDsl.g:5576:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalTorXakisDsl.g:5577:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalTorXakisDsl.g:5583:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varName_0_0 = null;

        EObject lv_typeName_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5589:2: ( ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) ) )
            // InternalTorXakisDsl.g:5590:2: ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            {
            // InternalTorXakisDsl.g:5590:2: ( ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) ) )
            // InternalTorXakisDsl.g:5591:3: ( (lv_varName_0_0= ruleVarName ) ) otherlv_1= '::' ( (lv_typeName_2_0= ruleTypeName ) )
            {
            // InternalTorXakisDsl.g:5591:3: ( (lv_varName_0_0= ruleVarName ) )
            // InternalTorXakisDsl.g:5592:4: (lv_varName_0_0= ruleVarName )
            {
            // InternalTorXakisDsl.g:5592:4: (lv_varName_0_0= ruleVarName )
            // InternalTorXakisDsl.g:5593:5: lv_varName_0_0= ruleVarName
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getVarNameVarNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_varName_0_0=ruleVarName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.VarName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getColonColonKeyword_1());
            		
            // InternalTorXakisDsl.g:5614:3: ( (lv_typeName_2_0= ruleTypeName ) )
            // InternalTorXakisDsl.g:5615:4: (lv_typeName_2_0= ruleTypeName )
            {
            // InternalTorXakisDsl.g:5615:4: (lv_typeName_2_0= ruleTypeName )
            // InternalTorXakisDsl.g:5616:5: lv_typeName_2_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getTypeNameTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeName_2_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"nl.tno.torxakis.language.TorXakisDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleValExpr"
    // InternalTorXakisDsl.g:5637:1: entryRuleValExpr returns [EObject current=null] : iv_ruleValExpr= ruleValExpr EOF ;
    public final EObject entryRuleValExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExpr = null;


        try {
            // InternalTorXakisDsl.g:5637:48: (iv_ruleValExpr= ruleValExpr EOF )
            // InternalTorXakisDsl.g:5638:2: iv_ruleValExpr= ruleValExpr EOF
            {
             newCompositeNode(grammarAccess.getValExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExpr=ruleValExpr();

            state._fsp--;

             current =iv_ruleValExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExpr"


    // $ANTLR start "ruleValExpr"
    // InternalTorXakisDsl.g:5644:1: ruleValExpr returns [EObject current=null] : this_ValExpr1_0= ruleValExpr1 ;
    public final EObject ruleValExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ValExpr1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5650:2: (this_ValExpr1_0= ruleValExpr1 )
            // InternalTorXakisDsl.g:5651:2: this_ValExpr1_0= ruleValExpr1
            {

            		newCompositeNode(grammarAccess.getValExprAccess().getValExpr1ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ValExpr1_0=ruleValExpr1();

            state._fsp--;


            		current = this_ValExpr1_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleValExpr"


    // $ANTLR start "entryRuleValExpr1"
    // InternalTorXakisDsl.g:5662:1: entryRuleValExpr1 returns [EObject current=null] : iv_ruleValExpr1= ruleValExpr1 EOF ;
    public final EObject entryRuleValExpr1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExpr1 = null;


        try {
            // InternalTorXakisDsl.g:5662:49: (iv_ruleValExpr1= ruleValExpr1 EOF )
            // InternalTorXakisDsl.g:5663:2: iv_ruleValExpr1= ruleValExpr1 EOF
            {
             newCompositeNode(grammarAccess.getValExpr1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExpr1=ruleValExpr1();

            state._fsp--;

             current =iv_ruleValExpr1; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExpr1"


    // $ANTLR start "ruleValExpr1"
    // InternalTorXakisDsl.g:5669:1: ruleValExpr1 returns [EObject current=null] : ( (this_ValExpr2_0= ruleValExpr2 ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )* ) | this_ValExprLet_7= ruleValExprLet | this_ValExprIte_8= ruleValExprIte ) ;
    public final EObject ruleValExpr1() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_5=null;
        EObject this_ValExpr2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_typeName_6_0 = null;

        EObject this_ValExprLet_7 = null;

        EObject this_ValExprIte_8 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5675:2: ( ( (this_ValExpr2_0= ruleValExpr2 ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )* ) | this_ValExprLet_7= ruleValExprLet | this_ValExprIte_8= ruleValExprIte ) )
            // InternalTorXakisDsl.g:5676:2: ( (this_ValExpr2_0= ruleValExpr2 ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )* ) | this_ValExprLet_7= ruleValExprLet | this_ValExprIte_8= ruleValExprIte )
            {
            // InternalTorXakisDsl.g:5676:2: ( (this_ValExpr2_0= ruleValExpr2 ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )* ) | this_ValExprLet_7= ruleValExprLet | this_ValExprIte_8= ruleValExprIte )
            int alt60=3;
            switch ( input.LA(1) ) {
            case RULE_CAPSID:
            case RULE_SMALLID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_OPERATOR:
            case 19:
            case 74:
            case 79:
                {
                alt60=1;
                }
                break;
            case 65:
                {
                alt60=2;
                }
                break;
            case 75:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalTorXakisDsl.g:5677:3: (this_ValExpr2_0= ruleValExpr2 ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )* )
                    {
                    // InternalTorXakisDsl.g:5677:3: (this_ValExpr2_0= ruleValExpr2 ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )* )
                    // InternalTorXakisDsl.g:5678:4: this_ValExpr2_0= ruleValExpr2 ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )*
                    {

                    				newCompositeNode(grammarAccess.getValExpr1Access().getValExpr2ParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_64);
                    this_ValExpr2_0=ruleValExpr2();

                    state._fsp--;


                    				current = this_ValExpr2_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalTorXakisDsl.g:5686:4: ( ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) ) | ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) ) )*
                    loop59:
                    do {
                        int alt59=3;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_OPERATOR) ) {
                            alt59=1;
                        }
                        else if ( (LA59_0==21) ) {
                            alt59=2;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalTorXakisDsl.g:5687:5: ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) )
                    	    {
                    	    // InternalTorXakisDsl.g:5687:5: ( () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) ) )
                    	    // InternalTorXakisDsl.g:5688:6: () ( (lv_operator_2_0= RULE_OPERATOR ) ) ( (lv_right_3_0= ruleValExpr2 ) )
                    	    {
                    	    // InternalTorXakisDsl.g:5688:6: ()
                    	    // InternalTorXakisDsl.g:5689:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getValExpr1Access().getValExprOperatorLeftAction_0_1_0_0(),
                    	    								current);
                    	    						

                    	    }

                    	    // InternalTorXakisDsl.g:5695:6: ( (lv_operator_2_0= RULE_OPERATOR ) )
                    	    // InternalTorXakisDsl.g:5696:7: (lv_operator_2_0= RULE_OPERATOR )
                    	    {
                    	    // InternalTorXakisDsl.g:5696:7: (lv_operator_2_0= RULE_OPERATOR )
                    	    // InternalTorXakisDsl.g:5697:8: lv_operator_2_0= RULE_OPERATOR
                    	    {
                    	    lv_operator_2_0=(Token)match(input,RULE_OPERATOR,FOLLOW_65); 

                    	    								newLeafNode(lv_operator_2_0, grammarAccess.getValExpr1Access().getOperatorOPERATORTerminalRuleCall_0_1_0_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getValExpr1Rule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"operator",
                    	    									lv_operator_2_0,
                    	    									"nl.tno.torxakis.language.TorXakisDsl.OPERATOR");
                    	    							

                    	    }


                    	    }

                    	    // InternalTorXakisDsl.g:5713:6: ( (lv_right_3_0= ruleValExpr2 ) )
                    	    // InternalTorXakisDsl.g:5714:7: (lv_right_3_0= ruleValExpr2 )
                    	    {
                    	    // InternalTorXakisDsl.g:5714:7: (lv_right_3_0= ruleValExpr2 )
                    	    // InternalTorXakisDsl.g:5715:8: lv_right_3_0= ruleValExpr2
                    	    {

                    	    								newCompositeNode(grammarAccess.getValExpr1Access().getRightValExpr2ParserRuleCall_0_1_0_2_0());
                    	    							
                    	    pushFollow(FOLLOW_64);
                    	    lv_right_3_0=ruleValExpr2();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getValExpr1Rule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"right",
                    	    									lv_right_3_0,
                    	    									"nl.tno.torxakis.language.TorXakisDsl.ValExpr2");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTorXakisDsl.g:5734:5: ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) )
                    	    {
                    	    // InternalTorXakisDsl.g:5734:5: ( () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) ) )
                    	    // InternalTorXakisDsl.g:5735:6: () otherlv_5= '::' ( (lv_typeName_6_0= ruleTypeName ) )
                    	    {
                    	    // InternalTorXakisDsl.g:5735:6: ()
                    	    // InternalTorXakisDsl.g:5736:7: 
                    	    {

                    	    							current = forceCreateModelElementAndSet(
                    	    								grammarAccess.getValExpr1Access().getValExprTestLeftAction_0_1_1_0(),
                    	    								current);
                    	    						

                    	    }

                    	    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getValExpr1Access().getColonColonKeyword_0_1_1_1());
                    	    					
                    	    // InternalTorXakisDsl.g:5746:6: ( (lv_typeName_6_0= ruleTypeName ) )
                    	    // InternalTorXakisDsl.g:5747:7: (lv_typeName_6_0= ruleTypeName )
                    	    {
                    	    // InternalTorXakisDsl.g:5747:7: (lv_typeName_6_0= ruleTypeName )
                    	    // InternalTorXakisDsl.g:5748:8: lv_typeName_6_0= ruleTypeName
                    	    {

                    	    								newCompositeNode(grammarAccess.getValExpr1Access().getTypeNameTypeNameParserRuleCall_0_1_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_64);
                    	    lv_typeName_6_0=ruleTypeName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getValExpr1Rule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"typeName",
                    	    									lv_typeName_6_0,
                    	    									"nl.tno.torxakis.language.TorXakisDsl.TypeName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:5769:3: this_ValExprLet_7= ruleValExprLet
                    {

                    			newCompositeNode(grammarAccess.getValExpr1Access().getValExprLetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprLet_7=ruleValExprLet();

                    state._fsp--;


                    			current = this_ValExprLet_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTorXakisDsl.g:5778:3: this_ValExprIte_8= ruleValExprIte
                    {

                    			newCompositeNode(grammarAccess.getValExpr1Access().getValExprIteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprIte_8=ruleValExprIte();

                    state._fsp--;


                    			current = this_ValExprIte_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleValExpr1"


    // $ANTLR start "entryRuleValExpr2"
    // InternalTorXakisDsl.g:5790:1: entryRuleValExpr2 returns [EObject current=null] : iv_ruleValExpr2= ruleValExpr2 EOF ;
    public final EObject entryRuleValExpr2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExpr2 = null;


        try {
            // InternalTorXakisDsl.g:5790:49: (iv_ruleValExpr2= ruleValExpr2 EOF )
            // InternalTorXakisDsl.g:5791:2: iv_ruleValExpr2= ruleValExpr2 EOF
            {
             newCompositeNode(grammarAccess.getValExpr2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExpr2=ruleValExpr2();

            state._fsp--;

             current =iv_ruleValExpr2; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExpr2"


    // $ANTLR start "ruleValExpr2"
    // InternalTorXakisDsl.g:5797:1: ruleValExpr2 returns [EObject current=null] : (this_SmallIdName_0= ruleSmallIdName | this_ValExprUnaryOperator_1= ruleValExprUnaryOperator | this_ValExprFunctionCall_2= ruleValExprFunctionCall | this_ValExprContructorCall_3= ruleValExprContructorCall | this_ValExprInteger_4= ruleValExprInteger | this_ValExprString_5= ruleValExprString | this_ValExprRegex_6= ruleValExprRegex | this_ValExprBracket_7= ruleValExprBracket | this_ValExprError_8= ruleValExprError ) ;
    public final EObject ruleValExpr2() throws RecognitionException {
        EObject current = null;

        EObject this_SmallIdName_0 = null;

        EObject this_ValExprUnaryOperator_1 = null;

        EObject this_ValExprFunctionCall_2 = null;

        EObject this_ValExprContructorCall_3 = null;

        EObject this_ValExprInteger_4 = null;

        EObject this_ValExprString_5 = null;

        EObject this_ValExprRegex_6 = null;

        EObject this_ValExprBracket_7 = null;

        EObject this_ValExprError_8 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5803:2: ( (this_SmallIdName_0= ruleSmallIdName | this_ValExprUnaryOperator_1= ruleValExprUnaryOperator | this_ValExprFunctionCall_2= ruleValExprFunctionCall | this_ValExprContructorCall_3= ruleValExprContructorCall | this_ValExprInteger_4= ruleValExprInteger | this_ValExprString_5= ruleValExprString | this_ValExprRegex_6= ruleValExprRegex | this_ValExprBracket_7= ruleValExprBracket | this_ValExprError_8= ruleValExprError ) )
            // InternalTorXakisDsl.g:5804:2: (this_SmallIdName_0= ruleSmallIdName | this_ValExprUnaryOperator_1= ruleValExprUnaryOperator | this_ValExprFunctionCall_2= ruleValExprFunctionCall | this_ValExprContructorCall_3= ruleValExprContructorCall | this_ValExprInteger_4= ruleValExprInteger | this_ValExprString_5= ruleValExprString | this_ValExprRegex_6= ruleValExprRegex | this_ValExprBracket_7= ruleValExprBracket | this_ValExprError_8= ruleValExprError )
            {
            // InternalTorXakisDsl.g:5804:2: (this_SmallIdName_0= ruleSmallIdName | this_ValExprUnaryOperator_1= ruleValExprUnaryOperator | this_ValExprFunctionCall_2= ruleValExprFunctionCall | this_ValExprContructorCall_3= ruleValExprContructorCall | this_ValExprInteger_4= ruleValExprInteger | this_ValExprString_5= ruleValExprString | this_ValExprRegex_6= ruleValExprRegex | this_ValExprBracket_7= ruleValExprBracket | this_ValExprError_8= ruleValExprError )
            int alt61=9;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalTorXakisDsl.g:5805:3: this_SmallIdName_0= ruleSmallIdName
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getSmallIdNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SmallIdName_0=ruleSmallIdName();

                    state._fsp--;


                    			current = this_SmallIdName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:5814:3: this_ValExprUnaryOperator_1= ruleValExprUnaryOperator
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprUnaryOperatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprUnaryOperator_1=ruleValExprUnaryOperator();

                    state._fsp--;


                    			current = this_ValExprUnaryOperator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTorXakisDsl.g:5823:3: this_ValExprFunctionCall_2= ruleValExprFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprFunctionCall_2=ruleValExprFunctionCall();

                    state._fsp--;


                    			current = this_ValExprFunctionCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTorXakisDsl.g:5832:3: this_ValExprContructorCall_3= ruleValExprContructorCall
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprContructorCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprContructorCall_3=ruleValExprContructorCall();

                    state._fsp--;


                    			current = this_ValExprContructorCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTorXakisDsl.g:5841:3: this_ValExprInteger_4= ruleValExprInteger
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprIntegerParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprInteger_4=ruleValExprInteger();

                    state._fsp--;


                    			current = this_ValExprInteger_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTorXakisDsl.g:5850:3: this_ValExprString_5= ruleValExprString
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprStringParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprString_5=ruleValExprString();

                    state._fsp--;


                    			current = this_ValExprString_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTorXakisDsl.g:5859:3: this_ValExprRegex_6= ruleValExprRegex
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprRegexParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprRegex_6=ruleValExprRegex();

                    state._fsp--;


                    			current = this_ValExprRegex_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTorXakisDsl.g:5868:3: this_ValExprBracket_7= ruleValExprBracket
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprBracketParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprBracket_7=ruleValExprBracket();

                    state._fsp--;


                    			current = this_ValExprBracket_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTorXakisDsl.g:5877:3: this_ValExprError_8= ruleValExprError
                    {

                    			newCompositeNode(grammarAccess.getValExpr2Access().getValExprErrorParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValExprError_8=ruleValExprError();

                    state._fsp--;


                    			current = this_ValExprError_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleValExpr2"


    // $ANTLR start "entryRuleValExprUnaryOperator"
    // InternalTorXakisDsl.g:5889:1: entryRuleValExprUnaryOperator returns [EObject current=null] : iv_ruleValExprUnaryOperator= ruleValExprUnaryOperator EOF ;
    public final EObject entryRuleValExprUnaryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprUnaryOperator = null;


        try {
            // InternalTorXakisDsl.g:5889:61: (iv_ruleValExprUnaryOperator= ruleValExprUnaryOperator EOF )
            // InternalTorXakisDsl.g:5890:2: iv_ruleValExprUnaryOperator= ruleValExprUnaryOperator EOF
            {
             newCompositeNode(grammarAccess.getValExprUnaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprUnaryOperator=ruleValExprUnaryOperator();

            state._fsp--;

             current =iv_ruleValExprUnaryOperator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprUnaryOperator"


    // $ANTLR start "ruleValExprUnaryOperator"
    // InternalTorXakisDsl.g:5896:1: ruleValExprUnaryOperator returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_valExpr_1_0= ruleValExpr2 ) ) ) ;
    public final EObject ruleValExprUnaryOperator() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        EObject lv_valExpr_1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:5902:2: ( ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_valExpr_1_0= ruleValExpr2 ) ) ) )
            // InternalTorXakisDsl.g:5903:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_valExpr_1_0= ruleValExpr2 ) ) )
            {
            // InternalTorXakisDsl.g:5903:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_valExpr_1_0= ruleValExpr2 ) ) )
            // InternalTorXakisDsl.g:5904:3: ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_valExpr_1_0= ruleValExpr2 ) )
            {
            // InternalTorXakisDsl.g:5904:3: ( (lv_operator_0_0= RULE_OPERATOR ) )
            // InternalTorXakisDsl.g:5905:4: (lv_operator_0_0= RULE_OPERATOR )
            {
            // InternalTorXakisDsl.g:5905:4: (lv_operator_0_0= RULE_OPERATOR )
            // InternalTorXakisDsl.g:5906:5: lv_operator_0_0= RULE_OPERATOR
            {
            lv_operator_0_0=(Token)match(input,RULE_OPERATOR,FOLLOW_65); 

            					newLeafNode(lv_operator_0_0, grammarAccess.getValExprUnaryOperatorAccess().getOperatorOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValExprUnaryOperatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.OPERATOR");
            				

            }


            }

            // InternalTorXakisDsl.g:5922:3: ( (lv_valExpr_1_0= ruleValExpr2 ) )
            // InternalTorXakisDsl.g:5923:4: (lv_valExpr_1_0= ruleValExpr2 )
            {
            // InternalTorXakisDsl.g:5923:4: (lv_valExpr_1_0= ruleValExpr2 )
            // InternalTorXakisDsl.g:5924:5: lv_valExpr_1_0= ruleValExpr2
            {

            					newCompositeNode(grammarAccess.getValExprUnaryOperatorAccess().getValExprValExpr2ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_valExpr_1_0=ruleValExpr2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprUnaryOperatorRule());
            					}
            					set(
            						current,
            						"valExpr",
            						lv_valExpr_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr2");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleValExprUnaryOperator"


    // $ANTLR start "entryRuleSmallIdName"
    // InternalTorXakisDsl.g:5945:1: entryRuleSmallIdName returns [EObject current=null] : iv_ruleSmallIdName= ruleSmallIdName EOF ;
    public final EObject entryRuleSmallIdName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallIdName = null;


        try {
            // InternalTorXakisDsl.g:5945:52: (iv_ruleSmallIdName= ruleSmallIdName EOF )
            // InternalTorXakisDsl.g:5946:2: iv_ruleSmallIdName= ruleSmallIdName EOF
            {
             newCompositeNode(grammarAccess.getSmallIdNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmallIdName=ruleSmallIdName();

            state._fsp--;

             current =iv_ruleSmallIdName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSmallIdName"


    // $ANTLR start "ruleSmallIdName"
    // InternalTorXakisDsl.g:5952:1: ruleSmallIdName returns [EObject current=null] : ( (lv_name_0_0= RULE_SMALLID ) ) ;
    public final EObject ruleSmallIdName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:5958:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) )
            // InternalTorXakisDsl.g:5959:2: ( (lv_name_0_0= RULE_SMALLID ) )
            {
            // InternalTorXakisDsl.g:5959:2: ( (lv_name_0_0= RULE_SMALLID ) )
            // InternalTorXakisDsl.g:5960:3: (lv_name_0_0= RULE_SMALLID )
            {
            // InternalTorXakisDsl.g:5960:3: (lv_name_0_0= RULE_SMALLID )
            // InternalTorXakisDsl.g:5961:4: lv_name_0_0= RULE_SMALLID
            {
            lv_name_0_0=(Token)match(input,RULE_SMALLID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSmallIdNameAccess().getNameSMALLIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSmallIdNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.SMALLID");
            			

            }


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
    // $ANTLR end "ruleSmallIdName"


    // $ANTLR start "entryRuleValExprError"
    // InternalTorXakisDsl.g:5980:1: entryRuleValExprError returns [EObject current=null] : iv_ruleValExprError= ruleValExprError EOF ;
    public final EObject entryRuleValExprError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprError = null;


        try {
            // InternalTorXakisDsl.g:5980:53: (iv_ruleValExprError= ruleValExprError EOF )
            // InternalTorXakisDsl.g:5981:2: iv_ruleValExprError= ruleValExprError EOF
            {
             newCompositeNode(grammarAccess.getValExprErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprError=ruleValExprError();

            state._fsp--;

             current =iv_ruleValExprError; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprError"


    // $ANTLR start "ruleValExprError"
    // InternalTorXakisDsl.g:5987:1: ruleValExprError returns [EObject current=null] : (otherlv_0= 'ERROR' ( (lv_error_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleValExprError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_error_1_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:5993:2: ( (otherlv_0= 'ERROR' ( (lv_error_1_0= RULE_STRING ) ) ) )
            // InternalTorXakisDsl.g:5994:2: (otherlv_0= 'ERROR' ( (lv_error_1_0= RULE_STRING ) ) )
            {
            // InternalTorXakisDsl.g:5994:2: (otherlv_0= 'ERROR' ( (lv_error_1_0= RULE_STRING ) ) )
            // InternalTorXakisDsl.g:5995:3: otherlv_0= 'ERROR' ( (lv_error_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getValExprErrorAccess().getERRORKeyword_0());
            		
            // InternalTorXakisDsl.g:5999:3: ( (lv_error_1_0= RULE_STRING ) )
            // InternalTorXakisDsl.g:6000:4: (lv_error_1_0= RULE_STRING )
            {
            // InternalTorXakisDsl.g:6000:4: (lv_error_1_0= RULE_STRING )
            // InternalTorXakisDsl.g:6001:5: lv_error_1_0= RULE_STRING
            {
            lv_error_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_error_1_0, grammarAccess.getValExprErrorAccess().getErrorSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValExprErrorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"error",
            						lv_error_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleValExprError"


    // $ANTLR start "entryRuleValExprIte"
    // InternalTorXakisDsl.g:6021:1: entryRuleValExprIte returns [EObject current=null] : iv_ruleValExprIte= ruleValExprIte EOF ;
    public final EObject entryRuleValExprIte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprIte = null;


        try {
            // InternalTorXakisDsl.g:6021:51: (iv_ruleValExprIte= ruleValExprIte EOF )
            // InternalTorXakisDsl.g:6022:2: iv_ruleValExprIte= ruleValExprIte EOF
            {
             newCompositeNode(grammarAccess.getValExprIteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprIte=ruleValExprIte();

            state._fsp--;

             current =iv_ruleValExprIte; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprIte"


    // $ANTLR start "ruleValExprIte"
    // InternalTorXakisDsl.g:6028:1: ruleValExprIte returns [EObject current=null] : (otherlv_0= 'IF' ( (lv_conditionValExpr_1_0= ruleValExpr1 ) ) otherlv_2= 'THEN' ( (lv_thenValExpr_3_0= ruleValExpr1 ) ) otherlv_4= 'ELSE' ( (lv_elseValExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'FI' ) ;
    public final EObject ruleValExprIte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_conditionValExpr_1_0 = null;

        EObject lv_thenValExpr_3_0 = null;

        EObject lv_elseValExpr_5_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:6034:2: ( (otherlv_0= 'IF' ( (lv_conditionValExpr_1_0= ruleValExpr1 ) ) otherlv_2= 'THEN' ( (lv_thenValExpr_3_0= ruleValExpr1 ) ) otherlv_4= 'ELSE' ( (lv_elseValExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'FI' ) )
            // InternalTorXakisDsl.g:6035:2: (otherlv_0= 'IF' ( (lv_conditionValExpr_1_0= ruleValExpr1 ) ) otherlv_2= 'THEN' ( (lv_thenValExpr_3_0= ruleValExpr1 ) ) otherlv_4= 'ELSE' ( (lv_elseValExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'FI' )
            {
            // InternalTorXakisDsl.g:6035:2: (otherlv_0= 'IF' ( (lv_conditionValExpr_1_0= ruleValExpr1 ) ) otherlv_2= 'THEN' ( (lv_thenValExpr_3_0= ruleValExpr1 ) ) otherlv_4= 'ELSE' ( (lv_elseValExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'FI' )
            // InternalTorXakisDsl.g:6036:3: otherlv_0= 'IF' ( (lv_conditionValExpr_1_0= ruleValExpr1 ) ) otherlv_2= 'THEN' ( (lv_thenValExpr_3_0= ruleValExpr1 ) ) otherlv_4= 'ELSE' ( (lv_elseValExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'FI'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getValExprIteAccess().getIFKeyword_0());
            		
            // InternalTorXakisDsl.g:6040:3: ( (lv_conditionValExpr_1_0= ruleValExpr1 ) )
            // InternalTorXakisDsl.g:6041:4: (lv_conditionValExpr_1_0= ruleValExpr1 )
            {
            // InternalTorXakisDsl.g:6041:4: (lv_conditionValExpr_1_0= ruleValExpr1 )
            // InternalTorXakisDsl.g:6042:5: lv_conditionValExpr_1_0= ruleValExpr1
            {

            					newCompositeNode(grammarAccess.getValExprIteAccess().getConditionValExprValExpr1ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
            lv_conditionValExpr_1_0=ruleValExpr1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprIteRule());
            					}
            					set(
            						current,
            						"conditionValExpr",
            						lv_conditionValExpr_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getValExprIteAccess().getTHENKeyword_2());
            		
            // InternalTorXakisDsl.g:6063:3: ( (lv_thenValExpr_3_0= ruleValExpr1 ) )
            // InternalTorXakisDsl.g:6064:4: (lv_thenValExpr_3_0= ruleValExpr1 )
            {
            // InternalTorXakisDsl.g:6064:4: (lv_thenValExpr_3_0= ruleValExpr1 )
            // InternalTorXakisDsl.g:6065:5: lv_thenValExpr_3_0= ruleValExpr1
            {

            					newCompositeNode(grammarAccess.getValExprIteAccess().getThenValExprValExpr1ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_67);
            lv_thenValExpr_3_0=ruleValExpr1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprIteRule());
            					}
            					set(
            						current,
            						"thenValExpr",
            						lv_thenValExpr_3_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,77,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getValExprIteAccess().getELSEKeyword_4());
            		
            // InternalTorXakisDsl.g:6086:3: ( (lv_elseValExpr_5_0= ruleValExpr1 ) )
            // InternalTorXakisDsl.g:6087:4: (lv_elseValExpr_5_0= ruleValExpr1 )
            {
            // InternalTorXakisDsl.g:6087:4: (lv_elseValExpr_5_0= ruleValExpr1 )
            // InternalTorXakisDsl.g:6088:5: lv_elseValExpr_5_0= ruleValExpr1
            {

            					newCompositeNode(grammarAccess.getValExprIteAccess().getElseValExprValExpr1ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_68);
            lv_elseValExpr_5_0=ruleValExpr1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprIteRule());
            					}
            					set(
            						current,
            						"elseValExpr",
            						lv_elseValExpr_5_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,78,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValExprIteAccess().getFIKeyword_6());
            		

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
    // $ANTLR end "ruleValExprIte"


    // $ANTLR start "entryRuleValExprLet"
    // InternalTorXakisDsl.g:6113:1: entryRuleValExprLet returns [EObject current=null] : iv_ruleValExprLet= ruleValExprLet EOF ;
    public final EObject entryRuleValExprLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprLet = null;


        try {
            // InternalTorXakisDsl.g:6113:51: (iv_ruleValExprLet= ruleValExprLet EOF )
            // InternalTorXakisDsl.g:6114:2: iv_ruleValExprLet= ruleValExprLet EOF
            {
             newCompositeNode(grammarAccess.getValExprLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprLet=ruleValExprLet();

            state._fsp--;

             current =iv_ruleValExprLet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprLet"


    // $ANTLR start "ruleValExprLet"
    // InternalTorXakisDsl.g:6120:1: ruleValExprLet returns [EObject current=null] : (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_valExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'NI' ) ;
    public final EObject ruleValExprLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_assignments_1_0 = null;

        EObject lv_assignments_3_0 = null;

        EObject lv_valExpr_5_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:6126:2: ( (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_valExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'NI' ) )
            // InternalTorXakisDsl.g:6127:2: (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_valExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'NI' )
            {
            // InternalTorXakisDsl.g:6127:2: (otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_valExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'NI' )
            // InternalTorXakisDsl.g:6128:3: otherlv_0= 'LET' ( (lv_assignments_1_0= ruleAssignment ) ) (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )* otherlv_4= 'IN' ( (lv_valExpr_5_0= ruleValExpr1 ) ) otherlv_6= 'NI'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getValExprLetAccess().getLETKeyword_0());
            		
            // InternalTorXakisDsl.g:6132:3: ( (lv_assignments_1_0= ruleAssignment ) )
            // InternalTorXakisDsl.g:6133:4: (lv_assignments_1_0= ruleAssignment )
            {
            // InternalTorXakisDsl.g:6133:4: (lv_assignments_1_0= ruleAssignment )
            // InternalTorXakisDsl.g:6134:5: lv_assignments_1_0= ruleAssignment
            {

            					newCompositeNode(grammarAccess.getValExprLetAccess().getAssignmentsAssignmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_56);
            lv_assignments_1_0=ruleAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprLetRule());
            					}
            					add(
            						current,
            						"assignments",
            						lv_assignments_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.Assignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:6151:3: (otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==15) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalTorXakisDsl.g:6152:4: otherlv_2= ';' ( (lv_assignments_3_0= ruleAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getValExprLetAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalTorXakisDsl.g:6156:4: ( (lv_assignments_3_0= ruleAssignment ) )
            	    // InternalTorXakisDsl.g:6157:5: (lv_assignments_3_0= ruleAssignment )
            	    {
            	    // InternalTorXakisDsl.g:6157:5: (lv_assignments_3_0= ruleAssignment )
            	    // InternalTorXakisDsl.g:6158:6: lv_assignments_3_0= ruleAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getValExprLetAccess().getAssignmentsAssignmentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_assignments_3_0=ruleAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getValExprLetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assignments",
            	    							lv_assignments_3_0,
            	    							"nl.tno.torxakis.language.TorXakisDsl.Assignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getValExprLetAccess().getINKeyword_3());
            		
            // InternalTorXakisDsl.g:6180:3: ( (lv_valExpr_5_0= ruleValExpr1 ) )
            // InternalTorXakisDsl.g:6181:4: (lv_valExpr_5_0= ruleValExpr1 )
            {
            // InternalTorXakisDsl.g:6181:4: (lv_valExpr_5_0= ruleValExpr1 )
            // InternalTorXakisDsl.g:6182:5: lv_valExpr_5_0= ruleValExpr1
            {

            					newCompositeNode(grammarAccess.getValExprLetAccess().getValExprValExpr1ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_52);
            lv_valExpr_5_0=ruleValExpr1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprLetRule());
            					}
            					set(
            						current,
            						"valExpr",
            						lv_valExpr_5_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValExprLetAccess().getNIKeyword_5());
            		

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
    // $ANTLR end "ruleValExprLet"


    // $ANTLR start "entryRuleValExprBracket"
    // InternalTorXakisDsl.g:6207:1: entryRuleValExprBracket returns [EObject current=null] : iv_ruleValExprBracket= ruleValExprBracket EOF ;
    public final EObject entryRuleValExprBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprBracket = null;


        try {
            // InternalTorXakisDsl.g:6207:55: (iv_ruleValExprBracket= ruleValExprBracket EOF )
            // InternalTorXakisDsl.g:6208:2: iv_ruleValExprBracket= ruleValExprBracket EOF
            {
             newCompositeNode(grammarAccess.getValExprBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprBracket=ruleValExprBracket();

            state._fsp--;

             current =iv_ruleValExprBracket; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprBracket"


    // $ANTLR start "ruleValExprBracket"
    // InternalTorXakisDsl.g:6214:1: ruleValExprBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_valExpr_1_0= ruleValExpr ) ) otherlv_2= ')' ) ;
    public final EObject ruleValExprBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_valExpr_1_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:6220:2: ( (otherlv_0= '(' ( (lv_valExpr_1_0= ruleValExpr ) ) otherlv_2= ')' ) )
            // InternalTorXakisDsl.g:6221:2: (otherlv_0= '(' ( (lv_valExpr_1_0= ruleValExpr ) ) otherlv_2= ')' )
            {
            // InternalTorXakisDsl.g:6221:2: (otherlv_0= '(' ( (lv_valExpr_1_0= ruleValExpr ) ) otherlv_2= ')' )
            // InternalTorXakisDsl.g:6222:3: otherlv_0= '(' ( (lv_valExpr_1_0= ruleValExpr ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getValExprBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTorXakisDsl.g:6226:3: ( (lv_valExpr_1_0= ruleValExpr ) )
            // InternalTorXakisDsl.g:6227:4: (lv_valExpr_1_0= ruleValExpr )
            {
            // InternalTorXakisDsl.g:6227:4: (lv_valExpr_1_0= ruleValExpr )
            // InternalTorXakisDsl.g:6228:5: lv_valExpr_1_0= ruleValExpr
            {

            					newCompositeNode(grammarAccess.getValExprBracketAccess().getValExprValExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_valExpr_1_0=ruleValExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprBracketRule());
            					}
            					set(
            						current,
            						"valExpr",
            						lv_valExpr_1_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ValExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getValExprBracketAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleValExprBracket"


    // $ANTLR start "entryRuleValExprRegex"
    // InternalTorXakisDsl.g:6253:1: entryRuleValExprRegex returns [EObject current=null] : iv_ruleValExprRegex= ruleValExprRegex EOF ;
    public final EObject entryRuleValExprRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprRegex = null;


        try {
            // InternalTorXakisDsl.g:6253:53: (iv_ruleValExprRegex= ruleValExprRegex EOF )
            // InternalTorXakisDsl.g:6254:2: iv_ruleValExprRegex= ruleValExprRegex EOF
            {
             newCompositeNode(grammarAccess.getValExprRegexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprRegex=ruleValExprRegex();

            state._fsp--;

             current =iv_ruleValExprRegex; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprRegex"


    // $ANTLR start "ruleValExprRegex"
    // InternalTorXakisDsl.g:6260:1: ruleValExprRegex returns [EObject current=null] : (otherlv_0= 'REGEX' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleValExprRegex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_regex_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:6266:2: ( (otherlv_0= 'REGEX' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalTorXakisDsl.g:6267:2: (otherlv_0= 'REGEX' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalTorXakisDsl.g:6267:2: (otherlv_0= 'REGEX' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalTorXakisDsl.g:6268:3: otherlv_0= 'REGEX' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getValExprRegexAccess().getREGEXKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getValExprRegexAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTorXakisDsl.g:6276:3: ( (lv_regex_2_0= RULE_STRING ) )
            // InternalTorXakisDsl.g:6277:4: (lv_regex_2_0= RULE_STRING )
            {
            // InternalTorXakisDsl.g:6277:4: (lv_regex_2_0= RULE_STRING )
            // InternalTorXakisDsl.g:6278:5: lv_regex_2_0= RULE_STRING
            {
            lv_regex_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_regex_2_0, grammarAccess.getValExprRegexAccess().getRegexSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValExprRegexRule());
            					}
            					setWithLastConsumed(
            						current,
            						"regex",
            						lv_regex_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getValExprRegexAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleValExprRegex"


    // $ANTLR start "entryRuleValExprString"
    // InternalTorXakisDsl.g:6302:1: entryRuleValExprString returns [EObject current=null] : iv_ruleValExprString= ruleValExprString EOF ;
    public final EObject entryRuleValExprString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprString = null;


        try {
            // InternalTorXakisDsl.g:6302:54: (iv_ruleValExprString= ruleValExprString EOF )
            // InternalTorXakisDsl.g:6303:2: iv_ruleValExprString= ruleValExprString EOF
            {
             newCompositeNode(grammarAccess.getValExprStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprString=ruleValExprString();

            state._fsp--;

             current =iv_ruleValExprString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprString"


    // $ANTLR start "ruleValExprString"
    // InternalTorXakisDsl.g:6309:1: ruleValExprString returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleValExprString() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:6315:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalTorXakisDsl.g:6316:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalTorXakisDsl.g:6316:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalTorXakisDsl.g:6317:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalTorXakisDsl.g:6317:3: (lv_name_0_0= RULE_STRING )
            // InternalTorXakisDsl.g:6318:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getValExprStringAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getValExprStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleValExprString"


    // $ANTLR start "entryRuleValExprInteger"
    // InternalTorXakisDsl.g:6337:1: entryRuleValExprInteger returns [EObject current=null] : iv_ruleValExprInteger= ruleValExprInteger EOF ;
    public final EObject entryRuleValExprInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprInteger = null;


        try {
            // InternalTorXakisDsl.g:6337:55: (iv_ruleValExprInteger= ruleValExprInteger EOF )
            // InternalTorXakisDsl.g:6338:2: iv_ruleValExprInteger= ruleValExprInteger EOF
            {
             newCompositeNode(grammarAccess.getValExprIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprInteger=ruleValExprInteger();

            state._fsp--;

             current =iv_ruleValExprInteger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprInteger"


    // $ANTLR start "ruleValExprInteger"
    // InternalTorXakisDsl.g:6344:1: ruleValExprInteger returns [EObject current=null] : ( (lv_name_0_0= ruleBIG_INT ) ) ;
    public final EObject ruleValExprInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:6350:2: ( ( (lv_name_0_0= ruleBIG_INT ) ) )
            // InternalTorXakisDsl.g:6351:2: ( (lv_name_0_0= ruleBIG_INT ) )
            {
            // InternalTorXakisDsl.g:6351:2: ( (lv_name_0_0= ruleBIG_INT ) )
            // InternalTorXakisDsl.g:6352:3: (lv_name_0_0= ruleBIG_INT )
            {
            // InternalTorXakisDsl.g:6352:3: (lv_name_0_0= ruleBIG_INT )
            // InternalTorXakisDsl.g:6353:4: lv_name_0_0= ruleBIG_INT
            {

            				newCompositeNode(grammarAccess.getValExprIntegerAccess().getNameBIG_INTParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleBIG_INT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getValExprIntegerRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.BIG_INT");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // $ANTLR end "ruleValExprInteger"


    // $ANTLR start "entryRuleValExprContructorCall"
    // InternalTorXakisDsl.g:6373:1: entryRuleValExprContructorCall returns [EObject current=null] : iv_ruleValExprContructorCall= ruleValExprContructorCall EOF ;
    public final EObject entryRuleValExprContructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprContructorCall = null;


        try {
            // InternalTorXakisDsl.g:6373:62: (iv_ruleValExprContructorCall= ruleValExprContructorCall EOF )
            // InternalTorXakisDsl.g:6374:2: iv_ruleValExprContructorCall= ruleValExprContructorCall EOF
            {
             newCompositeNode(grammarAccess.getValExprContructorCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprContructorCall=ruleValExprContructorCall();

            state._fsp--;

             current =iv_ruleValExprContructorCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprContructorCall"


    // $ANTLR start "ruleValExprContructorCall"
    // InternalTorXakisDsl.g:6380:1: ruleValExprContructorCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleValExprContructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_neValExprList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:6386:2: ( ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) ) otherlv_3= ')' )? ) )
            // InternalTorXakisDsl.g:6387:2: ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) ) otherlv_3= ')' )? )
            {
            // InternalTorXakisDsl.g:6387:2: ( ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) ) otherlv_3= ')' )? )
            // InternalTorXakisDsl.g:6388:3: ( (lv_name_0_0= ruleConstructorName ) ) (otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) ) otherlv_3= ')' )?
            {
            // InternalTorXakisDsl.g:6388:3: ( (lv_name_0_0= ruleConstructorName ) )
            // InternalTorXakisDsl.g:6389:4: (lv_name_0_0= ruleConstructorName )
            {
            // InternalTorXakisDsl.g:6389:4: (lv_name_0_0= ruleConstructorName )
            // InternalTorXakisDsl.g:6390:5: lv_name_0_0= ruleConstructorName
            {

            					newCompositeNode(grammarAccess.getValExprContructorCallAccess().getNameConstructorNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_69);
            lv_name_0_0=ruleConstructorName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprContructorCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.ConstructorName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTorXakisDsl.g:6407:3: (otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) ) otherlv_3= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==19) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTorXakisDsl.g:6408:4: otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getValExprContructorCallAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTorXakisDsl.g:6412:4: ( (lv_neValExprList_2_0= ruleNeValExprList ) )
                    // InternalTorXakisDsl.g:6413:5: (lv_neValExprList_2_0= ruleNeValExprList )
                    {
                    // InternalTorXakisDsl.g:6413:5: (lv_neValExprList_2_0= ruleNeValExprList )
                    // InternalTorXakisDsl.g:6414:6: lv_neValExprList_2_0= ruleNeValExprList
                    {

                    						newCompositeNode(grammarAccess.getValExprContructorCallAccess().getNeValExprListNeValExprListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_neValExprList_2_0=ruleNeValExprList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValExprContructorCallRule());
                    						}
                    						set(
                    							current,
                    							"neValExprList",
                    							lv_neValExprList_2_0,
                    							"nl.tno.torxakis.language.TorXakisDsl.NeValExprList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getValExprContructorCallAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleValExprContructorCall"


    // $ANTLR start "entryRuleValExprFunctionCall"
    // InternalTorXakisDsl.g:6440:1: entryRuleValExprFunctionCall returns [EObject current=null] : iv_ruleValExprFunctionCall= ruleValExprFunctionCall EOF ;
    public final EObject entryRuleValExprFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValExprFunctionCall = null;


        try {
            // InternalTorXakisDsl.g:6440:60: (iv_ruleValExprFunctionCall= ruleValExprFunctionCall EOF )
            // InternalTorXakisDsl.g:6441:2: iv_ruleValExprFunctionCall= ruleValExprFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getValExprFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValExprFunctionCall=ruleValExprFunctionCall();

            state._fsp--;

             current =iv_ruleValExprFunctionCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValExprFunctionCall"


    // $ANTLR start "ruleValExprFunctionCall"
    // InternalTorXakisDsl.g:6447:1: ruleValExprFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) )? otherlv_3= ')' ) ;
    public final EObject ruleValExprFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_neValExprList_2_0 = null;



        	enterRule();

        try {
            // InternalTorXakisDsl.g:6453:2: ( ( ( (lv_name_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) )? otherlv_3= ')' ) )
            // InternalTorXakisDsl.g:6454:2: ( ( (lv_name_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) )? otherlv_3= ')' )
            {
            // InternalTorXakisDsl.g:6454:2: ( ( (lv_name_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) )? otherlv_3= ')' )
            // InternalTorXakisDsl.g:6455:3: ( (lv_name_0_0= ruleFuncName ) ) otherlv_1= '(' ( (lv_neValExprList_2_0= ruleNeValExprList ) )? otherlv_3= ')'
            {
            // InternalTorXakisDsl.g:6455:3: ( (lv_name_0_0= ruleFuncName ) )
            // InternalTorXakisDsl.g:6456:4: (lv_name_0_0= ruleFuncName )
            {
            // InternalTorXakisDsl.g:6456:4: (lv_name_0_0= ruleFuncName )
            // InternalTorXakisDsl.g:6457:5: lv_name_0_0= ruleFuncName
            {

            					newCompositeNode(grammarAccess.getValExprFunctionCallAccess().getNameFuncNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleFuncName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValExprFunctionCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tno.torxakis.language.TorXakisDsl.FuncName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getValExprFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTorXakisDsl.g:6478:3: ( (lv_neValExprList_2_0= ruleNeValExprList ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_CAPSID && LA64_0<=RULE_OPERATOR)||LA64_0==19||LA64_0==65||(LA64_0>=74 && LA64_0<=75)||LA64_0==79) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTorXakisDsl.g:6479:4: (lv_neValExprList_2_0= ruleNeValExprList )
                    {
                    // InternalTorXakisDsl.g:6479:4: (lv_neValExprList_2_0= ruleNeValExprList )
                    // InternalTorXakisDsl.g:6480:5: lv_neValExprList_2_0= ruleNeValExprList
                    {

                    					newCompositeNode(grammarAccess.getValExprFunctionCallAccess().getNeValExprListNeValExprListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_neValExprList_2_0=ruleNeValExprList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValExprFunctionCallRule());
                    					}
                    					set(
                    						current,
                    						"neValExprList",
                    						lv_neValExprList_2_0,
                    						"nl.tno.torxakis.language.TorXakisDsl.NeValExprList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getValExprFunctionCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleValExprFunctionCall"


    // $ANTLR start "entryRuleConstructorName"
    // InternalTorXakisDsl.g:6505:1: entryRuleConstructorName returns [EObject current=null] : iv_ruleConstructorName= ruleConstructorName EOF ;
    public final EObject entryRuleConstructorName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorName = null;


        try {
            // InternalTorXakisDsl.g:6505:56: (iv_ruleConstructorName= ruleConstructorName EOF )
            // InternalTorXakisDsl.g:6506:2: iv_ruleConstructorName= ruleConstructorName EOF
            {
             newCompositeNode(grammarAccess.getConstructorNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructorName=ruleConstructorName();

            state._fsp--;

             current =iv_ruleConstructorName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstructorName"


    // $ANTLR start "ruleConstructorName"
    // InternalTorXakisDsl.g:6512:1: ruleConstructorName returns [EObject current=null] : ( (lv_name_0_0= RULE_CAPSID ) ) ;
    public final EObject ruleConstructorName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:6518:2: ( ( (lv_name_0_0= RULE_CAPSID ) ) )
            // InternalTorXakisDsl.g:6519:2: ( (lv_name_0_0= RULE_CAPSID ) )
            {
            // InternalTorXakisDsl.g:6519:2: ( (lv_name_0_0= RULE_CAPSID ) )
            // InternalTorXakisDsl.g:6520:3: (lv_name_0_0= RULE_CAPSID )
            {
            // InternalTorXakisDsl.g:6520:3: (lv_name_0_0= RULE_CAPSID )
            // InternalTorXakisDsl.g:6521:4: lv_name_0_0= RULE_CAPSID
            {
            lv_name_0_0=(Token)match(input,RULE_CAPSID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getConstructorNameAccess().getNameCAPSIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstructorNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.CAPSID");
            			

            }


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
    // $ANTLR end "ruleConstructorName"


    // $ANTLR start "entryRuleFuncName"
    // InternalTorXakisDsl.g:6540:1: entryRuleFuncName returns [EObject current=null] : iv_ruleFuncName= ruleFuncName EOF ;
    public final EObject entryRuleFuncName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncName = null;


        try {
            // InternalTorXakisDsl.g:6540:49: (iv_ruleFuncName= ruleFuncName EOF )
            // InternalTorXakisDsl.g:6541:2: iv_ruleFuncName= ruleFuncName EOF
            {
             newCompositeNode(grammarAccess.getFuncNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncName=ruleFuncName();

            state._fsp--;

             current =iv_ruleFuncName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFuncName"


    // $ANTLR start "ruleFuncName"
    // InternalTorXakisDsl.g:6547:1: ruleFuncName returns [EObject current=null] : ( (lv_name_0_0= RULE_SMALLID ) ) ;
    public final EObject ruleFuncName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:6553:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) )
            // InternalTorXakisDsl.g:6554:2: ( (lv_name_0_0= RULE_SMALLID ) )
            {
            // InternalTorXakisDsl.g:6554:2: ( (lv_name_0_0= RULE_SMALLID ) )
            // InternalTorXakisDsl.g:6555:3: (lv_name_0_0= RULE_SMALLID )
            {
            // InternalTorXakisDsl.g:6555:3: (lv_name_0_0= RULE_SMALLID )
            // InternalTorXakisDsl.g:6556:4: lv_name_0_0= RULE_SMALLID
            {
            lv_name_0_0=(Token)match(input,RULE_SMALLID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncNameAccess().getNameSMALLIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.SMALLID");
            			

            }


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
    // $ANTLR end "ruleFuncName"


    // $ANTLR start "entryRuleConstName"
    // InternalTorXakisDsl.g:6575:1: entryRuleConstName returns [EObject current=null] : iv_ruleConstName= ruleConstName EOF ;
    public final EObject entryRuleConstName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstName = null;


        try {
            // InternalTorXakisDsl.g:6575:50: (iv_ruleConstName= ruleConstName EOF )
            // InternalTorXakisDsl.g:6576:2: iv_ruleConstName= ruleConstName EOF
            {
             newCompositeNode(grammarAccess.getConstNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstName=ruleConstName();

            state._fsp--;

             current =iv_ruleConstName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstName"


    // $ANTLR start "ruleConstName"
    // InternalTorXakisDsl.g:6582:1: ruleConstName returns [EObject current=null] : ( (lv_name_0_0= RULE_SMALLID ) ) ;
    public final EObject ruleConstName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:6588:2: ( ( (lv_name_0_0= RULE_SMALLID ) ) )
            // InternalTorXakisDsl.g:6589:2: ( (lv_name_0_0= RULE_SMALLID ) )
            {
            // InternalTorXakisDsl.g:6589:2: ( (lv_name_0_0= RULE_SMALLID ) )
            // InternalTorXakisDsl.g:6590:3: (lv_name_0_0= RULE_SMALLID )
            {
            // InternalTorXakisDsl.g:6590:3: (lv_name_0_0= RULE_SMALLID )
            // InternalTorXakisDsl.g:6591:4: lv_name_0_0= RULE_SMALLID
            {
            lv_name_0_0=(Token)match(input,RULE_SMALLID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getConstNameAccess().getNameSMALLIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.tno.torxakis.language.TorXakisDsl.SMALLID");
            			

            }


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
    // $ANTLR end "ruleConstName"


    // $ANTLR start "entryRuleBIG_INT"
    // InternalTorXakisDsl.g:6610:1: entryRuleBIG_INT returns [String current=null] : iv_ruleBIG_INT= ruleBIG_INT EOF ;
    public final String entryRuleBIG_INT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBIG_INT = null;


        try {
            // InternalTorXakisDsl.g:6610:47: (iv_ruleBIG_INT= ruleBIG_INT EOF )
            // InternalTorXakisDsl.g:6611:2: iv_ruleBIG_INT= ruleBIG_INT EOF
            {
             newCompositeNode(grammarAccess.getBIG_INTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBIG_INT=ruleBIG_INT();

            state._fsp--;

             current =iv_ruleBIG_INT.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBIG_INT"


    // $ANTLR start "ruleBIG_INT"
    // InternalTorXakisDsl.g:6617:1: ruleBIG_INT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleBIG_INT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalTorXakisDsl.g:6623:2: (this_INT_0= RULE_INT )
            // InternalTorXakisDsl.g:6624:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getBIG_INTAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleBIG_INT"

    // Delegated rules


    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\12\11\uffff";
    static final String dfa_3s = "\1\4\1\10\11\uffff";
    static final String dfa_4s = "\1\117\1\116\11\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\3\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\4\1\5\1\2\12\uffff\1\7\66\uffff\1\10\4\uffff\1\6",
            "\1\12\6\uffff\2\12\2\uffff\1\11\2\12\7\uffff\2\12\12\uffff\3\12\1\uffff\2\12\3\uffff\3\12\1\uffff\1\12\1\uffff\10\12\2\uffff\1\12\2\uffff\1\12\1\uffff\2\12\3\uffff\3\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5804:2: (this_SmallIdName_0= ruleSmallIdName | this_ValExprUnaryOperator_1= ruleValExprUnaryOperator | this_ValExprFunctionCall_2= ruleValExprFunctionCall | this_ValExprContructorCall_3= ruleValExprContructorCall | this_ValExprInteger_4= ruleValExprInteger | this_ValExprString_5= ruleValExprString | this_ValExprRegex_6= ruleValExprRegex | this_ValExprBracket_7= ruleValExprBracket | this_ValExprError_8= ruleValExprError )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000061CC44002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000801F0L,0x0000000000008C02L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000080030L,0x0000000000000093L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000C000020010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1840000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0300000040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x6000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00000000001801F0L,0x0000000000008C02L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000200102L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00000000000801F0L,0x0000000000008400L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000080002L});

}