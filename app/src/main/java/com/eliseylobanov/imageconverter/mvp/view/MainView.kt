package com.eliseylobanov.imageconverter.mvp.view

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {
    fun loadImage(url: String?)
    fun showToastSuccess()
    fun showToastError()
}