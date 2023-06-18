package AbstractClass;

public class AbstractWorking {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        System.out.println(((Shape) r).area());
        System.out.println(((Shape) r).perimeter());
    }
}
