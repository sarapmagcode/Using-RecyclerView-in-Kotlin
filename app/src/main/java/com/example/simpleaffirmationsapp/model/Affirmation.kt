package com.example.simpleaffirmationsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Must have at least 1 property defined
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)