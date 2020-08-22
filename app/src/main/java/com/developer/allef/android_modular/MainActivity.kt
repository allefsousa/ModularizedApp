package com.developer.allef.android_modular

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.developer.allef.feature1.Feature1Activity
import com.developer.allef.feature2.Feature2Activity
import com.developer.allef.feature3.Feature3Fragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_feature1.setOnClickListener {
            val intent = Intent()
                    .setClassName(this, Feature1Activity::class.java.name)
            startActivity(intent)
        }

        btn_feature2.setOnClickListener {
            val intent = Intent()
                    .setClassName(this, Feature2Activity::class.java.name)
            startActivity(intent)
        }
        btn_feature3.setOnClickListener {
            val nextFrag = Feature3Fragment()
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, nextFrag, "findThisFragment")
                    .addToBackStack(null)
                    .commit()
        }


    }
}