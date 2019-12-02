package com.donpeno.smartsinger.main.mvvm.view.dialogs.basicStorage

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import com.donpeno.smartsinger.R
import com.donpeno.smartsinger.main.mvvm.lifecyclers.activitys.MainLifecyclerObserver
import com.donpeno.smartsinger.main.mvvm.lifecyclers.dialogs.DialogBasicStorageLifecyclerObserver
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

open class BasicStorageDialog : DialogFragment(){

    private val mListener : DialogBasicStorageLifecyclerObserver by inject { parametersOf() }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        var view:View = activity!!.layoutInflater.inflate(R.layout.dialog_fragment,null)
        var alert = AlertDialog.Builder(activity)
        alert.setView(view)
        return alert.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onRegisters()
    }

    private fun onRegisters() {
        lifecycle.addObserver(mListener)
    }
}