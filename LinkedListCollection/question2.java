//Write a program that inserts 25 random integers from 0 to 100 in order into a LinkedList object.
// The program should sort the elements,
// then calculate the sum of the elements and the floating-point average of the elements.


package LinkedListCollection;

import java.util.LinkedList;
import java.util.Random;

public class question2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers= new LinkedList<>();
        Random randInt = new Random();

        //Inserting random integers from 0-25 into the linked-list
        for(int i = 0; i < 25; i++){
            int randomNumber = randInt.nextInt(101);
            numbers.add(randomNumber);
        }

        System.out.println("Unsorted List: " + numbers);

        //Sorting the list
        numbers.sort(null);

        //Calculating the sum of the elements
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }

        //Calculating the floating point average of the elements
        double average = (double) sum / numbers.size();

        System.out.println("Sorted List: " + numbers);
        System.out.println("Sum " + sum);
        System.out.println("Average: " + average);
    }
}
