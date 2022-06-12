package com.timbuchalka.customstructures


fun main(args:Array<String>){

    val cars = Cars("1","Toyota","2010")

    val cars2 = Cars("2","Toyota","2010")

    val cars3 = cars

    println(cars.name == cars2.name)
    println(cars === cars3)
    println (cars2.javaClass)
//    val car5 = car4.year_model.hashCode()
    //println("hascode : $car5")
  //  println(car4 == cars2)
    val modelyear = cars.year_model.hashCode()
    val modelyear2= cars2.year_model.hashCode()

    println("${modelyear}  ${modelyear2}  ${modelyear.equals(modelyear2)} ")
    println(cars.id.hashCode() == cars.year_model.hashCode())
}


//data class Cars(val id:String, var name:String,var year_model:String)

class Cars(val id:String, var name:String,var year_model:String)