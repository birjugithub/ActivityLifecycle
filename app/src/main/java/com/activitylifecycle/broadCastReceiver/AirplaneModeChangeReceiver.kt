package com.activitylifecycle.broadCastReceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirPlaneModeOn = intent?.getBooleanExtra("state", false)

        if (isAirPlaneModeOn == true) {
            // Logic when airplane mode is enabled (e.g., pause data sync)

            Toast.makeText(context, "Airplane Mode ON", Toast.LENGTH_LONG).show()
            Log.d("MyBroadCastReceiver", "Airplane Mode is On")
        } else {
            // Logic when airplane mode is disabled (e.g., resume data sync)
            Toast.makeText(context, "Airplane Mode ON", Toast.LENGTH_LONG).show()
            Log.d("MyBroadCastReceiver", "Airplane Mode is On")

        }

    }

}