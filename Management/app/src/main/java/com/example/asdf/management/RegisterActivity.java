package com.example.asdf.management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText IDText = (EditText) findViewById(R.id.IDText);
        EditText PasswdText = (EditText) findViewById(R.id.PasswdText);
        EditText NameText = (EditText) findViewById(R.id.NameText);
        EditText AgeText = (EditText) findViewById(R.id.AgeText);

        Button registerButton = (Button) findViewById(R.id.registerbutton);

    }
}
