package com.timbuchalka

data class Employees(var age:Int,val name:String)


fun collectionState(employeeCollect:Collection<Employees>,mes:String){
    employeeCollect.forEach {
        println("$mes :: ${it.name}")
    }
}


// accessing the scope of variables within the higher order function
fun collectionStateAppear(employeeCollect:Collection<Employees>,mes:String){
    var sam = 0
    var eCololection = 0
    employeeCollect.forEach {
        if(it.name.endsWith("a")){
            eCololection++
        }
    }
    println("$eCololection :: no of items")
}

fun collectionStateWith(employeeCollect:Collection<Employees>,mes:String){

    // lambda return the data using this oeprator
    with(employeeCollect){
        println(employeeCollect)
    }
}
fun collectionStateLet(employeeCollect:Collection<Employees>,mes:String){

    // lambda return the data using this oeprator
     employeeCollect.let {
         println(it.forEach {
            println( it.name)
         })
     }
}









fun gpoo(str:String,myfun:(String)->String):Unit{
println(myfun(str))
}

fun main(args:Array<String>){


    gpoo("Hey their",{message:String->message.toString()})
    gpoo("heyyyy",{message->message.reversed()})
    gpoo("Hey their",{it.reversed()})

    val employeList = listOf(
        Employees(name="Sam",age=56),
        Employees(name="Soneta",age=45),
        Employees(name="Sara",age = 67)
    )
    collectionStateLet(employeList,"Eror")



/*


    val employeList = listOf(
        Employees(name="Sam",age=56),
        Employees(name="Soneta",age=45),
        Employees(name="Sara",age = 67)
    )

    //if lambda is the last argument in the function then
    // it can removed from the parenthesis.
    println(employeList.maxBy { e:Employees-> e.age })

    //the lambda can be provided with the type inference for more optimized code
    // type inference means that we are gonna remove the type defined with the
    // the argument and just define the argument as a paramter to the lambda
    //
    println(employeList.maxBy {e->e.age} )

    // using it parameter

    println(employeList.maxBy { it.age })

*/
//   loop@ for(i in 1..9){
//        for(j in 2..5){
//            if(i==2&& j==3) continue@loop
//                println(i *100 +j)
//                print(" ")
//
//            print("Loop end")
//        }
//    }




}