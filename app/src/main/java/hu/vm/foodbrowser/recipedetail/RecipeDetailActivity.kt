package hu.vm.foodbrowser.recipedetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.vm.foodbrowser.R
import hu.vm.foodbrowser.injector
import javax.inject.Inject

class RecipeDetailActivity : AppCompatActivity(), RecipeDetailView {
    @Inject
    lateinit var recipeDetailPresenter: RecipeDetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)
        injector.inject(this)
        recipeDetailPresenter.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        recipeDetailPresenter.detachView()
    }
}