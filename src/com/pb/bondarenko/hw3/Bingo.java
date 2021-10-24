package com.pb.bondarenko.hw3;

import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        int min_secret = 0;
        int max_secret = 100;
        int random_secret = min_secret + (int) (Math.random() * max_secret);
        int attempt=1;
        int uInput;
        Scanner input = new Scanner(System.in);

        while (true)  {
            System.out.println("Попытка № "+attempt);
            System.out.println("Для выхода введите 101. Угадайте целое число в диапазоне 1-100:");
            String s_input = input.nextLine() ;

            if (s_input.matches("[-+]?\\d+")){
            uInput = Integer.parseInt(s_input);
            } else {
                System.out.println("Вы ввели НЕ ЦЕЛОЕ ЧИСЛО, перезапуск...");
                continue;
            }

            if (uInput == 101){
                break;
            }

            if (uInput == random_secret){
                System.out.println("Поздравляем, Вы угадали!");
                System.out.println("Программа загадала: " + random_secret);
                System.out.println("Вы ввели: "+uInput);
                System.out.println("Использовано попыток: "+attempt);
                break;
            }

            if (uInput >random_secret){
                System.out.println("Загаданное число меньше, попробуйте ещё");
            }

            if (uInput <random_secret){
                System.out.println("Загаданное число больше, попробуйте ещё");
            }
            attempt++;

        }
    }
}
