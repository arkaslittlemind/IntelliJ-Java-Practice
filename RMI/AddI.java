package RMI;

import java.rmi.Remote;

public interface AddI extends Remote {
     int add (int x, int y) throws Exception;
}
