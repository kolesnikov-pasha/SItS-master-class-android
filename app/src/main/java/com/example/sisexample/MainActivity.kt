package com.example.sisexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.text_view)
        editText = findViewById(R.id.edit_text)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val text = editText.text
        if (text.isNullOrEmpty()) {
            Toast.makeText(this, "Слишком пусто!", Toast.LENGTH_LONG).show()
            return
        }
        if (text.length > 10) {
            Toast.makeText(this, "Слишком длинно!", Toast.LENGTH_LONG).show()
            return
        }
        textView.text = "Hello, $text!"
    }
}