package com.pb.bondarenko.hw6;

import com.pb.bondarenko.hw3.Array;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetClinic {
    public static void main(String[] args) throws Exception {
//Veterinarian veterinarian = new Veterinarian();
//Class clazz = veterinarian.getClass();
        //      System.out.println(clazz.getName());
        //     System.out.println(Arrays.toString(clazz.getMethods()));


        Dog a1 = new Dog();
        Cat a2 = new Cat();
        Horse a3 = new Horse("brown");
        Animal a = new Dog();

        Animal[] animals = {a1, a2, a3};

        a1.setFood("мяско");
        a2.setFood("вискас");
        a3.setFood("морковка");

        a1.setLocation("будка");
        a2.setLocation("чердак");
        a3.setLocation("конюшня");
        a1.makeNoise("Собакен");
        a2.makeNoise("Кошкен");
        a3.makeNoise("Коняка");
        a1.sleep("Собакен");
        a2.sleep("Кошкен");
        a3.sleep("Коняка");


        Class clazz = Class.forName("com.pb.bondarenko.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) {
            System.out.println("Отправляем животных к ветеринару: ");
            for (Animal animal : animals) {
                ((Veterinarian) obj).treatAnimal(animal);
            }
        }
    }
}
