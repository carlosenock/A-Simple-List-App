package com.cenock.dev.simplelistapp.data.repository;

import com.cenock.dev.simplelistapp.data.entity.LaptopEntity;
import com.cenock.dev.simplelistapp.data.remote.LaptopApi;
import com.cenock.dev.simplelistapp.data.repository.mapper.LaptopToDomainMapper;
import com.cenock.dev.simplelistapp.domain.model.Laptop;
import com.cenock.dev.simplelistapp.domain.repository.LaptopRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by carlosenock on 2/25/18.
 */

public class LaptopRepositoryImp implements LaptopRepository {

    private LaptopToDomainMapper mapper;
    private LaptopApi api;

    @Inject
    public LaptopRepositoryImp(LaptopApi api, LaptopToDomainMapper mapper) {
        this.mapper = mapper;
        this.api = api;
    }

    @Override
    public Observable<List<Laptop>> getLaptops() {
        return api.getLaptops().map(new Function<List<LaptopEntity>, List<Laptop>>() {
            @Override
            public List<Laptop> apply(List<LaptopEntity> laptopEntities) throws Exception {
                return mapper.map(laptopEntities);
            }
        });
    }
}
