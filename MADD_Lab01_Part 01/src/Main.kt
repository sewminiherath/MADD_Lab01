fun whoAmI(input: Any): String {
    return input::class.simpleName ?: "Unknown"
}

fun main() {
    println("Int type: " + whoAmI(100))
    println("String type: " + whoAmI("Hello"))
    println("Double type: " + whoAmI(3.14))
    println("Boolean type: " +whoAmI(true))
}