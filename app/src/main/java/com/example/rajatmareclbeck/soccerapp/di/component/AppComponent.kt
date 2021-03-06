package com.example.rajatmareclbeck.soccerapp.di.component

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton
import dagger.BindsInstance
import android.app.Application
import com.example.rajatmareclbeck.soccerapp.Flavour
import com.example.rajatmareclbeck.soccerapp.SoccerApplication
import com.example.rajatmareclbeck.soccerapp.di.module.ActivityModule
import com.example.rajatmareclbeck.soccerapp.di.module.AppModule
import com.example.rajatmareclbeck.soccerapp.di.module.FragmentModule
import com.example.rajatmareclbeck.soccerapp.di.module.NetModule
import dagger.android.support.AndroidSupportInjectionModule


@Singleton
@Component(modules = arrayOf(
        ActivityModule::class,
        FragmentModule::class,
        AppModule::class,
        Flavour::class,
        NetModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class
))
interface AppComponent : AndroidInjector<DaggerApplication> {


    fun inject(application: SoccerApplication)


    override fun inject(instance: DaggerApplication)

    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

}