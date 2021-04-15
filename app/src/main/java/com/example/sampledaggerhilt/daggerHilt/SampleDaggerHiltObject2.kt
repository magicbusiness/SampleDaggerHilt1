package com.example.sampledaggerhilt.daggerHilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object SampleDaggerHiltObject2
{
    //
    @Singleton // must be ApplicationComponent
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is String will be inject"

//    //
//    @Singleton
//    @Provides
//    @Named("String2")
//    fun provideTestString2() = "This is String will be inject as well"
}