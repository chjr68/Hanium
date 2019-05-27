package com.example.asdf.management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText IDText = (EditText) findViewById(R.id.IDText);
        EditText PasswdText = (EditText) findViewById(R.id.PasswdText);

        Button loginButton = (Button) findViewById(R.id.loginbutton);
        TextView RegisterButton = (TextView) findViewById(R.id.RegisterButton);


        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

    }
}
