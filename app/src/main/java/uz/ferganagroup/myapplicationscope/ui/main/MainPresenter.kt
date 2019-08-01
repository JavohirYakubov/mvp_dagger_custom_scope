package uz.ferganagroup.myapplicationscope.ui.main

import kotlinx.coroutines.*

class MainPresenter : MainContract.Presenter{
    var view: MainContract.View? = null

    override fun attach(view: MainContract.View) {
        this.view = view
    }

    override fun subscribe() {

    }

    override fun unSubscribe() {
        view?.showToastMessage("I am unsubscribe!")
    }

}