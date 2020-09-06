package homework.exams_generation;

public class CalculusExpression {
    private CalculusExpression leftExpression = null;
    private CalculusExpression rightExpression = null;
    private Operator operator;
    private boolean isExpression = false;
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

    public double calculate() {
        if (this.isExpression) {
            return operator.getOperation().calculate(leftExpression.calculate(),
                    rightExpression.calculate());
        }
        else {
            return value;
        }
    }
}
