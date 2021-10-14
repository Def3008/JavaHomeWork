package com.pb.bondarenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int userInput;
        Scanner ui = new Scanner(System.in);
        System.out.println("Введите целое число:");
        userInput = ui.nextInt();
        if (userInput >= 0 && userInput <= 14) {
            System.out.println("Введённое число: " + userInput + " попадает в диапазон:  [0-14] ");
        }else if (userInput >= 15 && userInput <= 35) {
            System.out.println("Введённое число: " + userInput + " попадает в диапазон:  [15-35] ");
        }else if (userInput >= 36 && userInput <= 50) {
            System.out.println("Введённое число: " + userInput + " попадает в диапазон:  [36-50] ");
        }else if (userInput >= 51 && userInput <= 100) {
            System.out.println("Введённое число: " + userInput + " попадает в диапазон:  [51-100] ");
        }else {
            System.out.println("Введённое число: " + userInput + " не попадает в интервалы:  [0-14],[15-35],[36-50],[51-100]");
        }
    }
}