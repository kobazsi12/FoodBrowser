package hu.vm.foodbrowser.dagger

import dagger.Component
import hu.vm.foodbrowser.foodlist.FoodListActivity
import hu.vm.foodbrowser.newrecipe.NewRecipeActivity
import hu.vm.foodbrowser.recipedetail.RecipeDetailActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(foodListActivity: FoodListActivity)
    fun inject(recipeDetailActivity: RecipeDetailActivity)
    fun inject(newRecipeActivity: NewRecipeActivity)
}