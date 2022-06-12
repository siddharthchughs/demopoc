package com.timbuchalka.customstructures

//data class Employee(var id :Int,val name:String)

fun main(args:Array<String>){
//    println("The Employee Detail")
//    val emp1 = Employee("Siddharth")
//    println(emp1.firstName + emp1.fullTime)
//    val emp2 = Employee("Jessica Alba",false)
//    println(emp2.firstName +  emp2.fullTime)
//    println( labelMultiply(3,4))
//    println(addMultipleValues("helloe","wordl"))

    val employeList = listOf(Employee("Sam",56,true),Employee("Soneta",45,true),
        Employee("Sara",34,false))
    showCalculationInput(addition)

    //hwo to find the person working for the company by their age.

//    println(employeList.maxBy( { e:Employee->e.age.toString().toInt() }))
    println(employeList.maxBy { e: Employee -> e.age.toString().toInt() })


//    showStringFormat("sidd", lamString)
   showStringFormatStr( lamString)
//    showStringFormatOne(arrayOf(1,2,3,4), lamIntegers)
  //  doCalcualation(::add)
}

//val strinNamesInty= {a:Array<Int>-> a.size}
//
//fun showStringNames(aName: Array<(Array<Int>) -> Int>){
//    aName.toString()
//}

fun add(a:Int,b:Int):Int{
    val sum = a+b
    return sum
}

fun doCalcualation(addfunc:(Int,Int)->Int){
    val result = addfunc(3,5)
   print(result)
}

val addition= { a:Int,b:Int -> a+b }
fun showCalculationInput(addy:(Int,Int)->Int){
    var result = addy(2,3)
    print(result)
}

fun showStringUpp(s:String):Unit {
    println(s)
}

val lamString = {s:String-> s.showFirstUpperCase()}

val lamIntegers = { a:Array<Int> -> arrayOf(1,2,3,4)}

fun showStringFormat(str:String,strName:(String)-> String){
    val resultString = strName(str)
    print(resultString)
}
fun showINtegerFormatFormat(str:String,strName:(Int)-> Int){
    val resultString = strName(strName.toString().toInt())
    print(resultString)
}

fun showStringFormatStr(strName:(String)-> String)
{
    println( strName("Siddharth"))
 }


fun addMultipleValues(param2: String,param1: String):String{
    return "${param2} + ${param1}"
}

fun labelMultiply(param1:Int,param2:Int):Int{
    return param1+ param2
}

class Employee(val firstName:String,var age:Int, var fullTime:Boolean= true){
}