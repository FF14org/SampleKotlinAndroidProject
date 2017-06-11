package com.drakontia.qiitaclient

/**
 * Created by drakontia on 2017/06/11.
 */
import android.app.Application
import com.drakontia.qiitaclient.dagger.AppComponent
import com.drakontia.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}
