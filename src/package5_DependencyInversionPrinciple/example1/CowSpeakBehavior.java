package package5_DependencyInversionPrinciple.example1;

public class CowSpeakBehavior implements SpeakBehavior{
    @Override
    public void makeSound() {
        System.out.println("Muuh");
    }
}
