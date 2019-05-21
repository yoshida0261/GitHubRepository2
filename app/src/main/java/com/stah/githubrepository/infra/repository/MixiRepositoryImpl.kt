package com.stah.githubrepository.infra.repository

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.repository.MixiRepository
import com.stah.githubrepository.infra.dao.RepositoryDao
import io.reactivex.Single


class MixiRepositoryImpl(private val dao : RepositoryDao) : MixiRepository {
    override fun findAllByPage(page: Int): Single<List<Repository>> {

        TODO("not implemented")

        /*
        return GitHubApiClient.apiClient.getRepositoty("mixi-org")
            .doOnNext{
                dao.insert(RepositoryMapper.convert(it))
            }.onErrorReturn {
                dao.findAll()
            }
            */

    }


    override fun store(repository: MixiRepository): Single<Repository> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}