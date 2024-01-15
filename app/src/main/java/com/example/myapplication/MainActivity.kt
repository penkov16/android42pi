package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Timer
import kotlin.concurrent.schedule


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Handler().postDelayed({
//            val mIntent = Intent(this@MainActivity, MainActivity2::class.java)
//            startActivity(mIntent)
//            finish()
//        }, 2000)

//        Timer().schedule(3000)
//        {
//            val mIntent = Intent(this@MainActivity, MainActivity2::class.java)
//            startActivity(mIntent)
//            finish()
//        }

    }

    fun ririr(view: View) {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }
}