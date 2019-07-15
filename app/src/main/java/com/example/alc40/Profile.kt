package com.example.alc40

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Glide
            .with(this)
            .load("https://scontent.fcpt6-1.fna.fbcdn.net/v/t1.0-9/14390738_1508543925838144_8666858864669205810_n.jpg?_nc_cat=101&_nc_oc=AQmrl78niP32ySbCbSKjtswS3Hm5QSrXk_CRdXBsFA7Vlgrf34vNC_x06sCgpiHyB6s&_nc_ht=scontent.fcpt6-1.fna&oh=0bb3f4f0cb6657b0ae6676d11c2de901&oe=5DA326C5")
            .into(sbu)
    }
}
