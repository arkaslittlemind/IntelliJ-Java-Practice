package Getters;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

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
