package package2_OpenClosedPrinciple.example1;

import jdk.swing.interop.SwingInterOpUtils;

public class RestaurantManagement {
    // this method should call any employee to do his job

    public void performDuties(Employee employee){
        /*if(employee instanceof Chef){
            System.out.println("Chef is working");
            cook();
            designPlates();
            prepareVegetables();
        }else if(employee instanceof Waiter){
            System.out.println("Waiter is working");
            serveCustomers();
            cleanTables();
            takeOrders();
        }

         */
        employee.work();

    }

    // Junk Drawer - Employee behavior must be the responsibility of employee objects

    /*// Chef's duties
    private void cook(){
        System.out.println("Cooking food");
    }

    private void designPlates(){
        System.out.println("Designing plates");
    }

    private void prepareVegetables(){
        System.out.println("Preparing vegetables");
    }

     */

    /*// Waiter's duties
    private void serveCustomers(){
        System.out.println("Serving food to customers");
    }

    private void cleanTables(){
        System.out.println("Cleaning the tables");
    }

    private void takeOrders(){
        System.out.println("Taking orders");
    }

     */
}
