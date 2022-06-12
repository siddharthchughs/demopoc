package com.timbuchalka.customstructures

fun main(args:Array<String>){

    val burgerPrice = 1

    when(burgerPrice){
        0-> print("NO burgers available")
        1-> print("Only one left for an order")
        2-> print("I am so hungry")
        3-> print("Sorry further orders can be taken for now ")
        else->{
            print("Are you sure.")
        }
    }


    var num= 10
    for (numbers in 0..num){
        println("the numbers are: $numbers")
    }

    var myName = "Siddharth"

    for (myChar in myName){
        println("the flow of char : $myChar")
    }

    for (myNumbers in 10.rangeTo(20).step(2)){
        println("my nmbers are: $myNumbers")
    }
    for ((index,items) in 10.rangeTo(20).step(2).withIndex()){
        println("index for each numbers is ${index+1} are: $items")
    }

    var arrayItem = arrayOf("a","I","o","e","u")

    for (elements in arrayItem.indices){
        println("the index for each ${elements} is ${arrayItem[elements]}")
    }


}