import com.timbuchalka.listCollections.append
import java.lang.StringBuilder
import java.math.BigDecimal

fun main (args:Array<String>){

    val list = mutableListOf("String","Hey their")
    val listIntegers:List<Short> = mutableListOf(23,45,45,89)
    val listFloat:List<Float> = mutableListOf(23.3f,45.5f,45.5f,89.0f)
    val listStrings : List<String> = mutableListOf ("3","4","5","6")
    list.add("Another String")
    printShortListOfNumbers(listIntegers)
    printSimpleIntegerConversion(listIntegers)
    printSFloatListOfNumbers(listFloat)

    val listOfDecimals = mutableListOf(BigDecimal(12.343),BigDecimal(23.4),BigDecimal(99.3),BigDecimal(676.4))
    listOfDecimals.printSimpleExtensionCollection()
    append(StringBuilder("heoolo"),StringBuilder("Siddharth"))

    if(listStrings is List<String>){

        println("this is string type list $listStrings")
    }



}

/*Just like in java we define T for any type
* with a function to take any mutableList
* */

//this <T> within the function define about the whole thing that
// the function is using the generics
// and <T> after the fun keyword define that it takes in type parameter to implement the generic collection concept

fun <T> printSimpleCollection(collection:List<T>){
    for (listOfItems in collection){
        println(listOfItems)
    }
}

// this function can take list of all Primitive type only as it is restricted for few types
// And also accepts the upperbound for the strict tyoe to be taken, defined T tpe Parameter for the Upper bound Number type
fun <T:Any> printSimpleIntegerConversion(collection:List<T>){
    for (listOfItems in collection){
        println(listOfItems)
    }
}

// <T> also takes parameters that could be appendable
// with where keyword , here we take two upperbound for the two variables

fun <T> printDataAppendable(item: T,item2: T)
    where T: CharSequence, T:Appendable{
        println("the number ${item.append(item2)}")
    }


fun <T> printShortListOfNumbers(collection:List<T>){
    for (listOfShorts in collection){
        print(listOfShorts)
    }
}
// function that takes type parameter with the collection of the list <Type> collection of any primitive data type
//
fun <T> printSFloatListOfNumbers(collection:List<T>){
    for (listOfShorts in collection){
        print(listOfShorts)
    }
}



//using extension function
fun <T> List<T>.printSimpleExtensionCollection(){
    for (listOfItems in this){
        println(listOfItems)
    }
}

//could we use the is operator with generic collection
// indeed we could.


