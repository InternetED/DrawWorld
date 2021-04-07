package com.example.drawworld

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * Creator: ED
 * Date: 2021/4/6 16:37
 * Mail: salahayo3192@gmail.com
 *
 * 範本如何創建多構造器的方法。
 * **/
private abstract class TemplateView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr)