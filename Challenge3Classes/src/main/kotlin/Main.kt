fun main(args: Array<String>) {
    var toFuel = 0
    println("Select the method to fuel: ")
    println("1 - Per money")
    println("2 - Per liter")
    toFuel = readLine()!!.toInt()

    if (toFuel == 1) {
        standard.fuelWithPrice()
    } else if (toFuel == 2) {
        standard.fuelWithLiters()
    }
}
