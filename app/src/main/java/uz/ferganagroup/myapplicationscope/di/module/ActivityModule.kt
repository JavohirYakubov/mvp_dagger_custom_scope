package uz.ferganagroup.myapplicationscope.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import uz.ferganagroup.myapplicationscope.BaseApp
import uz.ferganagroup.myapplicationscope.di.component.ActivityScope
import uz.ferganagroup.myapplicationscope.ui.main.MainPresenter


@Module
class ActivityModule{

    @Provides
    @ActivityScope
    fun provideMainPresenter(): MainPresenter = MainPresenter()
}