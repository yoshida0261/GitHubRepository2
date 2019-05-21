package com.stah.githubrepository.infra.api

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable


interface GitHubService {

    @GET("orgs/{org}/repos")
    fun getRepositoty(@Path("org") org: String) : Observable<List<RepositoryJson>>
}