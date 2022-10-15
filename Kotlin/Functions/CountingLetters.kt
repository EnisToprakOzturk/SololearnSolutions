fun main(args: Array<String>) {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}

fun letter_count(letter: Char, text: String): Int {

    var sum = 0

    for (i in text){
        if (i == letter)
            sum +=1
    }

    return sum
}