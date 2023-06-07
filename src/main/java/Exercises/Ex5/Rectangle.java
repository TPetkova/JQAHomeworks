package Exercises.Ex5;

public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }
    @Override
    public double calculateSurface() {
        return height*width;
    }
}
