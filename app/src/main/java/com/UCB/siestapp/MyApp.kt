package com.UCB.siestapp

import android.app.Application
import com.UCB.siestapp.di.appModule
import com.google.firebase.FirebaseApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SiestApp : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

        startKoin {
            androidContext(this@SiestApp)
            modules(appModule)
        }
    }
}