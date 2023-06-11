package ExceptionHandling;

class NegativeDimensionException extends Exception{
    public String toString() {
        return "Dimensions cannot be negative";
    }
}
public class ThrowThrowsDemo {
    static int area(int length, int breadth) throws NegativeDimensionException{
        if(length < 0 || breadth < 0) {
            throw new NegativeDimensionException();
        }
        return length * breadth;
    }

    static void meth1() throws NegativeDimensionException {
        System.out.println("Area of rectangle is: " + area(-10, 5)); // will throw an exception
    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch(NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
