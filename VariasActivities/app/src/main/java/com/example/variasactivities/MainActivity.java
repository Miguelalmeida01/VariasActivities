package com.example.variasactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etEmail;
    private Button btEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = findViewById(R.id.editTextNome);
        etEmail = findViewById(R.id.editTextEmail);
        btEnviar = findViewById(R.id.button);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno aluno = new Aluno(etNome.getText().toString(),etEmail.getText().toString());
                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
                //Passar dados
                //intent.putExtra("nome",etNome.getText().toString());
                //intent.putExtra("email",etEmail.getText().toString());
                intent.putExtra("objeto", aluno);
                startActivity(intent);
            }
        });

    }
}