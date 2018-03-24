package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import com.example.rajatmareclbeck.soccerapp.di.ActivityScoped
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class SoccerSeasonModule {

    @ActivityScoped
    @Binds
    abstract fun soccerSeasonPresenter(presenter: SoccerSeasonPresenter): SoccerSeasonContract.Presenter

    @ActivityScoped
    @Binds
    abstract fun soccerSeasonView(activity: SoccerSeasonActivity): SoccerSeasonContract.View

    @Module
    companion object {

        @ActivityScoped
        @Provides
        @JvmStatic
        fun soccerSeasonAdapter(activity: SoccerSeasonActivity): SoccerSeasonAdapter {
            return SoccerSeasonAdapter(activity)
        }
    }

}