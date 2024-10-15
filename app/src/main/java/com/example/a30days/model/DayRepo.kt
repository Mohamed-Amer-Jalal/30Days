package com.example.a30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days.R

data class Day(
    @DrawableRes val imageRes: Int,
    @StringRes val dayRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descRes: Int
)

object DayRepo {
    val days = listOf(
        Day(R.drawable.image0, R.string.title0, R.string.desc0, R.string.day1),
        Day(R.drawable.image1, R.string.title1, R.string.desc1, R.string.day2),
        Day(R.drawable.image2, R.string.title2, R.string.desc2, R.string.day3),
        Day(R.drawable.image3, R.string.title3, R.string.desc3, R.string.day4),
        Day(R.drawable.image4, R.string.title4, R.string.desc4, R.string.day5),
        Day(R.drawable.image5, R.string.title5, R.string.desc5, R.string.day6),
        Day(R.drawable.image6, R.string.title6, R.string.desc6, R.string.day7),
        Day(R.drawable.image7, R.string.title7, R.string.desc7, R.string.day8),
        Day(R.drawable.image8, R.string.title8, R.string.desc8, R.string.day9),
        Day(R.drawable.image9, R.string.title9, R.string.desc9, R.string.day10),
        Day(R.drawable.image10, R.string.title10, R.string.desc10, R.string.day11),
        Day(R.drawable.image11, R.string.title11, R.string.desc11, R.string.day12),
        Day(R.drawable.image12, R.string.title12, R.string.desc12, R.string.day13),
        Day(R.drawable.image13, R.string.title13, R.string.desc13, R.string.day14),
        Day(R.drawable.image14, R.string.title14, R.string.desc14, R.string.day15),
        Day(R.drawable.image15, R.string.title15, R.string.desc15, R.string.day16),
        Day(R.drawable.image16, R.string.title16, R.string.desc16, R.string.day17),
        Day(R.drawable.image17, R.string.title17, R.string.desc17, R.string.day18),
        Day(R.drawable.image18, R.string.title18, R.string.desc18, R.string.day19),
        Day(R.drawable.image19, R.string.title19, R.string.desc19, R.string.day20),
        Day(R.drawable.image20, R.string.title20, R.string.desc20, R.string.day21),
        Day(R.drawable.image21, R.string.title21, R.string.desc21, R.string.day22),
        Day(R.drawable.image22, R.string.title22, R.string.desc22, R.string.day23),
        Day(R.drawable.image23, R.string.title23, R.string.desc23, R.string.day24),
        Day(R.drawable.image24, R.string.title24, R.string.desc24, R.string.day25),
        Day(R.drawable.image25, R.string.title25, R.string.desc25, R.string.day26),
        Day(R.drawable.image26, R.string.title26, R.string.desc26, R.string.day27),
        Day(R.drawable.image27, R.string.title27, R.string.desc27, R.string.day28),
        Day(R.drawable.image28, R.string.title28, R.string.desc28, R.string.day29),
        Day(R.drawable.image29, R.string.title29, R.string.desc29, R.string.day30)
    )
}