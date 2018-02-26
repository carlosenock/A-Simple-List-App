package com.cenock.dev.simplelistapp.di.module;


import com.cenock.dev.simplelistapp.domain.usecase.GetLaptopsUseCase;
import com.cenock.dev.simplelistapp.presentation.contract.LaptopContract;
import com.cenock.dev.simplelistapp.presentation.presenter.LaptopPresenter;
import com.cenock.dev.simplelistapp.presentation.ui.adapter.LaptopAdapter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by carlosenock on 2/25/18.
 */
@Module
public class LaptopModule {

    @Provides
    @Singleton
    public LaptopContract.Presenter providePresenter(GetLaptopsUseCase getLaptopsUseCase) {
        return new LaptopPresenter(getLaptopsUseCase);
    }

    @Provides
    @Singleton
    public LaptopAdapter provideAdapter() {
        return new LaptopAdapter();
    }
}
