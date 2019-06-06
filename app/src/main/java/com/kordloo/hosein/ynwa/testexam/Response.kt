package com.kordloo.hosein.ynwa.testexam

data class Response (
    internal var name: String? = null, override var success: Boolean? = null, override var message: String? = null
) : Success()