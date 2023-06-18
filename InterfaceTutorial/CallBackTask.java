package InterfaceTutorial;

interface Member {
    void callback();
}

class Store {
    Member[] members = new Member[10];
    int count = 0;

    void register(Member m) {
        members[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }
    }
}
    class Customer implements Member {
        String name;
        Customer(String n) {
            name = n;
        }
        public void callback() {
            System.out.println("Ok, I will visit, " + name);
        }
    }


public class CallBackTask {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Arka");
        Customer c2 = new Customer("Yash");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}
