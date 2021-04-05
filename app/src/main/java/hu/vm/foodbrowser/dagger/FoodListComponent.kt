package hu.vm.foodbrowser.dagger

import dagger.Component
import hu.vm.foodbrowser.foodlist.FoodListActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(foodListActivity: FoodListActivity)
}