package com.example.homework

class ConvertClass:Convert {
    override var degreesCelsius: Int = 0;
    override var degreesToConvert: String = "";

    // результирующие градусы
    private var resultNumber:Float = 0.0f;

    // строка результат
    private var resultString:String = "";

    constructor(degreesCelsius: Int, degreesToConvert: String) {
        this.degreesCelsius = degreesCelsius;
        this.degreesToConvert = degreesToConvert;
    }

    override fun convertCelsius(degreesCelsius: Int, degreesToConvert: String): String {
        when (degreesToConvert) {
            "Кельвины" -> {
                resultNumber = (degreesCelsius + 273.15).toFloat();
                resultString = "$resultNumber K";
            }
            "Фаренгейты" -> {
                resultNumber = ((9.0 / 5.0) * degreesCelsius + 32).toFloat();
                resultString = "$resultNumber °F";
            }
            "Реомюра" -> {
                resultNumber = (0.8 * degreesCelsius).toFloat();
                resultString = "$resultNumber °R";
            }
        }

        return resultString;
    }
}