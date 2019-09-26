package org.mp.a0926manishaclass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var output01: String? = intent.extras?.getString("input01")
        second_text.text = "$output01"

        Toast.makeText(this, "input is $output01", Toast.LENGTH_SHORT).show()

        second_btn.setOnClickListener(View.OnClickListener {

            var myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        })
    }
}
