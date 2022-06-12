package com.timbuchalka

import java.math.BigDecimal

fun main(args: Array<String>) {

    val names = arrayOf("john","james","chris")
    val names_age = arrayOf(91,75,87)
    val Longs = arrayOf(91L,75L,87L)


    println(names_age is Array<Int>)
    println(names is Array<String>)
    println(Longs is Array<Long>)

//    print(names[2])

    /* Make an array with lambda expression. explicit defining the size of array with 16 (0-15)
       (it) is the index element from where the elements will evaluating the expression.
     */

/*
    val arrayNumber = Array(16){ it->   it*2}

    for (number in arrayNumber){
        println(number)
    }
*/

//    val arrayThousand  = Array(1000){i -> i+1 }
//        for (numbers in arrayThousand){
//            println(numbers)
//    }

    var someArray: Array<Int>
//    someArray = arrayOf(10,20,30)
//      for (numbers in someArray){
//          println(numbers)
//      }

    /* Initialize the elements with Array class using lambda
    * expression
    * */

    someArray = Array(10){ i->i*6}
    for (numbers in someArray){
        println(numbers)
    }


/*    array of mixed data types
  */
  val  anyArrayElement = arrayOf("22",22,BigDecimal(23.5),5,'c')
//    for (numbers in anyArrayElement){
//        println(numbers)
//    }


  //  println(anyArrayElement is Array<Any>)

    //this section is for converting the general array to Primitive typed Array
    val myIntArray = intArrayOf(23,34,56,456)
    //MultipleUtilities().putIntElements(myIntArray)

    //Cannot declare the array with the size without passing parameters
//    var anyArray = Array<Int>(5)
   // Can declare the Array of a Generic type within the delimiters
//    var anyArrayOne: Array<Int>

    var somOtherArray = IntArray(5)
    for (num in somOtherArray){
        println(num)
    }

//    MultipleUtilities().putIntElements(names_age.toIntArray())
    val myCollectionArray = intArrayOf(23,34,56,456)
    val convertIntA_To_GrnlArray = myCollectionArray.toTypedArray()
    println(convertIntA_To_GrnlArray.contentToString())
}

