package package4_InterfaceSegregationPrinciple.example1;

public interface Scanable {
    default void scan(){
        System.out.println("Document is scanned");
    }
}
