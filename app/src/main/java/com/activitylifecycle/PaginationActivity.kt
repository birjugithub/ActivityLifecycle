package com.activitylifecycle

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.activitylifecycle.adapter.RepoAdapter
import com.activitylifecycle.factory.RepoViewModelFactory
import com.activitylifecycle.viewModel.RepoViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class PaginationActivity : AppCompatActivity() {

    private lateinit var adapter: RepoAdapter
    private val viewModel: RepoViewModel by viewModels {
        RepoViewModelFactory()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagination)


        adapter= RepoAdapter()
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=adapter

        lifecycleScope.launch{
            viewModel.repo.collectLatest {
                adapter.submitData(it)
            }
        }
    }
}