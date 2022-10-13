fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    var day = 0

    for (i in 1..hours){
        if (i <= 5){
           total += 1
        }else if (i % 24 == 0){
            day = i / 24
            total = 15.0 * day
        }else{
            total += 0.5
        }
    }
    println(total)
}