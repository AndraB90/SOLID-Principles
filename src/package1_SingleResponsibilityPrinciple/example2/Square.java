package package1_SingleResponsibilityPrinciple.example2;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        super();
        this.side = side;
    }

    public int getSide() {
        return side;
    }



    @Override
    public int calculateArea() {
        return side*side;
    }

    @Override
    public int calculatePerimeter() {
        return 4*side;
    }
}
