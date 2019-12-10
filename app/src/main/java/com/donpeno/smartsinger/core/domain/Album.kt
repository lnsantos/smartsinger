package com.donpeno.smartsinger.core.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.donpeno.smartsinger.core.dao.schemas.AlbumSchema
import java.io.ObjectStreamConstants


@Entity(tableName = AlbumSchema.TABLE_NAME)
data class Album(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = AlbumSchema.ID_COLUMN)
    var  id: Int     = -1,

    @ColumnInfo(name = AlbumSchema.NAME_ALBUM_COLUMN)
    var   name: String? = "",

    @ColumnInfo(name = AlbumSchema.IMAGE_DIR_COLUMN)
    var  image: String? = "")