package ru.myapplication.constants

// объект, хранящий константы
object Constants {
    //зарплаты должностей
    const val STREET_CLEANER_SALARY = 25_000
    const val ENGINEER_SALARY = 57_000
    const val DIRECTOR_SALARY = 120_000

    // имена, которые занимают должности
    const val STREET_CLEANER = "Andrey"
    const val ENGINEER = "Sergey"
    const val DIRECTOR = "Dmitry"


    // пароли для должностей
    const val PASSWORD_STREET_CLEANER = "1234"
    const val PASSWORD_ENGINEER = "5678"
    const val PASSWORD_DIRECTOR = "1212"
    const val PASSWORD_ERROR = "Неверный пароль!"
    const val NAME_ERROR = "Нет такого имени!"
}