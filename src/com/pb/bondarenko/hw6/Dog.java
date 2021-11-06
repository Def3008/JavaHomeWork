package com.pb.bondarenko.hw6;

import java.util.Objects;

public class Dog extends Animal {

    private String muzzle;

    @Override
    void makeNoise(String zhivotnoe) {
        super.makeNoise(zhivotnoe);
        System.out.println("А именно: ");
        System.out.println(zhivotnoe + " гавкает \n");
    }

    @Override
    void eat(String zhivotnoe) {
        System.out.println(zhivotnoe + " снимает намордник");
        super.eat(zhivotnoe);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "Местоположение - '" + getLocation() + '\'' +
                "Еда -'" + getFood() + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return muzzle.equals(dog.muzzle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(muzzle);
    }


}
