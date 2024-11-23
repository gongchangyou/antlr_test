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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, STRING=9, 
		WS=10, IN=11, LIKE=12, ID=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NUMBER", "STRING", 
			"WS", "IN", "LIKE", "ID", "L", "I", "K", "E", "N", "X"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'['", "','", "']'", null, null, null, 
			"'IN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NUMBER", "STRING", "WS", 
			"IN", "LIKE", "ID"
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
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u00077\b"+
		"\u0007\u000b\u0007\f\u00078\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\bA\b\b\n\b\f\bD\t\b\u0001\b\u0001\b\u0001\t\u0004\tI\b\t\u000b"+
		"\t\f\tJ\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fY\b\f\n\f"+
		"\f\f\\\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\u0000%\u0000\u0001\u0000"+
		"\u000b\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  \u0004\u0000"+
		"%%AZ__az\u0005\u0000%%09AZ__az\u0002\u0000LLll\u0002\u0000IIii\u0002\u0000"+
		"KKkk\u0002\u0000EEee\u0002\u0000NNnn\u0002\u0000XXxxh\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000"+
		"\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001"+
		"\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000"+
		"\u0000\u000f6\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000\u0013"+
		"H\u0001\u0000\u0000\u0000\u0015N\u0001\u0000\u0000\u0000\u0017Q\u0001"+
		"\u0000\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001b]\u0001\u0000\u0000"+
		"\u0000\u001d_\u0001\u0000\u0000\u0000\u001fa\u0001\u0000\u0000\u0000!"+
		"c\u0001\u0000\u0000\u0000#e\u0001\u0000\u0000\u0000%g\u0001\u0000\u0000"+
		"\u0000\'(\u0005;\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005=\u0000"+
		"\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0006\u0001"+
		"\u0000\u0000\u0000-.\u0005)\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005"+
		"[\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005,\u0000\u00002\f\u0001"+
		"\u0000\u0000\u000034\u0005]\u0000\u00004\u000e\u0001\u0000\u0000\u0000"+
		"57\u0007\u0000\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0010\u0001"+
		"\u0000\u0000\u0000:B\u0005\"\u0000\u0000;A\b\u0001\u0000\u0000<=\u0005"+
		"\\\u0000\u0000=A\u0005\"\u0000\u0000>?\u0005\\\u0000\u0000?A\u0005\\\u0000"+
		"\u0000@;\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"EF\u0005\"\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GI\u0007\u0002\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0006"+
		"\t\u0000\u0000M\u0014\u0001\u0000\u0000\u0000NO\u0005I\u0000\u0000OP\u0005"+
		"N\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0003\u001b\r\u0000RS\u0003"+
		"\u001d\u000e\u0000ST\u0003\u001f\u000f\u0000TU\u0003!\u0010\u0000U\u0018"+
		"\u0001\u0000\u0000\u0000VZ\u0007\u0003\u0000\u0000WY\u0007\u0004\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u001a\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]^\u0007\u0005\u0000\u0000^\u001c\u0001\u0000"+
		"\u0000\u0000_`\u0007\u0006\u0000\u0000`\u001e\u0001\u0000\u0000\u0000"+
		"ab\u0007\u0007\u0000\u0000b \u0001\u0000\u0000\u0000cd\u0007\b\u0000\u0000"+
		"d\"\u0001\u0000\u0000\u0000ef\u0007\t\u0000\u0000f$\u0001\u0000\u0000"+
		"\u0000gh\u0007\n\u0000\u0000h&\u0001\u0000\u0000\u0000\u0006\u00008@B"+
		"JZ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}