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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		NUMBER=10, STRING=11, WS=12, IN=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
			"NUMBER", "STRING", "WS", "IN", "L", "I", "K", "E", "N", "X"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'LIKE'", "'='", "'('", "')'", "'['", "','", "']'", null, 
			null, null, null, "'IN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "NUMBER", 
			"STRING", "WS", "IN"
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
		"\u0004\u0000\ri\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b=\b\b\n\b\f\b@\t"+
		"\b\u0001\t\u0004\tC\b\t\u000b\t\f\tD\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\nM\b\n\n\n\f\nP\t\n\u0001\n\u0001\n\u0001\u000b\u0004"+
		"\u000bU\b\u000b\u000b\u000b\f\u000bV\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\u0000%\u0000\u0001\u0000"+
		"\u000b\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000"+
		"\"\"\\\\\u0003\u0000\t\n\r\r  \u0002\u0000LLll\u0002\u0000IIii\u0002\u0000"+
		"KKkk\u0002\u0000EEee\u0002\u0000NNnn\u0002\u0000XXxxh\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000"+
		"\u0005.\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t2\u0001"+
		"\u0000\u0000\u0000\u000b4\u0001\u0000\u0000\u0000\r6\u0001\u0000\u0000"+
		"\u0000\u000f8\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000\u0013"+
		"B\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017T\u0001"+
		"\u0000\u0000\u0000\u0019Z\u0001\u0000\u0000\u0000\u001b]\u0001\u0000\u0000"+
		"\u0000\u001d_\u0001\u0000\u0000\u0000\u001fa\u0001\u0000\u0000\u0000!"+
		"c\u0001\u0000\u0000\u0000#e\u0001\u0000\u0000\u0000%g\u0001\u0000\u0000"+
		"\u0000\'(\u0005;\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005L\u0000"+
		"\u0000*+\u0005I\u0000\u0000+,\u0005K\u0000\u0000,-\u0005E\u0000\u0000"+
		"-\u0004\u0001\u0000\u0000\u0000./\u0005=\u0000\u0000/\u0006\u0001\u0000"+
		"\u0000\u000001\u0005(\u0000\u00001\b\u0001\u0000\u0000\u000023\u0005)"+
		"\u0000\u00003\n\u0001\u0000\u0000\u000045\u0005[\u0000\u00005\f\u0001"+
		"\u0000\u0000\u000067\u0005,\u0000\u00007\u000e\u0001\u0000\u0000\u0000"+
		"89\u0005]\u0000\u00009\u0010\u0001\u0000\u0000\u0000:>\u0007\u0000\u0000"+
		"\u0000;=\u0007\u0001\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0012"+
		"\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AC\u0007\u0002\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0014\u0001\u0000\u0000\u0000"+
		"FN\u0005\"\u0000\u0000GM\b\u0003\u0000\u0000HI\u0005\\\u0000\u0000IM\u0005"+
		"\"\u0000\u0000JK\u0005\\\u0000\u0000KM\u0005\\\u0000\u0000LG\u0001\u0000"+
		"\u0000\u0000LH\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MP\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\"\u0000\u0000"+
		"R\u0016\u0001\u0000\u0000\u0000SU\u0007\u0004\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006\u000b\u0000\u0000"+
		"Y\u0018\u0001\u0000\u0000\u0000Z[\u0005I\u0000\u0000[\\\u0005N\u0000\u0000"+
		"\\\u001a\u0001\u0000\u0000\u0000]^\u0007\u0005\u0000\u0000^\u001c\u0001"+
		"\u0000\u0000\u0000_`\u0007\u0006\u0000\u0000`\u001e\u0001\u0000\u0000"+
		"\u0000ab\u0007\u0007\u0000\u0000b \u0001\u0000\u0000\u0000cd\u0007\b\u0000"+
		"\u0000d\"\u0001\u0000\u0000\u0000ef\u0007\t\u0000\u0000f$\u0001\u0000"+
		"\u0000\u0000gh\u0007\n\u0000\u0000h&\u0001\u0000\u0000\u0000\u0006\u0000"+
		">DLNV\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}