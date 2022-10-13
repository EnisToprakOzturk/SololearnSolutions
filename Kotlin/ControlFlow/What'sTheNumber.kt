fun main(args: Array<String>) {
    var num = readLine()!!.toInt()
    var sum = 0

    while (num > 0){
        sum += num % 10
        num /= 10
    }
    println(sum)
}
