package com.company;

public class Sportcar extends Car {

    private int maxSpeed;
    Sportcar(int weight, String color, int height, String mark, int price, int maxSpeed) {
        super(weight, color, height, mark, price);
        this.maxSpeed=maxSpeed;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double PriceRegister(int price, int hour) {
        double check= price * hour * 3.1;
        return check;
    }
}
