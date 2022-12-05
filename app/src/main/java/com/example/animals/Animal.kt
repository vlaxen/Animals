package com.example.animals

open class Animal {
    open val animalFood = "еда"
    open val animalName = "имя"
    open val animalMass = "вес"

    open fun animalIntro() {
       println("Добрый вечер, это $animalName. Я ем $animalFood и вешу, в среднем $animalMass килограмм")
    }
}