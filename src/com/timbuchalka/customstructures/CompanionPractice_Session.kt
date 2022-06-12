
fun main(args: Array<String>){

    SomeTest.showMeData()
    val text = SomeTest.jsyAString("SUdda")
    val textTest = SomeTest.justTextAppearence("siddharth", true)

    println(textTest.someString)
}

// You could never access the function of class without calling it's instance or object of that type !!
// So to make it happen without using instance of a class kotlin introduced companion object to solve this
// issue.
class SomeTest  private constructor(val someString:String){

//    constructor(str:String){
//        someString = str
//    }
//
//    constructor(str:String, lowerCase:Boolean){
//        if(lowerCase){
//            someString = str.toUpperCase()
//        }
//        else{
//            someString = str.toLowerCase()
//        }
//    }

    companion object {
        private var myNUmber = 34

        fun jsyAString(str:String) = SomeTest(str)

        fun justTextAppearence(str:String,lowerCase:Boolean) : SomeTest{
            if(lowerCase){
                return SomeTest(str.toUpperCase())
            }
            else{
                return SomeTest(str.toLowerCase())
            }
        }


        fun showMeData() {
            println("the data is shown like this : $myNUmber")
        }
    }

}