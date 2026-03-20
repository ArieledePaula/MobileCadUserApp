package com.example.cadastrodeusuario;

//Bloco de Importações
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

//Classe principal
public class CreateUser extends AppCompatActivity {
    TextInputEditText editNome, editEmail;

    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        // Vincula variável com elemente de interface gráfica, escrito no arquivo xml
        editNome = findViewById(R.id.nome);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            if(!nome.isEmpty()){
                MainActivity.listaNomes.add(nome + "(" + email + ") ");
                finish();
            }
        });
    }
}
