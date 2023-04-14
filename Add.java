import java.util.Scanner;

public class Add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("The sum of two numbers is: " + (n1 + n2));

    }
}
