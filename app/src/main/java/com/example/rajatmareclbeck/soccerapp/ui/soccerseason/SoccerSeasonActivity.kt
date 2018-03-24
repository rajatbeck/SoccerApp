package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.rajatmareclbeck.soccerapp.R
import com.example.rajatmareclbeck.soccerapp.data.models.SoccerSeason
import com.example.rajatmareclbeck.soccerapp.di.ActivityScoped
import com.example.rajatmareclbeck.soccerapp.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_soccer_season.*
import javax.inject.Inject

@ActivityScoped
class SoccerSeasonActivity @Inject constructor() : BaseActivity(), SoccerSeasonContract.View {


    @Inject
    lateinit var presenter: SoccerSeasonContract.Presenter
    @Inject
    lateinit var soccerSeasonAdapter: SoccerSeasonAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soccer_season)
        presenter.getSoccerSeasons()
    }


    override fun showView(soccerSeason: List<SoccerSeason>) {
        rvTournamentList.apply {
            layoutManager = LinearLayoutManager(this@SoccerSeasonActivity)
            adapter = soccerSeasonAdapter
        }
        soccerSeasonAdapter.soccerSeasonList = ArrayList(soccerSeason)
    }


}