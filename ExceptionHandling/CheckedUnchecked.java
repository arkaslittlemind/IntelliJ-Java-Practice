package ExceptionHandling;

class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance Should not be less than 10000";
    }
}
public class CheckedUnchecked {
    static void func1() {
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    static void func2() {
        func1();
    }
    static void func3() {
        func2();
    }
    public static void main(String[] args) {
        func3();
    }
}
