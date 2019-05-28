package jp.co.stah.api

import retrofit2.http.GET
import retrofit2.http.Path
import io.reactivex.Single


interface GitHubService {

    @GET("orgs/{org}/repos")
    fun getRepositoty(@Path("org") org: String) : Single<List<RepositoryJson>>
}