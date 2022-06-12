package com.timbuchalka.listCollections

import java.math.BigDecimal

fun main(args:Array<String>){


    val mixedList: List<Any> = listOf("strings",23,BigDecimal(23.45),"fall")
    val bigDecimal = getElementsOfType<String>(mixedList)

    for (itemDecimalsOnly in bigDecimal){
        println("$itemDecimalsOnly")
    }

}


 inline fun <reified T> getElementsOfType(collection:List<Any>):List<T>{

    val newList : MutableList<T> = mutableListOf()

    for (elements in collection){
        if(elements is T){
        newList.add(elements)
        }
    }

    return newList
}