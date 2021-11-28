package com.pb.bondarenko.hw10;


public class NumBox<T extends Number> {
    private final T[] number;

    public NumBox(int maxArrSize) {
        this.number = (T[]) new Number[maxArrSize];
    }

    public T get(int index) {
        return number[index];
    }

    public void set(int index, T number) {
        this.number[index] = number;
    }

    public void add(T num) throws Exception {
        boolean attempt = true;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == null) {
                number[i] = num;
                attempt = false;
                break;
            }

        }
        if (attempt) {
            throw new Exception("Массив полон, не резиновый!!!");
        }
    }

    public int length() {
        int maxI = 0;
        for (T num : number) {
            if (num != null) {
                maxI++;
//                System.out.println(maxI);
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
            if (n != null) {
                summ += n.doubleValue();
            }
        }
        return summ;
    }

    public T max() {
        T maxNumber = number[0];
        for (T n : number) {
            if (n != null) {
                if (maxNumber.doubleValue() < n.doubleValue()) {
                    maxNumber = n;
                }
            }
        }
        return maxNumber;
    }

}
