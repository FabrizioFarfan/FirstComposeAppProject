package com.example.learningcompose.di

import android.app.Application
import androidx.room.Room
import com.example.learningcompose.data.ConverterDataBase
import com.example.learningcompose.data.ConverterRepository
import com.example.learningcompose.data.ConverterRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideConverterDataBase(app: Application)
        =  Room.databaseBuilder(
            app.applicationContext,
            ConverterDataBase::class.java,
            "converter_data_database"
        ).build()


    @Singleton
    @Provides
    fun provideConverterRepository(db: ConverterDataBase) : ConverterRepository
        = ConverterRepositoryImpl(db.converterDAO)



}