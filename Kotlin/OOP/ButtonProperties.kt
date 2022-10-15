class Button {
    var width: Int = 0
    var height: Int = 0

    set(value) {
        if (value < 50){
            field = 50
        }else{
            field = value
        }
    }

    get() = field

}
fun main(args: Array<String>) {
    val b1 = Button()
    b1.height = readLine()!!.toInt()
    b1.width = readLine()!!.toInt()

    println(b1.width+b1.height)
}