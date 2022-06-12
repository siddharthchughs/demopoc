package com.timbuchalka


fun main() {
    class Employee(var name: String,val id: Int)


    val immutable = listOf("Siddharth","Brown","Mississipe")

    val convertToMutable = immutable.toMutableList()


    var immutable_set = setOf("Siddharth","Siddharth Chugh","Josh","Gorban","gorban","micheal")

    var listOf_Nulls = listOfNotNull("Fruits","nicheal",null,"Beverages","vegan","Vegetables")
//val books: Array<> = Employee("Siddharth Chugh",1)
    val arrayList = arrayListOf(1,2,3,4)

    val arrayListMutable = mutableListOf<Int>(1,2,3,4)

//    val array = arrayOf("black","whjite","green")

//    val listArray = array.toList()//listOf(*array)

    val fruitList = listOf("pineapple","guavva","blackgrapes","greengrapes","avacado","banna","papaya","peach","plump","apple")
    val newfruitList = listOf("pineapple","guavva","blackgrapes","banna","papaya","peach","plump","apple")

    val toList = listOf(fruitList[0])

//     print(fruitList.last{
//         it.startsWith("p")
//     })
//    print (arrayListMutable.javaClass)
//for (item in immutable_set)
//below written line define that, as the item in the list at the index position 5 is available print it or else
// for exception show null
// print(fruitList.getOrNull(15))

//     if(fruitList.size>5){
//         print(fruitList[5])

//     }
//print(listOf(fruitList,immutable)+"\n")
    //  print(fruitList+immutable)
//    print(fruitList.union(newfruitList))
//    val immutable = listOf("Siddharth","Brown","Mississipe")

// val convertToMutables = immutable.toMutableList()

//       convertToMutables.add("jessica")

//print (convertToMutables)

    val array = arrayOf("black","whjite","green")
    print(array.javaClass)

//    val convertToMutables = array.toMutableList()
//    convertToMutables.add("yellow")
//
//    val listNumber:IntArray = intArrayOf(1,2,3)
//    print("the type class"+listNumber.javaClass)
//
//    println(convertToMutables.javaClass)




}