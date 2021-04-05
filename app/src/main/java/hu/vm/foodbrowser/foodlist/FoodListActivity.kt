package hu.vm.foodbrowser.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.vm.foodbrowser.R
import hu.vm.foodbrowser.injector
import javax.inject.Inject

class FoodListActivity : AppCompatActivity(), FoodListView {
    @Inject
    lateinit var foodlListPresenter: FoodListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)
    }
}