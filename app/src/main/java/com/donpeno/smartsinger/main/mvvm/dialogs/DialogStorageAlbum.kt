package com.donpeno.smartsinger.main.mvvm.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.donpeno.smartsinger.R
import com.donpeno.smartsinger.main.mvvm.lifecyclers.dialogs.DialogBasicStorageLifecyclerObserver
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

open class DialogStorageAlbum : DialogFragment(){

    private val mListener : DialogBasicStorageLifecyclerObserver by inject { parametersOf() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.dialog_storage_album,container,false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onRegisters()
    }

    private fun onRegisters() {
        lifecycle.addObserver(mListener)
    }

}