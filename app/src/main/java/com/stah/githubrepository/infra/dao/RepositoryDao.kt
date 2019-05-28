package com.stah.githubrepository.infra.dao

import android.util.Log
import com.stah.githubrepository.domain.entity.Repository
import io.reactivex.Single
import io.realm.Realm

// ここにDI
class RepositoryDao() {


    private val realm = ArrayList<Repository>()
    fun insert(repositorys: List<Repository>) {

        repositorys.forEach {
            Log.d("mixi", it.name)
            realm.add(it)
        }

    }

    fun findAll(): Single<List<Repository>> {

        return Single.fromCallable {
            realm
        }
    }

}