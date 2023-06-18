package AbstractClass;

abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }
    public void meth1() {
        System.out.println("Method 1 of Super");
    }
    abstract public void meth2();
}

    class SubClass extends Super {
    @Override
    public void meth2() {
            System.out.println("Subclass Method 2");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Super s = new SubClass();
        s.meth1();
        s.meth2();
    }

}
