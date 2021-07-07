package com.databindinginkotlinviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.GridLayoutManager
import com.databindinginkotlinviewmodel.adapters.ProductsAdapter
import com.databindinginkotlinviewmodel.model.DataProvider
import kotlinx.android.synthetic.main.activity_recycler_view_data_binding.*

class RecyclerViewDataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_recycler_view_data_binding)
        Log.e("112233445",DataProvider.productList[2].name+"dsdkjfkldsj")
//        rv_products.layoutManager=GridLayoutManager(this,2)
//        var adapter:ProductsAdapter= ProductsAdapter(this,DataProvider.productList)
//        rv_products.adapter=adapter
//        adapter.notifyDataSetChanged()
        val binding: ViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view_data_binding)
        Log.e("112233",DataProvider.productList[2].name+"dsdkjfkldsj")
        binding.setVariable(BR.dataList, DataProvider.productList.toList())

    }
}