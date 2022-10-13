fun main(args: Array<String>){

    var count = 0

    while (true){
        var input = readLine()!!.toInt()
        if (input != 0){
            count += 1
        }else{
            break
        }
    }
    println(count)
}
