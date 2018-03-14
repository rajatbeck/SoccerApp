package com.example.rajatmareclbeck.soccerapp.data.repository

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
        val soccerSeasonRepository: SoccerSeasonRepository
)