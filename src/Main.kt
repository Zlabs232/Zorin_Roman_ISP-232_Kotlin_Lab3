import kotlin.random.Random

fun main() {
    //Task 1
    val sNumber = Random.nextInt(1, 51)
    var guess: Int
    var at = 0

    println("Угадайте число от 1 до 50:")
    while (true) {
        guess = readln().toInt()
        at++

        when {
            guess < sNumber -> println("Больше!")
            guess > sNumber -> println("Меньше!")
            else -> {
                println("Поздравляю! Вы угадали число $sNumber за $at попыток")
                break
            }
        }
    }

    //Task 2
    fun countV(s: String): Int {
        val v = "aeiouyаеёиоуыэюяAEIOUYАЕЁИОУЫЭЮЯ"
        var cnt = 0
        for (c in s) {
            if (c in v) cnt++
        }
        return cnt
    }

    print("Введите строку: ")
    val t = readln()
    println("Гласных: ${countV(t)}")
}