package com.example.thailandtourisum


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.thailandtourisum.databinding.FragmentTourisumBinding

/**
 * A simple [Fragment] subclass.
 */
class tourisumFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTourisumBinding>(inflater
            ,R.layout.fragment_tourisum,container,false)


        return  binding.root
    }


}
