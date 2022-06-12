package com.timbuchalka

import java.lang.StringBuilder

fun main(args: Array<String>) {


//  print (showTheNumber())

    val employes = listOf(
        EmployeeInfo("John", "brown", "2012"),
        EmployeeInfo("John", "white", "2015"),
        EmployeeInfo("John", "Bharti", "2017"),
        EmployeeInfo("Jessica", "ALba", "2011")
    )
//
//println(employes.minBy { emp -> emp.fname })
//println(employes)


//    val emp1 = Employees("John","brown", "2012")
//    val emp2 = Employees("John","brown","2012")
//   val emp3 = emp1.copy()
//    println(emp3==emp1)
//    var data =  emp1.Startyear.hashCode()
//    print(data)

//    searchForEmployee(employes,"ALba")
    searchForEmployee(employes,"Bharti")

    "Bharti".apply someString@{
        "ANother String".apply {
            print(toLowerCase())
            print(this@someString.toUpperCase())

        }
    }
}




data class EmployeeInfo(val firstName:String,val lastName:String,val Startyear:String)
{}


fun searchForEmployee(employee: List<EmployeeInfo>, lastname:String){
    employee.forEach returnBlock@ { empinfo->
        if (empinfo.lastName == lastname) {
            println("Yes, this employee existed $lastname")
            return@returnBlock
        }
    }

//}for(emp in employee) {
    println("No, this employee existed $lastname")
}

/*
fun showTheNumber()=
    StringBuilder().apply {
        for (i in 1..99){
            append(i)
            append(",")
        }
        append(100)
    }.toString()
*/



//lambda is sending receiver as a parameter or instance
//with is basically converting the instance inot a receiver
// and inside the lambda we don't have to refer receiver object when we want to
// refer to it's member function or value of it' property.
//fun showTheNumbers():String{
//
//    val number =StringBuilder()
//    return with(number){
//        for (i in 1..99){
//            append(i)
//            append(",")
//        }
//        append(100)
//        toString()
//    }

//}

//fun showTheNumber():String{
//    val number =StringBuilder()
//    for(i in 1..100){
//        number.append(i)
//        number.append(",")
//    }
//    number.append(101)
//    return number.toString()
//
//}