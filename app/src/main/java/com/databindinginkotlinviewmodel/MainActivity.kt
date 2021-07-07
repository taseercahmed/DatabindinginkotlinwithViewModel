package com.databindinginkotlinviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.databindinginkotlinviewmodel.model.Product

class MainActivity : AppCompatActivity(), IMainActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = ProductListFragment()

        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product List Fragment")
            .add(R.id.main_fragment_container, fragment, "product_list_fragment")
            .commit()

    }

    override fun onProductClick(product: Product) {

        val fragment = ProductDetailFragment()

        var bundle = Bundle()
        bundle.putParcelable("product_key", product)

        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product Detail Fragment")
            .replace(R.id.main_fragment_container, fragment, "product_detail_fragment")
            .commit()
    }

    override fun onProductImageClick(product: Product) {
        Toast.makeText(this, "${product.name} is clicked", Toast.LENGTH_SHORT).show()
    }
}
