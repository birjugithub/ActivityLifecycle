package com.activitylifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this@MainActivity,"Call onCreate method!", Toast.LENGTH_LONG).show()
    }

    override fun onStart(){
        super.onStart()
        Toast.makeText(this@MainActivity,"Call onStart method!", Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this@MainActivity,"Call onRestart method!", Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this@MainActivity,"Call onResume method!", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this@MainActivity,"Call onPause method!", Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this@MainActivity,"Call onStop method!", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this@MainActivity,"Call onDestroy method!", Toast.LENGTH_LONG).show()
    }

}