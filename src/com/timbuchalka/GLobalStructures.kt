package com.timbuchalka

val MY_FAVOURITE_BOOK  = "MAKING OF NEW WORLD"


fun main(args: Array<String>) {
    println(MY_FAVOURITE_BOOK)

    val car1= Cars("blue","toyota",2023)
    val car2= Cars("green","tata nano",2012)
    val car3= Cars("purple","nissan",2020)


println( showCarsColor(car1,car2,car3))
val numbers = arrayOf(1,2,3)

    val myCars = arrayOf(car1,car2)
    val mycars2 = car2.copy()
    val mycars3 = arrayOf(myCars,mycars2)
    val viewAllcars = arrayOf(*myCars,mycars2, *mycars3)

    for (i in viewAllcars){
        println("the merged list")
        println(i)
    }

    val manyCars = arrayOf(car1,car2,car3)
    println("Many cars using * operator")
    showCarsColor(*manyCars)
}



fun showCarsColor(vararg cards: Cars){
    for (car in cards){
        println(car.color)
    }
}



data class Cars(var color:String,val name:String,var year:Int)