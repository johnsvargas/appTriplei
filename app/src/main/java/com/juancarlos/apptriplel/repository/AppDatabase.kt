package com.juancarlos.apptriplel.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(TiendasUsuarioEntity::class), version = 1)
public abstract class AppDatabase : RoomDatabase() {

    abstract fun tiendasUsuario(): TiendasUsuarioDAO

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "triplei_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
