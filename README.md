# MobileCadUserApp

 ## 📱  Cadastro de Usuário  - Android Studio

### Este projeto é um aplicativo simples desenvolvido em Java utilizando Android Studio, com o objetivo de demonstrar o uso de:
-Activities <br>
-RecyclerView <br>
-Adapters <br>
-Comunicação entre telas <br>
-Persistência temporária em memória (lista estática) <br>
-O app permite cadastrar usuários (nome e e-mail) e exibi-los em uma lista dinâmica

 ## 📋 Funcionalidades <br>
-Cadastrar usuários <br>
-Listar usuários cadastrados <br>
-Atualização automática da lista ao voltar para a tela inicial <br>
-Estrutura simples e ideal para iniciantes em Android Studio

## 🧱 Estrutura do Projeto <br>
com.example.cadastrodeusuario <br>
│ <br>
├── MainActivity.java        - Tela principal com RecyclerView <br>
├── CreateUser.java          - Tela de cadastro <br>
├── UserAdapter.java         -  Adapter da RecyclerView <br>
│ <br>
└── res/ <br>
├── layout/activity_main.xml <br>
├── layout/create_user.xml <br>

# 📄 Descrição das Classes <br>

### 1. MainActivity.java
Tela principal que exibe a lista de usuários.

Funções principais: <br>
Gerencia o RecyclerView  <br>
Cria e mantém o UserAdapter <br>
Possui um botão "Cadastrar" <br>
Atualiza a lista no onResume() <br>
Armazena os dados em public static List<String> listaNomes <br>

### 2. CreateUser.java <br>
Tela de cadastro de usuários.

Funções: <br>
Captura Nome e E-mail <br>
Adiciona o texto "nome (email)" na lista estática da MainActivity <br>
Fecha a tela após salvar <br>

### 3. UserAdapter.java <br>

Adapter responsável por: <br>
Criar os itens da lista <br>
Preencher cada item com dados do usuário <br>
Controlar a quantidade de itens exibidos <br>

## 🖥️ Telas do App <br>

-Tela Principal <br>
-Exibe lista de usuários usando RecyclerView <br>
-Botão Cadastrar <br>
-Tela de Cadastro <br>
-Campo para Nome <br>
-Campo para E-mail  <br>
-Botão Salvar <br>

## ▶️ Como Executar <br>
Abra o projeto no Android Studio <br>
Aguarde o Gradle sincronizar <br>
Conecte um celular Android ou use um AVD <br>
Clique em Run (▶) <br>

## 📌 Observações Importantes <br>
A lista funciona apenas enquanto o app está aberto, pois é uma variável estática. <br>
Para salvar permanentemente seria necessário usar: <br>
-SharedPreferences <br>
-Banco de dados (Room, SQLite) <br>
-Arquivo local <br>
-Ou API externa 
