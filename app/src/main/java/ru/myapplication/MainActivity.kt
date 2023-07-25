package ru.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import ru.myapplication.constants.Constants
import ru.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding              // настроенный ViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {     //присваиваю кнопке слушатель нажатий

            // создаю переменную для сохранения значения которое ввёл прользователь
            val resultValue = bindingClass.editTextName.text.toString()

            // код для проверки результата в логах
            Log.d("MyLog", "Result = $resultValue")

            // проверка результата
            when (resultValue) {

                Constants.DIRECTOR -> {
                    // visibility = View.VISIBLE - делаем видимым текст результата
                    bindingClass.tvResult.visibility = View.VISIBLE

                    // создаю переменную для показа текста
                    val salary = "Получите вашу зарплату: ${Constants.DIRECTOR_SALARY} рублей"

                    // условие если пользователь вводит пароль
                    bindingClass.tvResult.text =
                        if (bindingClass.editTextPassword.text.toString() == Constants.PASSWORD_DIRECTOR) {
                            // показ текста
                            salary
                        } else {
                            Constants.PASSWORD_ERROR
                        }
                }

                Constants.ENGINEER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE

                    // создаю переменную для показа текста
                    val salary = "Получите вашу зарплату: ${Constants.ENGINEER_SALARY} рублей"

                    // условие если пользователь вводит пароль
                    bindingClass.tvResult.text =
                        if (bindingClass.editTextPassword.text.toString() == Constants.PASSWORD_ENGINEER) {
                            // показ текста
                            salary
                        } else {
                            Constants.PASSWORD_ERROR
                        }
                }

                Constants.STREET_CLEANER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE

                    // создаю переменную для показа текста
                    val salary = "Получите вашу зарплату: ${Constants.STREET_CLEANER_SALARY} рублей"

                    // условие если пользователь вводит пароль
                    bindingClass.tvResult.text =
                        if (bindingClass.editTextPassword.text.toString() == Constants.PASSWORD_STREET_CLEANER) {
                            // показ текста
                            salary
                        } else {
                            Constants.PASSWORD_ERROR
                        }
                }

                else -> {
                    // если имя введено не верно
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = Constants.NAME_ERROR
                }
            }
        }
    }
}