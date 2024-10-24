package com.woncan.sdktest

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.woncan.sourcelib.PublicAPI

class MainActivity : AppCompatActivity() {

		override fun onCreate(savedInstanceState : Bundle?) {
				super.onCreate(savedInstanceState)
				enableEdgeToEdge()
				setContentView(R.layout.activity_main)
				ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v , insets ->
						val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
						v.setPadding(systemBars.left , systemBars.top , systemBars.right , systemBars.bottom)
						insets
				}
				val startTest = PublicAPI.startTest()
				Log.i("TAG" , "onCreate: ${startTest}")
		}
}