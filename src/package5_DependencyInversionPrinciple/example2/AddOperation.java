package package5_DependencyInversionPrinciple.example2;

public class AddOperation implements CalculatorOperation {
    @Override
    public double calculate(double x, double y) {
        return x+y;
    }
}
