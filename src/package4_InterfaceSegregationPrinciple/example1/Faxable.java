package package4_InterfaceSegregationPrinciple.example1;

public interface Faxable {
    default void sendFax(){
        System.out.println("Document is faxed");
    }
}
