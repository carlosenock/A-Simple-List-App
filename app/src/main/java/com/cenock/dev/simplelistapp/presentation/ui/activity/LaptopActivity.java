package com.cenock.dev.simplelistapp.presentation.ui.activity;

import com.cenock.dev.simplelistapp.R;
import com.cenock.dev.simplelistapp.presentation.ui.fragment.LaptopFragment;

import cleancore.dev.cenock.com.core.presentation.ui.activity.BaseFragmentActivity;

public class LaptopActivity extends BaseFragmentActivity {

    @Override
    protected int getFragmentContainerId() {
        return R.id.framelayoutContainer;
    }

    @Override
    protected void initView() {
        setFragment(new LaptopFragment());
    }

    @Override
    protected void injectDependencies() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_laptop;
    }
}
