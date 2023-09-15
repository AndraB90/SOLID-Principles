package package2_OpenClosedPrinciple.object_polymorphism;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}
