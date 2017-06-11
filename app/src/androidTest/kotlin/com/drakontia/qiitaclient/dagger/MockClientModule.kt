package com.drakontia.qiitaclient.dagger

import dagger.Module
import dagger.Provides
import org.mockito.Mockito
import com.drakontia.qiitaclient.client.ArticleClient
import javax.inject.Singleton

@Module
class MockClientModule {

    @Provides
    @Singleton
    fun provideArticleClient(): ArticleClient =
            Mockito.mock(ArticleClient::class.java)
}