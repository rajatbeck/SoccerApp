package com.example.rajatmareclbeck.soccerapp.di.module

import com.example.rajatmareclbeck.soccerapp.di.ActivityScoped
import com.example.rajatmareclbeck.soccerapp.ui.soccerseason.SoccerSeasonActivity
import com.example.rajatmareclbeck.soccerapp.ui.soccerseason.SoccerSeasonModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [(SoccerSeasonModule::class)])
    abstract fun soccerSeasonActivity(): SoccerSeasonActivity


}