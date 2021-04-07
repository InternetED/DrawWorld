package com.example.drawworld

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View

import androidx.annotation.ColorInt


/**
 * Creator: ED
 * Date: 2021/4/6 16:40
 * Mail: salahayo3192@gmail.com
 *
 * **/
class CircleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : View(context, attrs, defStyleAttr, defStyleRes) {


    private val mPaint = Paint().apply {
        color = Color.GRAY
        strokeWidth = 5F
        style = Paint.Style.FILL
    }

    @ColorInt
    private val color: Int

    init {

        val a = context.obtainStyledAttributes(attrs, R.styleable.CircleView)
        color = a.getColor(R.styleable.CircleView_circle_color, Color.RED)
        a.recycle()

        mPaint.color = color
    }


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 获取传入的padding值
        val paddingLeft = paddingLeft;
        val paddingRight = paddingRight;
        val paddingTop = paddingTop;
        val paddingBottom = paddingBottom;


        // 獲取高度和寬度
        val width = width.toFloat() - paddingLeft - paddingRight
        val height = height.toFloat() - paddingTop - paddingBottom

        // 設置圓的半徑 = 寬或高最小值的二分之一
        val radius = width.coerceAtMost(height) / 2

        logd("width:$width , height:$height")

        // cx 和 cy 為圓心的位置
        canvas.drawCircle(paddingLeft + width / 2, paddingTop + height / 2, radius, mPaint)
    }

    fun logd(msg: String) {
        Log.d("CircleView", msg)
    }

}