package com.donpeno.smartsinger.core.domain

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.donpeno.smartsinger.core.dao.schemas.StropheSchema

data class Strophe (

    @PrimaryKey
    @ColumnInfo(name = StropheSchema.ID_COLUMN)
    var    id: Int    = 0,

    @ColumnInfo(name = StropheSchema.NAME_STROPHE_COLUMN)
    var     strophe_text: String = "",

    @ColumnInfo(name = StropheSchema.ID_MUSIC_COLUMN)
    var music_id: Int    = -1)

