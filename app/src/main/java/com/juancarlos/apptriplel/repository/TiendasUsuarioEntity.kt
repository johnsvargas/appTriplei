package com.juancarlos.apptriplel.repository

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TiendasUsuario")
data class TiendasUsuarioEntity (
    @PrimaryKey @ColumnInfo(name = "determinante") val determinante: Int,
    @ColumnInfo(name = "cadena") var Cadena:  String?,
    @ColumnInfo(name = "sucursal") var Sucursal: String?,
    @ColumnInfo(name = "latitud") var Latitud: Float = 0.0f,
    @ColumnInfo(name = "longitud") var Longitud: Float = 0.0f
    )