package com.shin.di_practice

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(
    private val piston: Piston
) {
    fun startEngine() {
        Log.i("interfacer_han", "${this::class.simpleName} is ready")
    }
}