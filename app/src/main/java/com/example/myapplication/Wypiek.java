package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "wypieki_tabela")
public class Wypiek {
    @PrimaryKey (autoGenerate = true)
    private int id;
    private String nazwa;
    private String skladniki;
    @ColumnInfo (name = "temperatura_pieczenia")
    private int temperatura;
    @ColumnInfo (name = "czas_pieczenia")
    private int czasPieczenia;

    public Wypiek(String nazwa, String skladniki, int temperatura, int czasPieczenia) {
        id = 0;
        this.nazwa = nazwa;
        this.skladniki = skladniki;
        this.temperatura = temperatura;
        this.czasPieczenia = czasPieczenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getCzasPieczenia() {
        return czasPieczenia;
    }

    public void setCzasPieczenia(int czasPieczenia) {
        this.czasPieczenia = czasPieczenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
