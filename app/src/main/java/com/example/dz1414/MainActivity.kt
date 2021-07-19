package com.example.dz1414

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*Разработать программу, которая будет как "магически" шар выдавать случайный результат.
 К примеру, вы ей задаете вопрос: "..... . .. ... .. ?", а она выдает вам результат из предложенного:

Да
Нет
Скорее всего да
Скорее всего нет
Возможно
Имеются перспективы
Вопрос задан неверно
*/
fun main(args: Array<String>) {

    println("Ваш вопрос?")
    val line = readLine()

    val words = arrayOf("Да", "Нет", "Скорее всего да", "Скорее всего нет", "Возможно", "Имеются перспективы", "Вопрос задан неверно")
    val arraySize = words.size

    val rand = Random.nextInt(arraySize)
    val name = "${words[rand]}"
    println(name)

}