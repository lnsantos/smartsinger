package com.donpeno.smartsinger.core.database.repositories

import com.donpeno.smartsinger.core.database.AppDatabase
import com.donpeno.smartsinger.core.domain.Album

class AlbumRepository(database: AppDatabase) {

    private val dao = database.albumDao()

    fun save(album:Album):Long{

        return dao.save(album)
    }

    fun get():List<Album>{
        return dao.getAll()
    }

}