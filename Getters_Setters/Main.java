package Getters_Setters;

public class Main {
    public static void main(String[] args) {
        Car Nissan = new Car("Nissan", 10000, 2020, "Green");
        Car Datsun = new Car("Datsun", 11000, 2023, "Blue");

        System.out.println("This " + Nissan.getMake() + " is worth $" + Nissan.getPrice() + ". It was built in " + Nissan.getYear() + ". It is " + Nissan.getColor() + ".\n" );
        System.out.println("This " + Datsun.getMake() + " is worth $" + Datsun.getPrice() + ". It was built in " + Datsun.getYear() + ". It is " + Datsun.getColor() + ".\n" );


    }
}
