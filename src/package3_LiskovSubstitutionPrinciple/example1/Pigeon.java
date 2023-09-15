package package3_LiskovSubstitutionPrinciple.example1;

public class Pigeon extends Bird implements Flyable{
    public Pigeon(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void fly() {
        System.out.println(breed+" is flying");
    }
}
