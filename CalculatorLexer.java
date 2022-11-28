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
		FLOAT=1, LPAREN=2, RPAREN=3, COMMA=4, DOT=5, POW=6, SQRT=7, TIMES=8, DIV=9, 
		PLUS=10, MINUS=11, INTEGRAL=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FLOAT", "LPAREN", "RPAREN", "COMMA", "DOT", "POW", "SQRT", "TIMES", 
			"DIV", "PLUS", "MINUS", "INTEGRAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "','", "'.'", "'^'", "'sqrt'", "'*'", "'/'", 
			"'+'", "'-'", "'cal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "LPAREN", "RPAREN", "COMMA", "DOT", "POW", "SQRT", "TIMES", 
			"DIV", "PLUS", "MINUS", "INTEGRAL", "WS"
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
		"\u0004\u0000\rJ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b"+
		"\u0000\f\u0000\u001e\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b"+
		"\u0000\f\u0000$\u0003\u0000\'\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fE\b"+
		"\f\u000b\f\f\fF\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0001\u0003\u0000\t\n\r\r "+
		" M\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001c\u0001\u0000\u0000\u0000\u0003(\u0001"+
		"\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000"+
		"\u0000\t.\u0001\u0000\u0000\u0000\u000b0\u0001\u0000\u0000\u0000\r2\u0001"+
		"\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000"+
		"\u0000\u0013;\u0001\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017"+
		"?\u0001\u0000\u0000\u0000\u0019D\u0001\u0000\u0000\u0000\u001b\u001d\u0002"+
		"09\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f&\u0001\u0000\u0000\u0000 \"\u0005.\u0000\u0000!#\u000209"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000& \u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0002\u0001\u0000\u0000"+
		"\u0000()\u0005(\u0000\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005)\u0000"+
		"\u0000+\u0006\u0001\u0000\u0000\u0000,-\u0005,\u0000\u0000-\b\u0001\u0000"+
		"\u0000\u0000./\u0005.\u0000\u0000/\n\u0001\u0000\u0000\u000001\u0005^"+
		"\u0000\u00001\f\u0001\u0000\u0000\u000023\u0005s\u0000\u000034\u0005q"+
		"\u0000\u000045\u0005r\u0000\u000056\u0005t\u0000\u00006\u000e\u0001\u0000"+
		"\u0000\u000078\u0005*\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005"+
		"/\u0000\u0000:\u0012\u0001\u0000\u0000\u0000;<\u0005+\u0000\u0000<\u0014"+
		"\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000>\u0016\u0001\u0000\u0000"+
		"\u0000?@\u0005c\u0000\u0000@A\u0005a\u0000\u0000AB\u0005l\u0000\u0000"+
		"B\u0018\u0001\u0000\u0000\u0000CE\u0007\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0006\f\u0000\u0000I\u001a"+
		"\u0001\u0000\u0000\u0000\u0005\u0000\u001e$&F\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}