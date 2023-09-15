package package5_DependencyInversionPrinciple.example1;

public class CatSpeakBehavior implements SpeakBehavior{
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
