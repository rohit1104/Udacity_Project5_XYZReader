package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ArticleDetailFragmentImageView extends ImageView{
    private final float MIN_ASPECT_RATIO = 1.2f;
    private float mAspectRatio = MIN_ASPECT_RATIO;

    public ArticleDetailFragmentImageView(Context context) {
        super(context);
    }

    public ArticleDetailFragmentImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ArticleDetailFragmentImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setAspectRatio(float aspectRatio) {
        if(aspectRatio > MIN_ASPECT_RATIO){
            mAspectRatio = aspectRatio;
        }
        requestLayout();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, (int) (measuredWidth / mAspectRatio));
    }
}
