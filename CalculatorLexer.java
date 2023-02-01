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
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, DOT=2, POW=3, SQRT=4, TIMES=5, DIV=6, PLUS=7, MINUS=8, WS=9, 
		COS=10, SIN=11, TAN=12, ACOS=13, ASIN=14, ATAN=15, LOG=16, PI=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "DOT", "POW", "SQRT", "TIMES", "DIV", "PLUS", "MINUS", "WS", 
			"COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LOG", "PI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.'", "'^'", "'sqrt'", "'*'", "'/'", "'+'", "'-'", null, 
			"'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'log'", "'PI'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "DOT", "POW", "SQRT", "TIMES", "DIV", "PLUS", "MINUS", 
			"WS", "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LOG", "PI"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u0011j\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000%\b"+
		"\u0000\u000b\u0000\f\u0000&\u0001\u0000\u0001\u0000\u0004\u0000+\b\u0000"+
		"\u000b\u0000\f\u0000,\u0003\u0000/\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\bC\b\b\u000b\b\f\bD\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0001\u0003\u0000\t\n\r\r"+
		"  m\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0001$\u0001\u0000\u0000\u0000\u00030\u0001"+
		"\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000"+
		"\u0000\t9\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r=\u0001"+
		"\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000"+
		"\u0000\u0013H\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017"+
		"P\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bY\u0001"+
		"\u0000\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000"+
		"\u0000!g\u0001\u0000\u0000\u0000#%\u000209\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'.\u0001\u0000\u0000\u0000(*\u0005.\u0000\u0000)+\u000209\u0000"+
		"*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.(\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/\u0002\u0001\u0000\u0000\u0000"+
		"01\u0005.\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005^\u0000\u0000"+
		"3\u0006\u0001\u0000\u0000\u000045\u0005s\u0000\u000056\u0005q\u0000\u0000"+
		"67\u0005r\u0000\u000078\u0005t\u0000\u00008\b\u0001\u0000\u0000\u0000"+
		"9:\u0005*\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005/\u0000\u0000"+
		"<\f\u0001\u0000\u0000\u0000=>\u0005+\u0000\u0000>\u000e\u0001\u0000\u0000"+
		"\u0000?@\u0005-\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AC\u0007\u0000"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FG\u0006\b\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005c\u0000\u0000"+
		"IJ\u0005o\u0000\u0000JK\u0005s\u0000\u0000K\u0014\u0001\u0000\u0000\u0000"+
		"LM\u0005s\u0000\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000\u0000O\u0016"+
		"\u0001\u0000\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005a\u0000\u0000RS\u0005"+
		"n\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0005a\u0000\u0000UV\u0005"+
		"c\u0000\u0000VW\u0005o\u0000\u0000WX\u0005s\u0000\u0000X\u001a\u0001\u0000"+
		"\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005s\u0000\u0000[\\\u0005i\u0000"+
		"\u0000\\]\u0005n\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0005a\u0000"+
		"\u0000_`\u0005t\u0000\u0000`a\u0005a\u0000\u0000ab\u0005n\u0000\u0000"+
		"b\u001e\u0001\u0000\u0000\u0000cd\u0005l\u0000\u0000de\u0005o\u0000\u0000"+
		"ef\u0005g\u0000\u0000f \u0001\u0000\u0000\u0000gh\u0005P\u0000\u0000h"+
		"i\u0005I\u0000\u0000i\"\u0001\u0000\u0000\u0000\u0005\u0000&,.D\u0001"+
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