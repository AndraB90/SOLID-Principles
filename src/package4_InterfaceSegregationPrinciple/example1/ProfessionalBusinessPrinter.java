package package4_InterfaceSegregationPrinciple.example1;

public class ProfessionalBusinessPrinter extends Printer implements Printable, Copyable, Faxable, Scanable{
    public ProfessionalBusinessPrinter(String brand) {
        super(brand);
    }

}
