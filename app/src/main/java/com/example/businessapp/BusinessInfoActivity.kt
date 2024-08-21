package com.example.businessapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BusinessInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_business_info)

        val citySpinner: Spinner = findViewById(R.id.cityDropdown)
        val areaSpinner: Spinner = findViewById(R.id.areaDropdown)
        val submitButton: Button = findViewById(R.id.submitButton)
        val cancelButton: Button = findViewById(R.id.cancelButton)

        val cities = listOf("Select City", "Dhaka", "Chittagong", "Khulna", "Rajshahi", "Sylhet")
        val areas = listOf("Select Area", "Gulshan", "Dhanmondi", "Banani", "Mirpur", "Uttara")

        // Set up ArrayAdapters for spinners
        val cityAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cities)
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        citySpinner.adapter = cityAdapter

        val areaAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, areas)
        areaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        areaSpinner.adapter = areaAdapter

        // Handle Submit button click
        submitButton.setOnClickListener {
            val selectedCity = citySpinner.selectedItem.toString()
            val selectedArea = areaSpinner.selectedItem.toString()
        }

        // Handle Cancel button click
        cancelButton.setOnClickListener {
            finish()
        }
    }
}