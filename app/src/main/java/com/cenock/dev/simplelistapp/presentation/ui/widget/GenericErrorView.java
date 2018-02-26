package com.cenock.dev.simplelistapp.presentation.ui.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

import com.cenock.dev.simplelistapp.R;

/**
 * Created by carlosenock on 2/25/18.
 */

public class GenericErrorView  extends InfoView{

    public GenericErrorView(Context context) {
        super(context);
    }

    public GenericErrorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GenericErrorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public GenericErrorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected String getTitle() {
        return getContext().getString(R.string.titleServerError);
    }

    @Override
    protected String getSubTitle() {
        return getContext().getString(R.string.subtitleServerError);
    }

    @Override
    protected String getButtonText() {
        return getContext().getString(R.string.buttonTextServerError);
    }
}

