package package5_DependencyInversionPrinciple.example1;

public abstract class Animal {
    protected String breed;
    protected String color;


    public Animal(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
