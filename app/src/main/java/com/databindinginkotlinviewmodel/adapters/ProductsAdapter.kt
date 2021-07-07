package com.databindinginkotlinviewmodel.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.databindinginkotlinviewmodel.BR
import com.databindinginkotlinviewmodel.IMainActivity
import com.databindinginkotlinviewmodel.databinding.ProductItemBinding

import com.databindinginkotlinviewmodel.model.Product


class ProductsAdapter(private val context: Context, private val dataList: List<Product>)
    : RecyclerView.Adapter<ProductsAdapter.BindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
//        val rootView =
//                ProductItemBinding.inflate(LayoutInflater.from(context),parent,false)

        val rootView: ViewDataBinding =
            ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)

        return BindingViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val product = dataList[position]
           Log.e("112233",product.name+"dsdkjfkldsj")
       holder.itemBinding.setVariable(BR.productItem, product)
        holder.itemBinding.setVariable(BR.listener, context as IMainActivity)
        holder.itemBinding.executePendingBindings()

    }

    override fun getItemCount() = dataList.size

//    class BindingViewHolder(val itemBinding: ProductItemBinding)
//        : RecyclerView.ViewHolder(itemBinding.root)

    class BindingViewHolder(val itemBinding: ViewDataBinding)
        : RecyclerView.ViewHolder(itemBinding.root)


}