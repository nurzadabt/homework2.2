package com.company;

public class Car implements Printable {

    private String marka;
    private int number;

    public Car(String marka, int number) {
        this.marka = marka;
        this.number = number;
    }

    public String getMarka() {
        return marka;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void print() {

    }
}
