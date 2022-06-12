package com.timbuchalka.typeconstructors

fun main(args: Array<String>) {

val emp = Employee("John")
    println(emp.firstname)
    emp.fulltime  = false
    println(emp.fulltime)
val emp2 = Employee("GI.Jo")
    println(emp2.firstname)
    println(emp2.fulltime)
val emp3 = Employee("Catherine")
    println(emp3.firstname)
    emp3.fulltime= false
    println(emp3.fulltime)

    print(emp.equals(emp2))
    print(emp ==emp2)
    print(emp ===emp2)

}

class Employee(val firstname:String, fulltime: Boolean=true ){
    var fulltime=fulltime
    get(){
        println("Running the custom get")
    return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }
}
