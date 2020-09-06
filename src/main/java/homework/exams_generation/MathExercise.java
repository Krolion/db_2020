package homework.exams_generation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathExercise extends Exercise {
    private CalculusExpression expression;
    private int answerPrecision;

    public MathExercise(CalculusExpression expression, int answerPrecision) {
        this.expression = expression;
        this.answerPrecision = answerPrecision;
        this.exerciseDesc = "Solve this expression";
        if (answerPrecision != 0) {
            this.exerciseDesc += " with " + answerPrecision + " digits precision";
        }
        this.exerciseDesc += ":\n" + expression.toString();
        this.answer = BigDecimal.valueOf(expression.calculate())
                .setScale(answerPrecision, RoundingMode.HALF_UP)
                .toString();
    }


}
