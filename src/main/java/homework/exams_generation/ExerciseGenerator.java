package homework.exams_generation;

import heroes.Hero;
import homework.exams_generation.exercise_factories.MathExerciseFactory;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static heroes.RandomUtil.randomItem;

public class ExerciseGenerator {

    private List<ExerciseFactory> factories;

    @SneakyThrows
    public ExerciseGenerator() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Reflections scanner = new Reflections("homework.exams_generation");
        factories = new ArrayList<>();
        // here you can create custom generator by choosing any factories you like
        List<Class<? extends ExerciseFactory>> classes = new ArrayList<>(scanner.getSubTypesOf(ExerciseFactory.class));
        for (Class<? extends ExerciseFactory> aClass : classes) {
            if (!aClass.isInterface()) {
                factories.add(aClass.getConstructor().newInstance());
            }
        }

    }

    public Exercise getNewExercise() {
            return randomItem(factories).createExercise();
    }
}
