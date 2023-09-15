package package5_DependencyInversionPrinciple.example1;

public class Cat extends Animal{
    CatSpeakBehavior catSpeakBehavior;
    public Cat(String breed, String color, CatSpeakBehavior catSpeakBehavior) {
        super(breed, color);
        this.catSpeakBehavior=catSpeakBehavior;
    }

    @Override
    public void makeSound() {
        catSpeakBehavior.makeSound();
    }
}
