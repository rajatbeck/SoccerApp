package com.example.rajatmareclbeck.soccerapp.utility.extensions


import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

val dateFormatter = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
val timeFormatter = SimpleDateFormat("KK:mm a", Locale.getDefault())
val dateTimeFormatter = SimpleDateFormat("dd MMM yy KK:mm a", Locale.getDefault())
val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())


fun Long.dateFormat(formatter: SimpleDateFormat = dateTimeFormatter): String = formatter.format(Date(this))

fun convertUTCtoGMT(utcTime: String): String {
    simpleDateFormat.timeZone = TimeZone.getTimeZone("UTC")
    val date = simpleDateFormat.parse(utcTime)
    dateFormatter.applyPattern("dd MMM yyyy")
    return dateFormatter.format(date)

}
