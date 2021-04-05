package hu.vm.foodbrowser.recipedetail

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecipeDetailPresenter @Inject constructor(private val recipeDetailInteractor: RecipeDetailInteractor) {
    private var view: RecipeDetailView? = null

    fun attachView(view: RecipeDetailView){
        this.view = view
    }

    fun detachView(){
        this.view = view
    }
}