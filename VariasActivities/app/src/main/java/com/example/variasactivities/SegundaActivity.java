package com.example.variasactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvNome;
    private TextView tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvNome = findViewById(R.id.textViewNome);
        tvEmail = findViewById(R.id.textViewEmail);

        Bundle dados = getIntent().getExtras();
       // String nome = dados.getString("nome");
       // String email = dados.getString("email");
        Aluno aluno = (Aluno) dados.getSerializable("objeto");
        tvNome.setText(aluno.getNome());
        tvEmail.setText(aluno.getEmail());
    }
}