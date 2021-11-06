package com.pb.bondarenko.hw6;

public class Animal {
    private String food;
    private String location;

    void makeNoise(String zhivotnoe) {
        System.out.println(zhivotnoe + " шумит");
    }

    void eat(String zhivotnoe) {
        System.out.println(zhivotnoe + " ест");
    }

    void sleep(String zhivotnoe) {
        System.out.println(zhivotnoe + " спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
