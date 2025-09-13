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

    //Task 3
    print("Введите N: ")
    val n = readln().toInt()
    var cur = n
    while (cur >= 1) {
        println(cur)
        cur--
    }

    //Task 4
    fun genPass(): String {
        val len = Random.nextInt(8, 17)
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*"
        return (1..len).map { chars.random() }.joinToString("")
    }

    // Задание 5. Мини-опрос
    print("Имя: ")
    val name = readln()
    print("Цвет: ")
    val color = readln()
    print("Животное: ")
    val animal = readln()
    print("Хобби: ")
    val hobby = readln()

    val feedbacks = listOf("Ты крутой, Дальше меньше!", "Хорошая работа!", "Отлично!", "Молодец!",)
    val randomFb = feedbacks.random()

    println("\n--- Результаты ---")
    println("Имя: $name")
    println("Ответы: $color, $animal, $hobby")
    println("Отзыв: $randomFb")

    //Task 6
    print("Введите N: ")
    val num = readln().toInt()
    var s = 0
    var i = 1
    while (i <= num) {
        s += i
        i++
    }
    println("Сумма: $s")

    //Task 7
    println("10 бросков:")
    repeat(10) {
        println("${it + 1}: ${Random.nextInt(1, 7)}")
    }

    //Task 8
    val a = Random.nextInt(0, 6)
    val b = Random.nextInt(0, 6)
    val c = Random.nextInt(0, 6)

    println("Слоты: $a $b $c")
    if (a == b && b == c) {
        println("Джекпот!")
    }
}