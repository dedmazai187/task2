/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    /*  val number1: Int = 1
    val number2:Int = 4

    if(number1>number2)
        println("Первое число больше")
    else if (number1<number2)
        println("Второе число больше")
   else
        println("Числа равны")*/
    val number1: Int =1456
    val number2: Int =1456

    val result: String = when {
        number1 > number2 -> "Первое число больше"
        number2 > number1 -> "Второе число больше"
        else -> "Числа равны"
    }
    println(result)
}
/////