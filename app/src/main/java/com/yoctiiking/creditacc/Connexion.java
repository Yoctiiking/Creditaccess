package com.yoctiiking.creditacc;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.Function;

public class Connexion extends AppCompatActivity {
    private static Button btn_valid2;
    private static EditText email, password ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        btn_valid2= (Button)findViewById(R.id.btn_valid2);
        email= (EditText) findViewById(R.id.email);
        password= (EditText) findViewById(R.id.password);
        btn_valid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                connexion();
            }
        });

        if (android.os.Build.VERSION.SDK_INT > 7) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }
    }

    private void connexion() {

        try {

            Fonctions fonc = new Fonctions();
            Statement st = fonc.connexionSQLBDD();

            String SQL ="SELECT password FROM users WHERE full_name'"+email.getText().toString()+"'";

            final ResultSet rs = st.executeQuery(SQL);
            rs.next();

            if (rs.getString(1).equals(password.getText().toString())){
                Nextactivity();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Nextactivity() {
        Intent intent = new Intent(Connexion.this, MainActivity.class);
        startActivity(intent);
        finish();
    }



}

