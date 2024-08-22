package com.example.businessapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ShopTypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shop_type)

        val submitButton: Button = findViewById(R.id.submitButton)
        val cancelButton: Button = findViewById(R.id.cancelButton)

        val item1: LinearLayout? = findViewById(R.id.item1)
        val item2: LinearLayout? = findViewById(R.id.item2)
        val item3: LinearLayout? = findViewById(R.id.item3)
        val item4: LinearLayout? = findViewById(R.id.item4)
        val item5: LinearLayout? = findViewById(R.id.item5)
        val item6: LinearLayout? = findViewById(R.id.item6)
        val item7: LinearLayout? = findViewById(R.id.item7)

        val items = listOfNotNull(item1, item2, item3, item4, item5, item6, item7)

        if (items.isEmpty()) {
            Log.e("BusinessInfoActivity", "One or more items were not found in the layout.")
        } else {
            items.forEach { item ->
                item.setOnClickListener {
                    items.forEach { it.isSelected = false }
                    item.isSelected = true
                }
            }
        }

        submitButton.setOnClickListener {
            Toast.makeText(this, "Submission Successful", Toast.LENGTH_SHORT).show()
        }

        cancelButton.setOnClickListener {
           onBackPressedDispatcher.onBackPressed()
        }
    }
}