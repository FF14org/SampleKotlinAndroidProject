package com.drakontia.qiitaclient

/**
 * Created by drakontia on 2017/06/10.
 */
import android.support.annotation.IdRes
import android.view.View
import android.content.Context
import android.widget.Toast

fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}