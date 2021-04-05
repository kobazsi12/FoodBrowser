package hu.vm.foodbrowser

import android.app.Application
import hu.vm.foodbrowser.dagger.ApplicationComponent
import hu.vm.foodbrowser.dagger.DaggerApplicationComponent

class FoodBrowserApplication : Application() {
    lateinit var injector: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injector = DaggerApplicationComponent.builder().build()
    }
}