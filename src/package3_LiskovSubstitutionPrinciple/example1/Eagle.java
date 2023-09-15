package package3_LiskovSubstitutionPrinciple.example1;

public class Eagle extends Bird implements Flyable{
    public Eagle(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void fly() {
        System.out.println(breed+" is flying");
    }
}
