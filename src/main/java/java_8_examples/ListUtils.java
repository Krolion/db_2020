package java_8_examples;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {
    public static <T> int countDuplicates(List<T> list, T t, Comparator<T> comparator) {
        int counter=0;
        for (T t1 : list) {
            if (comparator.equal(t1, t)) {
                counter++;
            }
        }
        return counter;
    }
}
