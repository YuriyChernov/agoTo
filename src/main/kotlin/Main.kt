fun main() {
    val agoToSec = 216000
    val sec = 60
    val hour = 3600

    val res1 = agoToSec / sec
    val res2 = agoToSec / hour

    val agoTo = when (agoToSec) {
        in 0..59 -> "был(а) только что"
        in 60..3599 -> "был(а) $res1 минут назад"
        in 3600..86399 -> "был(а) $res2 часов назад"
        in 86400..172800 -> "был(а) вчера"
        in 172801..259200 -> "был(а) позавчера"
        else -> "был(а) давно"
    }

    if (res1 % 100 == 11) {
        println("был(а) $res1 минут назад")
    } else if (res1 % 100 == 12) {
        println("был(а) $res1 минут назад")
    } else if (res1 % 100 == 13) {
        println("был(а) $res1 минут назад")
    } else if (res1 % 100 == 14) {
        println("был(а) $res1 минут назад")
    } else if (res1 % 10 == 1) {
        println("был(а) $res1 минуту назад")
    } else if (res1 % 10 == 2) {
        println("был(а) $res1 минуты назад")
    } else if (res1 % 10 == 3) {
        println("был(а) $res1 минуты назад")
    } else if (res1 % 10 == 4) {
        println("был(а) $res1 минуты назад")
    } else println("был(а) $res1 минут назад")


    if (res2 % 100 == 11) {
        println("был(а) $res2 часов назад")
    } else if (res2 % 100 == 12) {
        println("был(а) $res2 часов назад")
    } else if (res2 % 100 == 13) {
        println("был(а) $res2 часов назад")
    } else if (res2 % 100 == 14) {
        println("был(а) $res2 часов назад")
    } else if (res2 % 10 == 1) {
        println("был(а) $res2 час назад")
    } else if (res2 % 10 == 2) {
        println("был(а) $res2 часа назад")
    } else if (res2 % 10 == 3) {
        println("был(а) $res2 часа назад")
    } else if (res2 % 10 == 4) {
        println("был(а) $res2 часа назад")
    } else println("был(а) $res2 часов назад")

    println("$agoTo")
}









