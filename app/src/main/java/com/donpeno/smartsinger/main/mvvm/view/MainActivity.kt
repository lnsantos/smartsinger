package com.donpeno.smartsinger.main.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.donpeno.smartsinger.R
import com.donpeno.smartsinger.core.mock.ServiceProcess
import com.donpeno.smartsinger.main.mvvm.lifecyclers.activitys.MainLifecyclerObserver
import com.donpeno.smartsinger.main.mvvm.view.dialogs.basicStorage.BasicStorageDialog
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val name : ServiceProcess by inject { parametersOf() }
    private val mListener : MainLifecyclerObserver by inject { parametersOf() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onRegisters()
        floatingActionButton2.setOnClickListener{
            BasicStorageDialog()
                .show(supportFragmentManager, "a")
        }
        Toast.makeText(this,name.username,Toast.LENGTH_LONG).show()
    }

    private fun onRegisters() {
        lifecycle.addObserver(mListener)
    }
}
