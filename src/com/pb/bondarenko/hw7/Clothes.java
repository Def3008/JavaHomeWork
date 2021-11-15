package com.pb.bondarenko.hw7;

public abstract class Clothes {
    private Size size;
    private float price;
    private String color;

    public Clothes(Size size, float price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return
                size +
                        ", Цена -" + price +
                        ", Цвет -'" + color + '\''
                ;
    }
}
