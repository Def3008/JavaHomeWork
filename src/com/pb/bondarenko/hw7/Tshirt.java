package com.pb.bondarenko.hw7;

public class Tshirt extends Clothes implements WomenClothes, ManClothes {
    public Tshirt(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка");
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка");
    }
}
