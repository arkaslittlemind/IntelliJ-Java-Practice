//Develop and test a class with an ArrayList of objects of type of your (innovative)
// choice (but not of in-built type) characterized by three relevant instance variables of your
// choice. Populate the array list with three such objects. Show how to iterate through the elements
// of the array list. Display the elements of the array list in
// increasing order of any one attribute.


package Generics;

import java.util.*;

class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "ID:" + id + "\nName:" + name + "\nPrice:" + price;
    }
}
public class question2 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Product A", 10.99));
        productList.add(new Product(2, "Product B", 5.99));
        productList.add(new Product(3, "Product C", 7.99));

        //Sorting the arraylist in ascending order of price
        productList.sort(Comparator.comparingDouble(Product::getPrice));

        System.out.println("Products sorted by price: \n");
        Iterator<Product> it = productList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println("-------------------------");
        }
    }
}
