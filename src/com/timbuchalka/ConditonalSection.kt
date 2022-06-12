package com.timbuchalka


fun main(args: Array<String>) {


    val range  = 1..12


    println(6 in range)

//    val backWard = 12.downTo(2)
//
//    println(1 in backWard)
//
//    for(i in range){
//        print(i)
//    }
//
//    for(i in range step 2){
//        println(i)
//    }
//    for(i in 12 downTo 1){
//        println(i)
//    }

    for ( i in 12 downTo 3 step 3) { print(i)}


    val months = arrayListOf("January","February","March","April","May","June","July")

    for (indices in months.indices){
        println("${months[indices]} for it's index $indices")
    }

    months.forEach { print(it) }
    months.forEachIndexed { index, value -> println("$value belongs to each $index")}

//    months.forEachIndexed()

  for (i in 2 until 18 ){
      print(i)
  }
    //var num : Int

//    if(someCondition){
//        num = 50
//    }
//    else{
//        num= 60
//    }
//    num = somecondition()
//
//    val somecondition = 45 > 56
//    val num = if(somecondition) print("Yes")  else print("No")


//    val someAnotherCondition = 44>50
//
//    val result = if(someAnotherCondition){
//        print("Yes $someAnotherCondition")
//    }
//    else {
//        print("NO : $someAnotherCondition")
//    }

//    run{
//        print("I am in a lambda")
//    }

    val employee= listOf(
        Employes("John","White",2020),
        Employes("Merry","Jane",2009),
        Employes("Siddharth","Chugh",2022)
    )

//    println(employee.minBy { e-> e.Year })
    // double colon for reference to member variable using class name
    println(employee.minBy(Employes::Year))

//    var num = 10
//    run {
//        num++
//        print(num)
//    }
//      run{::topleveFunction }
}
   fun topleveFunction() = "Hey their I am a top Level function"

private data class Employes(val fname:String, val lname:String,val Year :Int)
{}
