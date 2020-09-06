package homework.exams_generation.exercise_factories;

import homework.exams_generation.CalculusExpression;
import homework.exams_generation.Exercise;
import homework.exams_generation.MathExercise;
import homework.exams_generation.Operator;

import java.util.Random;

public class MediumFloatAdditionExerciseFactory implements MediumExerciseFactory, AdditionExerciseFactory, FloatExerciseFactory{

    @Override
    public Exercise createExercise() {
        Random random = new Random();
        int upperLimit = 200;
        CalculusExpression expression1 = new CalculusExpression(
               ((double) random.nextInt(upperLimit)) / 10);
        CalculusExpression expression2 = new CalculusExpression(
                ((double) random.nextInt(upperLimit)) / 10);
        CalculusExpression expression3 = new CalculusExpression(
                ((double) random.nextInt(upperLimit)) / 10);
        CalculusExpression expression = new CalculusExpression(expression1, expression2,
                Operator.PLUS);
        expression = new CalculusExpression(expression, expression3, Operator.PLUS);
        return new MathExercise(expression, random.nextInt(2));
    }
}
