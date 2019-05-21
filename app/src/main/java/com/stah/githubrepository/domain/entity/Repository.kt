package com.stah.githubrepository.domain.entity


open class Repository(
    id: RepositoryId,
    open val name: String
) : Entity<RepositoryId>(id)  {  // TODO  RealmObject()
}