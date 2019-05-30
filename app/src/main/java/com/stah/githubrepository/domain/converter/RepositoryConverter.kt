package com.stah.githubrepository.domain.converter

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.entity.RepositoryId
import jp.co.stah.api.RepositoryJson

object RepositoryConverter {

    fun convert(json : List<RepositoryJson>) : List<Repository> {

        val list = ArrayList<Repository>()
        for (repositoryJson in json) {
            list.add(        Repository(RepositoryId(""), repositoryJson.name))
        }
        return list
    }



}