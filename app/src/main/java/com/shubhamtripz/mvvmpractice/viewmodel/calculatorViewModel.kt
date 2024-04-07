package com.shubhamtripz.mvvmpractice.viewmodel

import androidx.lifecycle.ViewModel
import com.shubhamtripz.mvvmpractice.model.CalculatorData

class calculatorViewModel: ViewModel() {

    fun calulatesum(num1: Int, num2: Int):  CalculatorData{
        val sum = num1 + num2
        return CalculatorData(num1, num2, sum)
    }
}