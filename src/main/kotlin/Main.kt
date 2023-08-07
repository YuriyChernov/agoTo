fun main() {
    val agoToSec = 34000
    val sec = 60
    val hour = 3600

    val res1 = agoToSec / sec
    val res2 = agoToSec / hour

    val agoTo = when (agoToSec) {
        in 0..59 -> "был(а) только что"
        in 60..3599 -> "был(а) ${minToText(res1)} назад"
        in 3600..86399 -> "был(а) ${hourToText(res2)} назад"
        in 86400..172800 -> "был(а) вчера"
        in 172801..259200 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
    println(agoTo)
}

fun minToText(min: Int) = when {
    min in 11..14 -> "$min минут"
    min % 10 == 1 -> "$min минуту"
    min % 10 in 2..4 -> "$min минуты"
    else -> "$min минут"
}

fun hourToText(hour: Int) = when {
    hour in 11..14 -> "$hour часов"
    hour % 10 == 1 -> "$hour час"
    hour % 10 in 2..4 -> "$hour часа"
    else -> "$hour часов"
}










