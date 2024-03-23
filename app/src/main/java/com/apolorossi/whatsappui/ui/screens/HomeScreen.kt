package com.apolorossi.whatsappui.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import com.apolorossi.whatsappui.data.INITIAL_PAGE
import com.apolorossi.whatsappui.data.tabs
import com.apolorossi.whatsappui.ui.components.AppBarComponent
import com.apolorossi.whatsappui.ui.components.TabsComponent
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { tabs.size })

    val scope = rememberCoroutineScope()

    Column {
        AppBarComponent()

        TabsComponent(
            initialIndex = INITIAL_PAGE,
            pagerState = pagerState,
            onTabSelected = {
                scope.launch {
                    pagerState.animateScrollToPage(it)
                }
            }
        )

        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState
        ) {page ->

            when(page) {
                0 -> ChatScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }
            
        }

    }
}


@Preview
@Composable
fun HomeScreenPrevious() {
    HomeScreen()
}