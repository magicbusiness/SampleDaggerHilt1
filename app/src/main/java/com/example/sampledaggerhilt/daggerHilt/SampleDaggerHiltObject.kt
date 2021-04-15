package com.example.sampledaggerhilt.daggerHilt

import android.content.Context
import com.example.sampledaggerhilt.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object SampleDaggerHiltObject
{
//    //
//    @Singleton
//    @Provides
//    @Named("String1")
//    fun provideTestString1() = "This is String will be inject"

    // must add string in file String
    @ActivityScoped // must be ActivityComponent
    @Provides
    @Named("String2")
    fun provideTestString2(
        @ApplicationContext context: Context,
        @Named("String1") testString1: String
    ) = "${context.getString(R.string.string_to_inject)} - $testString1"
}