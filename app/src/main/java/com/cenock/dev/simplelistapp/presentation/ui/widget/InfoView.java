package com.cenock.dev.simplelistapp.presentation.ui.widget;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.cenock.dev.simplelistapp.R;
import com.cenock.dev.simplelistapp.databinding.ViewInfoBinding;

import cleancore.dev.cenock.com.core.presentation.ui.widget.BaseCustomView;

/**
 * Created by carlosenock on 2/25/18.
 */

public abstract class InfoView extends BaseCustomView {
    private View.OnClickListener actionListener;
    private ViewInfoBinding binder;

    public InfoView(Context context) {
        super(context);
    }

    public InfoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public InfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public InfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void init(Context context){
        binder = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_info,this,false);
        addView(binder.getRoot());
        binder.tvTitleWarning.setText(getTitle());
        binder.tvBodyWarning.setText(Html.fromHtml(getSubTitle()));
        binder.btWarning.setText(getButtonText());
    }

    public void setActionListener(View.OnClickListener actionListener) {
        this.actionListener = actionListener;
        binder.btWarning.setOnClickListener(actionListener);
    }

    protected abstract String getTitle();

    protected abstract String getSubTitle();

    protected abstract String  getButtonText();
}