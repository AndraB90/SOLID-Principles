package package4_InterfaceSegregationPrinciple.example1;

public class DesktopLaserPrinter extends Printer implements Printable, Scanable{
    public DesktopLaserPrinter(String brand) {
        super(brand);
    }

}
