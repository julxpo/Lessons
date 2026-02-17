package org.example.lesson_2

fun main() {
    /*Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
    а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

    – Создай целочисленные переменные и проинициализируй их этими данными;
    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
    – Выведи результат в консоль в формате [часы:минуты], используя двузначное представление чисел (например, 17:05, а не 17:5).*/

    val hoursDeparture = 9
    val minutesDeparture = 39
    println("Время отправления: "+hoursDeparture+":"+minutesDeparture)

    val hoursOnTheWay = 457 / 60
    val minutesOnTheWay = 457 % 60
    val onTheWay = 457
    println("В пути "+hoursOnTheWay+" часов "+minutesOnTheWay+" минут")

    val hoursArrival = (onTheWay + minutesDeparture) / 60 + hoursDeparture
    val minutesArrival = (onTheWay + minutesDeparture) % 60
    println("Время прибытия: "+hoursArrival+":"+minutesArrival)
}