package package2_OpenClosedPrinciple.object_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
    public static void main(String[] args) {
        List<Animal> animalList= new ArrayList<>(List.of(
                new Dog("Spike"),
                new Cat("Tom"),
                new Mouse("Jerry"),
                new Horse("Fury"),
                new Chicken("Maurice")
        ));


        /*for (Animal a: animalList) {
            a.makeSound();
        }

         */

        animalList.forEach(Animal::makeSound);

    }
}
