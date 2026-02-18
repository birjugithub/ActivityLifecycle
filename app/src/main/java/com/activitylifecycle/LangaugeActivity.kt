package com.activitylifecycle

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.activitylifecycle.utils.LanguageManager
import org.intellij.lang.annotations.Language

class LangaugeActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_langauge)

        val hindi=findViewById<Button>(R.id.btnHindi)
        val english=findViewById<Button>(R.id.btnEnglish)
        val french=findViewById<Button>(R.id.btnFrench)
        val spanish=findViewById<Button>(R.id.btnSpanish)


        hindi.setOnClickListener {
            changeLocal(this,"hi")
        }

        english.setOnClickListener {
            changeLocal(this,"en")

        }

        french.setOnClickListener {
            changeLocal(this,"fr")

        }
        spanish.setOnClickListener {
            changeLocal(this,"es")

        }

    }


    fun changeLocal(context: Context, language: String) {
        LanguageManager.saveLanguage(context, language)
        LanguageManager.setLocale(context, language)
        restartApp(context)
    }

    fun restartApp(context: Context) {
        val intent = Intent(context, LangaugeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        context.startActivity(intent)
        if (context is Activity) {
            context.finish()
        }
    }
}