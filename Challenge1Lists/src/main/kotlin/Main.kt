/*Challenge 1: Lists
Given the names, heights and ages of 10 students, make a program that determines
how many students over the age of 13 are shorter than the average height of those
students.
[[“Bruno”, 170, 14], [“Leonardo”, 174, 21], [“Juan”, 156, 12], [“Juliana”, 166, 13],
[“Wagner”, 184, 17], [“Micaela”, 172, 18], [“Bento”, 150, 14], [“Lucia”, 162, 13], [“Pedro”,
169, 14], [“Carla”, 158, 16]]
*/

fun main(args: Array<String>) {

    var height = 0
    var age = 0
    var result = 0
    var average = 0
    var averageShort = 0
    var listStudents = arrayOf(
        arrayOf("Bruno", 170, 14), arrayOf("Leonardo", 174, 21), arrayOf("Juan", 156, 12),
        arrayOf("Juliana", 166, 13), arrayOf("Wagner", 184, 17), arrayOf("Micaela", 172, 18),
        arrayOf("Bento", 150, 14), arrayOf("Lucia", 163, 13), arrayOf("Pedro", 169, 14),
        arrayOf("Carla", 158, 16))

    for (student in listStudents) {
        height = student[1] as Int
        result += height
    }

    average = result / listStudents.size

    for (student in listStudents) {
        height = student[1] as Int
        age = student[2] as Int

        if (height < average && age > 13) {
            averageShort++
        }
    }

    println("$averageShort students over 13 years old are shorter than the average height of all students.")
}


