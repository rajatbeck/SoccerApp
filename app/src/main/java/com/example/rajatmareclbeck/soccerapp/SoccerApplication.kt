package com.example.rajatmareclbeck.soccerapp

import android.annotation.SuppressLint
import android.content.Context
import android.support.multidex.MultiDex
import com.example.rajatmareclbeck.soccerapp.di.component.DaggerAppComponent
import com.facebook.stetho.Stetho
import com.singhajit.sherlock.core.Sherlock
import com.squareup.leakcanary.LeakCanary
import com.tspoon.traceur.Traceur
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber

class SoccerApplication: DaggerApplication(){

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            LeakCanary.install(this)
            Sherlock.init(this)
            Traceur.enableLogging()
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }


}