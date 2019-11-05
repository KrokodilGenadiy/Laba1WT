package com.company;

public abstract class Car {
    private int weight;
    private String color;
    private int height;
    private String mark;
    private int price;

    Car(int weight, String color, int height,String mark, int price){
        this.weight= weight;
        this.color= color;
        this.height= height;
        this.mark= mark;
        this.price=price;
    }



    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight= weight;
    }



    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }



    public String getMark(){
        return mark;
    }
    public void setMark(String mark){
        this.mark= mark;
    }



    public int getHeight(){
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }



    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public abstract double PriceRegister(int price, int hour);



}
