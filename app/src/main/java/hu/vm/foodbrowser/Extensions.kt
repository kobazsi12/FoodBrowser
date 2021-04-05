package hu.vm.foodbrowser

import android.app.Activity
import hu.vm.foodbrowser.dagger.ApplicationComponent

val Activity.injector: ApplicationComponent
    get() = (application as FoodBrowserApplication).injector