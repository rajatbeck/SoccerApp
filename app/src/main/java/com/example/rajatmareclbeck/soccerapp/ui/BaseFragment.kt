package com.example.rajatmareclbeck.soccerapp.ui

import com.example.rajatmareclbeck.soccerapp.data.api.Api
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment : DaggerFragment() {

    @Inject
    lateinit var api: Api
}