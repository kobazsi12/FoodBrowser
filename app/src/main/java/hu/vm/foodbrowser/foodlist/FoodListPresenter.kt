package hu.vm.foodbrowser.foodlist

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FoodListPresenter @Inject constructor(private val foodListInteractor: FoodListInteractor ) {
    private var view: FoodListView? = null

    fun attachView(view: FoodListView){
        this.view = view
    }

    fun detachView(){
        this.view = view
    }
}