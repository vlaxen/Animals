package com.example.animals

open class Animal(
    open val animalFood: String,
    open val animalName: String,
    open val animalMass: Int
    ) {
    fun printAnimals(){
        println("Животное называется $animalName, питается $animalFood, имеет среднюю массу $animalMass кг.")
}