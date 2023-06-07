package Homework6;

public class Dog extends Animal{
    @Override
    public void play() {
        System.out.println("Dogs chase the ball");

    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Dogs are barking baw baw");
    }

    public void bringSticks() {
        System.out.println("Dogs can bring the stick");
    }
}
