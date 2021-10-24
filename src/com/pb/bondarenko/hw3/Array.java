package com.pb.bondarenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int counter=0;
        Scanner imp = new Scanner(System.in);

        while (counter<arr.length){
            System.out.println("Введите целое число, элемент массива №: " + counter);
            arr[counter] = imp.nextInt();

            counter++;
        }
        System.out.println("Получился такой массив: ");
        for (int anArray : arr) {
            System.out.print(anArray + " ");
        }
        int posElms=0;
        int summArr=0;

        for (int i = 0; i < arr.length; i++) {
            summArr+=arr[i];
            if (arr[i]>0){
                posElms++;
            }
        }
        System.out.println("\nСумма элементов массива равна: "+summArr );
        System.out.println("Кол-во положительных элементов в массиве: "+posElms);

        boolean sorted = false;
        int tmp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    sorted = false;
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        System.out.println("Сортированный массив: ");
        for (int anArray : arr) {
            System.out.print(anArray + " ");
        }
    }
}
