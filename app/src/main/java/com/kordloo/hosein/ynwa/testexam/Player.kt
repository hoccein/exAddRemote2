package com.kordloo.hosein.ynwa.testexam

import android.content.Context
import android.widget.Toast

class Player(val response: Response) : Job {

    override fun doSomthing(c: Context, name: String) {
        Toast.makeText(c, "name: $name - ${response.message}: ${response.success}", Toast.LENGTH_SHORT).show()
    }
}