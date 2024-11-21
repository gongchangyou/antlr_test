// Generated from java-escape by ANTLR 4.11.1

package com.mouse.antlr_test.expr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CommonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUMBER=9, 
		STRING=10, WS=11, IN=12, LIKE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "NUMBER", 
			"STRING", "WS", "IN", "LIKE", "L", "I", "K", "E"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'['", "','", "']'", null, null, null, 
			null, "'IN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "NUMBER", "STRING", 
			"WS", "IN", "LIKE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Common.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\ra\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u00074\b\u0007\n\u0007\f\u00077\t\u0007\u0001"+
		"\b\u0004\b:\b\b\u000b\b\f\b;\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\tD\b\t\n\t\f\tG\t\t\u0001\t\u0001\t\u0001\n\u0004\nL\b\n\u000b"+
		"\n\f\nM\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u001d\u0000"+
		"\u001f\u0000!\u0000\u0001\u0000\t\u0003\u0000AZ__az\u0004\u000009AZ__"+
		"az\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"LLll\u0002\u0000IIii\u0002\u0000KKkk\u0002\u0000EEeeb\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005"+
		"\'\u0001\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000"+
		"\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000"+
		"\u000f1\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013="+
		"\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000"+
		"\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bY\u0001\u0000\u0000\u0000"+
		"\u001d[\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000\u0000!_\u0001"+
		"\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0005=\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000"+
		"(\u0006\u0001\u0000\u0000\u0000)*\u0005)\u0000\u0000*\b\u0001\u0000\u0000"+
		"\u0000+,\u0005[\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005,\u0000"+
		"\u0000.\f\u0001\u0000\u0000\u0000/0\u0005]\u0000\u00000\u000e\u0001\u0000"+
		"\u0000\u000015\u0007\u0000\u0000\u000024\u0007\u0001\u0000\u000032\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u00006\u0010\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u00008:\u0007\u0002\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<\u0012\u0001\u0000\u0000\u0000=E\u0005\"\u0000\u0000>D\b\u0003\u0000"+
		"\u0000?@\u0005\\\u0000\u0000@D\u0005\"\u0000\u0000AB\u0005\\\u0000\u0000"+
		"BD\u0005\\\u0000\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HI\u0005\"\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JL\u0007"+
		"\u0004\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0006\n\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005I\u0000"+
		"\u0000RS\u0005N\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0003\u001b"+
		"\r\u0000UV\u0003\u001d\u000e\u0000VW\u0003\u001f\u000f\u0000WX\u0003!"+
		"\u0010\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0007\u0005\u0000\u0000"+
		"Z\u001c\u0001\u0000\u0000\u0000[\\\u0007\u0006\u0000\u0000\\\u001e\u0001"+
		"\u0000\u0000\u0000]^\u0007\u0007\u0000\u0000^ \u0001\u0000\u0000\u0000"+
		"_`\u0007\b\u0000\u0000`\"\u0001\u0000\u0000\u0000\u0006\u00005;CEM\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}