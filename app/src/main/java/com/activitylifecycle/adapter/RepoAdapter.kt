package com.activitylifecycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.activitylifecycle.R
import com.activitylifecycle.model.RepoItem

class RepoAdapter :
    PagingDataAdapter<RepoItem, RepoAdapter.RepoViewHolder>(DIFF_UTIL) {

    class RepoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvId: TextView = itemView.findViewById(R.id.id)
        val tvName: TextView = itemView.findViewById(R.id.name)
        val tvFullName: TextView = itemView.findViewById(R.id.full_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.repo_item, parent, false)
        return RepoViewHolder(view)
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        holder.tvId.text = getItem(position)?.id.toString() ?: ""
        holder.tvName.text = getItem(position)?.name ?: ""
        holder.tvFullName.text = getItem(position)?.full_name ?: ""

    }

    companion object {
        val DIFF_UTIL = object : DiffUtil.ItemCallback<RepoItem>() {
            override fun areItemsTheSame(oldItem: RepoItem, newItem: RepoItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: RepoItem, newItem: RepoItem): Boolean {
                return oldItem == newItem
            }
        }
    }
}
