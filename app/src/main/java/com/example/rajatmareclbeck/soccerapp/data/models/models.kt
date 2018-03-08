package com.example.rajatmareclbeck.soccerapp.data.models

import com.squareup.moshi.Json

sealed class Optional<out T> {
    class Some<out T>(val element: T) : Optional<T>()
    object None : Optional<Nothing>()
}

data class SoccerSeason(
        @Json(name = "id") val id: Int,
        @Json(name = "caption") val caption: String,
        @Json(name = "league") val league: String,
        @Json(name = "year") val year: String,
        @Json(name = "currentMatchday") val currentMatchDay: Int,
        @Json(name = "numberOfMatchdays") val numberOfMatchDays: Int,
        @Json(name = "numberOfTeams") val numberOfTeams: Int,
        @Json(name = "numberOfGames") val numberOfGames: Int,
        @Json(name = "lastUpdated") val lastUpdated: String
)