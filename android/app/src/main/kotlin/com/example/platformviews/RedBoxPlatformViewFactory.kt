package com.example.platformviews

import android.content.Context
import android.view.View;
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory

class RedBoxPlatformViewFactory : PlatformViewFactory(StandardMessageCodec.INSTANCE) {

  override fun create(context: Context, id: Int, args: Any?): PlatformView {
    val view = RedBox(context)

    return object : PlatformView {
      override fun getView(): View {
        return view
      }

      override fun dispose() {}
    }
  }
}
