package com.pb.bondarenko.hw6;

public class Horse extends Animal {

    private String eyeColor;

    public Horse(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    void makeNoise(String zhivotnoe) {
        super.makeNoise(zhivotnoe);
        System.out.println("А именно: ");
        System.out.println(zhivotnoe + " игогокает \n");
    }

    @Override
    void eat(String zhivotnoe) {
        System.out.println(zhivotnoe + " цокает копытами");
        super.eat(zhivotnoe);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "Местоположение- '" + getLocation() + '\'' +
                "Еда - " + getFood() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horse horse = (Horse) o;

        return eyeColor.equals(horse.eyeColor);
    }

    @Override
    public int hashCode() {
        return eyeColor.hashCode();
    }
}
