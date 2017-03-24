package com.example.euapp16.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IT_activity extends AppCompatActivity {
    Button ButtonQ1, ButtonQ2, ButtonQ3;
    Intent intentMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.it_activity);
        ButtonQ1 = (Button) findViewById(R.id.button_Java);
        ButtonQ2 = (Button) findViewById(R.id.button_C1);
        ButtonQ3 = (Button) findViewById(R.id.button_C2);

        Button back;
        back = (Button) findViewById(R.id.button_Back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        ButtonQ1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent (getApplicationContext(), QnA_activity.class);
                intentMain.putExtra("question", "What will this code do? (this.x = y)");
                intentMain.putExtra("answer", "Set X with value from Y.");
                startActivity(intentMain);
            }
        });

        ButtonQ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent (getApplicationContext(), QnA_activity.class);
                intentMain.putExtra("question", "How do you initialize a list in C#?");
                intentMain.putExtra("answer", "Set X with value from Y.");
                startActivity(intentMain);
            }
        });

        ButtonQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMain = new Intent (getApplicationContext(), QnA_activity.class);
                intentMain.putExtra("question", "How do you print a line to the Console?");
                intentMain.putExtra("answer", "Set X with value from Y.");
                startActivity(intentMain);
            }
        });
    }
}
