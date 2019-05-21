
package com.stah.githubrepository.presentation.presentor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stah.githubrepository.R


class MainActivity : AppCompatActivity() {

    lateinit var presenter: MainPresentor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO presenter
        //presenter = MainPresentor()
        /*
        val values = arrayOf(
            "repos"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, android.R.id.text1, values
        )
        listView.adapter = adapter
        */

    }
}
