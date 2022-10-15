fun main(args: Array<String>) {
    val price = readLine()!!.toDouble()
    calc(price)
}

fun calc(price: Double){
    val taxPrice = price * 0.15
    println("${price+taxPrice}")
}