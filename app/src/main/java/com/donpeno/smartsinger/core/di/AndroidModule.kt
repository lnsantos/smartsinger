package com.donpeno.smartsinger.core.di

import com.donpeno.smartsinger.core.mock.ServiceProcess
import org.koin.dsl.module.module

val androidModule = module{
    single { this }
    single { ServiceProcess() }
}