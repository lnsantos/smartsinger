package com.donpeno.smartsinger.core.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.donpeno.smartsinger.BuildConfig
import com.donpeno.smartsinger.core.dao.AlbumDao
import com.donpeno.smartsinger.core.domain.Album

@Database(entities = [Album::class], version = BuildConfig.DATABASE_VERSION)
abstract class AppDatabase : RoomDatabase(){

    abstract fun albumDao() : AlbumDao

    companion object{

        private var instance: AppDatabase? = null

        fun getInstance(ctx: Context): AppDatabase{
            if(instance == null){
                instance = Room.databaseBuilder(
                    ctx,
                    AppDatabase::class.java,
                    BuildConfig.DATABASE_NAME).build()
            }
            return instance as AppDatabase
        }

        fun destroyInstance(){
            instance = null
        }
    }
}