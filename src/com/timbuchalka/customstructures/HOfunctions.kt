package com.timbuchalka.customstructures

import com.timbuchalka.Helper.Utility
import com.timbuchalka.UtilityHelper

fun main(args:Array<String>) {

    val myD :Int = 23

    val studentOne = Student(1,"Siddharth","Chugh")
    println(studentOne.name)
   val studentTwo = Student(2,"Micheal","Obama")
   val studentThree = Student(3,"Sean","Paul")
   val studentFour = Student(4,"Susan","Alba")
    println(studentOne.name)
    println(studentOne.id===studentTwo.id)
    println(studentOne.name==studentTwo.name)

    val studentFive: Any = studentFour

    if(studentFive is Student){
        val someData = studentFive.name
        println(someData)
    }

    val dataString = """Humpty Dumpty sat on a wall
        *Humpty Dumpty had a great fall
        *All the king's horses and the king's men 
        *Couldn't put Humpty together againnnnn.......
    """.trimMargin("*")

    println(dataString)

    println(showString(label="I know", operand1 = "Siddharth", operand2 = "Chugh"))

    // example for the named parameters
     showStudent(studentFour,studentOne,studentTwo,dt="Hey there")

    val s = "Hey there this is me extension function"
    println(s.showFirstUpperCase())
   println(Utility().showFirstUpperCase("Siddharth Chugh"))


        val su1 :Int =0
        val su2 :Int =0
        val su3 = su1.plus(su2)
        println(su3.showAddition())
//   val range : Int = -500
//       range.showRnage()
//
    var total : Int
    val initialValue = 0
    for(fb in initialValue..20){
        total = fb +initialValue
        println(total)
    }

   println(showAddition(num2 = 2, numb1 = 3))

    val dogDetal  = showDogInfo(dog_Name = "0jon", dog_Age = "2")
   println(dogDetal)
}


fun showAddition(numb1:Int,num2:Int):Int{
    return numb1+num2
}

fun showDogInfo(dog_Name:String,dog_Age :String){
    println("hey there my dog's name is ${dog_Name} and it is ${dog_Age} years old, thanks for your time !!")
}


fun Int.showRnage(){

    for (rangesDefined in this..1){
        println("${rangesDefined}")
    }


}

fun Int.showAddition():Int{

    val a = 23
    val b = 45
    val c = a+b
    return c
}



fun String.showFirstUpperCase():String{
    val uppserString = substring(0,3).toUpperCase() + substring(1)
    return uppserString.substring(0,uppserString.length-1) +
            uppserString.substring(uppserString.length -1,uppserString.length).toUpperCase()
}


fun showStudent(vararg student: Student,dt: String){
    student.forEach { println(it.name) }
}
fun showString(operand1:String,operand2:String,label:String="Hey") =
    "${operand1} ${operand2} ${label}"


class Student(var id:Int,val name:String,val lastName:String)


