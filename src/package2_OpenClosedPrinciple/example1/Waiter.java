package package2_OpenClosedPrinciple.example1;

public class Waiter extends Employee{
    public Waiter(String name, String department, boolean isWorking) {
        super(name, department, isWorking);
    }

    // Waiter's duties
    private void serveCustomers(){
        System.out.println("Serving food to customers");
    }

    private void cleanTables(){
        System.out.println("Cleaning the tables");
    }

    private void takeOrders(){
        System.out.println("Taking orders");
    }

    public void work(){
        serveCustomers();
        cleanTables();
        takeOrders();
    }
}
