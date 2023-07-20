package com.example.myapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.data.model.Task
import com.example.myapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentHome : Fragment() {
    var _binding: FragmentHomeBinding? = null
    val binding: FragmentHomeBinding get() = _binding!!

    private val adapterHome = AdapterHome()
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
        setRecyclerView()
        getTasks()
    }

    private fun getTasks() {
        viewModel.getTasks().observe(viewLifecycleOwner) {
            it?.let {
                adapterHome.tasks = it as ArrayList<Task>
            }
        }
    }

    private fun setRecyclerView() {
        binding.rvFragmentHomeListTasks.apply {
            adapter = adapterHome
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        }
    }

    private fun onClick() {
        binding.fabFragmentHomeAddList.setOnClickListener {
            val task = Task("arshya", 2020)
            viewModel.InsertTask(task)
        }
    }
}