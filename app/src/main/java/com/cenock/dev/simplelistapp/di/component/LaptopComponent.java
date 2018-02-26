package com.cenock.dev.simplelistapp.di.component;

import com.cenock.dev.simplelistapp.di.module.LaptopModule;
import com.cenock.dev.simplelistapp.di.module.LaptopNetworkModule;
import com.cenock.dev.simplelistapp.presentation.ui.fragment.LaptopFragment;

import javax.inject.Singleton;

import cleancore.dev.cenock.com.core.di.component.FragmentComponent;
import dagger.Component;

/**
 * Created by carlosenock on 2/25/18.
 */

@Singleton
@Component(modules = {LaptopModule.class, LaptopNetworkModule.class})
public interface LaptopComponent extends FragmentComponent<LaptopFragment> {
}
