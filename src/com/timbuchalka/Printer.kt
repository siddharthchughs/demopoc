package com.timbuchalka


fun main(args:Array<String>){

    val printer = LaserPrinter("HP 1234")
    printer.printModel()

}



abstract class Printer(val model_name:String) {
    open fun printModel() = println("the model name of the printer $model_name")
    abstract fun printPrice() : Double
}

open class LaserPrinter(modelName:String): Printer(modelName){

  override fun printModel() = print("THe model name is ${model_name}")
    override fun printPrice(): Double = 123.44

}


class SpecialTypeLaserPrinter(modelName:String) : LaserPrinter(modelName){

    override fun printModel() {

    }

}