package com.cenock.dev.simplelistapp.presentation.ui.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.cenock.dev.simplelistapp.R;


/**
 * Created by carlosenock on 2/25/18.
 */

public class DefaultLoadingView  extends FrameLayout {
    public DefaultLoadingView(@NonNull Context context) {
        super(context);init(context);
    }

    public DefaultLoadingView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);init(context);
    }

    public DefaultLoadingView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DefaultLoadingView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.view_loading_progress,this);
    }
}
