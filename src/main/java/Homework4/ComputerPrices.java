package Homework4;

public class ComputerPrices {
    public static void main(String args[]) {
        Computer comp1 = new Computer(0,0.0,"");
        comp1.price = 4400.99;

        Computer comp2 = new Computer(2020,5000,"Windows10");

        System.out.println(comp1.comparePrice(comp2));

    }
}
