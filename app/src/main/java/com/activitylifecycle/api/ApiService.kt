package com.activitylifecycle.api

import com.activitylifecycle.model.RepoItem
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("users/google/repos")
    suspend fun getRepos(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<RepoItem>


}