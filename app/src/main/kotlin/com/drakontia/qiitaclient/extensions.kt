package com.drakontia.qiitaclient

/**
 * Created by drakontia on 2017/06/10.
 */
import android.support.annotation.IdRes
import android.view.View

fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}