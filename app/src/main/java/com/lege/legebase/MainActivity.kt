package com.lege.legebase

import android.os.Bundle
import android.util.Log
import com.lege.android.base.PreferencesManager
import com.lege.android.base.ui.BaseActivity
import com.lege.android.base.util.AlarmClockUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import org.json.JSONArray
import org.json.JSONObject
import timber.log.Timber


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        PreferencesManager.init(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setOnClickListener {
            AlarmClockUtil.setNewRepeatReminder(aaaa::class.java,this,"new_remind",16490,
            0,12,3,20,20,15,"111")
//            AlarmClockUtil.deleteNewReminder(aaaa::class.java,this,16490,0)
            toast("1111")
        }
    }
}
