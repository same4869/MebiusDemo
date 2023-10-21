package com.xun.mebiusdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.pokemon.mebius.benchmark.MebiusBenchMarkUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.mBenchmarkBtn).setOnClickListener {
            Toast.makeText(applicationContext,"手机等级是:" + MebiusBenchMarkUtils.getPhoneLevel(applicationContext),Toast.LENGTH_SHORT).show()
        }
    }
}