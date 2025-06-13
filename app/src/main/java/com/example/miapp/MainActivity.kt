package com.example.miapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "¡FUNCIONÓ! APK generada con IA y GitHub"
            textSize = 24f
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }
        setContentView(textView)
    }
}
