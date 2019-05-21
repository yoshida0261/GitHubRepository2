package com.stah.githubrepository.infra.dao

import com.stah.githubrepository.domain.entity.Repository
import io.realm.Realm

class RepositoryDao(realm: Realm) {

    private val realm = realm
    fun insert(repositorys: List<Repository>) {

        /*
        TODO realm
        realm.executeTransaction {
            realm.createObject(Repository::class.java)
        }
        */
    }


    fun findAll(): List<Repository> {
        TODO("not implemented")
        /*
          realm.where(Repository::class.java).findAll()

        return repositoryList
        */
    }

}