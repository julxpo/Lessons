package org.example.lesson_2

fun main() {
    /*В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
    которым назначили зарплату в 20000 рублей каждому.
    Пишем часть гипотетического софта для бухгалтерии, который будет считать:

    – Расходы на выплату зарплаты постоянных сотрудников;
    – Общие расходы по ЗП после прихода стажеров;
    – Среднюю ЗП одного сотрудника после устройства стажеров.

    Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.*/

    val countWorkers = 50
    val salaryWorkers = 30000
    val countInterns = 30
    val salaryInterns = 20000

    val salaryOfEmployees = countWorkers * salaryWorkers
    val salariesWithInterns = salaryOfEmployees + countInterns * salaryInterns
    val average = salariesWithInterns / (countWorkers + countInterns)
    println(salaryOfEmployees)
    println(salariesWithInterns)
    println(average)
}