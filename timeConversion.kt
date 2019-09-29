import java.io.*
import java.math.*
import java.text.*
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    var t = if (s.length == 10) s.substring(0, s.length - 2) + " " + s.substring(s.length - 2, s.length) else s
     var time = LocalTime.parse(t, DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM))
    return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
