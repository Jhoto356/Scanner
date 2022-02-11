package com.example.km_kit

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.km_kit.databinding.ActivityMainBinding
import com.example.km_kit.utils.Constants.*
import com.example.km_kit.services_activities.CameraActivity
import com.example.km_kit.services_activities.PermissionApp

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var context: Context
    private lateinit var activity: AppCompatActivity
    private lateinit var permissionApp: PermissionApp


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        context = this
        activity = this

        initComponents()
        requestPermissions()
    }

    private fun initComponents () {
        permissionApp = PermissionApp()
        actionButtons()
    }

    private fun requestPermissions () {
        permissionApp.requestPermissions(context, activity)
    }

    private fun actionButtons () {
        pressOpenScan()
    }

    private fun pressOpenScan () {
        binding.btnScan.setOnClickListener {
            if (pCameraG){
                startActivity(Intent(this, CameraActivity::class.java))
            } else {
                permissionApp.requestCameraP(activity)
            }
        }
    }

}