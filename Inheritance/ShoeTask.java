package Inheritance;

public class ShoeTask {
    public static void main(String[] args) {
        Shoe s = new Shoe("Nike", 10);
        System.out.println(s.brand);

        Walking w = new Walking(true, "Puma", 8);
        System.out.println(w.goreTex);

        Running r = new Running(6.6, "Nike", 10);
        System.out.println(r.brand);
    }
}
