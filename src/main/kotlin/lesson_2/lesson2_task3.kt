package org.example.lesson_2
const val TIME_TRANSFER = 60

fun main() {
    /*Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
    а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

    – Создай целочисленные переменные и проинициализируй их этими данными;
    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
    – Выведи результат в консоль в формате [часы:минуты], используя двузначное представление чисел (например, 17:05, а не 17:5).*/

    val hoursDeparture = 9
    val minutesDeparture = 39
    println("Время отправления: ${String.format("%02d", hoursDeparture)}:$minutesDeparture")

    val onTheWay = 457
    val hoursOnTheWay = onTheWay / TIME_TRANSFER
    val minutesOnTheWay = onTheWay % TIME_TRANSFER
    println("В пути $hoursOnTheWay часов $minutesOnTheWay минут")

    val minutesInTotal = onTheWay + minutesDeparture
    val hoursArrival = minutesInTotal / TIME_TRANSFER + hoursDeparture
    val minutesArrival = minutesInTotal % TIME_TRANSFER
    println("Время прибытия: ${String.format("%2d",hoursArrival)}:$minutesArrival")
}