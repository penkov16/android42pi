package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.util.Timer
import kotlin.concurrent.schedule


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Handler().postDelayed({
            val mIntent = Intent(this@MainActivity3, MainActivity2::class.java)
            startActivity(mIntent)
            finish()
        }, 3000)
    }

//        Timer().schedule(5000)
//        {
//            val mIntent = Intent(this@MainActivity3, MainActivity2::class.java)
//            startActivity(mIntent)
//            finish()
//        }

    }
