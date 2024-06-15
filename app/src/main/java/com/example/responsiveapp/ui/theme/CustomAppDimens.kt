package com.example.responsiveapp.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


data class AppDimens(
    val oneDp : Dp,
    val fiveDp : Dp
)


val smallDimens = AppDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp
)
val compactDimens = AppDimens(
    oneDp = 2.dp,
    fiveDp = 6.dp
)
val mediumDimens = AppDimens(
    oneDp = 5.dp,
    fiveDp = 9.dp
)
val largeDimens = AppDimens(
    oneDp = 10.dp,
    fiveDp = 14.dp
)