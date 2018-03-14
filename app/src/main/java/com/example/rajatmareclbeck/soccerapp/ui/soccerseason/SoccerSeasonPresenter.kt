package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import com.example.rajatmareclbeck.soccerapp.data.repository.Repository
import com.example.rajatmareclbeck.soccerapp.data.repository.SoccerSeasonRepository
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

class SoccerSeasonPresenter @Inject constructor() : SoccerSeasonContract.Presenter {


    @Inject
    lateinit var view: SoccerSeasonContract.View
    @Inject
    lateinit var repository: Repository


    override fun takeView(view: SoccerSeasonContract.View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dropView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getSoccerSeasons() {
        repository.soccerSeasonRepository.getSoccerSeason()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            view.showView(it)
                        }, onError = {
                    Timber.e(it)
                }
                )
    }

}