fun main() {
    println(agoToStr(172801))

}

fun agoToStr(seconds: Int) = when (seconds) {
    in 0..60 -> "только что"
    in 60..(3599) -> "Был(а) ${seconds / 60} ${secondsToMinutes(seconds)} назад "
    in 3600..(60 * 60 * 24) -> "Был(а) ${seconds / 3600} ${secondsToHours(seconds)} назад "
    in 60 * 60 * 24..(60 * 60 * 24) * 3 -> "Был(а) ${secondsToDays(seconds)}"
    else -> "Давно"

}


fun secondsToHours(seconds: Int): String {
    var hours = seconds / 3600
    return when {
        hours % 10 in 2..4 -> "Часа"
        hours % 10 == 1 -> "Час"
        else -> "Часов"
    }
}


fun secondsToMinutes(seconds: Int): String {
    var minutes = seconds / 60
    return when {
        minutes in 11..14 -> "Минут"
        minutes % 10 in 2..4 -> "Минуты"
        minutes % 10 == 1 -> "Минуту"
        else -> "Минут"
    }
}

fun secondsToDays(seconds: Int): String {
    return when (seconds) {
        in (60 * 60 * 24)..(60 * 60 * 24) * 2 -> "вчера"
        else -> "позавчера"
    }
}