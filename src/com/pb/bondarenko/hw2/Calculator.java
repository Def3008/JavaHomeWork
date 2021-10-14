package com.pb.bondarenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1,
            operand2;
        String sign;

        Scanner imp = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        operand1 = imp.nextInt();

        System.out.println("Введите второе целое число:");
        operand2 = imp.nextInt();

        System.out.println("Введите операцию (допустимы: +,-,/,*) :");
        sign = imp.next();

        System.out.println( operand1 + sign + operand2);

        switch (sign) {
            case "+": {
                System.out.println("Сумма чисел равна: " + (operand1 + operand2));
            }
                break;
            case "-": {
                System.out.println("Разница чисел равна: " + (operand1 - operand2));
            }
                break;
            case "*": {
                System.out.println("Произведение чисел равно: " + (operand1 * operand2));
            }
                break;
            case "/": {
                if (operand2 == 0) {
                    System.out.println("Извините, делить на 0 пока нельзя :(");
                } else {
                    System.out.println("Результат деления равен: " + (operand1 / (float)operand2));
                }
                break;
            }
            default: {
                System.out.println("Что-то пошло не так, повторите");
            }
        }
    }
}
