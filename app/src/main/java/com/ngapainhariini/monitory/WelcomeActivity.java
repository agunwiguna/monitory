package com.ngapainhariini.monitory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_NAME = "extra_name";
    Button btn_oke;

    TextView tv_data_received;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tv_data_received = findViewById(R.id.tv_data_received);
        btn_oke = findViewById(R.id.btn_oke);
        btn_oke.setOnClickListener(this);

        String name = getIntent().getStringExtra(EXTRA_NAME);

        String text = " Beres! Sekarang "+ name +
                " \n udah bisa ngecek \n pengunaan HP mu \n tiap hari buat bantu "+ name+"\n ngatur waktu :)";
        tv_data_received.setText(text);
    }

    @Override
    public void onClick(View v) {

        String name = getIntent().getStringExtra(EXTRA_NAME);

        if(v.getId() == R.id.btn_oke){
            Toast.makeText(this, "Hallo Salam Kenal "+name, Toast.LENGTH_SHORT).show();
        }
    }
}
