import java.util.LinkedList;
import java.util.Objects;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator extends CalculatorBaseListener {

    private final LinkedList<Double> firstStack = new LinkedList<>();
    private final LinkedList<Double> secondStack = new LinkedList<>();

    public Double getResult() {
        return secondStack.pop();
    }

    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {

        Double result = secondStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.PLUS)) {
                result = result + secondStack.removeLast();
            } else {
                result = result - secondStack.removeLast();
            }
        }
        secondStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> " + result);
    }

    @Override
    public void exitMultiExpression(CalculatorParser.MultiExpressionContext ctx) {

        Double result = firstStack.removeLast();
         for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.TIMES)) {
                result = result * firstStack.removeLast();
            } else  {
                result = firstStack.removeLast()/result ;
            }


        }
        secondStack.push(result);
        System.out.println("MultiExpression: \"" + ctx.getText() + "\" -> " + result);
    }

    @Override
    public void exitPowExpression(CalculatorParser.PowExpressionContext ctx) {

        Double result = firstStack.removeLast();
        for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.POW)) {
                result = Math.pow( firstStack.removeLast(),result);
            }
            else{
                result = Math.pow(result, 1/ firstStack.removeLast());
            }

        }
        firstStack.push(result);
        System.out.println("PowExpression: \"" + ctx.getText() + "\" -> " + result);
    }
    @Override
    public void exitFunction(CalculatorParser.FunctionContext ctx){

        double result = firstStack.pop();
        if(ctx.funcname()!=null) {
            for (int i = ctx.getChildCount(); i >= 1; i = i - 2) {
                if (Objects.equals(ctx.funcname().getChild(i - 2).getText(), ctx.getChild(i - 2).getText())) {
                    if(ctx.funcname().COS()!=null) result=Math.cos(result);
                    if(ctx.funcname().SIN()!=null) result=Math.sin(result);
                    if(ctx.funcname().TAN()!=null) result=Math.tan(result);
                    if(ctx.funcname().ACOS()!=null) result=Math.acos(result);
                    if(ctx.funcname().ASIN()!=null) result=Math.asin(result);
                    if(ctx.funcname().ATAN()!=null) result=Math.atan(result);
                    if(ctx.funcname().LOG ()!=null) result=Math.log(result);
                    if(ctx.funcname().PI ()!=null) result=result * Math.PI;
                }
            }
        }
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
        firstStack.push(result);

    }

    private boolean symbolEquals(ParseTree child, int symbol) {
        return ((TerminalNode) child).getSymbol().getType() == symbol;
    }

    @Override
    public void exitFloatExpression(CalculatorParser.FloatExpressionContext ctx) {

        double value = Integer.parseInt(ctx.NUMBER().getText());
        if (ctx.MINUS() != null) {
            firstStack.push(-1 * value);
        } else {
            firstStack.push(value);
        }
        System.out.println("FloatExpression: \"" + ctx.getText() + "\" ");
    }

    public static Double calc(CharStream charStream) {

        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens.getText());

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        Calculator calculatorListener = new Calculator();
        walker.walk(calculatorListener, tree);
        return calculatorListener.getResult();
    }

    public static void main(String[] args) throws Exception {

        CharStream charStreams = CharStreams.fromFileName(".\\example.txt");
        Double result = calc(charStreams);
        System.out.println("Result = " + result);
    }
}
