package com.example.animals

open class Animal {
    open val animalFood = ""
    open val animalName = ""
    open val animalMass = ""

    open fun animalIntro() {
       println("Добрый вечер, это $animalName. Я ем $animalFood и вешу, в среднем $animalMass килограмм")
    }
}