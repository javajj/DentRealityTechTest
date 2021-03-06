package com.jmw.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jmw.data.api.ApiHelper
import com.jmw.data.repository.MainRepository
import com.jmw.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper, private val file:String) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {

            return MainViewModel(MainRepository(apiHelper),file) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}