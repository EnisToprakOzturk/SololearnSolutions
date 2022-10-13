fun main(args: Array<String>) {
    val hour = readLine()!!.toInt()

    if (hour <= 18){
        println("Open")
    }else{
        println("Closed")
    }
}