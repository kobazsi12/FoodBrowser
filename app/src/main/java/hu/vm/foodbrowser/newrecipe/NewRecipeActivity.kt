package hu.vm.foodbrowser.newrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.vm.foodbrowser.R
import hu.vm.foodbrowser.injector
import javax.inject.Inject

class NewRecipeActivity : AppCompatActivity(), NewRecipeView {
    @Inject
    lateinit var newRecipePresenter: NewRecipePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_recipe)
        injector.inject(this)
        newRecipePresenter.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        newRecipePresenter.detachView()
    }
}