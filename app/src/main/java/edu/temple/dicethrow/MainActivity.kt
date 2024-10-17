package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener {
            DieFragment.newInstance(6)
            (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as DieFragment).throwDie();
        }
    }
}