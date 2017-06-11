package com.drakontia.qiitaclient

/**
 * Created by drakontia on 2017/06/11.
 */
import android.app.Application
import dagger.Component
import com.drakontia.qiitaclient.dagger.AppComponent
import com.drakontia.qiitaclient.dagger.ClientModule
import javax.inject.Singleton

open class QiitaClientApp : Application() {

    val component: AppComponent = createComponent()

    open fun createComponent(): AppComponent =
            DaggerQiitaClientApp_QiitaClientAppComponent.create()

    @Component(modules = arrayOf(ClientModule::class))
    @Singleton
    interface QiitaClientAppComponent : AppComponent
}
