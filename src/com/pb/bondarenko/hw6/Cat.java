package com.pb.bondarenko.hw6;

public class Cat extends Animal{

    private int weight;

    @Override
    void makeNoise(String zhivotnoe) {
        super.makeNoise(zhivotnoe);
        System.out.println("А именно: ");
        System.out.println(zhivotnoe + " мяукает" +"\n");
    }

    @Override
    void eat(String zhivotnoe) {
        super.eat(zhivotnoe);
        System.out.println(zhivotnoe+" поправляется на 1%");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Местоположение - '" + getLocation() + '\'' +
                "Еда - " + getFood() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return weight == cat.weight;
    }

    @Override
    public int hashCode() {
        return weight;
    }
}
