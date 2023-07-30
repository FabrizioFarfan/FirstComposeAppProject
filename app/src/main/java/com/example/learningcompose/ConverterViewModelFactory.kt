package com.example.learningcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learningcompose.data.ConverterRepository
import javax.inject.Inject

class ConverterViewModelFactory @Inject constructor(private val repository: ConverterRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ConverterViewModel(repository) as T
    }
}