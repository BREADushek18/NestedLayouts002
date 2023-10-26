package com.example.nestedlayouts002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            clickCount++

            when {
                clickCount % 3 == 0 -> {
                    findViewById<TextView>(R.id.textView2).text = ""
                    findViewById<TextView>(R.id.textView5).text = ""
                    findViewById<TextView>(R.id.textView8).text = ""
                    findViewById<TextView>(R.id.textView3).text = clickCount.toString()
                    findViewById<TextView>(R.id.textView6).text = clickCount.toString()
                    findViewById<TextView>(R.id.textView9).text = clickCount.toString()
                }
                clickCount % 3 == 2 -> {
                    findViewById<TextView>(R.id.textView1).text = ""
                    findViewById<TextView>(R.id.textView4).text = ""
                    findViewById<TextView>(R.id.textView7).text = ""
                    findViewById<TextView>(R.id.textView2).text = clickCount.toString()
                    findViewById<TextView>(R.id.textView5).text = clickCount.toString()
                    findViewById<TextView>(R.id.textView8).text = clickCount.toString()
                }
                else -> {
                    findViewById<TextView>(R.id.textView3).text = ""
                    findViewById<TextView>(R.id.textView6).text = ""
                    findViewById<TextView>(R.id.textView9).text = ""
                    findViewById<TextView>(R.id.textView1).text = clickCount.toString()
                    findViewById<TextView>(R.id.textView4).text = clickCount.toString()
                    findViewById<TextView>(R.id.textView7).text = clickCount.toString()
                }
            }
        }
    }
}


