package com.donpeno.smartsinger.core.di

import com.donpeno.smartsinger.core.mock.ServiceProcess
import com.donpeno.smartsinger.main.mvvm.lifecyclers.activitys.MainLifecyclerObserver
import com.donpeno.smartsinger.main.mvvm.lifecyclers.dialogs.DialogBasicStorageLifecyclerObserver
import org.koin.dsl.module.module

val androidModule = module{
    single { this }
    single { ServiceProcess() }
    single { MainLifecyclerObserver() }
    single { DialogBasicStorageLifecyclerObserver() }
}