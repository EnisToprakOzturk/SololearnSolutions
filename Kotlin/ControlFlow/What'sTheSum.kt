fun main(args: Array<String>){
    val start = readLine()!!.toInt()
    val end = readLine()!!.toInt()
    var sum = 0

    for (i in start..end){
        sum += i
    }

    println(sum)
}