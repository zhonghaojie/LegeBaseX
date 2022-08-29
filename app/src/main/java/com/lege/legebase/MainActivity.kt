package com.lege.legebase

import android.os.Bundle
import android.util.Log
import com.lege.android.base.PreferencesManager
import com.lege.android.base.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import timber.log.Timber


class MainActivity : BaseActivity() {

    class Test{
        var key = ""
        var value = ""
    }
    data class Person(val name:String,val age:Int)
    override fun onCreate(savedInstanceState: Bundle?) {
        PreferencesManager.init(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
