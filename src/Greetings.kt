fun main (args: Array<String>) {

    var time = args[0].toInt()
    var phase: String = if (time < 12) "Morning" else "Night"
    println("Good $phase, Kotlin")
}