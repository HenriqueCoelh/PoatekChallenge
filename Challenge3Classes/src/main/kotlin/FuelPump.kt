import kotlin.math.roundToInt

val standard = FuelPump("Standard", 6.60, 40000.0)
val premium = FuelPump("Premium", 7.20, 30000.0)
val diesel = FuelPump("Diesel", 5.60, 50000.0)
val alcohol = FuelPump("Alcohol", 5.40, 45000.0)

open class FuelPump(
    var fuelType: String,
    var fuelPrice: Double,
    var fuelQuantity: Double,
) {
    private var price = 0.0
    private var liters = 0.0
    var liters2digits = 0.0

    fun fuelWithPrice() {
        print("Enter the price to be paid: R$")
        price = readLine()!!.toDouble()
        liters = price / fuelPrice
        liters2digits = (liters * 100.0).roundToInt() / 100.0

        if (liters > standard.fuelQuantity) {
            println("You will be paid R$0.00, as there is not enough fuel.")
        } else {
            println("You will pay R$$price for " + liters2digits + "L of $fuelType")
            setPrice()
        }
    }

    fun fuelWithLiters() {
        print("Enter how many liters will be filled:")
        liters = readLine()!!.toDouble()
        price = liters * fuelPrice
        liters2digits = (liters * 100.0).roundToInt() / 100.0

        if (liters > standard.fuelQuantity) {
            println("You will be paid R$0.00, as there is not enough fuel.")
        } else {
            println("You will pay R$$price for " + liters2digits + "L of $fuelType")
            setLiter()
        }
    }

    private fun setPrice() {
        do {
            var yesNo = 0
            println("Do you want to change the fuel type? ")
            println("YES - Type 1")
            println("NO - Type 2")
            yesNo = readLine()!!.toInt()

            if (yesNo == 1) {
                var num = 0
                println("Select the type of fuel you want to fill: ")
                println("1 - Standard")
                println("2 - Premium")
                println("3 - Diesel")
                println("4 - Alcohol")
                num = readLine()!!.toInt()

                if (num == 1) {
                    liters = price / standard.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0
                    println("You will pay R$$price for " + liters2digits + "L of $fuelType")
                } else if (num == 2) {
                    liters = price / premium.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0
                    if (liters > premium.fuelQuantity) {
                        println("You will be paid R$0.00, as there is not enough fuel.")
                    } else {
                        premium.fuelQuantity = premium.fuelQuantity - liters
                        println("You will pay R$$price for " + liters2digits + "L of ${premium.fuelType}")
                    }
                } else if (num == 3) {
                    liters = price / diesel.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0
                    if (liters > diesel.fuelQuantity) {
                        println("You will be paid R$0.00, as there is not enough fuel.")
                    } else {
                        diesel.fuelQuantity = diesel.fuelQuantity - liters
                        println("You will pay R$$price for " + liters2digits + "L of ${diesel.fuelType}")
                    }
                } else if (num == 4) {
                    liters = price / alcohol.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0
                    if (liters > alcohol.fuelQuantity) {
                        println("You will be paid R$0.00, as there is not enough fuel.")
                    } else {
                        alcohol.fuelQuantity = alcohol.fuelQuantity - liters
                        println("You will pay R$$price for " + liters2digits + "L of ${alcohol.fuelType}")
                    }
                }
            }
        } while (yesNo == 1)
    }

    private fun setLiter() {
        do {
            var yesNo = 0
            println("Do you want to change the fuel type? ")
            println("YES - Type 1")
            println("NO - Type 2")
            yesNo = readLine()!!.toInt()

            if (yesNo == 1) {
                var num = 0
                println("Selecione o tipo de combustível com que deseja abastecer: ")
                println("1 - Standard")
                println("2 - Premium")
                println("3 - Diesel")
                println("4 - Alcohol")
                num = readLine()!!.toInt()

                if (num == 1) {
                    price = liters * standard.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0
                    println("You will pay R$$price for " + liters2digits + "L of $fuelType")
                } else if (num == 2) {
                    price = liters * premium.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0
                    if (liters > premium.fuelQuantity) {
                        println("You will be paid R$0.00, as there is not enough fuel.")
                    } else {
                        premium.fuelQuantity = premium.fuelQuantity - liters
                        println("Você paYou will pay R$$price for " + liters2digits + "L of ${premium.fuelType}")
                    }
                } else if (num == 3) {
                    price = liters * diesel.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0

                    if (liters > diesel.fuelQuantity) {
                        println("You will be paid R$0.00, as there is not enough fuel.")
                    } else {
                        diesel.fuelQuantity = diesel.fuelQuantity - liters
                        println("You will pay R$$price for " + liters2digits + "L of ${diesel.fuelType}")
                    }
                } else if (num == 4) {
                    price = liters * alcohol.fuelPrice
                    liters2digits = (liters * 100.0).roundToInt() / 100.0
                    if (liters > alcohol.fuelQuantity) {
                        println("You will be paid R$0.00, as there is not enough fuel.")
                    } else {
                        alcohol.fuelQuantity = alcohol.fuelQuantity - liters
                        println("You will pay R$$price for " + liters2digits + "L of ${alcohol.fuelType}")
                    }
                }
            }

        } while (yesNo == 1)
    }
}



