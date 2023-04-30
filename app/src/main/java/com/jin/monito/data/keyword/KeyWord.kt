package com.jin.monito.data.keyword

import com.jin.monito.data.ImageAPI

data class KeyWord(
    val id:Int,
    val keyWord:String,
    val dataSource : ImageAPI,
    val imageCount : Int,
    val editedTimeStamp : Long,
)
