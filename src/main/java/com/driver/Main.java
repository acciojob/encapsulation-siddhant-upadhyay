package com.driver;

public class Main {

    public static void main(String[] args) {


        RWOnly obj = new RWOnly();

        // try setting a value to name in Main
        // function using setter function and access it's value using getter function
        obj.setName("siddhant");
        obj.getName();
    }

}