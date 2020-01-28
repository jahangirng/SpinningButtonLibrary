package com.gc.spinningbutton;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;

public class SpinningButton extends Button implements View.OnClickListener{
    private static final int RIGHT_DIRECTION = 0;
    private static final int LEFT_DIRECTION = 1;

    private int mSpinDirection;

    public SpinningButton(Context context) {
        super(context);
        init(context, null);
    }

    public SpinningButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public SpinningButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SpinningButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.SpinningButton, 0, 0);
            try {
                mSpinDirection = a.getInt(R.styleable.SpinningButton_spinningDirection, RIGHT_DIRECTION);
                Log.d("mSpinDirection", String.valueOf(mSpinDirection));
            } finally {
                a.recycle();
            }
        }
        setOnClickListener(this);
    }

    public void setSpinDirection(int spinDirection) {
        mSpinDirection = spinDirection;
    }

    @Override
    public void onClick(View v) {
        RotateAnimation animation = null;
        if (mSpinDirection == RIGHT_DIRECTION) {
            animation = new RotateAnimation(0, 360, v.getWidth() / 2, v.getHeight() / 2);
        } else if (mSpinDirection == LEFT_DIRECTION) {
            animation = new RotateAnimation(360, 0, v.getWidth() / 2, v.getHeight() / 2);
        }
        animation.setDuration(500);
        v.startAnimation(animation);
    }
}
