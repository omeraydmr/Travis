package com.omeraydmr.travis.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.omeraydmr.travis.model.Place;

import java.util.List;

@Dao
public interface PlaceDao {

    @Insert
    void insert(Place place);

    @Delete
    void delete(Place place);

    @Query("SELECT * FROM Place WHERE name = :nameinput")
    List<Place> getAll(String nameinput);


}
