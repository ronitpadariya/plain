package io.plainapp.util;

import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;

/**
 * Created by ronit on 8/11/17.
 */

public class ColorUtils {

  private ColorUtils() { }



  /**
   * Set the alpha component of {@code color} to be {@code alpha}.
   */
  public static @CheckResult
  @ColorInt
  int modifyAlpha(@ColorInt int color,
      @IntRange(from = 0, to = 255) int alpha) {
    return (color & 0x00ffffff) | (alpha << 24);
  }


  /**
   * Set the alpha component of {@code color} to be {@code alpha}.
   */
  public static @CheckResult @ColorInt int modifyAlpha(@ColorInt int color,
      @FloatRange(from = 0f, to = 1f) float alpha) {
    return modifyAlpha(color, (int) (255f * alpha));
  }


}
