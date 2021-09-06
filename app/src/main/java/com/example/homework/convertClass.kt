package com.example.homework

class ConvertClass:Convert {
    override var degreesCelsius: Int = 0;
    override var degreesToConvert: String = "";

    private var resultNumber:Float = 0.0f;
    private var resultString:String = "";

    constructor(degreesCelsius: Int, degreesToConvert: String) {
        this.degreesCelsius = degreesCelsius;
        this.degreesToConvert = degreesToConvert;
        convertCelsius(degreesCelsius, degreesToConvert);
    }

    override fun convertCelsius(degreesCelsius: Int, degreesToConvert: String): String {
        if(degreesToConvert == "Кельвины") {
            resultNumber = (degreesCelsius + 273.15).toFloat();
            resultString = resultNumber.toString() + " " + "K";
        }
        else if(degreesToConvert == "Фаренгейты") {
            resultNumber = ((9.0 / 5.0) * degreesCelsius + 32).toFloat();
            resultString = resultNumber.toString() + " " + "°F";
        }
        else if(degreesToConvert == "Реомюра") {
            resultNumber = (0.8 * degreesCelsius).toFloat();
            resultString = resultNumber.toString() + " " + "°R";
        }

        return resultString;
    }
}