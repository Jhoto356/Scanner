package com.example.km_kit.services_actitvities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.km_kit.databinding.ActivityCameraBinding

class CameraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCameraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}