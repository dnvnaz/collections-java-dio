package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, int alturaCm) {
        pessoaList.add(new Pessoa(nome, idade, alturaCm));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Fernando", 45, 170);
        ordenacaoPessoas.adicionarPessoa("Cristiane", 43, 160);
        ordenacaoPessoas.adicionarPessoa("Donovan", 20, 182);
        ordenacaoPessoas.adicionarPessoa("Kamilly", 19, 163);

        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }

}

