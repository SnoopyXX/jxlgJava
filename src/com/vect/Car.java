package com.vect;

public class Car extends MotoVehicle{
    public String type;

    public Car(){

    }

    public Car(String no,String type,int price){
        super.no = no;//父类
        super.price = price;
        this.type = type;//当前类
    }

    @Override
    public void calcRent(int days) {
        System.out.println(days * super.price);
    }
}
