package com.drakontia.qiitaclient

import dagger.Component
import com.drakontia.qiitaclient.dagger.AppComponent
import com.drakontia.qiitaclient.dagger.MockClientModule
import javax.inject.Singleton

class MockApp : QiitaClientApp() {

    override fun createComponent(): AppComponent =
            DaggerMockApp_MockComponent.create()

    @Component(modules = arrayOf(MockClientModule::class))
    @Singleton
    internal interface MockComponent : AppComponent {
        fun inject(mainActivityTest: MainActivityTest)
    }
}