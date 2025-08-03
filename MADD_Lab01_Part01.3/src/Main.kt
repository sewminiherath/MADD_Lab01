fun greetings(name: String, age: Int) {
    println("Hello, $name!")
    if (age >= 18) {
        println("You are eligible for this course!.")
    } else {
        println("You are not eligible for this course!.")
    }
}
fun main() {
    greetings("Sewmini", 22)
    greetings("Nilu",16)

    val names = arrayOf("Sewmini", "Nilu", "Kamal", "Sunil", "Amara")

    for (i in names.indices) {
        println("Name[$i]: ${names[i]}")
    }
}
