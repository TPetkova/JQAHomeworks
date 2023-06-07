package Exercises.Ex6;

public class Main {
    public static void main(String[] args) {
        Animal animals[] = { new Dog(2, "Sparky", "male"),
                                new Cat(5,"Dodo", "male"),
                                new Frog(1, "Jasmine", "female"),
                                new Kitten(1, "Kati", "female"),
                                new Tomcat(6, "Tom", "male")};
        for (Animal animal: animals) {
            System.out.println("This is: " + animal.getName() + " and it is " + animal.getAge() +
                            " years old and it is " + animal.getGender() + " and it makes sound " +
                                animal.makeSound());

        }

    }
}
