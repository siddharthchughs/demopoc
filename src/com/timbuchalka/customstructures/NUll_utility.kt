package com.timbuchalka.customstructures;

fun main(args: Array<String>) {

//        val str :String ?= null
//        str?.toUpperCase()
//        println("This null concept : ${str}")


        //not null assertion operator

//        val str1: String? =null
//        str1  = str!!
//        val str3 = str1.showFirstUpperCase()

        val arrayElements = arrayOfNulls<Int>(5)
        for (elements in arrayElements.indices){
                println("${arrayElements[elements]} : ${elements}")
        }
}
