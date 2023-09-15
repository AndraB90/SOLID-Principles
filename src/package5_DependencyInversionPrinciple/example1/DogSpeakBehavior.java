package package5_DependencyInversionPrinciple.example1;

public class DogSpeakBehavior implements SpeakBehavior{
    @Override
    public void makeSound() {
        System.out.println("Wau wau");
    }
}
