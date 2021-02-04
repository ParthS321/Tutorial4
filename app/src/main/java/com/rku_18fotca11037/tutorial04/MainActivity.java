package com.rku_18fotca11037.tutorial04;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnloginclick;
    EditText edtusername, edtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Login Page");

        edtusername = findViewById(R.id.edtusername);
        edtpassword = findViewById(R.id.edtpassword);
        btnloginclick= findViewById(R.id.btnloginclick);

        btnloginclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valUsername = edtusername.getText().toString();
                String valPassword = edtpassword.getText().toString();
                if(valUsername.equals("admin@gmail.com") && valPassword.equals("admin"))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}