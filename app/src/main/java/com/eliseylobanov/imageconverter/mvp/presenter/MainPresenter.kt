package com.eliseylobanov.imageconverter.mvp.presenter

import com.eliseylobanov.imageconverter.mvp.model.IConverterModel
import com.eliseylobanov.imageconverter.mvp.view.MainView
import moxy.MvpPresenter

class MainPresenter(private val converterModel: IConverterModel) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        loadImage(null)
    }

    fun loadImage(uri: String?) {
        viewState.loadImage(uri)
    }

    fun convertImage(uri: String) = converterModel.convertImage(uri)?.subscribe({
        viewState.showToastSuccess()
    }, {
        viewState.showToastError()
    })

}