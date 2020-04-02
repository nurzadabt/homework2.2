package com.company;

public class Mercedes extends Car implements Printable {

    private int year;
    private double volue;

    String className;

    public Mercedes(String marka, int number, int year, double volue,String className) {

        super(marka, number);
        this.year = year;
        this.volue = volue;
        this.className=className;
    }

    public int getYear() {
        return year;
    }

    public double getVolue() {
        return volue;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public void print() {
        System.out.println(getYear()+"-год выпуска "+getVolue()+"-обьем двигателя "+getNumber()+"-номер машины "+getMarka()+"-марка машины"+getClassName());
    }
}
