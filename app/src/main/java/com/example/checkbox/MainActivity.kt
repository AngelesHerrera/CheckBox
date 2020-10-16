package com.example.checkbox

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var txtSaludo: EditText
    lateinit var chkNegrita: CheckBox
    lateinit var chkCursiva: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkNegrita = findViewById(R.id.chkNegrita)
        chkCursiva = findViewById(R.id.chkCursiva)
        txtSaludo = findViewById(R.id.txt)

    }
    fun clicCheck(v: View){
        val checkPresiono: CheckBox = v as CheckBox
        if(checkPresiono.id == R.id.chkNegrita)
            Log.v("CheckAPP", "Es el checkbox de negritas")
        else
            Log.v("CheckAPP", "Es el checkbox de cursivas")
        txtSaludo.typeface = Typeface.DEFAULT
        if(chkNegrita.isChecked)
            txtSaludo.typeface = Typeface.defaultFromStyle(Typeface.BOLD);
        if(chkCursiva.isChecked)
            txtSaludo.typeface = Typeface.defaultFromStyle(Typeface.ITALIC);
    }
}