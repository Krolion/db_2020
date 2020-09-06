package homework.exams_generation;

import lombok.Getter;

@Getter
public class CalculusExpression {
    private CalculusExpression leftExpression = null;
    private CalculusExpression rightExpression = null;
    private Operator operator;
    public boolean isExpression = false;
    private double value = 0;

    public CalculusExpression(CalculusExpression leftExpression,
                              CalculusExpression rightExpression,
                              Operator operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
        this.isExpression = true;
    }

    public CalculusExpression(double value) {
        this.value = value;
    }

    public CalculusExpression(String expression) {

    }

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
        return leftExpressionString + operator.getSign() + rightExpressionString;
    }
}
