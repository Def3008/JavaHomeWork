package com.pb.bondarenko.hw10;

public class Main {
    public static void main(String[] args) throws Exception {
        NumBox<Float> floatNumBox = new NumBox<>(5);
        floatNumBox.add(55.5F);
        floatNumBox.add(8.3F);
        floatNumBox.add(444.9F);
        floatNumBox.add(1.1F);
        floatNumBox.add(0.1F);
//        floatNumBox.add(2.1F); // для проверки нерезиновости раскомментировать

        System.out.println("----- Значения для \"Float\" -----");
        System.out.println("Текущее количество элементов: "+floatNumBox.length());
        System.out.println("Число под индексом 2: "+floatNumBox.get(2));
        System.out.println("Среднее арифметическое элементов массива: "+floatNumBox.average());
        System.out.println("Максимальный элемент массива: "+floatNumBox.max());
        System.out.println("Сумма всех элементов массива: "+floatNumBox.sum());


        NumBox<Integer> integerNumBox = new NumBox<>(3);
        integerNumBox.add(33);
        integerNumBox.add(44);
        integerNumBox.add(22);
//        integerNumBox.add(6); // для проверки нерезиновости раскомментировать

        System.out.println("----- Значения для \"Integer\" -----");
        System.out.println("Текущее количество элементов: "+integerNumBox.length());
        System.out.println("Число под индексом 1: "+integerNumBox.get(1));
        System.out.println("Среднее арифметическое элементов массива: "+integerNumBox.average());
        System.out.println("Максимальный элемент массива: "+integerNumBox.max());
        System.out.println("Сумма всех элементов массива: "+integerNumBox.sum());
    }
}
