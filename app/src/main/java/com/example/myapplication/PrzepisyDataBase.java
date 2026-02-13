package com.example.myapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Wypiek.class}, version = 2)
public abstract class PrzepisyDataBase extends RoomDatabase {

    public abstract WypiekiDao zwrocWypiekiDao();
    private static PrzepisyDataBase instancja;
    public static PrzepisyDataBase zwrocInstancjeBazyDanych(Context context){
        if (instancja == null){
            instancja = Room.databaseBuilder(
                    context,
                    PrzepisyDataBase.class,
                    "Przepisy_db"
            )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instancja;
    }


}
