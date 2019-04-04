package com.ngapainhariini.monitory;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_mulai;

    //NIM : 10116388
    //Nama : Agun Wiguna
    //Kelas : AKB-9

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mulai = findViewById(R.id.btn_mulai);
        btn_mulai.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_mulai){
            Intent mulai = new Intent(MainActivity.this,AktivasiActivity.class);
            startActivity(mulai);
        }
    }
}
