package homework.exams_generation;

import enums.Gender;
import enums.GenderNotExistsException;
import homework.exams_generation.basic_operations.Divide;
import homework.exams_generation.basic_operations.Minus;
import homework.exams_generation.basic_operations.Multiply;
import homework.exams_generation.basic_operations.Plus;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Operator {
    PLUS("+", new Plus(), 6),
    MINUS("-", new Minus(), 6),
    MULTIPLY("*", new Multiply(), 7),
    DIVIDE("/", new Divide(), 7);

    private final String sign;
    private final Operation operation;
    private final int precedence;

    Operator(String s, Operation operation, int precedence) {
        this.sign = s;
        this.operation = operation;
        this.precedence = precedence;
    }

    public static Operator findBySign(String sign) throws IllegalAccessException {
        for (Operator operator : values()) {
            if (operator.sign.equals(sign)) {
                return operator;
            }
        }
        throw new IllegalAccessException("No such operator as \"" + sign + "\"");
    }

    public static boolean isOperation(String sign) {
        for (Operator operator : values()) {
            if (operator.sign.equals(sign)) {
                return true;
            }
        }
        return false;
    }

    public Operation getOperation() {
        return this.operation;
    }

    public int getPrecedence() {
        return precedence;
    }

    public String getSign() {
        return sign;
    }
}
