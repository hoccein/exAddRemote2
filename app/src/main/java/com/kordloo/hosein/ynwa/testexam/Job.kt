package com.kordloo.hosein.ynwa.testexam

import android.content.Context

interface Job {
    fun doSomthing(context: Context, name: String = "hosein")
}