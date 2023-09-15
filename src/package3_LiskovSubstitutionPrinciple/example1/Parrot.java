package package3_LiskovSubstitutionPrinciple.example1;

public class Parrot extends Bird implements Flyable{
    public Parrot(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void fly() {
        System.out.println(breed+" is flying");
    }
}
