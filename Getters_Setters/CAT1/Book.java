package Getters_Setters.CAT1;

public class Book {
    private String bookName;
    private String ISBN;
    private String authorName;
    private String publisher;

    public Book(String bookName, String ISBN, String authorName, String publisher){
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getInfo() {
        return "Book Name: " + bookName + "\nISBN: " + ISBN + "\nAuthor: " + authorName + "\nPublisher: " + publisher;
    }

}
