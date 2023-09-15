package package5_DependencyInversionPrinciple.example1;

public class Main {
    public static void main(String[] args) {
        Animal cow = new Cow("european", "white",new CowSpeakBehavior());
        Animal dog = new Dog("German Shepard", "black", new DogSpeakBehavior());
        Animal cat = new Cat("Siamese", "beige", new CatSpeakBehavior());

        cow.makeSound();
        dog.makeSound();
        cat.makeSound();


    }
}
