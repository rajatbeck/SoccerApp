package com.example.rajatmareclbeck.soccerapp

import android.content.Context
import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.readystatesoftware.chuck.ChuckInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

@Module
class Flavour {

    @Provides
    fun provideOkHttpClientBuilder(context: Context, cache: Cache): OkHttpClient.Builder {
        Stetho.initializeWithDefaults(context)
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val chuckInterceptor = ChuckInterceptor(context).showNotification(true)
        return OkHttpClient.Builder()
                .addInterceptor(chuckInterceptor)
                .addInterceptor(httpLoggingInterceptor)
                .addNetworkInterceptor(StethoInterceptor())
                .cache(cache)
    }

}