package com.donpeno.smartsinger.core.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.donpeno.smartsinger.core.dao.schemas.MusicSchema

@Entity
data class Music(

    @PrimaryKey
    @ColumnInfo(name = MusicSchema.ID_COLUMN)
    var    id: Int    = 0,

    @ColumnInfo(name = MusicSchema.NAME_MUSIC_COLUMN)
    var     name: String = "",

    @ColumnInfo(name = MusicSchema.IMAGE_DIR_COLUMN)
    var image_dir:String? = "",

    @ColumnInfo(name = MusicSchema.ID_ALBUM_COLUMN)
    var album_id: Int    = -1)