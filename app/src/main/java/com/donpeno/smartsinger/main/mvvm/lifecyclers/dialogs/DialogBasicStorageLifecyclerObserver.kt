package com.donpeno.smartsinger.main.mvvm.lifecyclers.dialogs

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class DialogBasicStorageLifecyclerObserver : LifecycleObserver{

    private var TAG = DialogBasicStorageLifecyclerObserver::class.java.simpleName

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