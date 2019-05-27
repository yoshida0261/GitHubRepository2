package com.stah.githubrepository.usecase

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.entity.RepositoryId
import rx.Single

class GetRepositoryUseCaseImpl : GetRepositoryUseCase {
    override fun execute(repositoryId: RepositoryId): Single<Repository> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}