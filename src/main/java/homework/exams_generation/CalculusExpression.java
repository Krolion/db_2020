package homework.exams_generation;

import homework.exams_generation.exceptions.CantParseExpressionException;
import lombok.Getter;
import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

@Getter
public class CalculusExpression {
    private CalculusExpression leftExpression = null;
    private CalculusExpression rightExpression = null;
    public Operator operator;
    public boolean isExpression = false;
    public double value = 0;

    public CalculusExpression(CalculusExpression leftExpression,
                              CalculusExpression rightExpression,
                              Operator operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
        this.isExpression = true;
    }

    public CalculusExpression(double value) {
        this.isExpression = false;
        this.value = value;
    }

/*    public static CalculusExpression calculusExpressionParser(String expression) {
        if (NumberUtils.isParsable(expression)) {
            return new CalculusExpression(NumberUtils.createDouble(expression));
        }
        else {
            int bracketCount = 0;
            String leftExpressionString = "";
            for (int i = 0; i < expression.length(); ++i) {
                if (expression.charAt(i) == '(') {
                    bracketCount += 1;
                }
                if (expression.charAt(i) == ')') {
                    bracketCount -= 1;
                }
                if (bracketCount == 0) {
                    if (i == expression.length() - 1) {
                        throw new CantParseExpressionException("Extra brackets around expression!");
                    }
                    if (Operator.isOperation(String
                            .valueOf(expression.charAt(i + 1)))) {

                    }
                }
            }
        }
    }*/

    public double calculate() {
        if (this.isExpression) {
            return operator.getOperation().calculate(leftExpression.calculate(),
                    rightExpression.calculate());
        }
        else {
            return value;
        }
    }

    @Override
    public String toString() {
        if (isExpression) {
            String leftExpressionString = leftExpression.toString();
            String rightExpressionString = rightExpression.toString();
            if (leftExpression.isExpression) {
                if (operator.getPrecedence() > leftExpression.operator.getPrecedence()) {
                    leftExpressionString = "(" + leftExpressionString + ")";
                }
            }
            if (rightExpression.isExpression) {
                if (operator.getPrecedence() >= rightExpression.operator.getPrecedence()) {
                    rightExpressionString = "(" + rightExpressionString + ")";
                }
            }
            return leftExpressionString + " " +  operator.getSign() + " " + rightExpressionString;
        }
        else {
            return BigDecimal.valueOf(value).toString();
        }
    }
}
