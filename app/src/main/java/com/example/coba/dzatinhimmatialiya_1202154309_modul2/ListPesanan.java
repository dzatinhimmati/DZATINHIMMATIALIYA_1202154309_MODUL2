package com.example.coba.dzatinhimmatialiya_1202154309_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by THOSIBA on 18-Feb-18.
 */

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataPrice;
    private ArrayList<Integer> foto;
    private TextView x,y;

    //Daftar Menu Makanan
    private String[] Judul = {"Nasi Goreng", "Baso","Mie gorang","Batagor","Cilok"};
    //Daftar Harga
    private String[] test = {"Rp. 10.000", "Rp. 10.000","Rp. 7.000","Rp. 5.000","Rp. 5.000"};
    //Daftar Gambar
    private int[] Foto = {R.drawable.nasigoreng, R.drawable.baso,R.drawable.mie,R.drawable.batagor,R.drawable.cilok};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        dataMenu = new ArrayList<>();
        dataPrice = new ArrayList<>();
        foto = new ArrayList<>();
        Daftarmakanan();


        rView = (RecyclerView) findViewById(R.id.RecyclerView);
        rView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataPrice,foto);
        rView.setAdapter(adapter);

    }

    private void Daftarmakanan(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataPrice.add(test[w]);
            foto.add(Foto[w]);
        }
    }


}
