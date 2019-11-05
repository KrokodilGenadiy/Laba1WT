package com.company;

public class Limo extends Car {

    private int peopleLimit;

    Limo(int weight, String color, int height, String mark, int price, int peopleLimit) {
        super(weight, color, height, mark, price);
        this.peopleLimit= peopleLimit;
    }

    @Override
    public double PriceRegister(int price, int hour) {
        double check= price * hour * 2.5;
        return check;
    }


    public int getPeopleLimit() {
        return peopleLimit;
    }
    public void setPeopleLimit(int peopleLimit) {
        this.peopleLimit = peopleLimit;
    }

}
