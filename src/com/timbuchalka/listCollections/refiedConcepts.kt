import com.timbuchalka.listCollections.getElementsOfType
import java.math.BigDecimal

fun main (args:Array<String>){
    val mixedCollection: List<Any> = listOf("Hele",BigDecimal(23.3),"hey",34,56,56.6f)
    val listFunctions = getElementsOfType<Int>(mixedCollection)
   for (mixedElement in mixedCollection){
       println(mixedElement)
   }
}

inline fun <reified T>  getElementsOfType(collectionMixed:List<Any>):List<T>{
    var newList : MutableList<T> = mutableListOf()
    for (elementsMixed in collectionMixed){
        if(elementsMixed is T){
            print(elementsMixed)
        }
    }
    return newList
}

