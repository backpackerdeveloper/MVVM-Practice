package com.shubhamtripz.mvvmpractice.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.shubhamtripz.mvvmpractice.databinding.ActivityMainBinding
import com.shubhamtripz.mvvmpractice.viewmodel.calculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: calculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider(this).get(calculatorViewModel::class.java)

        binding.calculatorBtn.setOnClickListener {
            val num1 = binding.edtnum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.edtnum2.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.calulatesum(num1, num2)
            binding.resultTextView.text = "${result.sum}"
        }
    }
}
