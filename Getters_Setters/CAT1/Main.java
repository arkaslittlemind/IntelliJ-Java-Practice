package Getters_Setters.CAT1;

public class Main {
    public static void main(String[] args) {

       Book book = new Book("Cracking the Coding Interview", "978-0-9847828-6-4", "Gayle Laakmann Mcdowell", "Career Cup");

       System.out.println("The details of the book are: " + book.getInfo());

    }
}
