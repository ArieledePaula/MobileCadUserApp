package com.example.cadastrodeusuario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declaração dos Componentes Visuais e do Adaptador da Lita
    RecyclerView recyclerView;

    UserAdapter adapter;

    Button btnCadastrar;

    //Atenção: Atributo estático (static) permite que os dados persistam na memória
    //Enquanto o app estiver
     public static List<String> listaNomes = new ArrayList<>();

     //Método de inicialização da Activity (POnto de entrada da tela)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //Vincula o arquivo de layout XML (activity_main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        //Regra de negócio: insere um texto no topo da lista, caso ela esteja vazia
        if(listaNomes.isEmpty()){
            listaNomes.add("Nome de cadastro");

        //mapeamento dos componentes do RecyclerView do XML para o objeto java
        recyclerView = findViewById(R.id.recycler_view);

        //Define o LayoutManager: organiza itens da lista numa coluna vertical simples
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Instancia o adaptador passando a nossa lista de nomes
         adapter = new UserAdapter((listaNomes));

        //Conecta o adaptador ao RecyclerView para que os dados sejam desenhados na tela
        recyclerView.setAdapter(adapter);

        //Mapeia o botão de cadastro
        btnCadastrar = findViewById(R.id.btnCadastrar);

        //Configura o evento de clique usando a expressão lambda (java 8+)
        btnCadastrar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CreateUser.class));
        });
        }
    }

    //Método chamado sempre que a tela volta a ficar visível para o usuário
    @Override
    protected void onResume(){
        super.onResume();
        //Avisar o adaptador que a fonte de dados(listaNomes) pode ter sindo alterada na outra tela, forçando a atualização visual da lista
        adapter.notifyDataSetChanged();
    }
}