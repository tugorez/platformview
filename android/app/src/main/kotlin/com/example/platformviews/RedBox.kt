package com.example.platformviews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class RedBox(context: Context?) : View(context) {
  private val paint: Paint = Paint()

  init {
    paint.setColor(Color.RED)
  }

  override fun onDraw(canvas: Canvas) {
    super.onDraw(canvas)

    val centerX = getWidth() / 2
    val centerY = getHeight() / 2

    canvas.drawRect(
      (centerX - RedBox.Companion.SIZE / 2).toFloat(),
      (centerY - RedBox.Companion.SIZE / 2).toFloat(),
      (centerX + RedBox.Companion.SIZE / 2).toFloat(),
      (centerY + RedBox.Companion.SIZE / 2).toFloat(),
      paint
    )
  }

  companion object {
    const val SIZE = 250
  }
}
