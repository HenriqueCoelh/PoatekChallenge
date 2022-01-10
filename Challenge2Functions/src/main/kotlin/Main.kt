fun invert(num: String): Int {
    var position = 0
    var inverted = ""
    val array: Array<String> = num.toCharArray().map { it.toString() }.toTypedArray()
    for (i in 1..array.size step 1) {
        position = array.size - i
        inverted += array[position]
    }
    return inverted.toInt()
}

fun main(args: Array<String>) {
    do {
        println("Enter a number longer than two digits:")
        var num = readLine()!!
        println("The number that was entered, inverted, looks like this:")
        var invertedNumber = invert(num)
        println(invertedNumber)
        println("Want to invert one more number?")
        println("YES - Type 1")
        println("NO - Type 2")
        var yesNo = readLine()!!.toInt()
    } while (yesNo == 1)
}
