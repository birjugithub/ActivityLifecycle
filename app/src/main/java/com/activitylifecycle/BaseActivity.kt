package com.activitylifecycle

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.activitylifecycle.utils.LanguageManager

open class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        val lang = LanguageManager.getLanguage(newBase)
        val updatedContext = LanguageManager.setLocale(newBase, lang)
        super.attachBaseContext(updatedContext)
    }
}
