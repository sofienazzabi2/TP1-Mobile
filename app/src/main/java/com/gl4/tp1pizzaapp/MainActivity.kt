package com.gl4.tp1pizzaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var nomInput: TextInputEditText
    lateinit var prenomInput: TextInputEditText
    lateinit var adresseInput: TextInputEditText
    lateinit var miniRadioButton: RadioButton
    lateinit var moyenneRadioButton: RadioButton
    lateinit var maxiRadioButton: RadioButton
    lateinit var fromageChip: Chip
    lateinit var tomateChip: Chip
    lateinit var champignonChip: Chip
    lateinit var commanderBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nomInput = findViewById(R.id.textFieldNom)
        prenomInput = findViewById(R.id.textFieldPrenom)
        adresseInput = findViewById(R.id.textFieldAdresse)

        miniRadioButton = findViewById(R.id.radio_button_Mini)
        moyenneRadioButton = findViewById(R.id.radio_button_Moyenne)
        maxiRadioButton = findViewById(R.id.radio_button_Maxi)

        fromageChip = findViewById(R.id.chipFromage)
        champignonChip = findViewById(R.id.chipChampignon)
        tomateChip = findViewById(R.id.chipTomate)

        commanderBtn = findViewById(R.id.btnCommander)

        commanderBtn.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }

    }
}