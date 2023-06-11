package ExceptionHandling;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] array = new int[100];
      for (int i = 0; i < 100; i++) {
          int y = (int) (Math.random() * 100);
          array[i] = y;
      }
      try {
          System.out.println("Enter any index: ");
          int n = sc.nextInt();
          System.out.println("Value at stated index is: " + array[n]);
      } catch(ArrayIndexOutOfBoundsException e) {
          System.out.println("Exception caught at:" + e);
      }
    }
}
