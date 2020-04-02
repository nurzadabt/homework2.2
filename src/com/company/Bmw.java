package com.company;

public class Bmw extends Car implements Printable {

    private String model;

    public Bmw(String marka, int number, String model) {
        super(marka, number);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {


        System.out.println(getModel()+"-модель машины "+getNumber()+"-номер машины "+getMarka()+"-марка машины");
    }
}
