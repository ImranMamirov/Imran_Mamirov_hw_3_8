package com.example.imran_mamirov_hw_3_8

import java.io.Serializable

data class CharacterModel(
    val status: String,
    val name: String,
    val image: String
) : Serializable
