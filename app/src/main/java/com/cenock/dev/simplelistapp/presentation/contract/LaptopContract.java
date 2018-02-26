package com.cenock.dev.simplelistapp.presentation.contract;

import com.cenock.dev.simplelistapp.domain.model.Laptop;

import java.util.List;

import cleancore.dev.cenock.com.core.presentation.contract.BaseViewPresenter;
import cleancore.dev.cenock.com.core.presentation.contract.IProgressView;

/**
 * Created by carlosenock on 2/25/18.
 */

public interface LaptopContract {
    interface View extends IProgressView {
        void showLaptops(List<Laptop> laptops);
        void showError(boolean show);
    }

    interface Presenter extends BaseViewPresenter<View> {
        void getLaptops();
    }
}
