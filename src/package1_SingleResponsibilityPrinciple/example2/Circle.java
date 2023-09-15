package package1_SingleResponsibilityPrinciple.example2;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public int calculateArea() {
        return (int) (Math.PI*radius*radius);
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2*Math.PI*radius);
    }
}
