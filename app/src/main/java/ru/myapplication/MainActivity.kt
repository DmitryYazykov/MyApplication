package ru.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import ru.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding              // настроенный ViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {     //присваиваю кнопке слушатель нажатий

            // создаю переменную для сохранения значения которое ввёл прользователь
            val resultValue = bindingClass.edValue.text.toString().toInt()

            // код для проверки результата в логах
            Log.d("MyLog", "Result = $resultValue")

            // проверка результата
            when (resultValue) {

                in 0..1_000 -> {
                    // visibility = View.VISIBLE - делаем видимым текст результата
                    bindingClass.tvResult.visibility = View.VISIBLE
                    // показ текста
                    bindingClass.tvResult.text = "Вы начинающий блогер"
                }

                in 1_000..100_000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Вы отличный блогер"
                }

                in 100_000..1_000_000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Вы лучший блогер"
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Вы супер звезда!"
                }
            }
        }
    }
}