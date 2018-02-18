package com.example.coba.dzatinhimmatialiya_1202154309_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by THOSIBA on 18-Feb-18.
 */

public class TakeAway extends AppCompatActivity {

    private EditText nm,hp,addr,catt;
    private Button plh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_activity);

        //MEMBUAT VARIABEL DENGAN ID
        nm = (EditText) findViewById(R.id.editTextnama);
        hp = (EditText) findViewById(R.id.editTextphone);
        addr = (EditText) findViewById(R.id.editTextalamat);
        catt = (EditText) findViewById(R.id.editTextcatatan);
        plh = (Button) findViewById(R.id.buttonpilih);
        addListenerOnButtonpilih();

    }
    public void addListenerOnButtonpilih() {// YANG TERJADI APABILA BUTTON DITEKAN

        plh.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent c = new Intent(TakeAway.this,ListPesanan.class);
                startActivity(c);

            }

        });
    }



}

