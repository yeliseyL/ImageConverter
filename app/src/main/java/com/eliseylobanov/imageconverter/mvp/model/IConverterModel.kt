package com.eliseylobanov.imageconverter.mvp.model

import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Completable

interface IConverterModel {
    fun convertImage(uri: String): @NonNull Completable?
}