package Multithreading;

import java.util.Random;

public class ColorDisplayer implements Runnable {
    private String[] colors = {"white", "blue", "black", "green", "red", "yellow"};

    @Override
    public void run() {
        Random random = new Random();
        int index;

        do {
            index = random.nextInt(colors.length);
            String color = colors[index];
            System.out.println(color);

            try {
                Thread.sleep(1000); // Wait for 1 second between each color display
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!colors[index].equals("red"));
        System.out.println("Stop displaying colors");
    }

    public static void main(String[] args) {
        ColorDisplayer colorDisplay = new ColorDisplayer();
        Thread thread = new Thread(colorDisplay);
        thread.start();
    }
}

