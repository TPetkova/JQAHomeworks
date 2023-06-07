package Homework6;

public class AnimalDemo {
    public static void main(String args[]) {
        Bird bird = new Bird();
        bird.fly();
        bird.synk(bird);
        bird.synk(bird, bird);
        bird.synk(bird,bird,bird);
        bird.play();
        bird.makeSomeNoise();

        Cat cat = new Cat();
        cat.climp();
        cat.play();
        cat.makeSomeNoise();

        Dog dog = new Dog();
        dog.bringSticks();
        dog.play();
        dog.makeSomeNoise();
    }
}
