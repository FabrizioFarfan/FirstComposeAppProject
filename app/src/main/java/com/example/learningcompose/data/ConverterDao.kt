package com.example.learningcompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ConverterDao {

    @Insert
    fun insertResult(result: ConversionResult)

    @Delete
    fun deleteResult(result: ConversionResult)

    @Query("DELETE FROM conversion_result_table")
    fun deleteAll()

    @Query("SELECT * FROM conversion_result_table")
    fun getResults(): Flow<List<ConversionResult>>
}