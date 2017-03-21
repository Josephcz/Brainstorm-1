package com.example.euapp16.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    Button buttonRegister;
    public Intent intentMain;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        final Button buttonRegister = (Button) findViewById(R.id.buttonRegister);




        buttonLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent (getApplicationContext(), ActivitySubject.class);
                EditText editText = (EditText) findViewById(R.id.editText);
                String message = editText.getText().toString();
                intentMain.putExtra("EXTRA_MESSAGE", message);
                startActivity(intentMain);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent (getApplicationContext(), Register_Activity.class);
                EditText editText = (EditText) findViewById(R.id.editText);
                String message = editText.getText().toString();
                intentMain.putExtra("EXTRA_MESSAGE", message);
                startActivity(intentMain);
            }
        });

    }

    public void sendMessage(View view) {

    };
}
