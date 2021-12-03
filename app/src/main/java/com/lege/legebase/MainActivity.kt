package com.lege.legebase

import android.os.Bundle
import android.util.Log
import com.google.gson.JsonArray
import com.google.gson.JsonParser
import com.lege.android.base.PreferencesManager
import com.lege.android.base.ui.BaseActivity
import com.lege.android.base.ui.DialogUtil
import com.lege.android.base.util.JSON
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
        JavaTest.test();
        val str = "[{\"age\":12,\"name\":\"张三\"},{\"age\":13,\"name\":\"李四\"},{\"age\":14,\"name\":\"王五\"}]"
        val person = "{\"age\":12,\"name\":\"张三\"}"
        val array = JSONArray(str)

        (0 until array.length()).forEach{
            (array[it] as JSONObject).apply {
                Log.d("JSON", this.optString("name"))
            }

        }
        val list = JSON.parseArray<Person>(str,Person::class.java)
        val personObj = JSON.parseObject(person, Person::class.java)
        Log.d("JSON", "")
        root.setOnClickListener {
//            DialogUtil.showConfirmDialogForChildrenTomato(this,title="测试dialog",content = "asaaaaaa",onOk = {},onCancel = {})
            DialogUtil.showCustomDialog(this,title="测试dialog",content = "asaaaaaa",onOk = {},onCancel = {})


            Timber.d("ASASASASASAS")


        }

        Timber.plant(Timber.DebugTree())
        Timber.tag("AAASASAS")
    }
}
