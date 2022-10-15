fun main(args: Array<String>) {
    var letter = readLine()!![0]
    val names = arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")

    filteringNames(letter,names)
}

fun filteringNames(letter: Char, names: Array<String>){
    for(i in names){
        if (i[0] == letter)
            println(i)
    }
}