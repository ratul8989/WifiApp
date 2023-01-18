package com.example.wifiapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onoff = findViewById<View>(R.id.on_off)
        val connectdisconnect = findViewById<View>(R.id.connect_disconnect)
        val scan = findViewById<View>(R.id.scan_wifi)

        val onoff1 = OnOffFragment()
        val connectdisconnect1 = ConnectDisconnectFragment()
        val scan1 = ScanFragment()

        /*supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, onoff1)
            commit()
        }*/

        onoff.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment,onoff1)
                addToBackStack(null)
                commit()
            }
        }

        connectdisconnect.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment,connectdisconnect1)
                addToBackStack(null)
                commit()
            }
        }

        scan.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment,scan1)
                addToBackStack(null)
                commit()
            }
        }

    }
}