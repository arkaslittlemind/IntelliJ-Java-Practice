package Generics;

public class question1 {
    public static void main(String[] args) {

        // Creating an object with a pair of an integer and a string
        GenericPair<Integer, String> pair = new GenericPair<>(10, "Hello");

        // Retrieving the values from the public getter methods
        Integer firstValue = pair.getFirst();
        String secondValue = pair.getSecond();
        System.out.println("Integer value of object = " + firstValue);
        System.out.println("String value of object = " + secondValue);

        // Updating the values of the object
        pair.setFirst(20);
        pair.setSecond("World");

        System.out.println("\n");

        // Retrieving the updated values of the object
        Integer updatedFirstValue = pair.getFirst();
        String updatedSecondValue = pair.getSecond();
        System.out.println("Updated Integer value of object = " + updatedFirstValue);
        System.out.println("Updated String value of object = " + updatedSecondValue);
    }
}

class GenericPair<T, U> {
    private T first;
    private U second;

    public GenericPair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    //Setters and getters
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}