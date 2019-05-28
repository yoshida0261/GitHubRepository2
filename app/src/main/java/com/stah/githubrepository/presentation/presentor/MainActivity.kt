package com.stah.githubrepository.presentation.presentor

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.stah.githubrepository.R
import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.infra.dao.RepositoryDao
import com.stah.githubrepository.infra.repository.MixiRepositoryImpl
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), MainPresentor.Contract {

    lateinit var presenter: MainPresentor

    override fun showRepository(repository: List<Repository>) {

        val list = ArrayList<String>()
        repository.forEach {
            list.add(it.name)
        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, android.R.id.text1, list
        )
        listView.adapter = adapter
    }

    val presentor = MainPresentor(this, MixiRepositoryImpl(RepositoryDao()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presentor.getMixiRepository()



    }
}
