package com.example.restro.ui.recommendedrestro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.restro.databinding.FragmentRecommendedRestroBinding

class RecommendedRestroFragment : Fragment() {

    private lateinit var binding : FragmentRecommendedRestroBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentRecommendedRestroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews()

    }

    private fun setupViews() {
        //back button on toolbar
        binding.toolBar.setNavigationOnClickListener {
            //go back
        }
    }
}