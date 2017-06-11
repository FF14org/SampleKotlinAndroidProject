package com.drakontia.qiitaclient.dagger

/**
 * Created by drakontia on 2017/06/11.
 */
import com.drakontia.qiitaclient.MainActivity

interface  AppComponent {

    fun inject(mainActivity: MainActivity)
}