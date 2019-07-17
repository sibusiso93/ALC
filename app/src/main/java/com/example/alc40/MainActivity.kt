package com.example.alc40

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {  switch("About") }
        button2.setOnClickListener { switch("Profile") }
        Glide
            .with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/invitation-7c83a.appspot.com/o/Andela.jpeg?alt=media&token=fe39821f-6290-4a49-a8fd-60f0bf95a895")
            .into(back)
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
