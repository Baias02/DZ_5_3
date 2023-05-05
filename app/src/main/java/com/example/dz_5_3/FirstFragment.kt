package com.example.dz_5_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.dz_5_3.databinding.FragmentFirst2Binding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirst2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirst2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        plusAndMinus()
    }

    private fun plusAndMinus() {
        binding.NEXT.setOnClickListener {
            if (!binding.editName.text.isEmpty() &&
                !binding.editAge.text.isEmpty() &&
                !binding.editEmail.text.isEmpty()
            ) {
                navigationSecond()
            } else {
                Toast.makeText(activity, "Введите ваше имя и фамилию", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private fun navigationSecond() {
        val bundle = Bundle()
        bundle.putString("name", binding.editName.text.toString())
        bundle.putString("age", binding.editAge.text.toString())
        bundle.putString("email", binding.editEmail.text.toString())
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, secondFragment)
            .commit()
    }
}



