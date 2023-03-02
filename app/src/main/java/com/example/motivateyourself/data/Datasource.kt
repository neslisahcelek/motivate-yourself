package com.example.motivateyourself.data

import com.example.motivateyourself.R
import com.example.motivateyourself.model.Affirmation

class Datasource {
    fun loadAffirmations():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation_1,R.drawable.d6),
            Affirmation(R.string.affirmation_2,R.drawable.d5),
            Affirmation(R.string.affirmation_3,R.drawable.d2),
            Affirmation(R.string.affirmation_4,R.drawable.d10),
            Affirmation(R.string.affirmation_5,R.drawable.d4),
            Affirmation(R.string.affirmation_6,R.drawable.d7),
            Affirmation(R.string.affirmation_7,R.drawable.d3),
            Affirmation(R.string.affirmation_8,R.drawable.d1),
            Affirmation(R.string.affirmation_9,R.drawable.d9),
            Affirmation(R.string.affirmation_10,R.drawable.d8),
        )
    }
}