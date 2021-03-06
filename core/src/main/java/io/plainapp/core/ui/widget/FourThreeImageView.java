package io.plainapp.core.ui.widget;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by ronit on 25/10/17.
 */

public class FourThreeImageView extends ForegroundImageView {

  public FourThreeImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override
  protected void onMeasure(int widthSpec, int heightSpec) {
    int fourThreeHeight = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(widthSpec) * 3 / 4,
        MeasureSpec.EXACTLY);
    super.onMeasure(widthSpec, fourThreeHeight);
  }

}
