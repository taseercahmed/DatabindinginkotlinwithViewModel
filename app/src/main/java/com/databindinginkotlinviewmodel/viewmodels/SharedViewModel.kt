package com.databindinginkotlinviewmodel.viewmodels

import android.content.ClipData.Item
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SharedViewModel : ViewModel() {
    private val selected = MutableLiveData<Item>()

    fun select(item: Item) {
        selected.value = item
    }

    fun getSelected(): LiveData<Item> {
        return selected
    }
}