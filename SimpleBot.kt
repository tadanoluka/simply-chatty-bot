package bot

fun main() {
    println("Hello! My name is Aid.")
    println("I was created in 2022.")
    println("Please, remind me your name.")
    val name = readln()
    println("What a great name you have, ${name.replaceFirstChar { it.uppercase() }}!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}
