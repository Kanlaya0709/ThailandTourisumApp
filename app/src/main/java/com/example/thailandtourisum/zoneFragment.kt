package com.example.thailandtourisum


import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.thailandtourisum.databinding.FragmentZoneBinding

/**
 * A simple [Fragment] subclass.
 */
class zoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentZoneBinding>(inflater
            ,R.layout.fragment_zone,container,false)

        binding.northernButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)}

        binding.northeasternButton.setOnClickListener{ view ->
                view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)}

        binding.southernButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)}

        binding.centralButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)}

        binding.easterButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)}


        
        return  binding.root

    }
}
