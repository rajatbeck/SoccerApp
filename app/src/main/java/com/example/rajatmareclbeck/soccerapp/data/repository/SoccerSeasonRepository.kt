package com.example.rajatmareclbeck.soccerapp.data.repository

import android.content.Context
import com.example.rajatmareclbeck.soccerapp.data.api.Api
import com.example.rajatmareclbeck.soccerapp.data.models.SoccerSeason
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SoccerSeasonRepository @Inject constructor(
        private val api: Api
) {

    fun getSoccerSeason(): Flowable<List<SoccerSeason>> {
        return api.getSoccerSeasons().toFlowable()
    }

}