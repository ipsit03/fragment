package com.example.fra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    lateinit var replace: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replace=findViewById(R.id.buttonreplace)
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        val firstFragment = firstfragment()
        fragmentTransaction.add(R.id.fra, firstFragment)
        fragmentTransaction.commit()
        replace.setOnClickListener {
            val secondFragmentManager:FragmentManager=supportFragmentManager
            val secondFragmentTransaction:FragmentTransaction=secondFragmentManager.beginTransaction()
            val secondFragment=secondfragment()
            secondFragmentTransaction.replace(R.id.fra,secondFragment)
            secondFragmentTransaction.addToBackStack(null)
            secondFragmentTransaction.commit()
        }
    }
}