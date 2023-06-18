package InterfaceTutorial;

interface Test {
    void method1();
    void method2();
}

class MyClass implements Test {
    public void method1() {
        System.out.println("Method 1 of class MyClass");
    }
    public void method2() {
        System.out.println("Method 2 of class MyClass");
    }

    public void method3() {
        System.out.println("Method 3 of class MyClass");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Test t = new MyClass();
        t.method1();
        t.method2();
    }
}
