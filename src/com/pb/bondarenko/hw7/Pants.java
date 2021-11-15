package com.pb.bondarenko.hw7;

public class Pants extends Clothes implements WomenClothes, ManClothes {
    public Pants(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Брюки");
    }

    @Override
    public void dressWomen() {
        System.out.println("Брюки");
    }
}
