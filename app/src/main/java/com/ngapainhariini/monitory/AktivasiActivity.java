package com.ngapainhariini.monitory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AktivasiActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivasi);

        btn_masuk = findViewById(R.id.btn_masuk);
        btn_masuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_masuk){
            Intent masuk = new Intent(AktivasiActivity.this, FormActivity.class);
            startActivity(masuk);
        }
    }
}
