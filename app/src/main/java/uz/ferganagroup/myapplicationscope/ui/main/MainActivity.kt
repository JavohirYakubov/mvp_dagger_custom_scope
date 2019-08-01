package uz.ferganagroup.myapplicationscope.ui.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.*
import uz.ferganagroup.myapplicationscope.BaseApp
import uz.ferganagroup.myapplicationscope.R
import uz.ferganagroup.myapplicationscope.TemporaryMemory
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainPresenter
    @Inject
    lateinit var temporaryMemory: TemporaryMemory
    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as BaseApp).createActivityComponent().inject(this)
        presenter = MainPresenter()
        presenter.attach(this)
        presenter.subscribe()

        CoroutineScope(Dispatchers.IO).launch {
            delay(2000)
            CoroutineScope(Dispatchers.Main).launch {
                showToastMessage("dsdklds")
            }
        }
    }

    override fun showToastMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unSubscribe()
    }
}
