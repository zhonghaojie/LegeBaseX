package com.lege.legebase

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.hjq.toast.ToastUtils
import org.jetbrains.anko.toast

class aaaa:BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        ToastUtils.show("222222")
    }
}