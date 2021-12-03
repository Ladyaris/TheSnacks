package com.ladyaris.thesnacks.model

import android.accounts.AuthenticatorDescription
import android.graphics.Picture
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import org.w3c.dom.ProcessingInstruction

@Parcelize
data class Recipes(
    var name: String?,
    var category: String?,
    var description: String?,
    var ingredients: String,
    var instructions: String?,
    var pictures: String?,
    var number: String?,
    var calories: String?,
    var carbo: String?,
    var protein: String?
): Parcelable
