package com.example.homework

interface Convert {
    // входящие градусы Цельсия
    val degreesCelsius:Int;
    // во что конвертируем (Кельвины или Фаренгейты)
    val degreesToConvert:String;

    // функция конвертирующая градусы в Фаренгейты/ Кельвины
    // тип возвращаемого значения - int
    fun convertCelsius(degreesCelsius:Int, degreesToConvert:String): String;

}