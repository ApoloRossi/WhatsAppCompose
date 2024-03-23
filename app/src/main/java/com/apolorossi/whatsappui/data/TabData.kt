package com.apolorossi.whatsappui.data

data class TabData(
    val title: String,
    val unreadCount: Int?
)


val tabs = listOf(
    TabData(Tabs.CHATS.value, 5),
    TabData(Tabs.STATUS.value, null),
    TabData(Tabs.CALLS.value, 4)
)

enum class Tabs (val value:String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}


const val INITIAL_PAGE = 0