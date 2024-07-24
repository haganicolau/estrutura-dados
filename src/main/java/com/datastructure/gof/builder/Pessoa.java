package com.datastructure.gof.builder;

public class Pessoa {

    public static void main(String[] args) {
        Pessoa pessoa =
                Pessoa.builder().nome("Hagamenon").sobrenome("nicolau").idade(34).build();
    }

    private final String nome;
    private final String sobrenome;
    private final int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public static PessoaBuilder.Stage0 builder() {
        return nome -> sobrenome -> idade -> () -> new Pessoa(nome, sobrenome, idade);
    }

    private interface PessoaBuilder {
        interface Stage0 { Stage1 nome(String nome); }
        interface Stage1 { Stage2 sobrenome(String sobrenome); }
        interface Stage2 { Stage3 idade(int idade); }
        interface Stage3 { Pessoa build(); }
    }
}
