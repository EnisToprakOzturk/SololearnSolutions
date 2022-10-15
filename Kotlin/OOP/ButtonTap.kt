class Button(var width: Int, var height: Int) {

    var name = ""

    fun tap(){
        println("$name was tapped")
    }
}

fun main(args: Array<String>) {
    val b1 = Button(200, 50)
    b1.name = readLine()!!
    b1.tap()
}