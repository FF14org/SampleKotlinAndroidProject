package com.drakontia.qiitaclient.dagger

/**
 * Created by drakontia on 2017/06/11.
 */
import dagger.Component
import com.drakontia.qiitaclient.MainActivity
import javax.inject.Singleton

@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface  AppComponent {

    fun inject(mainActivity: MainActivity)
}