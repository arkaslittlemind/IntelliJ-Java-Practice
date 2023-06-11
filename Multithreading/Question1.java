//Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
package Multithreading;
class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while(true) {
            System.out.println("Good Morning");
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
