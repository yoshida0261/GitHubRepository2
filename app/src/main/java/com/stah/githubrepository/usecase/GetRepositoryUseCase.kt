package com.stah.githubrepository.usecase

import com.stah.githubrepository.domain.entity.Repository
import io.reactivex.Single

interface GetRepositoryUseCase {

    fun execute(): Single<List<Repository>>
}