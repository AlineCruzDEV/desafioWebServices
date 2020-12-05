package com.digitalhouse.marvelhqs.entities

import java.io.Serializable

data class HQ(
    val id: Int,
    val dates: List<Date>,
    val title: String,
    var description: String,
    val issueNumber: Int,
    val images: List<Image>,
    val pageCount: Int,
    val prices: List<Price>,
    val thumbnail: Thumbnail,
) : Serializable

data class Thumbnail(val path: String, val extension: String) : Serializable {
    override fun toString(): String {
        return "$path.$extension".replace("http", "https")
    }
}

data class Image(val extension: String, val path: String) : Serializable

data class Date(
    val date: String,
    val type: String
) : Serializable

data class Price(
    val price: Double,
    val type: String
) : Serializable