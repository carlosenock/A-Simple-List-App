package com.cenock.dev.simplelistapp.di.module;

import com.cenock.dev.simplelistapp.data.remote.LaptopApi;
import com.cenock.dev.simplelistapp.data.repository.LaptopRepositoryImp;
import com.cenock.dev.simplelistapp.data.repository.mapper.LaptopToDomainMapper;
import com.cenock.dev.simplelistapp.domain.model.Laptop;
import com.cenock.dev.simplelistapp.domain.repository.LaptopRepository;

import javax.inject.Singleton;

import cleancore.dev.cenock.com.core.Config;
import cleancore.dev.cenock.com.core.data.remote.ApiServiceFactory;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by carlosenock on 2/25/18.
 */
@Module
public class LaptopNetworkModule {

    @Provides
    LaptopRepository provideRepository(LaptopApi api, LaptopToDomainMapper mapper) {
        return new LaptopRepositoryImp(api, mapper);
    }

    @Provides
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    @Provides
    @Singleton
    LaptopApi provideApiService(OkHttpClient okHttpClient) {
        return ApiServiceFactory.build(okHttpClient, LaptopApi.class, Config.API_BASE_URL);
    }
}
