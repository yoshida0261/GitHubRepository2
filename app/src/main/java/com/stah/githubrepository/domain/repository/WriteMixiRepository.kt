package com.stah.githubrepository.domain.repository

import com.stah.githubrepository.domain.entity.Repository
import io.reactivex.Single


interface WriteMixiRepository {
    fun store(repository: MixiRepository) : Single<Repository>
}