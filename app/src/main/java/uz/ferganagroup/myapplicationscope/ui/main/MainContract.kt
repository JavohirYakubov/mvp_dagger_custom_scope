package uz.ferganagroup.myapplicationscope.ui.main

import android.view.View
import uz.ferganagroup.myapplicationscope.base.BaseView

class MainContract {
    interface View : BaseView

    interface Presenter {
        fun attach(view: View)
        fun subscribe()
        fun unSubscribe()
    }
}