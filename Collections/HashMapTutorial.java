package Collections;

import java.util.HashMap;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("yash", "234567");
        map.put("Arka", "123456");
        map.put("deb", "7890");

        System.out.println(map);

        System.out.println(map.containsValue("234567"));
        System.out.println(map.containsKey("yash"));

    }
}
