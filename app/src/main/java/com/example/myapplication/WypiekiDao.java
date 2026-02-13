package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WypiekiDao {
    @Insert
    public void wstawWypiekDoBazy(Wypiek wypiek);
    @Insert
    public void wstawKilkaWypiekow(Wypiek ...wypieks);

    @Delete
    public void usunZBazy(Wypiek wypiek);

    @Update
    public void zaktualizuj(Wypiek wypiek);

    @Query("Select * from wypieki_tabela")
    List<Wypiek> zwrocWszystkieWypiekiZBazy();

    @Query("Select nazwa from wypieki_tabela where czas_pieczenia< :czas")
    List<String> zwrocNazwyWypiekow(int czas);
}
