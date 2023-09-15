package package2_OpenClosedPrinciple.example1;

public class Restaurant {
    public static void main(String[] args) {
        Employee chef = new Chef("Luigi", "Kitchen",true);
        Employee waiter = new Waiter("Marco", "Front", true);
        Employee security = new Security("Bluto", "Front Doors", true);
        Employee admin = new Administrator("Nick", "Administration", true);
        RestaurantManagement restaurantManagement = new RestaurantManagement();

        restaurantManagement.performDuties(chef);
        restaurantManagement.performDuties(waiter);
        restaurantManagement.performDuties(security);
        restaurantManagement.performDuties(admin);


    }
}
