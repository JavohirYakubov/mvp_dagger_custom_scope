package uz.ferganagroup.myapplicationscope.di.component

import dagger.Component
import uz.ferganagroup.myapplicationscope.BaseApp
import uz.ferganagroup.myapplicationscope.di.module.ActivityModule
import uz.ferganagroup.myapplicationscope.di.module.AppModule
import uz.ferganagroup.myapplicationscope.ui.main.MainActivity
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent{
    fun inject(app: BaseApp)
    fun plus(activityModule: ActivityModule): ActivityComponent
}