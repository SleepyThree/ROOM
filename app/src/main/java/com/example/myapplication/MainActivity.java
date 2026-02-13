package com.example.myapplication;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
PrzepisyDataBase przepisyDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przepisyDataBase = PrzepisyDataBase.zwrocInstancjeBazyDanych(MainActivity.this);
        przepisyDataBase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypiek("sernik", "ser, ziemniaki, cukier, jajka", 200, 170));
        przepisyDataBase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypiek("Drożdżówka", "ser, ziemniaki, cukier, jajka", 200, 170));
        przepisyDataBase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypiek("Szarlotka", "ser, ziemniaki, cukier, jajka", 200, 170));

    }
}