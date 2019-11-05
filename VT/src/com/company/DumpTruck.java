package com.company;

public class DumpTruck extends Car {

    private int weightLimit;

    DumpTruck(int weight, String color, int height, String mark, int price, int weightLimit) {
        super(weight, color, height, mark, price);
        this.weightLimit= weightLimit;
    }


    public int getWeightLimit() {
        return weightLimit;
    }
    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    @Override
    public double PriceRegister(int price, int hour) {
       double check= price * hour * 1.8;
        return check;
    }
}
