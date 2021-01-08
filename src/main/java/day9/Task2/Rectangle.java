package day9.Task2;

public class Rectangle extends Figure{
    private int x;
    private int y;

    public Rectangle(int x, int y, String color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return x * y;
    }

    @Override
    public double perimeter() {
        return x + x + y + y;
    }
}
