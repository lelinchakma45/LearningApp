package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation.Adapter.ClassAdapter
import com.example.navigation.DataClass.ClassLesson
import com.example.navigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.classView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        val listofItem = ArrayList<ClassLesson>()

        listofItem.add(ClassLesson("Basic English for Class XII","25 Lessons",R.drawable.globe, R.drawable.class_bg))
        listofItem.add(ClassLesson("Basic English for Class XII","25 Lessons",R.drawable.knowledge, R.drawable.class_bg_two))

        var myList = ClassAdapter(listofItem)
        binding.classView.adapter = myList
        return binding.root
    }
}