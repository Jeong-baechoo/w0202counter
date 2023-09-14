package com.example.w0202counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w0202counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener{
            main.btnText.text = "${++count}"
        }
        main.btnMinus.setOnClickListener{
            if(count > 0)
                main.btnText.text = "${--count}"
        }
        main.btnReset.setOnClickListener{
            count = 0
            main.btnText.text = "$count"
        }

    }
}