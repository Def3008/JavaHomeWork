package com.pb.bondarenko.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка");
    }
}
