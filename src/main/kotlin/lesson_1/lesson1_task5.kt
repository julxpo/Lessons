package org.example.lesson_1

fun main() {

    /*Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
    - Значения часов, минут и секунд отображать двумя цифрами.*/

    //должно быть 01:48:00
    val seconds: Short = 6480
    val minutes = seconds / 60
    val restMinutes = seconds % 60 //итоговые секунды
    val hours = minutes / 60 //часы
    val restHours = minutes % 60 //минуты
    val separator = ":"

    print("0"+hours+separator)
    print(restHours)
    print(separator)
    print("0"+restMinutes)
}