package package4_InterfaceSegregationPrinciple.example1;

public interface Printable {
    default void print(){
        System.out.println("Document is printed");
    }
}
