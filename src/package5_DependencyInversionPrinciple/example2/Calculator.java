package package5_DependencyInversionPrinciple.example2;

public class Calculator {

    CalculatorOperation calculatorOperation;

    public Calculator(CalculatorOperation calculatorOperation) {
        this.calculatorOperation = calculatorOperation;
    }

    public double solve(double x, double y){
        return calculatorOperation.calculate(x,y);
    }
}


