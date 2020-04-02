package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Bmw").print();
        createObject("Mercedes").print();

        createObject("Audi").print();


    }

    public static Printable createObject(String className) {
        Printable print = null;
        switch (className) {
            case "Bmw":


                print = new Bmw("Bmw R32", 157, "Bmw");

                break;

            case "Mercedes":


                print = new Mercedes("Mercedes Benz",2020,2012,3.5,"");

                break;

            case "Audi":

                print = new Audi("Audi B4", 111, 2500);

                break;
        }

        return print;


    }
}
