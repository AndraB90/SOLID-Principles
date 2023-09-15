package package1_SingleResponsibilityPrinciple.example2;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }



    @Override
    public int calculateArea() {
        return length*width;
    }

    @Override
    public int calculatePerimeter() {
        return 2*(length+width);
    }
}
