package com.example.sharetovers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    //var String s1[], s2[]
   // var images : IntArray = intArrayOf( R.drawable.asian,R.drawable.french,R.drawable.packaged,R.drawable.fruits,R.drawable.indian,R.drawable.pastries,R.drawable.pizza,R.drawable.desert,R.drawable.mediteranean,R.drawable.pasta)
    lateinit var recyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navController)

        // var s1 = getResources().getStringArray(R.array.food_types)
        //recyclerView = findViewById(R.id.recyclerView)

    }

}

