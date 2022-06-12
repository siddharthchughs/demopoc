package com.timbuchalka;

public class SomeOtherClass {

    /*
    * This method is calling the static method from the some class in java
    * and it doesn't require the class to be instantiated.
    * */
    public void aMethodDemo(){
        SomeClass.accessprivateVar();
    }
}