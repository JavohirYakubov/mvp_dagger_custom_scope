package uz.ferganagroup.myapplicationscope.di.component

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import uz.ferganagroup.myapplicationscope.di.module.ActivityModule
import uz.ferganagroup.myapplicationscope.di.module.AppModule
import uz.ferganagroup.myapplicationscope.ui.main.MainActivity
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}