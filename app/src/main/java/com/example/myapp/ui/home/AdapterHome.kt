package com.example.myapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.data.model.Task
import com.example.myapp.databinding.AdapterHomeBinding


class AdapterHome : RecyclerView.Adapter<AdapterHome.ViewHolder>() {

    var tasks = ArrayList<Task>()
        set(value){
            field=value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHome.ViewHolder {
        return ViewHolder(AdapterHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: AdapterHome.ViewHolder, position: Int) {
        holder.bind(tasks[position])
    }

    override fun getItemCount(): Int = tasks.size


    inner class ViewHolder(val binding: AdapterHomeBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(task : Task){
            binding.textView.setText(task.Name)
            binding.textView2.setText(task.number.toString()

            )
        }
    }

}