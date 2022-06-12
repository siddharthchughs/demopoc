package com.timbuchalka.mapCollection

fun main(args: Array<String>) {


    val setValues = setOf(10,15,24,36,37,128)

  //  println(setValues.filter { it % 2 == 0 })

    val immutableList = mapOf<Int,Cars>(
        1 to Cars("HYBRID model 2","tesla",2018),
        2 to Cars("Camery","Toyota",2015),
        3 to Cars("Maruti Creta","Susuki",2015)
    )

//    println(immutableList.filter { it.value.company_name.endsWith("a") })



    println(immutableList.filter { it.value.name.contains("m") && it.value.model_year== 2015 && it.value.model_year == 2015 })
    println(immutableList.size)

    val arrayList = listOf(23,34,45,45,66)
//    val mutableList : MutableList<Int> = mutableListOf()
//    for (i in arrayList){
//        mutableList.add(i+10)
//    }
    val mutable = arrayList.map { it+10 }
    println(mutable)



}

data class Cars(val name:String,val company_name:String,var model_year:Int ){

}