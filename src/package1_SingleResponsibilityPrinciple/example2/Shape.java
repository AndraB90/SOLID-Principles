package package1_SingleResponsibilityPrinciple.example2;

public abstract class Shape {
    public AreaCalculatorService areaCalculatorService;
    public PerimeterCalculatorService perimeterCalculatorService;

    public Shape() {
        this.areaCalculatorService = new AreaCalculatorService();
        this.perimeterCalculatorService = new PerimeterCalculatorService();
    }

    public void showAreaAndPerimeter(){
        System.out.println("The perimeter is: "+this.perimeterCalculatorService.calculatePerimeter(this));
        System.out.println("The area is: "+this.areaCalculatorService.calculateArea(this));
    }

    public abstract int calculateArea();
    public abstract int calculatePerimeter();
}
