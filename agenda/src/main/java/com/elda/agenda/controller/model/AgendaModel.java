package com.elda.agenda.controller.model;



public class AgendaModel {
    String nome;
    String telefone;
    String email;
    String cep;

    public AgendaModel(String nome, String telefone, String email, String cep) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }
    public String getCep(){
        return cep;
    }

}