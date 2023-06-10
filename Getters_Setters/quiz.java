package Getters_Setters;

public class quiz {
    public static void main(String[] args) {

        Shirt nike = new Shirt("Nike", 20.99, "Small");

        nike.brand = "woops, accidental update";
        System.out.println("Brand: " + nike.brand);
        System.out.println("Price: " + nike.price);
        System.out.println("Size: " + nike.size);

    }
}
class Shirt {

    String brand;
    double price;
    String size;

    // constructor...


    public Shirt(String brand, double price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public String getBrand() {
        return this.brand;
    }
    public double getPrice() {
        return this.price;
    }
    public String getSize() {
        return this.size;
    }

}