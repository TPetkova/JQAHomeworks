package Exercises.Ex5;

public class Circle extends Shape {
    public Circle(double width, double height) {
        super(width,height);
    }
    @Override
    public double calculateSurface() {
        double area = width*height;
        double radius = Math.sqrt(area/Math.PI);
        return radius;
    }

}
