interface Shape {
    fun setup()
    fun draw()
}

class Circle : Shape {
    override fun setup() {
        println("Setting up Circle...")
    }

    override fun draw() {
        println("Drawing a Circle")
        }
}

class Rectangle : Shape {
    override fun setup() {
        println("Setting up Rectangle...")
    }

    override fun draw() {
        println("Drawing a Rectangle")
        }
}

fun main() {
    val shapes: List<Shape> = listOf(Circle(), Rectangle())

    for (shape in shapes) {
        shape.setup()
        shape.draw()
        }
}