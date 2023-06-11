package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero. TRY AGAIN!!");
        }

        System.out.println("Exit");
    }
}
