package package5_DependencyInversionPrinciple.example1;

public class Dog extends Animal{

    DogSpeakBehavior dogSpeakBehavior;
    public Dog(String breed, String color, DogSpeakBehavior dogSpeakBehavior) {
        super(breed, color);
        this.dogSpeakBehavior = dogSpeakBehavior;
    }

    @Override
    public void makeSound() {
        dogSpeakBehavior.makeSound();
    }
}
