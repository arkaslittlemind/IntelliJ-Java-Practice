//Write a program that creates a LinkedList object of 10 characters,
// then creates a second LinkedList object containing a copy of the first list,
// but in reverse order.

package LinkedListCollection;

import java.util.Collections;
import java.util.LinkedList;
@SuppressWarnings("rawtypes")
public class question1 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i : arr){
                list1.add(i);
        }
        System.out.println("First List: " + list1);
        //System.out.println("-------------------------");

        Collections.reverse(list1);
        //System.out.println("Reversed List: " + list1);

        LinkedList list2;
        list2 = (LinkedList) list1.clone();

        System.out.println("Second List: " + list2);


    }
}