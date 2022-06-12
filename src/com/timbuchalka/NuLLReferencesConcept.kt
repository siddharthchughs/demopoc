package com.timbuchalka

fun main(args: Array<String>) {


    val demoNull : String ?= null

    val nullableint = arrayOfNulls<Int>(5)
     for (nullValues in nullableint) {
         println(nullValues)
     }

    val valueFloat:Float?= -3847.384f
    val valuesFloat : Float?
    valuesFloat  =-3847.384f
    println(valuesFloat)


    val valuesForShort  = shortArrayOf(1,2,3,4,5)
    for (shtType in valuesForShort) {
        println(shtType)
    }

    val valuesShort: Array<Short> = arrayOf(1,2,3,4,5)
    for (shtType in valuesShort) {
        println(shtType)
    }
     val showValuesNUllable  = arrayOfNulls<Int>(200)
    for (nullableVal in showValuesNUllable){
        println(nullableVal)
    }

}