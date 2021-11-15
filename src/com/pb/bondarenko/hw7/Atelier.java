package com.pb.bondarenko.hw7;

public class Atelier {
    public static void main(String[] args) {

        Clothes[] clothes = {
                new Tshirt(Size.S, 200, "red"),
                new Tshirt(Size.XS, 250, "brown"),
                new Pants(Size.XXS, 2000, "grey"),
                new Pants(Size.L, 20, "blue"),
                new Skirt(Size.M, 666, "black"),
                new Skirt(Size.L, 0, "pink"),
                new Tie(Size.S, 1000, "green"),
                new Tie(Size.XXS, 5000, "silver")
        };
        dressMan(clothes);
        dressWomen(clothes);
    }

    static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
                System.out.println(clothe);
            }
        }

    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
                System.out.println(clothe);
            }
        }
    }
}
