package io.legado.app.lib.theme.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import io.legado.app.lib.theme.accentColor
import io.legado.app.utils.applyTint

/**
 * @author Aidan Follestad (afollestad)
 */
class ThemeEditText(context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {

    init {
        if (!isInEditMode) {
            applyTint(context.accentColor)
        }
    }
}
