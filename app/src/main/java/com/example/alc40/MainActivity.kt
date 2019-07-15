package com.example.alc40

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {  switch("About") }
        button2.setOnClickListener { switch("Profile") }
    }
    fun switch(name:String)
    {
       if(name == "Profile")
       {
           startActivity(Intent(this, Profile::class.java))
       }
        else
       {
           startActivity(Intent(this, About::class.java))
       }
    }
}
