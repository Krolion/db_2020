package homework.exams_generation;

public class MathExercise extends Exercise {
    private CalculusExpression expression;
    private int answerPrecision;

    @Override
    public String toString() {
        return "MathExercise{" +
                "expression=" + expression +
                '}';
    }
}
