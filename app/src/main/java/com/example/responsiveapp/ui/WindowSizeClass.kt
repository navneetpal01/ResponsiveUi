package com.example.responsiveapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalConfiguration


sealed class WindowSize(
    val size: Int
) {

    data class Small(val smallSize: Int) : WindowSize(size = smallSize)
    data class Medium(val mediumSize: Int) : WindowSize(size = mediumSize)
    data class Compact(val compactSize: Int) : WindowSize(size = compactSize)
    data class Large(val largeSize: Int) : WindowSize(size = largeSize)

}

data class WindowSizeClass(
    val height: WindowSize,
    val width: WindowSize
)

@Composable
fun rememberWindowSize(): WindowSizeClass {

    val config = LocalConfiguration.current
    val width by remember(config) { mutableStateOf(config.screenWidthDp) }
    val height by remember(config){ mutableStateOf(config.screenHeightDp) }

    val windowWidthClass = when{

    }

}


