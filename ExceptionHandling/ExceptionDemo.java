package ExceptionHandling;


import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            //System.out.println(e);
            System.out.println("Denominator should not be zero. TRY AGAIN!!");
        }

        System.out.println("Exit");
    }
}
