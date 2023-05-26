import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
         ArrayList<String> studentsName = new ArrayList<>();
         studentsName.add("Arka");
         System.out.println(studentsName);

        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4); //adds 4 at the end of the list
        System.out.println(list);

        list.add(1, 50); //adds 50 at index number 1
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);   //appends all the elements of new list to the old list
        System.out.println(list);

        System.out.println(list.get(1)); //fetches element at specified index*/


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        // Accessing elements in a list with various looping statements //
        System.out.println("First Way ->>");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Elements: " + list.get(i));
        }

        System.out.println("Second Way ->>");
        for(Integer elements : list) {
            System.out.println("Elements: " + elements);
        }

        System.out.println("Third Way -->");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.println("Iterator" + it.next());
        }

        //list.set(2, 1000); // updates the element at the defined index
        //System.out.println(list);

        //System.out.println(list.contains(500)); //returns a boolean value if the element is present in the list

        /*System.out.println(list);
        list.remove(1); //removes element at index 1
        System.out.println(list);

        list.remove(Integer.valueOf(60)); //removes the element with value 60
        System.out.println(list);

        list.clear();  //remove all elements from the list
        System.out.println(list);*/
    }
}
