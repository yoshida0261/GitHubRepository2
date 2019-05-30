package com.stah.githubrepository.infra.repository

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.converter.RepositoryConverter
import com.stah.githubrepository.domain.repository.MixiRepository
import com.stah.githubrepository.infra.dao.RepositoryDao
import jp.co.stah.api.GitHubApiClient
import io.reactivex.Single


class MixiRepositoryImpl(private val dao: RepositoryDao) : MixiRepository {


    override fun findAll(): Single<List<Repository>> {
        return GitHubApiClient.apiClient.getRepositoty("mixi-inc")
            .map {
                RepositoryConverter.convert(it)
            }
            .doOnSuccess {
                dao.insert(it)
            }
    }


    // todo
    override fun insert(repository: MixiRepository): Single<List<Repository>> {
        return GitHubApiClient.apiClient.getRepositoty("mixi-inc")
            .map { RepositoryConverter.convert(it) }
            .doOnSuccess {
                dao.insert(it)
            }
    }
}