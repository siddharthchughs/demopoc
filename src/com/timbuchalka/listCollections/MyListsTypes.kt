package com.timbuchalka.listCollections

/*This program is based upon different types of collections
*
* */

fun main(args: Array<String>) {

    /*listOf:
    * */

    val myIntArray = listOf(1, 23, 345, 57683, 2345)
    val myStringArray = listOf("1", "23", "345", "57683", "2345")



    for (eachElement in myIntArray.indices){
            println("not divisible by 2 ${myIntArray[eachElement]}: :: ${myIntArray.get(eachElement).toString().length}")
        if(myIntArray.get(eachElement).toString().length%2==0 ){
            println("items is even ${myIntArray[eachElement]}:: ")
        }
        else{
            println("items is odd ${myIntArray[eachElement]}")

        }
       println(myIntArray.filter { it.toString().length%2==0 })
    }
    for (eachElement in myStringArray.indices){
        println("the length of each number with array ${myStringArray[eachElement]}: ${myStringArray.get(eachElement).length}")
    }





    myIntArray.forEach {
        print(it)
    }

    val myListString = listOf("Summer, Autumn,Spring, monsoon, Winter")
    val myindexedString = arrayOf("Summer, Autumn,Spring, monsoon, Winter")

    myListString.forEach {
       println(it)
    }

    myListString.forEach {
        println("lenght ${it}")
    }

    myindexedString.forEachIndexed{index, value -> println("$value  of index $index") }


    val convertimmutable_To_mutable = myListString.toMutableList()
    convertimmutable_To_mutable.add(1, "weather of happiness")
    println(convertimmutable_To_mutable)

//    print(myListString.javaClass)

    /*Make a empty list in Collection
    * */

    val emptyList = emptyList<String>()
    println(emptyList)

//    var strings = listOf<String>()
//    strings.

    println(emptyList.isEmpty())

    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }
    println(emptyList.toString())
    if(!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notnullList = listOfNotNull("Summer", null, "Spring", "monsoon", "Winter")
    println(notnullList.javaClass)



    /*
    *
    * */


    val arrayList = arrayListOf(1,2,3)
     println(arrayList.javaClass)


    val mutableList = mutableListOf(1,2,3)
    println(mutableList.javaClass)

    // mutable list has no fixed size, Add more or remove more elements from the array.
    mutableList[2] = 56
    println("A new element just added into the mutable list: $mutableList")

    val seasonList = listOf("Summer", "Autumn", "Spring", "monsoon", "Winter","Winter")
    val arrayFruit = listOf("blue berry","green vegetables","fruits","fruits", "edible food to eat")



    for (index in seasonList.indices){
        println("the index based forlooop : ${seasonList[index]} : ${seasonList[index].length}")

    }




    val array = arrayOf("blue berry","green vegetables","fruits", "edible food to eat")
    val arrayToList = array.toList()
    println(arrayToList)


    val arrayToPrimitive = intArrayOf(1,2,3)
    println(arrayToPrimitive.contentToString())

    //Collection concept
    println(array.toList())
    println(array.last())
    println(array.reversedArray().toList())

    val mergeList = listOf(seasonList,arrayFruit)
    println(mergeList.toList())

    val pairList = seasonList+ arrayFruit
    println(pairList.toList())

    // not show the duplicate elements in the list after merging them together.
    val noDuplicateItemArray = seasonList.union(arrayFruit)
    println(noDuplicateItemArray)

    // not show the duplicate elements in the list after merging them together.
    val noDuplicate = seasonList.distinct()
    println(noDuplicate)

    val itemPairingList = seasonList.zip(arrayFruit)
    println(itemPairingList)







}