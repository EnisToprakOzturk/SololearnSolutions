abstract class Component(width: Int, height: Int) {
    protected var width = width
    protected var height = height
    abstract fun show()
}
class Button(width: Int, height: Int): Component(width, height) {
    private var name: String = "Button"
    fun tap() {
        println(name + " was tapped")
    }

    override fun show() {
        println("Showing a Button")
    }

}
class Image(width: Int, height: Int): Component(width, height) {
    fun draw() {
        println(width.toString()+"x"+height.toString())
    }

    override fun show() {
        println("Showing an Image")
    }

}
fun main(args: Array<String>) {
    val b1 = Button(200, 50)
    b1.tap()
    b1.show()

    val img = Image(300, 500)
    img.draw()
    img.show()
}