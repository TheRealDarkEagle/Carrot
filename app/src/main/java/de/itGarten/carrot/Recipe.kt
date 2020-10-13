package de.itGarten.carrot

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Recipe(
    @PrimaryKey
    val rid: Int,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "time_required") val timeRequired: String?
)