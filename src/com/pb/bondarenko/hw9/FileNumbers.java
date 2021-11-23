package com.pb.bondarenko.hw9;

import java.io.*;

public class FileNumbers {


    public static void main(String[] args) throws IOException {

        int[][] arr = new int[10][10];
        int max_int = 100;
        int min_int = 1;

        createArray(arr, min_int, max_int);
        createNumbersFile(arr, "files\\numbers.txt");

        int[][] nArr = createOddNumbersFile("files\\numbers.txt");

        createNumbersFile(nArr, "files\\odd-numbers.txt");
    }

    private static String createNumbersFile(int[][] arr, String numbers) throws IOException {

        BufferedWriter b = new BufferedWriter(new FileWriter(numbers));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                b.write(String.valueOf(arr[i][j]) + " ");
            }
            b.newLine();
        }
        b.flush();
        b.close();

        return numbers;
    }


    private static int[][] createArray(int[][] arr, int min_int, int max_int) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (int) ((Math.random() * (max_int-min_int) ) + min_int);
            }
        }
        return arr;
    }


    private static int[][] createOddNumbersFile(String path) {
        int[][] arr = new int[10][10];
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            for (int i = 0; i < 10; i++) {
                String[] strArr = br.readLine().trim().split(" ");
                for (int j = 0; j < 10; j++) {
                    if (Integer.parseInt(strArr[j]) % 2 == 0) {
                        strArr[j] = String.valueOf(0);
                    }
                    arr[i][j] = Integer.parseInt(strArr[j]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
        return arr;
    }


}
