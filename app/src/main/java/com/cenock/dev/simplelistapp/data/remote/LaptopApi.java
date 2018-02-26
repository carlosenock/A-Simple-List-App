package com.cenock.dev.simplelistapp.data.remote;

import com.cenock.dev.simplelistapp.data.entity.LaptopEntity;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by carlosenock on 2/25/18.
 */

public interface LaptopApi {

    @GET("list")
    Observable<List<LaptopEntity>> getLaptops();
}
