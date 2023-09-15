package package5_DependencyInversionPrinciple.example1;

public class Cow extends Animal{

    CowSpeakBehavior cowSpeakBehavior;
    public Cow(String breed, String color, CowSpeakBehavior cowSpeakBehavior) {
        super(breed, color);
        this.cowSpeakBehavior = cowSpeakBehavior;
    }

    @Override
    public void makeSound() {
        cowSpeakBehavior.makeSound();
    }
}
