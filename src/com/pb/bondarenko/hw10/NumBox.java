package com.pb.bondarenko.hw10;

import java.util.Arrays;

public class NumBox<T extends Number> {
    private final T[] number;

    public NumBox(int maxArrSize) {
        this.number = (T[]) new Number[maxArrSize];
    }

    public void add(T num) throws Exception {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == null) {
                number[i] = num;
                break;
            }
//             else {
//                throw new Exception("Массив полон");
//            }
        }
    }

    public T get(int index) {
        return number[index];
    }

    public int length() {
        int maxI = 0;
        for (T number : number) {
            if (number != null) {
                maxI++;
            }
        }
        return maxI;
    }

    public double average() {
        return sum() / length();
            }

    public double sum() {
        double summ = 0;
        for (T n : number) {
            if (n!=null) {
                summ += n.doubleValue();
            }
        }
        return summ;
    }

    public T max() {
        T maxNumber = number[0];
        for (int i = 0; i < number.length; i++) {

            if (number[i].doubleValue() > maxNumber.doubleValue()) {
                maxNumber = number[i];
            } else break;
        }
        return maxNumber;
    }

}
