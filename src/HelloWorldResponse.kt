package com.daniil.shevtsov

import kotlinx.serialization.Serializable


@Serializable
data class HelloWorldResponse(
    val hello: String,
    val world: String
)