package org.mp.a0926manishaclass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn.setOnClickListener(View.OnClickListener {

            var input1 = main_input.text.toString()

            var myIntent = Intent(this, MainActivity2::class.java)
            myIntent.putExtra("input01", input1)
            startActivity(myIntent)

        })

    }
}

