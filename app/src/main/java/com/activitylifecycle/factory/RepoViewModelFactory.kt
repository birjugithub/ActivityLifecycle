package com.activitylifecycle.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.activitylifecycle.api.RetrofitClient
import com.activitylifecycle.repo.RepoRepository
import com.activitylifecycle.viewModel.RepoViewModel

class RepoViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        val apiService = RetrofitClient.api
        val repository = RepoRepository(apiService)

        return RepoViewModel(repository) as T

    }
}