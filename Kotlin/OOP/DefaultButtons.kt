class Button {
    var width = 0
    var height = 0

    constructor(x:Int, y:Int){
        width = x
        height = y
    }
}
fun main(args: Array<String>) {
    val b1 = Button(readLine()!!.toInt(), readLine()!!.toInt())

    println(b1.width*b1.height)
}