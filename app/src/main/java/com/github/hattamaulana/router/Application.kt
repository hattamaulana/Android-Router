package com.github.hattamaulana.router

import com.alibaba.android.arouter.launcher.ARouter

class Application: android.app.Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            ARouter.openDebug()
            ARouter.openLog()
        }

        ARouter.init(this)
    }
}