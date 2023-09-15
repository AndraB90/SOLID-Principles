package package4_InterfaceSegregationPrinciple.example1;

public interface Copyable {
    default void copy(){
        System.out.println("Document is copied");
    }
}
