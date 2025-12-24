package com.shin.di_practice

import android.util.Log
import javax.inject.Inject

class Piston @Inject constructor(
    private val crankshaft: Crankshaft,
    private val cylinder: Cylinder
) {
    fun startPiston() {
        Log.i("interfacer_han", "${this::class.simpleName} is ready")
    }
}