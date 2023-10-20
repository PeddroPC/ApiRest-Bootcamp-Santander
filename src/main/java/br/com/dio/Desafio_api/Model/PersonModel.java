package br.com.dio.Desafio_api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "person")
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;
    private String cidade;

    public long getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getIdade () {
        return idade;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public String getCidade () {
        return cidade;
    }

    public void setCidade (String cidade) {
        this.cidade = cidade;
    }
}
