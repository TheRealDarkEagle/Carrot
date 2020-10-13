package de.itGarten.carrot

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Recipe::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}
