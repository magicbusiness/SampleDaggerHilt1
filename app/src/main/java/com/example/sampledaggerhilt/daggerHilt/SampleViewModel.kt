package com.example.sampledaggerhilt.daggerHilt

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class SampleViewModel @ViewModelInject constructor(
    @Named("String2") testString2: String
) : ViewModel()
{
    init
    {
        Log.d("ViewModel", "Test String from ViewModel: $testString2")
    }
}