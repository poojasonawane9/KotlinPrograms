import java.util.Scanner
fun main(args: Array<String>){
    val input=Scanner(System.`in`)
    println("Enter Marks")
    val x= input.nextInt()
    when (x) {
        in 1..40 -> println("Student is failed")
        in 40..60 -> println("Second Class")
        in 60..70 -> println("First Class")
        in 70..100 -> println("Distiction")
        else -> {
            print("Invalid marks")
        }
    }
}

