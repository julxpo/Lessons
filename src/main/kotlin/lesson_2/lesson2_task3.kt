package org.example.lesson_2

fun main() {
    /*Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
    а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

    – Создай целочисленные переменные и проинициализируй их этими данными;
    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
    – Выведи результат в консоль в формате [часы:минуты], используя двузначное представление чисел (например, 17:05, а не 17:5).*/

    val separator = ":"
    val timeTransfer = 60
    val hoursDeparture = 9
    val minutesDeparture = 39
    println("Время отправления: 0"+hoursDeparture+separator+minutesDeparture)

    val onTheWay = 457
    val hoursOnTheWay = onTheWay / timeTransfer
    val minutesOnTheWay = onTheWay % timeTransfer
    println("В пути "+hoursOnTheWay+" часов "+minutesOnTheWay+" минут")

    val minutesInTotal = onTheWay + minutesDeparture
    val hoursArrival = minutesInTotal / timeTransfer + hoursDeparture
    val minutesArrival = minutesInTotal % timeTransfer
    println("Время прибытия: "+hoursArrival+separator+minutesArrival) //про форматирование вывода не поняла, вроде и так правильно же выводится
}