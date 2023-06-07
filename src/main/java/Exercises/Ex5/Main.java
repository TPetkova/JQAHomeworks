package Exercises.Ex5;

public class Main {
    public static void main(String[] args) {
        Shape array[] = new Shape[3];
        array[0] = new Rectangle(5,5);
        array[1] = new Circle(6,6);
        array[2] = new Triangle(2,1);

        double areaShapes[] = new double[array.length];
        for (int i=0; i< areaShapes.length;i++) {
            areaShapes[i] = array[i].calculateSurface();
        }

        for (double area : areaShapes) {
            System.out.println(area);
        }
    }
}
