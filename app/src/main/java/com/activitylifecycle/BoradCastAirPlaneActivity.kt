package com.activitylifecycle

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.activitylifecycle.broadCastReceiver.AirplaneModeChangeReceiver

class BoradCastAirPlaneActivity : AppCompatActivity() {
    private lateinit var airplaneModeReceiver: AirplaneModeChangeReceiver
    private lateinit var intentFilter: IntentFilter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_borad_cast_air_plane)
        airplaneModeReceiver= AirplaneModeChangeReceiver()
        intentFilter= IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(airplaneModeReceiver,intentFilter)
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(airplaneModeReceiver)
    }
}