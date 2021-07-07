package com.databindinginkotlinviewmodel.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
        val itemId: String,
        val name: String,
        val description: String,
        val price: Double,
        val salePrice: Double,
        val rating: Float,
        val totalRatings: Int,
        val image: String
) : Parcelable