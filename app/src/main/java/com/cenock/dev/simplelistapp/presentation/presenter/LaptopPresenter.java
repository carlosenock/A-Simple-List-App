package com.cenock.dev.simplelistapp.presentation.presenter;

import com.cenock.dev.simplelistapp.domain.model.Laptop;
import com.cenock.dev.simplelistapp.domain.usecase.GetLaptopsUseCase;
import com.cenock.dev.simplelistapp.presentation.contract.LaptopContract;

import java.util.List;

import javax.inject.Inject;

import cleancore.dev.cenock.com.core.domain.UseCase.UseCaseObserver;

/**
 * Created by carlosenock on 2/25/18.
 */

public class LaptopPresenter implements LaptopContract.Presenter {

    private LaptopContract.View view;
    private GetLaptopsUseCase getLaptopsUseCase;

    @Inject
    public LaptopPresenter(GetLaptopsUseCase getLaptopsUseCase) {
        this.getLaptopsUseCase = getLaptopsUseCase;
    }

    @Override
    public void initialize(LaptopContract.View view) {
        this.view = view;
        getLaptops();
    }

    @Override
    public void getLaptops() {
        view.showProgress(true);
        view.showError(false);
        getLaptopsUseCase.execute(new UseCaseObserver<List<Laptop>>() {
            @Override
            public void onNext(List<Laptop> value) {
                view.showLaptops(value);
                view.showProgress(false);
                view.showError(false);
            }

            @Override
            public void onError(Throwable e) {
                view.showProgress(false);
                view.showError(true);
            }
        });
    }
}
