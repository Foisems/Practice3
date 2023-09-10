import java.util.Random

fun main(args: Array<String>) {
    // Задание 1
    val myAge = 18
    val isTeenager: Boolean = 13 < myAge && myAge < 19

    // Задание 2
    val theirAge = 30
    val bothTeenagers = isTeenager &&  13 < theirAge && theirAge < 19

    // Задание 3
    /*
    Использование равенства строк
    */
    val reader = "Ольга"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    // Задание 4
    /*
    Сравнение строк по алфавиту
    */
    val readerBeforeAuthor = reader > author

    // Задание 5
    val myAge2 = 18
    if (13 < myAge2 && myAge2 < 19) println("Подросток") else println("Не подросток")

    // Задание 6
    val answer = if (13 < myAge2 && myAge2 < 19) "Подросток" else "Не подросток"
    println(answer)

    // Задание 7
    var counter = 0
    while (counter < 10){
        println("counter = $counter")
        counter++
    }

    // Задание 8
    var counter1 = 0
    var roll = 0
    do{
        roll = Random().nextInt(6)
        counter1++
    }while(roll != 0)
    println("После $counter1 бросков, roll равен $roll")

    // Задание 9
    val range = 1..10
    for (i in range){
        println (i * i)
    }

    // Задание 10
    for (i in range){
        println (Math.sqrt(i.toDouble()))
    }

    // Задание 11
    var sum = 0
    for (row in 1 until 8 step 2){
        for (column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)
}