package AbstractClass;

public class AbstractWorking {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;

        Shape s = r;

        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
