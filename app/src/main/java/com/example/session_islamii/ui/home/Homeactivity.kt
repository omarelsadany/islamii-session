package com.example.session_islamii.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.session_islamii.R
import com.example.session_islamii.ui.home.fragments.Hadethfragment
import com.example.session_islamii.ui.home.fragments.Quranfragment
import com.example.session_islamii.ui.home.fragments.Radiofragment
import com.example.session_islamii.ui.home.fragments.Sebhafragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Homeactivity : AppCompatActivity() {
    lateinit var bottom_navigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)
        bottom_navigation = findViewById(R.id.bottom_navigation)
        bottom_navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_quran) {
                pushfragment(Quranfragment())
            } else if (item.itemId == R.id.navigation_hadeth) {
                pushfragment(Hadethfragment())
            } else if (item.itemId == R.id.navigation_sebha) {
                pushfragment(Sebhafragment())
            } else if (item.itemId == R.id.navigation_radio) {
                pushfragment(Radiofragment())
            }
            return@setOnItemSelectedListener true
        }
        bottom_navigation.selectedItemId = R.id.navigation_quran
    }

    private fun pushfragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_contianer, fragment)
            .commit()
    }
}