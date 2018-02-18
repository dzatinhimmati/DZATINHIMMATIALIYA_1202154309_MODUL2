package com.example.coba.dzatinhimmatialiya_1202154309_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by THOSIBA on 18-Feb-18.
 */

public class DineIn extends AppCompatActivity {

    private EditText nm;
    private Spinner nomj;
    private Button plh;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinein_activity);




        nomj = (Spinner) findViewById(R.id.spinnernomeja);
        plh = (Button) findViewById(R.id.buttonpesan) ;

//ARRAY UNTUK SPINNER
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (nomj != null){
            nomj.setAdapter(adapter);
        }

    }

    }
    public void addListenerOnButtonpilih() {//YANG TERJADI APABILA BUTTON PILIH DITEKAN

        plh.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent a = new Intent(DineIn.this,ListPesanan.class);
                startActivity(a);

                nm = (EditText) findViewById(R.id.editTextnama);
                String test = nomj.getSelectedItem().toString();

//MEMBUAT TOAST UNTUK SETIAP ACTION
                if (nm ==null){
                    Toast.makeText(this,"Harus diisi",Toast.LENGTH_LONG).show();
                }

                else if (test.equalsIgnoreCase("Meja 1")){
                    String nama = nm.getText().toString();
                    Toast.makeText(this,"Anda " + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
                }

                else if (test.equalsIgnoreCase("Meja 2")){
                    String nama = nm.getText().toString();
                    Toast.makeText(this,"Anda " + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
                }

                else if (test.equalsIgnoreCase("Meja 3")){
                    String nama = nm.getText().toString();
                    Toast.makeText(this,"Anda " + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
                }

                else if (test.equalsIgnoreCase("Meja 4")){
                    String nama = nm.getText().toString();
                    Toast.makeText(this,"Anda " + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
                }

                else if (test.equalsIgnoreCase("Meja 5")){
                    String nama = nm.getText().toString();
                    Toast.makeText(this,"Anda " + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
                }


            }

        });
    }
}