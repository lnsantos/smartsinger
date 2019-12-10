package com.donpeno.smartsinger.core.dao

import androidx.room.*
import com.donpeno.smartsinger.core.dao.schemas.AlbumSchema
import com.donpeno.smartsinger.core.domain.Album

@Dao
interface AlbumDao {

    @Query("SELECT * FROM " + AlbumSchema.TABLE_NAME)
    fun getAll(): List<Album>

    @Query("SELECT * FROM " + AlbumSchema.TABLE_NAME + " WHERE ID_TABLE_COLUMN IN (:id)")
    fun getAllById(id: IntArray): List<Album>

    @Insert
    fun save(schema: Album) : Long

    @Delete
    fun delete(vararg schema: Album) : Int


}