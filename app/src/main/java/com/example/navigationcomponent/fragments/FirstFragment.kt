package com.example.navigationcomponent.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentFirstBinding
import com.example.navigationcomponent.databinding.FragmentSecondBinding
import com.example.navigationcomponent.util.autoCleared

class FirstFragment:Fragment(R.layout.fragment_first) {
    private var binding by autoCleared<FragmentFirstBinding>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}