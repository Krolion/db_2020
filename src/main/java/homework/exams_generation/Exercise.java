package homework.exams_generation;

/**
 * @author Evgeny Borisov
 */
abstract public class Exercise {
    protected String exerciseDesc;
    protected String answer;

    public boolean giveAnswer(String myAnswer) {
        return answer.equals(myAnswer);
    }

    @Override
    public String toString() {
        return exerciseDesc;
    }
}
