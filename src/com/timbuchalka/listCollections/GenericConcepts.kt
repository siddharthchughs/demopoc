package com.timbuchalka.listCollections

import java.lang.StringBuilder
import javax.print.attribute.standard.NumberUpSupported

fun main(args: Array<String>){

    val lisShapes  = mutableListOf("Square","Rectangle","Trapezium","qudrapedal")
    val listNumbers:List<Short?> = mutableListOf(23,232,45,556,665)
    val listANumbersAsFloat:List<Double> = mutableListOf(23.3,23.2,4.50,5.56,66.5)
    val listaANumbersString  = listOf("23","232","45","556","665")
//    lisShapes.printCollectionShapes()
//    printShapes(listaANumbersString)
//    printCollectionNumbers(listaANumbers)
//    append(StringBuilder("Siddharth"),StringBuilder("Chugh"))
    printListOFGenericShapes(listNumbers)
    showAnyList(listNumbers)
    printStrings(StringBuilder("Helo"),StringBuilder("Woorld"))

    takeAnyTyepOfArray(listANumbersAsFloat)

    val listAny: Any = listOf("stri","str2")
    if(listAny is List<*>){
        println("this is start projetction : this is list of String")
        val defineString = listAny as List<String>
        println("this is the list with replaced indices : ${defineString[1].replace("str2","Hey I am the new value")}")
       for(defineElements in defineString ){
           println("this is the elements : ${defineElements}")
       }

    }


}


fun <T:Any> takeAnyTyepOfArray(collectionAny:List<T>){
    for(elementsCollected in collectionAny){
        println("the elements of different types: ${elementsCollected}")
    }
}

fun <T:Number?> showAnyList(collectionAny:List<T>){
    for (elementAny in collectionAny){
        println("Any elements: ${elementAny.toString()}")
    }
}

fun <T> printStrings(appendableItem:T,appendItem:T)
where T :CharSequence, T: Appendable
{
    println("print elements for upper bounds: ${appendableItem.append(appendItem)}")
}


fun <T:Number?> printListOFGenericShapes(collectionShapes:List<T>){
    for (elementShapes in collectionShapes){
        println("${elementShapes}")
    }
}
fun <T> printListOFIntegers(collectionShapes:List<T>){
    for (elementShapes in collectionShapes){
        println("${elementShapes}")
    }
}



fun <T> printShapes(listBy: List<T>){
    for (elementsList  in listBy.indices)
    println("these are the shapes: ${elementsList}")
}

// calling function on the list i.e we are using the extension function for generic side.
fun <T> List<T>.printCollectionShapes(){
    for (elementsList  in this.indices)
    println("these are the shapes: ${elementsList}")
}

fun <T: Number?> List<T>.printCollectionNumber(){
    for (elementsList  in this.indices)
    println("these are the shapes: ${elementsList}")
}

fun <T> printCollectionNumbers(collectionAny:List<T>){
    for (elementsList  in collectionAny)
    println("these are the shapes: ${elementsList}")
}



fun <T> append(itemOne:T,itemTwo: T)
where T : CharSequence,T:Appendable
{
    println("Result is : ${itemOne.toString()}: ${itemTwo}")

}
