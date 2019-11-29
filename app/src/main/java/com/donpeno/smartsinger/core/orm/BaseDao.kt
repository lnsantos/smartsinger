package com.donpeno.smartsinger.core.orm

import androidx.room.Query

/*
    D = Tipo do DAO
*/
interface BaseDAO<D> {

    fun getAll():List<D>
    fun getAllById(id: IntArray) : List<D>
    fun create(schema : D)
    fun delete(schema : D)

}