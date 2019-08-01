package uz.ferganagroup.myapplicationscope

import android.app.Application
import android.content.Context
import dagger.android.DaggerActivity
import uz.ferganagroup.myapplicationscope.di.component.ActivityComponent
import uz.ferganagroup.myapplicationscope.di.component.AppComponent
import uz.ferganagroup.myapplicationscope.di.component.DaggerAppComponent
import uz.ferganagroup.myapplicationscope.di.module.ActivityModule
import uz.ferganagroup.myapplicationscope.di.module.AppModule
import javax.inject.Inject

class BaseApp : Application() {
    lateinit var component: AppComponent
    var activityComponent: ActivityComponent? = null

    @Inject
    lateinit var context: Context

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

        component.inject(this)

    }

    fun createActivityComponent(): ActivityComponent{
        if (activityComponent == null){
            activityComponent = component.plus(ActivityModule())
        }
        return activityComponent as ActivityComponent
    }
}