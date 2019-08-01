package uz.ferganagroup.myapplicationscope.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import uz.ferganagroup.myapplicationscope.BaseApp
import uz.ferganagroup.myapplicationscope.TemporaryMemory
import javax.inject.Singleton

@Module
class AppModule(private val app: BaseApp) {

    @Provides
    @Singleton
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun provideTemporaryMemory(): TemporaryMemory = TemporaryMemory("Jewel")
}