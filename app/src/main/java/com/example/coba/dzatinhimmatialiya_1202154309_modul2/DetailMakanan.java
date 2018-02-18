package com.example.coba.dzatinhimmatialiya_1202154309_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by THOSIBA on 18-Feb-18.
 */

public class DetailMakanan extends AppCompatActivity {

    private TextView men,harga,komps;
    private ImageView fto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmakanan);
        men = (TextView) findViewById(R.id.namamenu);

        harga = (TextView) findViewById(R.id.price);

        komps = (TextView) findViewById(R.id.komposisi);

        fto = (ImageView) findViewById(R.id.foto);

        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String price = c.getStringExtra("price");
        String komposisi= c.getStringExtra("komposisi");
        Integer foto = c.getIntExtra("gambar",0);


        men.setText(menu);
        harga.setText(price);
        komps.setText(komposisi);
        fto.setImageResource(foto);


    }
}
