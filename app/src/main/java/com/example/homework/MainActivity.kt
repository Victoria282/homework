package com.example.homework

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convertButton:Button = findViewById(R.id.button);
        val inputNumber: EditText = findViewById(R.id.editTextNumber);
        val resultFieldText:TextView = findViewById(R.id.resultField);

        // выпадающеее меню
        val spinnerItemsToChoose: Spinner = findViewById(R.id.spinner);

        // массив вариант
        val itemsToChoose = arrayListOf("Фаренгейты", "Кельвины", "Реомюра");

        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, itemsToChoose
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerItemsToChoose.adapter = adapter;

        convertButton.setOnClickListener() {
            // очищаем поле
            resultFieldText.text = "";
            val selected: String = spinnerItemsToChoose.selectedItem.toString()

            // проверка на пустоту
            if(inputNumber.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "Введите градусы!", Toast.LENGTH_SHORT).show();
            }
            else {
                val numberEditText : Int = inputNumber.text.toString().trim().toInt();
                convert(selected, numberEditText, resultFieldText);
            }
        }
        
    }
    private fun convert(selected: String, numberEditText: Int, resultFieldText: TextView) {
        val convertValue = ConvertClass(numberEditText, selected);
        val result = convertValue.convertCelsius(numberEditText, selected);
        resultFieldText.text = result.toString();
    }
}