fun main(args: Array<String>) {
    val age = readLine()!!.toInt()
    val value = when {
        age in 0..11 -> "Child"
        age in 12..17 -> "Teen"
        age in 18..64 -> "Adult"
        age >= 65 -> "Senior"
        else -> "Invalid Age"
    }
    println(value)
}
