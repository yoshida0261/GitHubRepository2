package com.stah.githubrepository.usecase

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.entity.RepositoryId
import rx.Single

interface GetRepositoryUseCase {

    fun execute(repositoryId: RepositoryId) : Single<Repository>
}