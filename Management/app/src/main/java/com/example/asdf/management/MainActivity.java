package com.example.asdf.management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText IDText = (EditText) findViewById(R.id.IDText);
        EditText PasswdText = (EditText) findViewById(R.id.PasswdText);

        TextView welcomMessage = (TextView) findViewById(R.id.welcomMessage);
    }
}
