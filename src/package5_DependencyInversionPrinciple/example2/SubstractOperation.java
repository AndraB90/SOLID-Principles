package package5_DependencyInversionPrinciple.example2;

public class SubstractOperation implements CalculatorOperation{
    @Override
    public double calculate(double x, double y) {
        return x-y;
    }
}
