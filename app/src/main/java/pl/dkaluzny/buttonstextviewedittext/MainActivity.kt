package pl.dkaluzny.buttonstextviewedittext

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = enterNameEdit.text
        showNameButtonbutton.setOnClickListener {
            if (text.isEmpty()) resultTxt.text = "Enter Name" else resultTxt.text = "Welcome " + text
        }
    }
}
