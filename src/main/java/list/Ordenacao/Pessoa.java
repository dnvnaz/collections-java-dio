package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private int alturaCm;

    public Pessoa(String nome, int idade, int alturaCm) {
        this.nome = nome;
        this.idade = idade;
        this.alturaCm = alturaCm;
    }


    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", alturaCm=" + alturaCm +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAlturaCm(), p2.getAlturaCm());
    }
}
