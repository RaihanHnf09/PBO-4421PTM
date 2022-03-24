class mobil(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }

    // Class function with parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

fun main() {
    val c1 = mobil("Ford", "Mustang", 1969)

    // print property values
    println(c1.brand + "" + c1.model + "" + c1.year)

    // Call the functions
    c1.drive()
    c1.speed(200)
}