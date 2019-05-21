package com.stah.githubrepository.domain.entity


class Repository(
    id: RepositoryId,
    val name: String
) : Entity<RepositoryId>(id) {
}