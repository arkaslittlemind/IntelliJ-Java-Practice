import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //Wrapper Class
        //Class that wraps ie; stores primitive data as an object

        int x = 15;
        Integer y = new Integer(15);
        Integer z = y.intValue();

        list.add(x);
        list.add(y);
        list.add(z);


    }
}
