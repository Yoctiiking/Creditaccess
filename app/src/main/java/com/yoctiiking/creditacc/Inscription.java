package com.yoctiiking.creditacc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Inscription extends AppCompatActivity {
    private static Button btn_valid;
    private static EditText full_name, email, password, passwordCheck ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        btn_valid= (Button)findViewById(R.id.btn_valid);
        full_name = (EditText) findViewById(R.id.full_name);
        email= (EditText) findViewById(R.id.email);
        password= (EditText) findViewById(R.id.password);
        passwordCheck= (EditText) findViewById(R.id.passwordCheck);

        btn_valid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    public void register(){
        boolean full_name = false;
        boolean email = false;
        boolean password = false;
        boolean passwordCheck = false;

        try {

        } catch (Exception e){
            Toast.makeText(Inscription.this, "L'inscription a échoué", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }
}
