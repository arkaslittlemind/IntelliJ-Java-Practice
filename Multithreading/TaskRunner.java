import java.util.Random;

//Main Class
public class TaskRunner {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();


    }
}

//First task
class Task1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();


            }
        }
    }
}


//Second task
class Task2 implements Runnable {
    public void run() {
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            int randomNumber = random.nextInt(140) + 110;
            System.out.println(randomNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
