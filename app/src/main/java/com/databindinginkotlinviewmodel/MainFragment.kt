package com.databindinginkotlinviewmodel

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.databindinginkotlinviewmodel.databinding.FragmentMainBinding
import com.databindinginkotlinviewmodel.model.Product
import com.databindinginkotlinviewmodel.viewmodels.MainViewModel
import java.io.IOException
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding=FragmentMainBinding.inflate(inflater,container,false);


        val viewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)
        binding.product=viewModel.getProduct();
      binding.listener=this

        return binding.root
    }
    fun runCode(view:View){
        
    }


}