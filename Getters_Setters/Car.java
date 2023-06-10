package Getters_Setters;

public class Car {
    private final String make;
    private final double price;
    private final int year;
    private final String color;

    public Car(String make, double price, int year, String color){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public double getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }



}
