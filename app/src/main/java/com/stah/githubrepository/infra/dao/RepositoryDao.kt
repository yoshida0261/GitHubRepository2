package com.stah.githubrepository.infra.dao

import com.stah.githubrepository.domain.entity.Repository
import io.realm.Realm

class RepositoryDao(realm: Realm) {

    private val realm = realm
    fun insert(repositorys: List<Repository>) {

        /*
        TODO realmでオブジェクトを格納する
        realm.executeTransaction {
            realm.createObject(Repository::class.java)
        }
        */
    }


    fun findAll(): List<Repository> {
        TODO("not implemented")
        // TODO  ここからrealmのデータを取得する
        /*
          realm.where(Repository::class.java).findAll()

        return repositoryList
        */
    }

}