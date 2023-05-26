import java.util.List;
import java.util.ArrayList;

public class LearnArrayList_Add {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
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

        System.out.println(list.get(1)); //fetches element at specified index
    }
}
