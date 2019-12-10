package com.donpeno.smartsinger.main.activity

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.donpeno.smartsinger.R
import com.donpeno.smartsinger.core.database.AppDatabase
import com.donpeno.smartsinger.core.database.repositories.AlbumRepository
import com.donpeno.smartsinger.core.domain.Album
import com.donpeno.smartsinger.core.mock.ServiceProcess
import com.donpeno.smartsinger.main.adapters.AdapterPagesMainActivity
import com.donpeno.smartsinger.main.mvvm.lifecyclers.activitys.MainLifecyclerObserver
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val name : ServiceProcess by inject { parametersOf() }
    private val mListener : MainLifecyclerObserver by inject { parametersOf() }
    private var db : AlbumRepository? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = AlbumRepository(AppDatabase.getInstance(this))
        onInitVariables()

        onRegisters()
        onSetupViewConfigurations()
        Toast.makeText(this,name.username,Toast.LENGTH_LONG).show()

    }

    private fun onInitVariables() {

            if(db!!.save(Album(-1,"asdas","asdasd")) > 0){
                var result = db!!.get()
                Toast.makeText(applicationContext,result.toString() + " ENCONTRADO",Toast.LENGTH_LONG).show()
            }


    }

    private fun onSetupViewConfigurations() {
        setupTabLayoutAndViewPager()
    }

    private fun onRegisters() {
        lifecycle.addObserver(mListener)
    }

    private fun setupTabLayoutAndViewPager(){
        val adapter = AdapterPagesMainActivity(this,supportFragmentManager)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
