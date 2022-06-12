package com.timbuchalka

import java.time.Year
import com.timbuchalka.customstructures.SomeClass
// Object singleton
// companion object
// object expression

 object CompanyCommunication{

     val currentYear = Year.now().value

     fun getLine() = "Our company rocks"

     fun getCompanyCopyrights() = "Copy rights are define for the company as of today $currentYear"

 }

fun main(arg: Array<String>) {
//    println(CompanyCommunication.getLine())
//  println(CompanyCommunication.getCompanyCopyrights())
 //   SomeClass.Companion.showData()
    val someString = SomeClass.convertLowerCase("Siddharth",true)
    print(someString.msg)
}


    class SomeClass {
        companion object {
            private val privateVar = 8
            fun showData() = println("Hey I am accessing my $privateVar")
        }
    }








