package com.example.asdf.management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;

public class RegisterActivity extends AppCompatActivity {
    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText IDText = (EditText) findViewById(R.id.IDText);
        EditText PasswdText = (EditText) findViewById(R.id.PasswdText);
        EditText NameText = (EditText) findViewById(R.id.NameText);
        EditText AgeText = (EditText) findViewById(R.id.AgeText);

        Button registerButton = (Button) findViewById(R.id.registerbutton);


        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_dehaze_black_24dp);
    }
}
