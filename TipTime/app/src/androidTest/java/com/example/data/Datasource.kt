package com.example.data

import com.example.tiptime.R
import com.example.timtime.model.Tiptime

class Datasource {

    fun loadAffirmations(): List<Tiptime> {
        return listOf<Tiptime>(
            Tiptime(R.string.tiptime1),
            Tiptime(R.string.tiptime1),
            Tiptime(R.string.tiptime2),
            Tiptime(R.string.tiptime3),
            Tiptime(R.string.tiptime4),
            Tiptime(R.string.tiptime5),
            Tiptime(R.string.tiptime6),
            Tiptime(R.string.tiptime7),
            Tiptime(R.string.tiptime8),
            Tiptime(R.string.tiptime9),
            Tiptime(R.string.tiptime10)
        )
    }
}