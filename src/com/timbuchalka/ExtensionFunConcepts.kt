package com.timbuchalka

fun main(args: Array<String>){

    fun String.Char():Int  = this.length
    println("Hello".Char())

    val s = "Hello"
    println(s.UpperCase())

    val d = 4
    val e = 4
    print(d.Add().plus(e.Add()))

val studentOne = Student("Siddharth","23061985",1)
    studentOne.name
    studentOne.id
    studentOne.dob = "232424"
    print("this is the student detail: ${studentOne.name}: ${studentOne.id} :  ${studentOne.dob}")
}

fun Int.Add():Int{
    return this.toInt()+this.toInt()
}

fun String.UpperCase():String{
    return this.toUpperCase()
}

// using the concept with the backing field
class Submarine{
    fun fire():Unit{
        print("Hey I am an extension function, exciting isn't it.")
    }
}

class Student(val name:String,dob:String,var id:Int){

    var dob = dob

        get() {
            print("Hey")
            return field
        }
        set(value) {
            print("Hey")
            field = value
        }

}