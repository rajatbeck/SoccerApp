package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import com.example.rajatmareclbeck.soccerapp.di.ActivityScoped
import dagger.Binds
import dagger.Module

@Module
abstract class SoccerSeasonModule {

    @ActivityScoped
    @Binds
    abstract fun soccerSeasonPresenter(presenter: SoccerSeasonPresenter): SoccerSeasonContract.Presenter

    @ActivityScoped
    @Binds
    abstract fun soccerSeasonView(activity: SoccerSeasonActivity): SoccerSeasonContract.View

}