package com.example.animals

class Wolf: Carnivore() {
    override val animalName = "Волк"
    override val animalMass = "100"

    override fun animalIntro() {
        println("Я злой и страшный серый $animalName, я в поросятах знаю толк!")
    }
}