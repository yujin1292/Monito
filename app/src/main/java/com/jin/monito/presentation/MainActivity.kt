package com.jin.monito.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.jin.monito.R
import com.jin.monito.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        navigateToFragmentIfNeeded(intent)

    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        navigateToFragmentIfNeeded(intent)
    }


    private fun navigateToFragmentIfNeeded(intent: Intent?){
        when( intent?.action){

            else ->{

            }
        }
    }
}