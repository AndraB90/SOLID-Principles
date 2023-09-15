package package5_DependencyInversionPrinciple.example2;

public class DivisionOperation implements CalculatorOperation {
    @Override
    public double calculate(double x, double y) {
        try {
            return x / y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
