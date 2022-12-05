package com.example.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animals = arrayOf(Cow(), Elephant(), Bear(), Wolf())
        for(it in animals) {
            it.animalIntro()
        }
/*
        val cow = Cow()
        val elephant = Elephant()
        val bear = Bear()
        val wolf = Wolf()
        cow.animalIntro()
        elephant.animalIntro()
        bear.animalIntro()
        wolf.animalIntro()
        println(animalList)*/
    }
}