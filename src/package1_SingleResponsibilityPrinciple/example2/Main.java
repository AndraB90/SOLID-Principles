package package1_SingleResponsibilityPrinciple.example2;

public class Main {
    public static void main(String[] args) {
       Shape rectangle = new Rectangle(4, 2);
       Shape square = new Square(3);
       Shape circle = new Circle(3);

        rectangle.showAreaAndPerimeter();
        square.showAreaAndPerimeter();
        circle.showAreaAndPerimeter();
    }
}
