import java.util.ArrayList;
import java.util.List;

public class LearnArrayList_Remove {
    public static void main(String[] args) {
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
        list.remove(1); //removes element at index 1
        System.out.println(list);

        list.remove(Integer.valueOf(60)); //removes the element with value 60
        System.out.println(list);

        list.clear();  //remove all elements from the list
        System.out.println(list);
    }
}
