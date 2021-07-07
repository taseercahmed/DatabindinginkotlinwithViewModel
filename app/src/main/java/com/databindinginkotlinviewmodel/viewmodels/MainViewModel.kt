package com.databindinginkotlinviewmodel.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.databindinginkotlinviewmodel.model.DataProvider
import com.databindinginkotlinviewmodel.model.Product

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var product:Product=DataProvider.productList.get(1)

    fun getProduct():Product=product

}