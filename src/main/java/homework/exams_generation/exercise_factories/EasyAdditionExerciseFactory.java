package homework.exams_generation.exercise_factories;

import homework.exams_generation.CalculusExpression;
import homework.exams_generation.Exercise;
import homework.exams_generation.MathExercise;
import homework.exams_generation.Operator;

import java.util.Random;

public class EasyAdditionExerciseFactory implements EasyExerciseFactory, AdditionExerciseFactory, IntegerExerciseFactory{

    @Override
    public Exercise createExercise() {
        Random random = new Random();
        int upperLimit = 20;
        CalculusExpression expression1 = new CalculusExpression(random.nextInt(upperLimit));
        CalculusExpression expression2 = new CalculusExpression(random.nextInt(upperLimit));
        CalculusExpression expression = new CalculusExpression(expression1, expression2,
                Operator.PLUS);
        return new MathExercise(expression, 0);
    }
}
