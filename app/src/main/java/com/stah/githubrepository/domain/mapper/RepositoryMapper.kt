package com.stah.githubrepository.domain.mapper

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.entity.RepositoryId
import com.stah.githubrepository.infra.api.RepositoryJson

object RepositoryMapper {

    fun convert(json : List<RepositoryJson>) : List<Repository> {

        val list = ArrayList<Repository>()
        for (repositoryJson in json) {
            list.add(        Repository(RepositoryId(""), "it"))
        }
        return list
    }



}