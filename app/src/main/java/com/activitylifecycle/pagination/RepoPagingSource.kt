package com.activitylifecycle.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.activitylifecycle.api.ApiService
import com.activitylifecycle.model.RepoItem

class RepoPagingSource(private val apiService: ApiService): PagingSource<Int, RepoItem>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, RepoItem> {

       return try {
           val page = params.key?:1
           val response=apiService.getRepos(page,params.loadSize)

           LoadResult.Page(
               data = response,
               prevKey = if (page==1) null else page-1,
               nextKey = if (response.isEmpty()) null else page+1
           )

       }catch (e: Exception){

           LoadResult.Error(e)

       }
    }

    override fun getRefreshKey(state: PagingState<Int, RepoItem>): Int? {
       return state.anchorPosition
    }
}