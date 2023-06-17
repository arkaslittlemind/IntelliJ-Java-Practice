package Multithreading;

import java.util.Random;

public class ColorDisplayer implements Runnable {

    private String[] colors = {"White","Blue","Black","Green","Red","Yellow"};

    @Override
    public void run() {
        Random random = new Random();
        String selectedColor;

        do {
            int colorIndex = random.nextInt(colors.length);
            selectedColor = colors[colorIndex];
            System.out.println(selectedColor);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!selectedColor.equals("red"));
        System.out.println("Stop displaying the colors");
    }
    public static void main(String[] args) {
        ColorDisplayer colorDisplayer = new ColorDisplayer();
        Thread t = new Thread(colorDisplayer);
        t.start();
    }

}
