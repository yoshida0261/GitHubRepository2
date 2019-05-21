package com.stah.githubrepository.infra.repository

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.repository.MixiRepository
import io.reactivex.Single


class MixiRepositoryImpl : MixiRepository {
    override fun findAllByPage(page: Int): Single<List<Repository>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun store(repository: MixiRepository): Single<Repository> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}