package com.vect;

public abstract class MotoVehicle {
    public String no;
    public String brand;
    public String color;
    public String mileAge;
    public int price;

    public abstract void calcRent(int days);
}
