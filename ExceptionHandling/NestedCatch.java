package ExceptionHandling;

public class NestedCatch {
    public static void main(String[] args) {
        int[] A = {30, 20, 10, 40, 0};

        try {
            int x = A[0] / A[4]; //will throw an error
            System.out.println("Result is: " + x);

            try {
                System.out.println(A[5]); //will throw an array index out of bound exception
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is Invalid");
            }
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero!!");
        }
        System.out.println("Exiting Programme!!");
    }
}

