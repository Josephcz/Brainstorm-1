package com.example.euapp16.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    Button buttonRegister;
    EditText editTextName, editTextPasswd;
    public Intent intentMain, intentSecond;
    EditText editText;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        final Button buttonRegister = (Button) findViewById(R.id.buttonRegister);
        final EditText editTextName = (EditText) findViewById(R.id.editText);
        final EditText editTextPasswd = (EditText) findViewById(R.id.editText2);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent (getApplicationContext(), Register_Activity.class);
                startActivity(intentMain);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               String n = editTextName.getText().toString();
                                               String ph = editTextPasswd.getText().toString();
                                               String x = "admin";
                                               if (n.equals(x) && ph.equals(x)) {
                                                   intentSecond = new Intent (getApplicationContext(), Subject_activity.class);
                                                   startActivity(intentSecond);
                                               }
                                               else {
                                                   Toast.makeText(MainActivity.this, "E-mail or password wrong.", Toast.LENGTH_SHORT).show();
                                               }
                                           }
                                       });



    }

    public void sendMessage(View view) {

    };
}
