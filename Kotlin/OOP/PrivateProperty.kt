open class Component(width: Int, height: Int) {
    protected var width = width
    protected var height = height
}
class Button(width: Int, height: Int): Component(width, height) {
    private var name: String = "Button"
    public fun tap() {
        println(name + " was tapped")
    }
}
class Image(width: Int, height: Int): Component(width, height) {
    public fun draw() {
        println(width.toString()+"x"+height.toString())
    }
}
fun main(args: Array<String>) {
    val b1 = Button(200, 50)
    b1.tap()

    val img = Image(300, 500)
    img.draw()
}