package package5_DependencyInversionPrinciple.example2;

public class Main {
    public static void main(String[] args) {
        //Add example

        Calculator add = new Calculator(new AddOperation());
        System.out.println(add.solve(3,4));
    }
}
