package homework.exams_generation.basic_operations;

import homework.exams_generation.Operation;

public class Divide implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
