package com.stah.githubrepository.usecase

import com.stah.githubrepository.domain.entity.Repository
import com.stah.githubrepository.domain.repository.MixiRepository
import io.reactivex.Single

class GetRepositoryUseCaseImpl(
    private val repository: MixiRepository
) : GetRepositoryUseCase {
    override fun execute(): Single<List<Repository>> {
        return repository.findAll()
    }
}