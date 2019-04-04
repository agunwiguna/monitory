package com.ngapainhariini.monitory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_next;
    EditText edt_nama, edt_umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        edt_nama = findViewById(R.id.edt_nama);
        edt_umur = findViewById(R.id.edt_umur);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_next){

            String inputNama = edt_nama.getText().toString().trim();
            String inputUmur = edt_umur.getText().toString().trim();

            boolean isEmptyFields = false;

            if(TextUtils.isEmpty(inputNama)){
                isEmptyFields = true;
                edt_nama.setError("Field ini tidak boleh kosong");
            }

            if(TextUtils.isEmpty(inputUmur)){
                isEmptyFields = true;
                edt_umur.setError("Field ini tidak boleh kosong");
            }

            if(!isEmptyFields){
                Intent welcome = new Intent(FormActivity.this,WelcomeActivity.class);
                welcome.putExtra(WelcomeActivity.EXTRA_NAME,inputNama);
                startActivity(welcome);
            }

        }
    }
}
