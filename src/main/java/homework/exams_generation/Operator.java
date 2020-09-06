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
    PLUS("+", new Plus()),
    MINUS("-", new Minus()),
    MULTIPLY("*", new Multiply()),
    DIVIDE("/", new Divide());

    private final String sign;
    private final Operation operation;

    Operator(String s, Operation operation) {
        this.sign = s;
        this.operation = operation;
    }

    public static Operator findBySign(String sign) throws IllegalAccessException {
        for (Operator operator : values()) {
            if (operator.sign.equals(sign)) {
                return operator;
            }
        }
        throw new IllegalAccessException("No such operator as \"" + sign + "\"");
    }

    public Operation getOperation() {
        return this.operation;
    }
}
