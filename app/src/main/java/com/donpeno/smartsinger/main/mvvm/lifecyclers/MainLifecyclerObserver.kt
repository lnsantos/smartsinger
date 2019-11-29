package com.donpeno.smartsinger.main.mvvm.lifecyclers

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.donpeno.smartsinger.main.mvvm.view.MainActivity

class MainLifecyclerObserver : LifecycleObserver{

    private var TAG : String = MainLifecyclerObserver::class.java.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartListener(){
        Log.i(TAG, "Starting activity...")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopListener(){
        Log.i(TAG, "Stop activity...")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeListener(){
        Log.i(TAG, "Init resume activity...")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseListener(){
        Log.i(TAG, "Activity pause...")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyListener(){
        Log.i(TAG, "activity destroyed...")
    }
}