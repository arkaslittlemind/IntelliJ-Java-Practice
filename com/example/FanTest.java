package com.example;

import java.util.Scanner;

public class FanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fan speed: ");
        int speed = input.nextInt();

        System.out.print("Enter fan color: ");
        input.nextLine();
        String color = input.nextLine();

        System.out.print("Enter fan radius: ");
        double radius = input.nextDouble();

        System.out.print("Is the fan on? (true/false): ");
        boolean on = input.nextBoolean();

        Fan fan = new Fan(speed, on, radius, color);
        System.out.println(fan);

        input.close();
    }
}







