package package2_OpenClosedPrinciple.example1;

public class Chef extends Employee{
    public Chef(String name, String department, boolean isWorking) {
        super(name, department, isWorking);
    }

    // Chef's duties
    private void cook(){
        System.out.println("Cooking food");
    }

    private void designPlates(){
        System.out.println("Designing plates");
    }

    private void prepareVegetables(){
        System.out.println("Preparing vegetables");
    }

    public void work(){
        cook();
        designPlates();
        prepareVegetables();
    }

}
