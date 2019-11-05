package com.company;

public class Tractor extends Car {
    private int power;

    Tractor(int weight, String color, int height, String mark, int price, int power) {
        super(weight, color, height, mark, price);
        this.power=power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public double PriceRegister(int price, int hour) {
        double check= price * hour * 1.1;
        return check;
    }
}
