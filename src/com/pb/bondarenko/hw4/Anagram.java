package com.pb.bondarenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первую строку : ");
        String firstSt = input.nextLine();
        System.out.println("Введите вторую строку : ");
        String secondSt = input.nextLine();

 if (equalsStr((sortInpStr(firstSt)),(sortInpStr(secondSt)))){
     System.out.println("Введённые строки являются анограммами");
 } else {
     System.out.println("Введённые строки НЕ являются анограммами");
 }

    }
    static String sortInpStr(String str){
        String lowStr=str.toLowerCase();
        char [] arrInpString = lowStr.toCharArray();
        Arrays.sort(arrInpString);
        String concat="";
        for (int i = 0; i < arrInpString.length; i++) {
            if(Character.isDigit(arrInpString[i]) || Character.isLetter(arrInpString[i]) ){
            concat= concat+(new StringBuilder().append(arrInpString[i]).toString());
            }
        }
    return concat;
    }

    static boolean equalsStr (String first, String second){
        return (first.equals(second));
            }
}


