package com.cristianvillamil.platziwallet.ui.observable

interface Observable {

    fun addObserver(observer: Observer)
    fun deleteObserver(observer: Observer)
    fun notifyObservers(newValue: Double)

}