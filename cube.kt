fun main(args: Array<String>){
    println("Enter 5 numbers")
    for (i in 1..5){
        val input= readLine()!!.toDouble()
        val result=Math.pow(input.toDouble(),3.0).toInt()
        println("cube is\t" +result)
    }
}