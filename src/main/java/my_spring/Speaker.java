package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface Speaker {
    @BenchMark
    void speak(String message);
}
