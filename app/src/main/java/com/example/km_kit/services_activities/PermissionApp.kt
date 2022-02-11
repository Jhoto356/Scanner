package com.example.km_kit.services_activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

import com.example.km_kit.utils.Constants.*

import pub.devrel.easypermissions.EasyPermissions

class PermissionApp {

    //Camera permission
    private fun verifyCameraP (context: Context): Boolean {
        pCameraG = EasyPermissions.hasPermissions(context, pCameraS)
        return pCameraG
    }

    private fun requestCameraP (activity: AppCompatActivity) {
        EasyPermissions.requestPermissions(activity, rmCameraP, pCameraCode, pCameraS)
    }

    fun requestPermissions (context: Context, activity: AppCompatActivity) {
        if (!verifyCameraP(context)) {
            requestCameraP(activity)
        }
    }

}