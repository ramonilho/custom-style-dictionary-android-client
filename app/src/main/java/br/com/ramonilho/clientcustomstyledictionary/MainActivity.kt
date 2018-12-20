package br.com.ramonilho.clientcustomstyledictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("RAMONILHO",
                getString(br.com.ramonilho.androidcustomstyledictionary.R.string.app_name))

    }
}
