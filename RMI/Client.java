package RMI;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception {
        AddI obj = (AddI) Naming.lookup("Add");
        System.out.println("Addition is: " + obj.add(5, 6));
    }
}
