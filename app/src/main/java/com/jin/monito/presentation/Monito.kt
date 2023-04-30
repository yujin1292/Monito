package com.jin.monito.presentation

import android.app.Application
import timber.log.Timber

class Monito: Application() {
    override fun onCreate() {
        super.onCreate()

        // Plant Timber for Debug Log`
        Timber.plant(Timber.DebugTree())
    }
}