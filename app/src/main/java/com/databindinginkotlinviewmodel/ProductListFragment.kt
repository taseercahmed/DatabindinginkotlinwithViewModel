package com.databindinginkotlinviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.databindinginkotlinviewmodel.databinding.FragmentProductListBinding
import com.databindinginkotlinviewmodel.model.DataProvider

class ProductListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding =
                FragmentProductListBinding.inflate(inflater, container, false)

        binding.dataList = DataProvider.productList

        return binding.root
    }

}