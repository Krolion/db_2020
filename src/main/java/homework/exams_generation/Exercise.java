package homework.exams_generation;

/**
 * @author Evgeny Borisov
 */
abstract public class Exercise {
    private String exerciseDesc;
    private String answer;

    public boolean giveAnswer(String myAnswer) {
        return answer.equals(myAnswer);
    }

    @Override
    public String toString() {
        return exerciseDesc;
    }
}
