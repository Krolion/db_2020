package homework.exams_generation;

import demo.Employee;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Evgeny Borisov
 */
public class Examinator {

    private final ExerciseGenerator generator = new ExerciseGenerator();
    private ArrayList<Exercise> classwork;

    public Examinator() throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
    }

    public void generateNewSet(int amount) {
        ArrayList<Exercise> base = new ArrayList<>();
        for (int i = 0; i < amount; ++i) {
            base.add(generator.getNewExercise());
        }
        classwork = base;
    }

    public void conductClasswork() {
        Scanner reader = new Scanner(System.in);
        for (Exercise exercise : classwork) {
            System.out.println(exercise.exerciseDesc);
            if (exercise.giveAnswer(reader.nextLine())) {
                System.out.println("Good");
            }
            else {
                System.out.println("No, it's " + exercise.answer);
            }
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Examinator examinator = new Examinator();
        examinator.generateNewSet(10);
        examinator.conductClasswork();
    }

}
