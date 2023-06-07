package Homework6;

public class Cat extends Animal {
    @Override
    public void play() {
        System.out.println("Cat plays on the carpet");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Cats make meow meow");
    }

    public void climp() {
        System.out.println("Cats love to purr");
    }
}
