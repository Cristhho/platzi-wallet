package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS = "typeSuccess"
        val TYPE_INFO = "typeInfo"
    }

    fun getDialog(type: String, context: Context): AlertDialog.Builder {
        when(type) {
            TYPE_ERROR -> {
                return AlertDialog.Builder(context)
                    .setMessage("Hubo un error al obtener los datos")
            }
            TYPE_SUCCESS -> {
                return AlertDialog.Builder(context)
                    .setMessage("Datos cargados con exito")
            }
            TYPE_INFO -> {
                return AlertDialog.Builder(context)
                    .setMessage("Dialogo informativo")
            }
        }

        return AlertDialog.Builder(context)
            .setMessage("Debe añadir el tipo")
    }
}