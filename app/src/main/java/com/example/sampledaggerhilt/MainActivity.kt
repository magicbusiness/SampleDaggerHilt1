package com.example.sampledaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.sampledaggerhilt.daggerHilt.SampleViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

//
@AndroidEntryPoint
class MainActivity : AppCompatActivity()
{
    //
    @Inject
    @Named("String1")
    lateinit var testString: String

    private val viewModel: SampleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        Log.d("MainActivity", "Test String from MainActivity: $testString")

        //
        viewModel
    }
}