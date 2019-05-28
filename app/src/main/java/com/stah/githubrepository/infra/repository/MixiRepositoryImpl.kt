package com.stah.githubrepository.infra.repository

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.mapper.RepositoryConverter
import com.stah.githubrepository.domain.repository.MixiRepository
import com.stah.githubrepository.infra.dao.RepositoryDao
import jp.co.stah.api.GitHubApiClient
import rx.Single


class MixiRepositoryImpl(private val dao: RepositoryDao) : MixiRepository {


    override fun findAll(): Single<List<Repository>> {
        return dao.findAll()
    }


    override fun insert(repository: MixiRepository): Single<List<Repository>> {
        return GitHubApiClient.apiClient.getRepositoty("mixi-org")
            .map { RepositoryConverter.convert(it) }
            .doOnSuccess {
                dao.insert(it)
            }
    }
}