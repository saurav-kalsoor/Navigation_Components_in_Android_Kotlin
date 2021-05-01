package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    private lateinit var binding : FragmentGameBinding
//    private lateinit var questions : ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        questions.add("Do you love Android Development?")
//        questions.add("Do you know Kotlin Language?")
//        questions.add("Do you want to learn know more?")

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false)
        binding.buttonSubmit.setOnClickListener {
            submit(it);
        }
        return binding.root
    }

    private fun submit(view: View) {
        if(binding.buttonYes.isChecked){
            view.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
        }else{
            view.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
        }
    }


}