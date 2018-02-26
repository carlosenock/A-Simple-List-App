package com.cenock.dev.simplelistapp.presentation.ui.fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.cenock.dev.simplelistapp.R;
import com.cenock.dev.simplelistapp.databinding.FragmentLaptopDetailBinding;
import com.cenock.dev.simplelistapp.domain.model.Laptop;

import cleancore.dev.cenock.com.core.presentation.ui.fragment.BaseFragment;


/**
 * Created by carlosenock on 2/25/18.
 */

public class LaptopDetailFragment extends BaseFragment<FragmentLaptopDetailBinding> {

    Laptop laptop;

    public static LaptopDetailFragment newInstance(Laptop laptop) {
        LaptopDetailFragment fragment = new LaptopDetailFragment();
        fragment.laptop = laptop;
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_laptop_detail;
    }

    @Override
    protected void initView() {
        setupToolbar();
        Glide.with(getContext())
                .load(laptop.image)
                .placeholder(R.drawable.ic_placeholder_image)
                .error(R.drawable.ic_placeholder_image)
                .priority(Priority.HIGH)
                .into(binder.ivLaptop);
        binder.tvTitle.setText(laptop.title);
        binder.tvDescription.setText(laptop.description);
        binder.tvDescription.setMovementMethod(new ScrollingMovementMethod());
    }

    private void setupToolbar() {
        binder.includedToolbar.ivBack.setVisibility(View.VISIBLE);
        binder.includedToolbar.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popBackStack();
            }
        });
    }

    @Override
    protected void injectDependencies() {

    }
}
