package com.shin.di_practice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named


@Module
@InstallIn(SingletonComponent::class)
class MyModule {

    @Provides
    @Named("Airbag")
    fun providesAirbagManufacturer(): String {
        return "Shin"
    }

    @Provides
    @Named("Battery")
    fun providesBatterManufacturer(): String {
        return "Mac"
    }
}