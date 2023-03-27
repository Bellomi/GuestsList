package com.example.guests.model

//vamos mapear os valores que o convidado recebe.
//o modelo normalmente bate com o que é salvo no banco de dados.
data class GuestModel(
    val id: Int,
    var name: String,
    var presence: Boolean
)
