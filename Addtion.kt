import java.util.Scanner
fun main(args: Array<String>){
    val input=Scanner(System.`in`)
    println("Enter Numbers")
    val c=input.nextDouble()
    val d=input.nextDouble()
    val add=Add()
    add.addition(c,d )
}
class Add{
    fun addition(a:Double,b:Double)
    {
        print("Addition of two Double no is ${a+b}")
    }
}