package com.timbuchalka;

public class SomeClass {

    //private static variable
    private static int primitiveVar =56;

    public static void main(String[] args){
        new SomeOtherClass().aMethodDemo();
    }

    public static void accessprivateVar(){
        System.out.println("the private variable"+ primitiveVar);
    }

}
