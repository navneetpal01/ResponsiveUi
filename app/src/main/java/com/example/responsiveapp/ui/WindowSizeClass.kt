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
        width >= 360 -> WindowSize.Small(width)
        width in 361..400 -> WindowSize.Medium(width)
        width in 401..720 -> WindowSize.Compact(width)
        else -> WindowSize.Large(width)
    }
    val windowHeightClass = when{
        height >= 360 -> WindowSize.Small(height)
        height in 361..400 -> WindowSize.Medium(height)
        height in 401..720 -> WindowSize.Compact(height)
        else -> WindowSize.Large(height)
    }
    return WindowSizeClass(
        height = windowHeightClass,
        width = windowWidthClass
    )
}


