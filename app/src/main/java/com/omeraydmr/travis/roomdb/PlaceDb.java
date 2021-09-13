package com.omeraydmr.travis.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.omeraydmr.travis.model.Place;

@Database(entities = Place.class, version = 1)
public abstract class PlaceDb extends RoomDatabase {
    public abstract PlaceDao PlaceDao();
}
