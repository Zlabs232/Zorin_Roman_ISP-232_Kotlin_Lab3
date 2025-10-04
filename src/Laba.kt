import kotlin.random.Random

fun main() {
    var number = 1
    while (number <= 5) {
        println("Число: $number")
        number++
    }

    number = 1
    while (number <= 10) {
        println(number)
        number++
        if (number == 5) {
            println("Останавливаемся на $number")
            break
        }
    }

    number = 0
    while (number < 10) {
        number++
        if (number == 3) {
            println("Пропускаем $number")
            continue
        }
        println(number)
    }

    println("Напишите что-нибудь (для выхода введите 'выход'):")
    while (true) {
        val input = readLine()
        if (input == "выход") {
            println("До свидания!")
            break
        }
        println("Вы ввели: $input")
    }

    var level = 0
    println("Добро пожаловать в Подземелье!")
    while (level < 5) {
        println("\nВы на уровне $level.")
        println("Выберите действие: [1] Вперёд | [2] Осмотреться | [0] Сдаться")
        val input = readLine()
        when (input) {
            "1" -> {
                level++
                println("Вы продвинулись на уровень $level!")
            }
            "2" -> {
                println("Вы осматриваетесь. Тут ничего интересного.")
                continue
            }
            "0" -> {
                println("Вы сдались. Игра окончена.")
                break
            }
            else -> {
                println("Неверный ввод. Попробуйте снова.")
                continue
            }
        }
    }
    if (level == 5) {
        println("Поздравляем! Вы выбрались из подземелья!")
    }

    do {
        print("Введите число больше 10: ")
        number = readln().toInt()
    } while (number <= 10)
    println("Спасибо! Вы ввели $number.")

    for (i in 1..5) {
        println("Шаг $i")
    }

    val fruits = listOf("apple", "banana", "cherry")
    for (fruit in fruits) {
        println("Фрукт: $fruit")
    }

    val sentence = "Kotlin's awesome"
    val words = sentence.split(" ")
    println(words)

    val data = "яблоко,апельсин;банан"
    val parts = data.split(",", ";")
    println(parts)

    print("Введите числа через пробел: ")
    val inputNumbers = readln()
    val numbersList = inputNumbers.split(" ")
    var sum = 0
    for (numStr in numbersList) {
        sum += numStr.toInt()
    }
    println("Сумма чисел: $sum")

    print("Введите первое число, знак операции и второе число через пробел: ")
    val inputCalc = readln().split(" ")
    val firstNumber = inputCalc[0].toDouble()
    val symbol = inputCalc[1]
    val secondNumber = inputCalc[2].toDouble()
    var result = 0.0
    when (symbol) {
        "+" -> result = firstNumber + secondNumber
        "-" -> result = firstNumber - secondNumber
        "*" -> result = firstNumber * secondNumber
        "/" -> result = firstNumber / secondNumber
        else -> println("Некорректный ввод")
    }
    println("$firstNumber $symbol $secondNumber = $result")

    val target = Random.nextInt(1, 101)
    println("Угадай число от 1 до 100")
    while (true) {
        print("Введи число: ")
        val guess = readln().toInt()
        when {
            guess < target -> println("Загаданное число больше")
            guess > target -> println("Загаданное число меньше")
            else -> {
                println("Поздравляю! Ты угадал число: $target")
                break
            }
        }
    }

    val dice1 = Random.nextInt(1, 7)
    val dice2 = Random.nextInt(1, 7)
    val sumDice = dice1 + dice2
    println("Первый кубик: $dice1")
    println("Второй кубик: $dice2")
    println("Сумма: $sumDice")

    val part1 = arrayOf("Опытный", "Безумный", "Легендарный", "Скрытый", "Гигачад")
    val part2 = arrayOf("стрелок", "геймер", "воин", "волшебник", "трейдер")
    val part3 = arrayOf("из CS60", "на максималках", "из будущего", "в бане у Габена", "с проклятым лугом")

    val rand1 = (Math.random() * part1.size).toInt()
    val rand2 = (Math.random() * part2.size).toInt()
    val rand3 = (Math.random() * part3.size).toInt()

    val phrase = "${part1[rand1]} ${part2[rand2]} ${part3[rand3]}"
    println("Ваш титул: $phrase")
}
