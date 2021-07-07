package com.databindinginkotlinviewmodel.custombindingadapter
//
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.databindinginkotlinviewmodel.adapters.ProductsAdapter
import com.databindinginkotlinviewmodel.model.Product


@BindingAdapter("bindList")
fun bindRecyclerViewList(view: RecyclerView, dataList: List<Product>) {

    if (dataList.isEmpty())
        return

    val layoutManager = view.layoutManager
    if (layoutManager == null)
        view.layoutManager = GridLayoutManager(view.context, 2)

    var adapter = view.adapter

    if (adapter == null) {
        adapter = ProductsAdapter(view.context, dataList)
        view.adapter = adapter
//        (view.adapter as ProductsAdapter).notifyDataSetChanged()
    }

}