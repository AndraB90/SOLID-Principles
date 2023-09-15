package package3_LiskovSubstitutionPrinciple.example1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flyable>flyingBirds = new ArrayList<>(List.of(
                new Pigeon("pigeon", "grey"),
                new Parrot("parrot", "rainbow"),
                new Eagle("eagle", "brown")
        ));

        flyingBirds.forEach(Flyable::fly);

    }

}
