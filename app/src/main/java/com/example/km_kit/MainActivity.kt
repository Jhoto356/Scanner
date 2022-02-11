package com.example.km_kit

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.km_kit.databinding.ActivityMainBinding
import com.example.km_kit.services_actitvities.PermissionApp

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
    }

    private fun requestPermissions () {
        permissionApp.requestPermissions(context, activity)
    }

}