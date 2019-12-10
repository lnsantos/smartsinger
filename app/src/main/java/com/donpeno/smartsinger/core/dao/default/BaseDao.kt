package com.donpeno.smartsinger.core.dao.default

import androidx.room.Dao
import androidx.room.Query

/*
    D = Tipo do DAO
*/
interface BaseDAO<D> {

    fun getAll():List<D>
    fun getAllById(id: IntArray) : List<D>
    fun create(vararg schema : D)
    fun delete(vararg schema : D)

}