package com.example.dz_5_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dz_5_3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getBundle()
    }

    private fun getBundle() {
        val bundle = this.arguments
        val name = bundle?.getString("name")
        val age = bundle?.getString("age")
        val email = bundle?.getString("email")
        binding.textName.setText(name)
        binding.textAge.setText(age)
        binding.textEmail.setText(email)
    }
}
