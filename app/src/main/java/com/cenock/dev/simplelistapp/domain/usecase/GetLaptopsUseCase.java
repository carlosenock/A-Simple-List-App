package com.cenock.dev.simplelistapp.domain.usecase;

import com.cenock.dev.simplelistapp.domain.model.Laptop;
import com.cenock.dev.simplelistapp.domain.repository.LaptopRepository;

import java.util.List;

import javax.inject.Inject;

import cleancore.dev.cenock.com.core.domain.UseCase.UseCase;
import io.reactivex.Observable;

/**
 * Created by carlosenock on 2/25/18.
 */

public class GetLaptopsUseCase extends UseCase<List<Laptop>> {

    private LaptopRepository repository;

    @Inject
    public GetLaptopsUseCase(LaptopRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Observable<List<Laptop>> createObservableUseCase() {
        return repository.getLaptops();
    }
}
