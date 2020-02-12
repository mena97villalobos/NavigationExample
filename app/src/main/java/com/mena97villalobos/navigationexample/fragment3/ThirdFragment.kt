package com.mena97villalobos.navigationexample.fragment3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.mena97villalobos.navigationexample.R
import kotlinx.android.synthetic.main.thrid_fragment.*

class ThirdFragment : Fragment() {

    private val viewModel: ThirdViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.thrid_fragment, container, false)
    }

    override fun onResume() {
        super.onResume()
        navigate.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                ThirdFragmentDirections.actionThirdFragmentToFirstFragment()
            )
        )

        navigateHome.setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToFirstFragment())
        }
    }

}