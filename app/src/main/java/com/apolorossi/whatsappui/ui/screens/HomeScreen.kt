package com.apolorossi.whatsappui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.apolorossi.whatsappui.ui.components.AppBarComponent
import com.apolorossi.whatsappui.ui.components.TabsComponent

@Composable
fun HomeScreen() {
    Column {
        AppBarComponent()
        TabsComponent()
    }
}


@Preview
@Composable
fun HomeScreenPrevious() {
    HomeScreen()
}