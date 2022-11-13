package com.example.capitalsquiz.data

data class Question(
    var id: Int,
    var question: String,
    var answers: List<String>,
    var correctAnswerId: Int

)
