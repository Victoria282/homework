package com.example.homework

interface Convert {
    // входящие градусы Цельсия
    val degreesCelsius:Int;

    // во что конвертируем (Кельвины, Реомюры, Фаренгейты)
    val degreesToConvert:String;

    // функция конвертирующая градусы в нужную ед.
    fun convertCelsius(degreesCelsius:Int, degreesToConvert:String): String;

}