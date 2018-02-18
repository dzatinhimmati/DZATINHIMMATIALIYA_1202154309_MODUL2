package com.example.coba.dzatinhimmatialiya_1202154309_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button psn;
    private RadioButton dine, take;
    private RadioGroup psnGr;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//MEMBUAT VARIABEL YANG DIBUTUHKAN
        psn = (Button) findViewById(R.id.buttonpesan);
        take = (RadioButton) findViewById(R.id.radioButtontakeaway);
        dine = (RadioButton) findViewById(R.id.radioButtondineit);
        psnGr = (RadioGroup) findViewById(R.id.pesanGr);
        addListenerOnButtonpesan();
    }

    public void addListenerOnButtonpesan() {// UNTUK ACTION KLIK PADA BUTTON

        psn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                int selectedId = psnGr.getCheckedRadioButtonId();//UNTUK PILIHAN RADIO BUTTON

                if (selectedId == dine.getId()){

                    Intent a = new Intent(MainActivity.this,DineIn.class);
                    startActivity(a);// APABILA DI KLIK RADIO BUTTON DINE IT MAKA MASUK KE AKTIVITY DINE IN
                }
                else if (selectedId == take.getId()){

                    Intent a = new Intent(MainActivity.this,TakeAway.class);
                    startActivity(a);// APABILA DI KLIK RADIO BUTTON TAKEAWAY MAKA MASUK KE AKTIVITY TAKEAWAY

                }



            }

        });
    }
}

