package Homework6;

public class Bird extends Animal {
    @Override
    public void play() {
        System.out.println("Bird plays on the tree");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Birds can sing beautiful songs");
    }

    public void fly() {
        System.out.println("Birds can fly");
    }

    public void synk(Bird bird) {
        System.out.println("Bird is singing loud");
    }

    public void synk(Bird bird, Bird bird2) {
        System.out.println("2 birds are singing louder");
    }

    public void synk(Bird bird, Bird bird2, Bird bird3) {
        System.out.println("3 birds are singing more louder");
    }
}
