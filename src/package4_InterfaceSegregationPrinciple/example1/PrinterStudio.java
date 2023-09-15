package package4_InterfaceSegregationPrinciple.example1;

public class PrinterStudio {
    public static void main(String[] args) {
        DesktopLaserPrinter laserPrinter = new DesktopLaserPrinter("Epson");
        DesktopHousePrinter housePrinter = new DesktopHousePrinter("Canon");
        ProfessionalBusinessPrinter professionalBusinessPrinter = new ProfessionalBusinessPrinter("LG");

        laserPrinter.print();
        laserPrinter.scan();

        housePrinter.print();

        professionalBusinessPrinter.copy();
        professionalBusinessPrinter.print();
        professionalBusinessPrinter.scan();
        professionalBusinessPrinter.sendFax();
    }
}
