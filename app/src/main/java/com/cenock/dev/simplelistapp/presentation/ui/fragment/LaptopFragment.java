package com.cenock.dev.simplelistapp.presentation.ui.fragment;

import android.view.View;

import com.cenock.dev.simplelistapp.R;
import com.cenock.dev.simplelistapp.databinding.FragmentLaptopBinding;
import com.cenock.dev.simplelistapp.di.component.DaggerLaptopComponent;
import com.cenock.dev.simplelistapp.domain.model.Laptop;
import com.cenock.dev.simplelistapp.presentation.contract.LaptopContract;
import com.cenock.dev.simplelistapp.presentation.ui.adapter.LaptopAdapter;

import java.util.List;

import javax.inject.Inject;

import cleancore.dev.cenock.com.core.presentation.ui.adapter.OnItemClickListener;
import cleancore.dev.cenock.com.core.presentation.ui.fragment.BaseStackFragment;

/**
 * Created by carlosenock on 2/25/18.
 */

public class LaptopFragment extends BaseStackFragment<FragmentLaptopBinding> implements LaptopContract.View {

    @Inject
    LaptopAdapter adapter;
    @Inject
    LaptopContract.Presenter presenter;

    @Override
    protected int getNavigationContainer() {
        return R.id.stackContainer;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_laptop;
    }

    @Override
    protected void initView() {
        presenter.initialize(this);
    }

    @Override
    protected void injectDependencies() {
        DaggerLaptopComponent.builder().build().inject(this);
    }

    @Override
    public void showLaptops(List<Laptop> laptops) {
        adapter.initializeList(laptops);
        adapter.setOnItemClickListener(new OnItemClickListener<Laptop>() {
            @Override
            public void onItemClick(int adapterPosition, Laptop item) {
                getBaseStackFragment().addFragmentToStack(LaptopDetailFragment.newInstance(item));
            }
        });
        binder.rvLaptops.setAdapter(adapter);
    }

    @Override
    public void showError(boolean show) {
        binder.serverErrorView.setVisibility(show ? View.VISIBLE : View.GONE);
        binder.rvLaptops.setVisibility(show ? View.GONE : View.VISIBLE);
    }

    @Override
    public void showProgress(boolean show) {
        binder.progressView.setVisibility(show ? View.VISIBLE : View.GONE);
        binder.rvLaptops.setVisibility(show ? View.GONE : View.VISIBLE);
    }
}
