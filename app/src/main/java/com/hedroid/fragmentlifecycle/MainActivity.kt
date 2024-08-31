package com.hedroid.fragmentlifecycle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val openFragment = findViewById<Button>(R.id.button)
        openFragment.setOnClickListener{
            val fragment = BlankFragment()

            val transient:FragmentTransaction= supportFragmentManager.beginTransaction()
            transient.replace(R.id.frameLayout,fragment)
            transient.addToBackStack(null)
            transient.commit()
        }

    }
}