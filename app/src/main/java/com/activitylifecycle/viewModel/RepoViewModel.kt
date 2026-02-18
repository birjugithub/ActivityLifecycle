package com.activitylifecycle.viewModel

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.activitylifecycle.model.RepoItem
import com.activitylifecycle.repo.RepoRepository
import kotlinx.coroutines.flow.Flow
import androidx.lifecycle.viewModelScope

class RepoViewModel(private val repoRepository: RepoRepository) : ViewModel() {
    val repo: Flow<PagingData<RepoItem>> = repoRepository.getRepo().cachedIn(viewModelScope)
}