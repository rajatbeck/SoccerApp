package com.example.rajatmareclbeck.soccerapp.ui.soccerseason

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rajatmareclbeck.soccerapp.R
import com.example.rajatmareclbeck.soccerapp.data.models.SoccerSeason
import com.example.rajatmareclbeck.soccerapp.utility.extensions.convertUTCtoGMT
import com.example.rajatmareclbeck.soccerapp.utility.extensions.dateFormat
import kotlinx.android.synthetic.main.soccer_season_item.view.*
import java.time.format.DateTimeFormatter
import javax.inject.Inject

class SoccerSeasonAdapter @Inject constructor(soccerSeasonActivity: SoccerSeasonActivity) : RecyclerView.Adapter<SoccerSeasonAdapter.SoccerSeasonViewHolder>() {

    var soccerSeasonList: ArrayList<SoccerSeason> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SoccerSeasonViewHolder {
        return SoccerSeasonViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.soccer_season_item, parent, false))
    }

    override fun getItemCount(): Int {
        return soccerSeasonList.size
    }

    override fun onBindViewHolder(holder: SoccerSeasonViewHolder?, position: Int) {
        holder?.bind(soccerSeasonList[position])
    }

    inner class SoccerSeasonViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        init {

        }

        fun bind(soccerSeasonItem: SoccerSeason) {
            itemView.tv_league_name.text = soccerSeasonItem.caption

            itemView.tv_last_updated.text =(convertUTCtoGMT(soccerSeasonItem.lastUpdated))
        }

    }
}