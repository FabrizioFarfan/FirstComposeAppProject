package com.example.learningcompose.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "conversion_result_table")
data class ConversionResult(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "result_id")
    val id: Int,
    @ColumnInfo(name = "result_message_1")
    val messagePart1: String,
    @ColumnInfo(name = "result_message_2")
    val messagePart2: String
)
