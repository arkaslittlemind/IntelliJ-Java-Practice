//Implementing multithreading using Thread Class

package Multithreading;

//class MyThread extends Thread {
//    public void run() {
//        int i = 1;
//        while(true) {
//            System.out.println(i + " Hello");
//            i++;
//        }
//    }
//}
public class ThreadTestThreadClass extends Thread{

    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ThreadTestThreadClass t = new ThreadTestThreadClass();
        t.start();
        int i = 1;

        while(true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
