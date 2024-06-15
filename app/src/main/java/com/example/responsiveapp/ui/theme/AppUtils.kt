package com.example.responsiveapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf


@Composable
fun ProvideAppUtils(
    appDimens : AppDimens,
    content : @Composable () -> Unit
){
    CompositionLocalProvider(
        LocalAppDimens provides appDimens,
        content = content
    )
}

val LocalAppDimens = compositionLocalOf {
    smallDimens
}