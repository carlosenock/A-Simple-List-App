package com.cenock.dev.simplelistapp.data.repository.mapper;

import com.cenock.dev.simplelistapp.data.entity.LaptopEntity;
import com.cenock.dev.simplelistapp.domain.model.Laptop;

import javax.inject.Inject;

import cleancore.dev.cenock.com.core.data.repository.mapper.Mapper;

/**
 * Created by carlosenock on 2/25/18.
 */

public class LaptopToDomainMapper extends Mapper<LaptopEntity, Laptop> {

    @Inject
    public LaptopToDomainMapper() {}

    @Override
    public Laptop map(LaptopEntity value) {
        Laptop laptop = new Laptop();
        laptop.title = value.title;
        laptop.description = value.description;
        laptop.image = value.image;
        return laptop;
    }

    @Override
    public LaptopEntity reverseMap(Laptop value) {
        LaptopEntity laptopEntity = new LaptopEntity();
        laptopEntity.title = value.title;
        laptopEntity.description = value.description;
        laptopEntity.image = value.image;
        return laptopEntity;
    }
}
