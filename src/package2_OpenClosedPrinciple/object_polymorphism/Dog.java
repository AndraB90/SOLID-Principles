package package2_OpenClosedPrinciple.object_polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getClass().getSimpleName()+" makes Wouf");
    }
}
