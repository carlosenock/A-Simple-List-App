package com.cenock.dev.simplelistapp.domain.repository;

import com.cenock.dev.simplelistapp.domain.model.Laptop;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by carlosenock on 2/25/18.
 */

public interface LaptopRepository {
    Observable<List<Laptop>> getLaptops();
}
