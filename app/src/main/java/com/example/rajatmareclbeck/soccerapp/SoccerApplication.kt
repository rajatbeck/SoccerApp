package com.example.rajatmareclbeck.soccerapp

import android.annotation.SuppressLint
import android.content.Context
import android.support.multidex.MultiDex
import com.example.rajatmareclbeck.soccerapp.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class SoccerApplication: DaggerApplication(){

    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }


}