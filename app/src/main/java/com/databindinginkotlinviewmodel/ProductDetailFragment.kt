package com.databindinginkotlinviewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.databindinginkotlinviewmodel.databinding.FragmentProductDetailBinding
import com.databindinginkotlinviewmodel.model.Product
import com.databindinginkotlinviewmodel.viewmodels.SharedViewModel



class ProductDetailFragment : Fragment() {
    private var model: SharedViewModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        val binding = FragmentProductDetailBinding.inflate(inflater, container, false)

      val product = arguments?.getParcelable<Product>("product_key")

        binding.product = product!!
        binding.listener = context as IMainActivity

        return binding.root

    }
}