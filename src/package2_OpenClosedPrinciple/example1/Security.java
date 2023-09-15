package package2_OpenClosedPrinciple.example1;

public class Security extends Employee{
    public Security(String name, String department, boolean isWorking) {
        super(name, department, isWorking);
    }

    @Override
    public void work() {
        protectPeople();
    }

    private void protectPeople(){
        System.out.println("Taking care of security");
    }


}
