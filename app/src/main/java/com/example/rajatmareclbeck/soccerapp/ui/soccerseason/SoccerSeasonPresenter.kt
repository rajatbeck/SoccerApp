package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import javax.inject.Inject

class SoccerSeasonPresenter @Inject constructor(): SoccerSeasonContract.Presenter {

    @Inject lateinit var view: SoccerSeasonContract.View



    override fun takeView(view: SoccerSeasonContract.View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dropView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}