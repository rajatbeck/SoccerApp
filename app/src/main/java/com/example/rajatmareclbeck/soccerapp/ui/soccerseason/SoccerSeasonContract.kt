package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import android.view.View
import com.example.rajatmareclbeck.soccerapp.data.models.SoccerSeason
import com.example.rajatmareclbeck.soccerapp.ui.BasePresenter
import com.example.rajatmareclbeck.soccerapp.ui.BaseView

interface SoccerSeasonContract{

    interface Presenter:BasePresenter<View>{

        fun getSoccerSeasons()

    }

    interface View:BaseView<Presenter>{

        fun showView(soccerSeason: List<SoccerSeason>)

    }


}