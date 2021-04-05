package hu.vm.foodbrowser.newrecipe

import hu.vm.foodbrowser.recipedetail.RecipeDetailView
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewRecipePresenter @Inject constructor(newRecipeInteractor: NewRecipeInteractor) {
    private var view: NewRecipeView? = null

    fun attachView(view: NewRecipeView){
        this.view = view
    }

    fun detachView(){
        this.view = view
    }
}