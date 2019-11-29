package com.donpeno.smartsinger.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.donpeno.smartsinger.R
import com.donpeno.smartsinger.core.mock.ServiceProcess
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val name : ServiceProcess by inject { parametersOf() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,name.username,Toast.LENGTH_LONG).show()
    }
}
