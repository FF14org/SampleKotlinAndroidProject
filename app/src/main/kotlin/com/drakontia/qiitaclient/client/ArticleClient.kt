package com.drakontia.qiitaclient.client

/**
 * Created by drakontia on 2017/06/11.
 */
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import com.drakontia.qiitaclient.model.Article

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}