package com.donpeno.smartsinger.core.application

import android.app.Application
import com.donpeno.smartsinger.core.di.androidModule
import com.donpeno.smartsinger.core.di.userModule
import org.koin.android.ext.android.startKoin
import org.koin.standalone.StandAloneContext.stopKoin

class SmartSingerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(androidModule, userModule))
    }

    override fun onTerminate() {
        super.onTerminate()
        stopKoin()

    }
}