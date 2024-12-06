package c14220041.myapplication

import java.util.Date

data class Todo(val text: String, var isDone: Boolean = false, val deadline: Date? = null)