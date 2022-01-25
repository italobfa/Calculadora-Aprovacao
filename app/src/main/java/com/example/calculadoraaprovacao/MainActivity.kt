package com.example.calculadoraaprovacao

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = calcular
        val resultado = resultado

        btnCalcular.setOnClickListener {
            val nota1 =  parseInt(nota1.text.toString())
            val nota2 = parseInt(nota2.text.toString())
            val faltas = parseInt(faltas.text.toString())
            val media = (nota1+nota2)/2

            if(nota1<=10 && nota2<=10){
                if(media >= 6 && faltas <=10){
                    resultado.text = "Aluno foi aprovado com média = $media e faltas = $faltas"
                    resultado.setTextColor(Color.GREEN)
                }else{
                    resultado.text = "Aluno foi reprovado com média = $media e faltas = $faltas"
                    resultado.setTextColor(Color.RED)
                }
            }else{
                resultado.text = "Notas precisam ter valores de no máximo 10"
                resultado.setTextColor(Color.BLACK)
            }
        }
    }
}