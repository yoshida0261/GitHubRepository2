package com.stah.githubrepository.domain.repository

import com.stah.githubrepository.domain.entity.Repository
import rx.Single


interface ReadMixiRepository {
    fun findAll(): Single<List<Repository>>
}