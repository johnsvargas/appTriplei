package com.juancarlos.apptriplel.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TiendasUsuarioDAO {
    @Query("SELECT * FROM determinante")
    fun getAll(): List<TiendasUsuarioEntity>

    @Insert
    fun insertAll(vararg tiendasUsuarioEntity: TiendasUsuarioEntity)

    @Delete
    fun delete(tiendasUsuarioEntity: TiendasUsuarioEntity)

}