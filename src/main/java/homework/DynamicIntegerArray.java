package homework;

/**
 * @author Evgeny Borisov
 */


//todo write an implementation of this interface

public interface DynamicIntegerArray {

    int get(int index);

    void push_back(int value);

    int pop_back(int value);

    void push_front(int value);

    int pop_front(int value);

    int size();


}
