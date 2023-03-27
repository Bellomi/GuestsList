package com.example.guests.constants

class DataBaseConstants private constructor() {

    //pra nao correr o risco de colocar o nome errado nas informações da tabela
    object GUEST {

        const val ID = "guestid"
        const val TABLE_NAME = "Guest"

        object COLUMNS {
            const val ID = "id"
            const val NAME = "name"

            const val PRESENCE = "presence"
        }
    }
}