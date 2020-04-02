package com.company;

public class Audi extends Car implements Printable {


    private  int size;

    public Audi(String marka, int number, int size) {
        super(marka, number);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(getSize()+"-размер "+getNumber()+"-номер машины "+getMarka()+"-марка машины");
    }
}
