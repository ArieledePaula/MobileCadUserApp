package com.example.cadastrodeusuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;
import java.util.List;

//Classe Adapter: Gerencia criação ep preenchimneto dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    //Atributoprivado que armazena a referÊncia dos dados que serão exibidos
    private List<String> listaUsuarios;

    //Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter
    public UserAdapter(List<String> lista){
        this.listaUsuarios = lista;
    }

    //Método 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NontNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        //LayoutInflater transforma o arquivo XMLem um objeto View Java
        //Aqui usamos um layout padrão do Android (simple_list_item1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        //Retorna uma nova instância da nossa classe interna ViewHolder com a View Criada
        return new ViewHolder(view);

        //Método 2: Vincula os dados de um objeto de lista a uma linha específica da tela

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position){
            //Recupera os dados da lista de acordo com a posição que o Android está desenhado agora
            String nome = listaUsuarios.get(position);

            //define o texto no componete visual que está guardado dentro de 'holder'
            holder.tvNome.setText(nome);
        }

    }
}
