package com.nicolascristaldo.amphibians

import android.app.Application
import com.nicolascristaldo.amphibians.data.AppContainer
import com.nicolascristaldo.amphibians.data.DefaultContainer

class AmphibiansApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultContainer()
    }
}