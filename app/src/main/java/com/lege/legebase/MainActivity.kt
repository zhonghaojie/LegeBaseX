package com.lege.legebase

import android.os.Bundle
import android.util.Log
import com.lege.android.base.PreferencesManager
import com.lege.android.base.ui.BaseActivity
import com.lege.android.base.ui.DialogUtil
import kotlinx.android.synthetic.main.activity_main.*
import com.google.gson.reflect.TypeToken
import com.lege.android.base.util.parseArray
import com.lege.android.base.util.parseObject
import com.lege.android.base.util.toJsonString
import java.lang.reflect.Type


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

        val person = "{\"age\":12,\"name\":\"张三\"}"
        val obj = person.parseObject<Person>()
        Log.d("JSON",""+obj.toJsonString())


        val str = "[{\"age\":12,\"name\":\"张三\"},{\"age\":13,\"name\":\"李四\"},{\"age\":14,\"name\":\"王五\"}]"
        val list2= str.parseArray<Person>()
        Log.d("JSON",list2.toJsonString())
        root.setOnClickListener {
//            DialogUtil.showConfirmDialogForChildrenTomato(this,title="测试dialog",content = "asaaaaaa",onOk = {},onCancel = {})
            DialogUtil.showCustomDialog(this,title="测试dialog",content = "asaaaaaa",onOk = {},onCancel = {})






        }

    }
}
