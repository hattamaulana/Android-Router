package com.github.hattamaulana.router

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toPage(view: View) {
        val navigate: (String) -> Unit = { direction ->
            ARouter.getInstance().build(direction).navigation()
        }

        when (view.id) {
            R.id.button -> navigate(PageOneActivity.Route)
            R.id.button2 -> navigate(PageTwoActivity.Route)
        }
    }
}