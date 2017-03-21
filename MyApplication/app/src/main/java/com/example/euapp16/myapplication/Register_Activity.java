package com.example.euapp16.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register_Activity extends AppCompatActivity {

    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        final Button buttonBack = (Button) findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }
}
