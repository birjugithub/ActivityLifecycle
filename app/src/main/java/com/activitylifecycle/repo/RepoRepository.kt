package com.activitylifecycle.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.activitylifecycle.api.ApiService
import com.activitylifecycle.model.RepoItem
import com.activitylifecycle.pagination.RepoPagingSource
import kotlinx.coroutines.flow.Flow

class RepoRepository(private val service: ApiService) {

    fun getRepo(): Flow<PagingData<RepoItem>>{
        return Pager(config = PagingConfig(pageSize = 10, enablePlaceholders = false),
            pagingSourceFactory = {
                RepoPagingSource(service) }).flow



    }
}