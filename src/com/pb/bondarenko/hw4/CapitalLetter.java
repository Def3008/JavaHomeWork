package com.pb.bondarenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку для обработки: ");
        String inpStrng = input.nextLine();

        System.out.println("Результат обработки: \n"+toApper(inpStrng));
            }
    static String toApper(String inpStrng){
        char [] arrInpStrng = inpStrng.toCharArray();
        for (int i = 0; i < arrInpStrng.length; i++) {
            arrInpStrng[0] = Character.toUpperCase(arrInpStrng[0]);
            if (arrInpStrng[i] == ' ' &&  i!=(arrInpStrng.length-1)) {

               try {
                   arrInpStrng[i + 1] = Character.toUpperCase(arrInpStrng[i + 1]);
               }catch (Exception e){
                   System.out.println("Вафля на "+arrInpStrng[i]);
               }
            }
           }
        StringBuilder sbf = new StringBuilder();
        return String.valueOf(sbf.append(arrInpStrng));
    }
}
