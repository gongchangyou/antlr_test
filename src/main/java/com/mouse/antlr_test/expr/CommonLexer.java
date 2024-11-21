package com.mouse.antlr_test.expr;

// Generated from java-escape by ANTLR 4.11.1
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
			"STRING", "WS", "IN", "LIKE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'['", "','", "']'", null, null, null, 
			null, "'IN'", "'LIKE'"
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
		"\u0004\u0000\rQ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007,\b\u0007\n\u0007\f\u0007/\t\u0007\u0001\b\u0004\b2"+
		"\b\b\u000b\b\f\b3\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t<\b\t\n\t\f\t?\t\t\u0001\t\u0001\t\u0001\n\u0004\nD\b\n\u000b\n\f\n"+
		"E\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  V\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d"+
		"\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007!\u0001"+
		"\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000\u000b%\u0001\u0000\u0000"+
		"\u0000\r\'\u0001\u0000\u0000\u0000\u000f)\u0001\u0000\u0000\u0000\u0011"+
		"1\u0001\u0000\u0000\u0000\u00135\u0001\u0000\u0000\u0000\u0015C\u0001"+
		"\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019L\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005;\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005=\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f"+
		" \u0005(\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!\"\u0005)\u0000\u0000"+
		"\"\b\u0001\u0000\u0000\u0000#$\u0005[\u0000\u0000$\n\u0001\u0000\u0000"+
		"\u0000%&\u0005,\u0000\u0000&\f\u0001\u0000\u0000\u0000\'(\u0005]\u0000"+
		"\u0000(\u000e\u0001\u0000\u0000\u0000)-\u0007\u0000\u0000\u0000*,\u0007"+
		"\u0001\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0010\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u000002\u0007\u0002\u0000\u000010\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u00004\u0012\u0001\u0000\u0000\u00005=\u0005\"\u0000"+
		"\u00006<\b\u0003\u0000\u000078\u0005\\\u0000\u00008<\u0005\"\u0000\u0000"+
		"9:\u0005\\\u0000\u0000:<\u0005\\\u0000\u0000;6\u0001\u0000\u0000\u0000"+
		";7\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\"\u0000\u0000A\u0014\u0001"+
		"\u0000\u0000\u0000BD\u0007\u0004\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0006\n\u0000\u0000H\u0016\u0001\u0000"+
		"\u0000\u0000IJ\u0005I\u0000\u0000JK\u0005N\u0000\u0000K\u0018\u0001\u0000"+
		"\u0000\u0000LM\u0005L\u0000\u0000MN\u0005I\u0000\u0000NO\u0005K\u0000"+
		"\u0000OP\u0005E\u0000\u0000P\u001a\u0001\u0000\u0000\u0000\u0006\u0000"+
		"-3;=E\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}