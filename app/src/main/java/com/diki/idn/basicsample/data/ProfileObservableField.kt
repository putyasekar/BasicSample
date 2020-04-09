package com.diki.idn.basicsample.data

import androidx.databinding.ObservableInt

data class ProfileObservableField(
    val name: String,
    val lastName: String,
    val likes: ObservableInt
)