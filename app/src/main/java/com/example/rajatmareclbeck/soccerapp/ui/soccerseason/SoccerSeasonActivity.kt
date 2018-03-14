package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import android.os.Bundle
import com.example.rajatmareclbeck.soccerapp.R
import com.example.rajatmareclbeck.soccerapp.data.models.SoccerSeason
import com.example.rajatmareclbeck.soccerapp.di.ActivityScoped
import com.example.rajatmareclbeck.soccerapp.ui.BaseActivity
import javax.inject.Inject

@ActivityScoped
class SoccerSeasonActivity @Inject constructor() : BaseActivity(), SoccerSeasonContract.View {


    @Inject
    lateinit var presenter: SoccerSeasonContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soccer_season)
        presenter.getSoccerSeasons()
    }


    override fun showView(soccerSeason: List<SoccerSeason>) {
        System.out.print(soccerSeason)
    }


}