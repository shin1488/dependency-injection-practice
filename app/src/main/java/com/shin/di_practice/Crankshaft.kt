package com.shin.di_practice

import android.util.Log
import javax.inject.Inject

class Crankshaft @Inject constructor() {
    fun startCrankShaft() {
        Log.i("interfacer_han", "${this::class.simpleName} is ready")
    }
}