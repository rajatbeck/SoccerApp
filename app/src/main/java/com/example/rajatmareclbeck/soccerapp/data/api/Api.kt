package com.example.rajatmareclbeck.soccerapp.data.api

import com.example.rajatmareclbeck.soccerapp.data.models.SoccerSeason
import io.reactivex.Single
import retrofit2.http.GET


interface Api {

//TODO: implement these one by one
//    /soccerseasons/{id}/ranking
//    /soccerseasons/{id}/fixtures
//    /fixtures
//    /soccerseasons/{id}/teams
//    /teams/{id}/fixtures/
//    /teams/{id}

    @GET("/soccerseasons/")
    fun getSoccerSeasons(): Single<List<SoccerSeason>>
}