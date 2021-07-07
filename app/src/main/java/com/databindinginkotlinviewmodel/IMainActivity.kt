package com.databindinginkotlinviewmodel

import com.databindinginkotlinviewmodel.model.Product

interface IMainActivity {
    fun onProductClick(product: Product)

    fun onProductImageClick(product: Product)
}