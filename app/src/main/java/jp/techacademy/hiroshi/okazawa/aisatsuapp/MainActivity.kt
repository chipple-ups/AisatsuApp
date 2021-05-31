package jp.techacademy.hiroshi.okazawa.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.app.TimePickerDialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.DatePickerDialog


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {

        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")


                    val time = hour

                    if (2 <= time && time < 10) {
                        textView.text = "おはよう"
                    } else if (10 <= time && time < 18) {
                        textView.text = "こんにちは"
                    } else {
                        textView.text = "こんばんは"
                    }



                    
                },
                13, 0, true)
        timePickerDialog.show()
        Log.d("UI_PARTS", "timePickerDialog")






    }


}