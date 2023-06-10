package Getters_Setters;


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

    public Car(Car source) { //Copy Constructor
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }

    public String getMake() { //getter
        return make;
    }

    public double getPrice() { //getter
        return price;
    }

    public void setPrice(double price){ //setter
        this.price = price;
    }

    public int getYear() { //getter
        return year;
    }

    public void setYear(int year){ //setter
        this.year = year;
    }

    public String getColor() { //getter
        return color;
    }

    public void setColor(String color) {  //setter
        this.color = color;
    }


}
