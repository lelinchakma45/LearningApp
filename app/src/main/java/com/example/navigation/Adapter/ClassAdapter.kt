package com.example.navigation.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation.DataClass.ClassLesson
import com.example.navigation.databinding.ClassCardBinding

class ClassAdapter(private val classList: ArrayList<ClassLesson>):RecyclerView.Adapter<ClassAdapter.myViewHolder>() {
    class myViewHolder(val binding: ClassCardBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        return myViewHolder(ClassCardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return classList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val classItem = classList[position]
        holder.binding.apply {
            classNameShow.text = classItem.className
            lessonShow.text = classItem.lessionCount
            classCardIcon.setImageResource(classItem.classIcon)
            cardBg.setBackgroundResource(classItem.classColor)
        }
    }
}