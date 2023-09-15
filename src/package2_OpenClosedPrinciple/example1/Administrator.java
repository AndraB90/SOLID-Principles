package package2_OpenClosedPrinciple.example1;

public class Administrator extends Employee{
    public Administrator(String name, String department, boolean isWorking) {
        super(name, department, isWorking);
    }

    @Override
    public void work() {
        makingCalculations();
    }

    private void makingCalculations(){
        System.out.println("Playing with numbers");
    }
}
