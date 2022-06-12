package com.timbuchalka.listCollections

fun main(args:Array<String>){
        println("hey")
    val declare = DecalreLateinit()
    declare.myname = "Sid"
    println(declare.myname)

    val studentData = Student(grade="2",firstName="Siddharth",lastName="Chugh",yearOfJoin=2010)

    val (name, grade,yoJoin) = studentData
    println("$name : $grade  : $yoJoin")


}

 class DecalreLateinit{
     lateinit var myname : String

     fun setValue (name:String){
         myname = name
     }
     fun getValue() = if(this::myname.isLateinit) myname else "No default"

 }






class Student(val firstName:String,val lastName:String,val grade:String,val yearOfJoin:Long){
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = yearOfJoin
}
