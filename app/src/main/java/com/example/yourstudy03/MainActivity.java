package com.example.yourstudy03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {

    EditText edit_email, edit_senha;
    Button bt_entrar;

    private Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_email = findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
        bt_entrar = findViewById(R.id.bt_entrar);

        edit_email.requestFocus();

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edit_email.getText().toString().isEmpty() || edit_senha.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Preencha o campo", Toast.LENGTH_LONG).show();
                    edit_email.requestFocus();
                }else if(edit_email.getText().toString().equals("Login@domonio.com" )&&
                         edit_senha.getText().toString().equals("123")   ){

                    Intent intent = new Intent(getApplicationContext(), Principal.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Login Incorreto!", Toast.LENGTH_LONG).show();
                    edit_email.requestFocus();
                }

            }
        });




    }
}