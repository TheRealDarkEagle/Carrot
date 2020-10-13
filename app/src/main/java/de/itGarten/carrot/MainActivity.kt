package de.itGarten.carrot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import de.itGarten.carrot.ui.main.Recipe

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recipeFragment = Recipe();
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        setContentView(R.layout.activity_main)
        fragmentTransaction.add(R.id.recipes_list, recipeFragment)
        fragmentTransaction.commit()
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "recipes"
        ).build()
    }
}