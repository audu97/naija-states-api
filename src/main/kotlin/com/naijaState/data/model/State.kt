package com.naijaState.data.model

import kotlinx.serialization.Serializable

@Serializable
data class State(
    val name: String,
    val stateId: String,
    val capital: String,
    val governor: String,
    val description: String,
    val population: Int,
    val slogan: String,
    val region: String,
    val YearCreated: Int,
)
